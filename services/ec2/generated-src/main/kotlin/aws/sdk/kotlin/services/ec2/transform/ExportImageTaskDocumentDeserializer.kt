// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ExportImageTask
import aws.sdk.kotlin.services.ec2.model.Tag
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

internal fun deserializeExportImageTaskDocument(deserializer: Deserializer): ExportImageTask {
    val builder = ExportImageTask.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val EXPORTIMAGETASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("exportImageTaskId"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val S3EXPORTLOCATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("s3ExportLocation"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ExportImageTask"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(EXPORTIMAGETASKID_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(S3EXPORTLOCATION_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                EXPORTIMAGETASKID_DESCRIPTOR.index -> builder.exportImageTaskId = deserializeString()
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                S3EXPORTLOCATION_DESCRIPTOR.index -> builder.s3ExportLocation = deserializeExportTaskS3LocationDocument(deserializer)
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString()
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
