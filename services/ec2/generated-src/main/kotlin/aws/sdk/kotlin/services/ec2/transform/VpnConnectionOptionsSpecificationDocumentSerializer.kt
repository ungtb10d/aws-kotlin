// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeVpnConnectionOptionsSpecificationDocument(serializer: Serializer, input: VpnConnectionOptionsSpecification) {
    val ENABLEACCELERATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EnableAcceleration"))
    val LOCALIPV4NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LocalIpv4NetworkCidr"))
    val LOCALIPV6NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LocalIpv6NetworkCidr"))
    val REMOTEIPV4NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RemoteIpv4NetworkCidr"))
    val REMOTEIPV6NETWORKCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RemoteIpv6NetworkCidr"))
    val STATICROUTESONLY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("StaticRoutesOnly"))
    val TUNNELINSIDEIPVERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TunnelInsideIpVersion"))
    val TUNNELOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TunnelOptions"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("VpnConnectionOptionsSpecification"))
        field(ENABLEACCELERATION_DESCRIPTOR)
        field(LOCALIPV4NETWORKCIDR_DESCRIPTOR)
        field(LOCALIPV6NETWORKCIDR_DESCRIPTOR)
        field(REMOTEIPV4NETWORKCIDR_DESCRIPTOR)
        field(REMOTEIPV6NETWORKCIDR_DESCRIPTOR)
        field(STATICROUTESONLY_DESCRIPTOR)
        field(TUNNELINSIDEIPVERSION_DESCRIPTOR)
        field(TUNNELOPTIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.enableAcceleration?.let { field(ENABLEACCELERATION_DESCRIPTOR, it) }
        input.staticRoutesOnly?.let { field(STATICROUTESONLY_DESCRIPTOR, it) }
        input.tunnelInsideIpVersion?.let { field(TUNNELINSIDEIPVERSION_DESCRIPTOR, it.value) }
        if (input.tunnelOptions != null) {
            listField(TUNNELOPTIONS_DESCRIPTOR) {
                for (el0 in input.tunnelOptions) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeVpnTunnelOptionsSpecificationDocument))
                }
            }
        }
        input.localIpv4NetworkCidr?.let { field(LOCALIPV4NETWORKCIDR_DESCRIPTOR, it) }
        input.remoteIpv4NetworkCidr?.let { field(REMOTEIPV4NETWORKCIDR_DESCRIPTOR, it) }
        input.localIpv6NetworkCidr?.let { field(LOCALIPV6NETWORKCIDR_DESCRIPTOR, it) }
        input.remoteIpv6NetworkCidr?.let { field(REMOTEIPV6NETWORKCIDR_DESCRIPTOR, it) }
    }
}