// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.VolumeAttachment
import aws.sdk.kotlin.services.ec2.model.VolumeAttachmentState
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

internal fun deserializeVolumeAttachmentDocument(deserializer: Deserializer): VolumeAttachment {
    val builder = VolumeAttachment.Builder()
    val ATTACHTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("attachTime"))
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("deleteOnTermination"))
    val DEVICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("device"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("status"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VolumeAttachment"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ATTACHTIME_DESCRIPTOR)
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(DEVICE_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTACHTIME_DESCRIPTOR.index -> builder.attachTime = deserializeString().let { Instant.fromIso8601(it) }
                DELETEONTERMINATION_DESCRIPTOR.index -> builder.deleteOnTermination = deserializeBoolean()
                DEVICE_DESCRIPTOR.index -> builder.device = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { VolumeAttachmentState.fromValue(it) }
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
