// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DisableFastSnapshotRestoreSuccessItem
import aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode
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
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeDisableFastSnapshotRestoreSuccessItemDocument(deserializer: Deserializer): DisableFastSnapshotRestoreSuccessItem {
    val builder = DisableFastSnapshotRestoreSuccessItem.Builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val DISABLEDTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("disabledTime"))
    val DISABLINGTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("disablingTime"))
    val ENABLEDTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("enabledTime"))
    val ENABLINGTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("enablingTime"))
    val OPTIMIZINGTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("optimizingTime"))
    val OWNERALIAS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerAlias"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("state"))
    val STATETRANSITIONREASON_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("stateTransitionReason"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DisableFastSnapshotRestoreSuccessItem"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(DISABLEDTIME_DESCRIPTOR)
        field(DISABLINGTIME_DESCRIPTOR)
        field(ENABLEDTIME_DESCRIPTOR)
        field(ENABLINGTIME_DESCRIPTOR)
        field(OPTIMIZINGTIME_DESCRIPTOR)
        field(OWNERALIAS_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATETRANSITIONREASON_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                DISABLEDTIME_DESCRIPTOR.index -> builder.disabledTime = deserializeString().let { Instant.fromIso8601(it) }
                DISABLINGTIME_DESCRIPTOR.index -> builder.disablingTime = deserializeString().let { Instant.fromIso8601(it) }
                ENABLEDTIME_DESCRIPTOR.index -> builder.enabledTime = deserializeString().let { Instant.fromIso8601(it) }
                ENABLINGTIME_DESCRIPTOR.index -> builder.enablingTime = deserializeString().let { Instant.fromIso8601(it) }
                OPTIMIZINGTIME_DESCRIPTOR.index -> builder.optimizingTime = deserializeString().let { Instant.fromIso8601(it) }
                OWNERALIAS_DESCRIPTOR.index -> builder.ownerAlias = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { FastSnapshotRestoreStateCode.fromValue(it) }
                STATETRANSITIONREASON_DESCRIPTOR.index -> builder.stateTransitionReason = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
