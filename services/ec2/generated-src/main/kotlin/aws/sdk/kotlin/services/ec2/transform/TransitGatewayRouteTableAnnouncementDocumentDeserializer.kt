// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableAnnouncement
import aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableAnnouncementDirection
import aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTableAnnouncementState
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
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeTransitGatewayRouteTableAnnouncementDocument(deserializer: Deserializer): TransitGatewayRouteTableAnnouncement {
    val builder = TransitGatewayRouteTableAnnouncement.Builder()
    val ANNOUNCEMENTDIRECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("announcementDirection"))
    val CORENETWORKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("coreNetworkId"))
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val PEERCORENETWORKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("peerCoreNetworkId"))
    val PEERTRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("peerTransitGatewayId"))
    val PEERINGATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("peeringAttachmentId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayId"))
    val TRANSITGATEWAYROUTETABLEANNOUNCEMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayRouteTableAnnouncementId"))
    val TRANSITGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayRouteTableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayRouteTableAnnouncement"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ANNOUNCEMENTDIRECTION_DESCRIPTOR)
        field(CORENETWORKID_DESCRIPTOR)
        field(CREATIONTIME_DESCRIPTOR)
        field(PEERCORENETWORKID_DESCRIPTOR)
        field(PEERTRANSITGATEWAYID_DESCRIPTOR)
        field(PEERINGATTACHMENTID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(TRANSITGATEWAYROUTETABLEANNOUNCEMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYROUTETABLEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ANNOUNCEMENTDIRECTION_DESCRIPTOR.index -> builder.announcementDirection = deserializeString().let { TransitGatewayRouteTableAnnouncementDirection.fromValue(it) }
                CORENETWORKID_DESCRIPTOR.index -> builder.coreNetworkId = deserializeString()
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                PEERCORENETWORKID_DESCRIPTOR.index -> builder.peerCoreNetworkId = deserializeString()
                PEERTRANSITGATEWAYID_DESCRIPTOR.index -> builder.peerTransitGatewayId = deserializeString()
                PEERINGATTACHMENTID_DESCRIPTOR.index -> builder.peeringAttachmentId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayRouteTableAnnouncementState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRANSITGATEWAYID_DESCRIPTOR.index -> builder.transitGatewayId = deserializeString()
                TRANSITGATEWAYROUTETABLEANNOUNCEMENTID_DESCRIPTOR.index -> builder.transitGatewayRouteTableAnnouncementId = deserializeString()
                TRANSITGATEWAYROUTETABLEID_DESCRIPTOR.index -> builder.transitGatewayRouteTableId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
