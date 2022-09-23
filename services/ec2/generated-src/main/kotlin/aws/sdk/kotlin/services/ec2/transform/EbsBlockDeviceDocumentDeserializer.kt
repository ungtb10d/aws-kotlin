// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EbsBlockDevice
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun deserializeEbsBlockDeviceDocument(deserializer: Deserializer): EbsBlockDevice {
    val builder = EbsBlockDevice.Builder()
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("deleteOnTermination"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val IOPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("iops"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("KmsKeyId"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val THROUGHPUT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("throughput"))
    val VOLUMESIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("volumeSize"))
    val VOLUMETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("volumeType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("EbsBlockDevice"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(IOPS_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(THROUGHPUT_DESCRIPTOR)
        field(VOLUMESIZE_DESCRIPTOR)
        field(VOLUMETYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DELETEONTERMINATION_DESCRIPTOR.index -> builder.deleteOnTermination = deserializeBoolean()
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                IOPS_DESCRIPTOR.index -> builder.iops = deserializeInt()
                KMSKEYID_DESCRIPTOR.index -> builder.kmsKeyId = deserializeString()
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                THROUGHPUT_DESCRIPTOR.index -> builder.throughput = deserializeInt()
                VOLUMESIZE_DESCRIPTOR.index -> builder.volumeSize = deserializeInt()
                VOLUMETYPE_DESCRIPTOR.index -> builder.volumeType = deserializeString().let { VolumeType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
