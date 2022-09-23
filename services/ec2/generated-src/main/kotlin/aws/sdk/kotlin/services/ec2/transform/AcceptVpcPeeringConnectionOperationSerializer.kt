// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AcceptVpcPeeringConnectionRequest
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


internal class AcceptVpcPeeringConnectionOperationSerializer: HttpSerialize<AcceptVpcPeeringConnectionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AcceptVpcPeeringConnectionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAcceptVpcPeeringConnectionOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeAcceptVpcPeeringConnectionOperationBody(context: ExecutionContext, input: AcceptVpcPeeringConnectionRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val VPCPEERINGCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcPeeringConnectionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AcceptVpcPeeringConnectionRequest"))
        trait(QueryLiteral("Action", "AcceptVpcPeeringConnection"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(VPCPEERINGCONNECTIONID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.vpcPeeringConnectionId?.let { field(VPCPEERINGCONNECTIONID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
