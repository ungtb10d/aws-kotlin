// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ProtocolValue
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentBgpConfiguration
import aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectPeerConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun deserializeTransitGatewayConnectPeerConfigurationDocument(deserializer: Deserializer): TransitGatewayConnectPeerConfiguration {
    val builder = TransitGatewayConnectPeerConfiguration.Builder()
    val BGPCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("bgpConfigurations"), XmlCollectionName("item"))
    val INSIDECIDRBLOCKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("insideCidrBlocks"), XmlCollectionName("item"))
    val PEERADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("peerAddress"))
    val PROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("protocol"))
    val TRANSITGATEWAYADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAddress"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayConnectPeerConfiguration"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(BGPCONFIGURATIONS_DESCRIPTOR)
        field(INSIDECIDRBLOCKS_DESCRIPTOR)
        field(PEERADDRESS_DESCRIPTOR)
        field(PROTOCOL_DESCRIPTOR)
        field(TRANSITGATEWAYADDRESS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BGPCONFIGURATIONS_DESCRIPTOR.index -> builder.bgpConfigurations =
                    deserializer.deserializeList(BGPCONFIGURATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<TransitGatewayAttachmentBgpConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTransitGatewayAttachmentBgpConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INSIDECIDRBLOCKS_DESCRIPTOR.index -> builder.insideCidrBlocks =
                    deserializer.deserializeList(INSIDECIDRBLOCKS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PEERADDRESS_DESCRIPTOR.index -> builder.peerAddress = deserializeString()
                PROTOCOL_DESCRIPTOR.index -> builder.protocol = deserializeString().let { ProtocolValue.fromValue(it) }
                TRANSITGATEWAYADDRESS_DESCRIPTOR.index -> builder.transitGatewayAddress = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
