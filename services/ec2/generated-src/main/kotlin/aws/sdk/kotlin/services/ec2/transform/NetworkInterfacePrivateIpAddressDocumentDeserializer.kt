// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.NetworkInterfacePrivateIpAddress
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

internal fun deserializeNetworkInterfacePrivateIpAddressDocument(deserializer: Deserializer): NetworkInterfacePrivateIpAddress {
    val builder = NetworkInterfacePrivateIpAddress.Builder()
    val ASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("association"))
    val PRIMARY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("primary"))
    val PRIVATEDNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateDnsName"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateIpAddress"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInterfacePrivateIpAddress"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATION_DESCRIPTOR)
        field(PRIMARY_DESCRIPTOR)
        field(PRIVATEDNSNAME_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATION_DESCRIPTOR.index -> builder.association = deserializeNetworkInterfaceAssociationDocument(deserializer)
                PRIMARY_DESCRIPTOR.index -> builder.primary = deserializeBoolean()
                PRIVATEDNSNAME_DESCRIPTOR.index -> builder.privateDnsName = deserializeString()
                PRIVATEIPADDRESS_DESCRIPTOR.index -> builder.privateIpAddress = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
