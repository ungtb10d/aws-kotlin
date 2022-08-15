// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateRestoreImageTaskRequest
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


internal class CreateRestoreImageTaskOperationSerializer: HttpSerialize<CreateRestoreImageTaskRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateRestoreImageTaskRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateRestoreImageTaskOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreateRestoreImageTaskOperationBody(context: ExecutionContext, input: CreateRestoreImageTaskRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Bucket"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val OBJECTKEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ObjectKey"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateRestoreImageTaskRequest"))
        trait(QueryLiteral("Action", "CreateRestoreImageTask"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(BUCKET_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(OBJECTKEY_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.bucket?.let { field(BUCKET_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
        input.objectKey?.let { field(OBJECTKEY_DESCRIPTOR, it) }
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
