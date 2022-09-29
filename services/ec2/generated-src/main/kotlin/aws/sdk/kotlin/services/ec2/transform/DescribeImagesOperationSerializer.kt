// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeImagesRequest
import aws.sdk.kotlin.services.ec2.model.Filter
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class DescribeImagesOperationSerializer: HttpSerialize<DescribeImagesRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeImagesRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeImagesOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeDescribeImagesOperationBody(context: ExecutionContext, input: DescribeImagesRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EXECUTABLEUSERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ExecutableBy"), FormUrlFlattened)
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val IMAGEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ImageId"), FormUrlFlattened)
    val INCLUDEDEPRECATED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("IncludeDeprecated"))
    val OWNERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Owner"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeImagesRequest"))
        trait(QueryLiteral("Action", "DescribeImages"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(EXECUTABLEUSERS_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(IMAGEIDS_DESCRIPTOR)
        field(INCLUDEDEPRECATED_DESCRIPTOR)
        field(OWNERS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.executableUsers != null) {
            listField(EXECUTABLEUSERS_DESCRIPTOR) {
                for (el0 in input.executableUsers) {
                    serializeString(el0)
                }
            }
        }
        if (input.filters != null) {
            listField(FILTERS_DESCRIPTOR) {
                for (el0 in input.filters) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterDocument))
                }
            }
        }
        if (input.imageIds != null) {
            listField(IMAGEIDS_DESCRIPTOR) {
                for (el0 in input.imageIds) {
                    serializeString(el0)
                }
            }
        }
        input.includeDeprecated?.let { field(INCLUDEDEPRECATED_DESCRIPTOR, it) }
        if (input.owners != null) {
            listField(OWNERS_DESCRIPTOR) {
                for (el0 in input.owners) {
                    serializeString(el0)
                }
            }
        }
    }
    return serializer.toByteArray()
}
