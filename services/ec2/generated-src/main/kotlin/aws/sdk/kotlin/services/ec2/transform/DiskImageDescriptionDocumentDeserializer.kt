// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DiskImageDescription
import aws.sdk.kotlin.services.ec2.model.DiskImageFormat
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

internal fun deserializeDiskImageDescriptionDocument(deserializer: Deserializer): DiskImageDescription {
    val builder = DiskImageDescription.Builder()
    val CHECKSUM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("checksum"))
    val FORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("format"))
    val IMPORTMANIFESTURL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("importManifestUrl"))
    val SIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("size"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DiskImageDescription"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CHECKSUM_DESCRIPTOR)
        field(FORMAT_DESCRIPTOR)
        field(IMPORTMANIFESTURL_DESCRIPTOR)
        field(SIZE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CHECKSUM_DESCRIPTOR.index -> builder.checksum = deserializeString()
                FORMAT_DESCRIPTOR.index -> builder.format = deserializeString().let { DiskImageFormat.fromValue(it) }
                IMPORTMANIFESTURL_DESCRIPTOR.index -> builder.importManifestUrl = deserializeString()
                SIZE_DESCRIPTOR.index -> builder.size = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}