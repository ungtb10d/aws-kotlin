// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsRequest
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeInstanceMetadataOptionsRequestDocument(serializer: Serializer, input: InstanceMetadataOptionsRequest) {
    val HTTPENDPOINT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("HttpEndpoint"))
    val HTTPPROTOCOLIPV6_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("HttpProtocolIpv6"))
    val HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("HttpPutResponseHopLimit"))
    val HTTPTOKENS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("HttpTokens"))
    val INSTANCEMETADATATAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("InstanceMetadataTags"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("InstanceMetadataOptionsRequest"))
        field(HTTPENDPOINT_DESCRIPTOR)
        field(HTTPPROTOCOLIPV6_DESCRIPTOR)
        field(HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR)
        field(HTTPTOKENS_DESCRIPTOR)
        field(INSTANCEMETADATATAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.httpTokens?.let { field(HTTPTOKENS_DESCRIPTOR, it.value) }
        input.httpPutResponseHopLimit?.let { field(HTTPPUTRESPONSEHOPLIMIT_DESCRIPTOR, it) }
        input.httpEndpoint?.let { field(HTTPENDPOINT_DESCRIPTOR, it.value) }
        input.httpProtocolIpv6?.let { field(HTTPPROTOCOLIPV6_DESCRIPTOR, it.value) }
        input.instanceMetadataTags?.let { field(INSTANCEMETADATATAGS_DESCRIPTOR, it.value) }
    }
}
