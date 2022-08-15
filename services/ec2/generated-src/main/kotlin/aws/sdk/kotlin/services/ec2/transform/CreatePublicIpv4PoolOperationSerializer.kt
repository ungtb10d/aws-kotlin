// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreatePublicIpv4PoolRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
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


internal class CreatePublicIpv4PoolOperationSerializer: HttpSerialize<CreatePublicIpv4PoolRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreatePublicIpv4PoolRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreatePublicIpv4PoolOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreatePublicIpv4PoolOperationBody(context: ExecutionContext, input: CreatePublicIpv4PoolRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreatePublicIpv4PoolRequest"))
        trait(QueryLiteral("Action", "CreatePublicIpv4Pool"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
