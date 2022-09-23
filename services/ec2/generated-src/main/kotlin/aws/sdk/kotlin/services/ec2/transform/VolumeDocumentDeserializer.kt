// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.Volume
import aws.sdk.kotlin.services.ec2.model.VolumeAttachment
import aws.sdk.kotlin.services.ec2.model.VolumeState
import aws.sdk.kotlin.services.ec2.model.VolumeType
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

internal fun deserializeVolumeDocument(deserializer: Deserializer): Volume {
    val builder = Volume.Builder()
    val ATTACHMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("attachmentSet"), XmlCollectionName("item"))
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val FASTRESTORED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("fastRestored"))
    val IOPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("iops"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kmsKeyId"))
    val MULTIATTACHENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("multiAttachEnabled"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val SIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("size"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("status"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val THROUGHPUT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("throughput"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val VOLUMETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("volumeType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Volume"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ATTACHMENTS_DESCRIPTOR)
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(CREATETIME_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(FASTRESTORED_DESCRIPTOR)
        field(IOPS_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(MULTIATTACHENABLED_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(SIZE_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(THROUGHPUT_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
        field(VOLUMETYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTACHMENTS_DESCRIPTOR.index -> builder.attachments =
                    deserializer.deserializeList(ATTACHMENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<VolumeAttachment>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeVolumeAttachmentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                FASTRESTORED_DESCRIPTOR.index -> builder.fastRestored = deserializeBoolean()
                IOPS_DESCRIPTOR.index -> builder.iops = deserializeInt()
                KMSKEYID_DESCRIPTOR.index -> builder.kmsKeyId = deserializeString()
                MULTIATTACHENABLED_DESCRIPTOR.index -> builder.multiAttachEnabled = deserializeBoolean()
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                SIZE_DESCRIPTOR.index -> builder.size = deserializeInt()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { VolumeState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                THROUGHPUT_DESCRIPTOR.index -> builder.throughput = deserializeInt()
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                VOLUMETYPE_DESCRIPTOR.index -> builder.volumeType = deserializeString().let { VolumeType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
