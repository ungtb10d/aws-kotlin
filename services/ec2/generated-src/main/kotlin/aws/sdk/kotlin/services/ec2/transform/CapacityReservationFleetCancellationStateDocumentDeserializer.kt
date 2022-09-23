// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetCancellationState
import aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState
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

internal fun deserializeCapacityReservationFleetCancellationStateDocument(deserializer: Deserializer): CapacityReservationFleetCancellationState {
    val builder = CapacityReservationFleetCancellationState.Builder()
    val CAPACITYRESERVATIONFLEETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("capacityReservationFleetId"))
    val CURRENTFLEETSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("currentFleetState"))
    val PREVIOUSFLEETSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("previousFleetState"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("CapacityReservationFleetCancellationState"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CAPACITYRESERVATIONFLEETID_DESCRIPTOR)
        field(CURRENTFLEETSTATE_DESCRIPTOR)
        field(PREVIOUSFLEETSTATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CAPACITYRESERVATIONFLEETID_DESCRIPTOR.index -> builder.capacityReservationFleetId = deserializeString()
                CURRENTFLEETSTATE_DESCRIPTOR.index -> builder.currentFleetState = deserializeString().let { CapacityReservationFleetState.fromValue(it) }
                PREVIOUSFLEETSTATE_DESCRIPTOR.index -> builder.previousFleetState = deserializeString().let { CapacityReservationFleetState.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
