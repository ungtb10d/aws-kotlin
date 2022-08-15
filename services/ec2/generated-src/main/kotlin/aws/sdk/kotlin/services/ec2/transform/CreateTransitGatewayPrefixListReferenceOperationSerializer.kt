// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayPrefixListReferenceRequest
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


internal class CreateTransitGatewayPrefixListReferenceOperationSerializer: HttpSerialize<CreateTransitGatewayPrefixListReferenceRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateTransitGatewayPrefixListReferenceRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateTransitGatewayPrefixListReferenceOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreateTransitGatewayPrefixListReferenceOperationBody(context: ExecutionContext, input: CreateTransitGatewayPrefixListReferenceRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val BLACKHOLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("Blackhole"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val PREFIXLISTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrefixListId"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayAttachmentId"))
    val TRANSITGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayRouteTableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateTransitGatewayPrefixListReferenceRequest"))
        trait(QueryLiteral("Action", "CreateTransitGatewayPrefixListReference"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(BLACKHOLE_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(PREFIXLISTID_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYROUTETABLEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.blackhole?.let { field(BLACKHOLE_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.prefixListId?.let { field(PREFIXLISTID_DESCRIPTOR, it) }
        input.transitGatewayAttachmentId?.let { field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR, it) }
        input.transitGatewayRouteTableId?.let { field(TRANSITGATEWAYROUTETABLEID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
