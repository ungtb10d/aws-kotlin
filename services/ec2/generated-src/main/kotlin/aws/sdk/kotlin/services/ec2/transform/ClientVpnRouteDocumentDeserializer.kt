// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ClientVpnRoute
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun deserializeClientVpnRouteDocument(deserializer: Deserializer): ClientVpnRoute {
    val builder = ClientVpnRoute.Builder()
    val CLIENTVPNENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientVpnEndpointId"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val DESTINATIONCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("destinationCidr"))
    val ORIGIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("origin"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("status"))
    val TARGETSUBNET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("targetSubnet"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("type"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ClientVpnRoute"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CLIENTVPNENDPOINTID_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DESTINATIONCIDR_DESCRIPTOR)
        field(ORIGIN_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(TARGETSUBNET_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLIENTVPNENDPOINTID_DESCRIPTOR.index -> builder.clientVpnEndpointId = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                DESTINATIONCIDR_DESCRIPTOR.index -> builder.destinationCidr = deserializeString()
                ORIGIN_DESCRIPTOR.index -> builder.origin = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeClientVpnRouteStatusDocument(deserializer)
                TARGETSUBNET_DESCRIPTOR.index -> builder.targetSubnet = deserializeString()
                TYPE_DESCRIPTOR.index -> builder.type = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
