// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GroupIdentifier
import aws.sdk.kotlin.services.ec2.model.Instance
import aws.sdk.kotlin.services.ec2.model.Reservation
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

internal fun deserializeReservationDocument(deserializer: Deserializer): Reservation {
    val builder = Reservation.Builder()
    val GROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("groupSet"), XmlCollectionName("item"))
    val INSTANCES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("instancesSet"), XmlCollectionName("item"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val REQUESTERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("requesterId"))
    val RESERVATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservationId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Reservation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(GROUPS_DESCRIPTOR)
        field(INSTANCES_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(REQUESTERID_DESCRIPTOR)
        field(RESERVATIONID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GROUPS_DESCRIPTOR.index -> builder.groups =
                    deserializer.deserializeList(GROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<GroupIdentifier>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeGroupIdentifierDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INSTANCES_DESCRIPTOR.index -> builder.instances =
                    deserializer.deserializeList(INSTANCES_DESCRIPTOR) {
                        val col0 = mutableListOf<Instance>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                REQUESTERID_DESCRIPTOR.index -> builder.requesterId = deserializeString()
                RESERVATIONID_DESCRIPTOR.index -> builder.reservationId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}