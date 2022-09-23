// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateNetworkInterfacePermissionRequest
import aws.sdk.kotlin.services.ec2.model.InterfacePermissionType
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


internal class CreateNetworkInterfacePermissionOperationSerializer: HttpSerialize<CreateNetworkInterfacePermissionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateNetworkInterfacePermissionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateNetworkInterfacePermissionOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreateNetworkInterfacePermissionOperationBody(context: ExecutionContext, input: CreateNetworkInterfacePermissionRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AWSACCOUNTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AwsAccountId"))
    val AWSSERVICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AwsService"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val PERMISSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("Permission"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateNetworkInterfacePermissionRequest"))
        trait(QueryLiteral("Action", "CreateNetworkInterfacePermission"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AWSACCOUNTID_DESCRIPTOR)
        field(AWSSERVICE_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PERMISSION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.awsAccountId?.let { field(AWSACCOUNTID_DESCRIPTOR, it) }
        input.awsService?.let { field(AWSSERVICE_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.permission?.let { field(PERMISSION_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
