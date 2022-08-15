// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.HttpTokensState
import aws.sdk.kotlin.services.ec2.model.InstanceMetadataEndpointState
import aws.sdk.kotlin.services.ec2.model.InstanceMetadataProtocolState
import aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState
import aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsRequest
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


internal class ModifyInstanceMetadataOptionsOperationSerializer: HttpSerialize<ModifyInstanceMetadataOptionsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyInstanceMetadataOptionsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyInstanceMetadataOptionsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyInstanceMetadataOptionsOperationBody(context: ExecutionContext, input: ModifyInstanceMetadataOptionsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val HTTPENDPOINT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HttpEndpoint"))
    val HTTPPROTOCOLIPV6_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HttpProtocolIpv6"))
    val HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("HttpPutResponseHopLimit"))
    val HTTPTOKENS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HttpTokens"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceId"))
    val INSTANCEMETADATATAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceMetadataTags"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyInstanceMetadataOptionsRequest"))
        trait(QueryLiteral("Action", "ModifyInstanceMetadataOptions"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(HTTPENDPOINT_DESCRIPTOR)
        field(HTTPPROTOCOLIPV6_DESCRIPTOR)
        field(HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR)
        field(HTTPTOKENS_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(INSTANCEMETADATATAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.httpEndpoint?.let { field(HTTPENDPOINT_DESCRIPTOR, it.value) }
        input.httpProtocolIpv6?.let { field(HTTPPROTOCOLIPV6_DESCRIPTOR, it.value) }
        input.httpPutResponseHopLimit?.let { field(HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR, it) }
        input.httpTokens?.let { field(HTTPTOKENS_DESCRIPTOR, it.value) }
        input.instanceId?.let { field(INSTANCEID_DESCRIPTOR, it) }
        input.instanceMetadataTags?.let { field(INSTANCEMETADATATAGS_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
