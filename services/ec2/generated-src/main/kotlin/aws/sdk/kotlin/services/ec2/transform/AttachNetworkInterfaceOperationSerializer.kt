// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AttachNetworkInterfaceRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class AttachNetworkInterfaceOperationSerializer: HttpSerialize<AttachNetworkInterfaceRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AttachNetworkInterfaceRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAttachNetworkInterfaceOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeAttachNetworkInterfaceOperationBody(context: ExecutionContext, input: AttachNetworkInterfaceRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("DeviceIndex"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceId"))
    val NETWORKCARDINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("NetworkCardIndex"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AttachNetworkInterfaceRequest"))
        trait(QueryLiteral("Action", "AttachNetworkInterface"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DEVICEINDEX_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(NETWORKCARDINDEX_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.deviceIndex?.let { field(DEVICEINDEX_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.instanceId?.let { field(INSTANCEID_DESCRIPTOR, it) }
        input.networkCardIndex?.let { field(NETWORKCARDINDEX_DESCRIPTOR, it) }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
