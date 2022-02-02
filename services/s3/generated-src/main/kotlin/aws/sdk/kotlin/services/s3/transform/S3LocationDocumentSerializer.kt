// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.S3Location
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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

internal fun serializeS3LocationDocument(serializer: Serializer, input: S3Location) {
    val ACCESSCONTROLLIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("AccessControlList"), XmlCollectionName("Grant"))
    val BUCKETNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("BucketName"))
    val CANNEDACL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("CannedACL"))
    val ENCRYPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Encryption"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val STORAGECLASS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("StorageClass"))
    val TAGGING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Tagging"))
    val USERMETADATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("UserMetadata"), XmlCollectionName("MetadataEntry"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("S3Location"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ACCESSCONTROLLIST_DESCRIPTOR)
        field(BUCKETNAME_DESCRIPTOR)
        field(CANNEDACL_DESCRIPTOR)
        field(ENCRYPTION_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(STORAGECLASS_DESCRIPTOR)
        field(TAGGING_DESCRIPTOR)
        field(USERMETADATA_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.accessControlList != null) {
            listField(ACCESSCONTROLLIST_DESCRIPTOR) {
                for (el0 in input.accessControlList) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGrantDocument))
                }
            }
        }
        input.bucketName?.let { field(BUCKETNAME_DESCRIPTOR, it) }
        input.cannedAcl?.let { field(CANNEDACL_DESCRIPTOR, it.value) }
        input.encryption?.let { field(ENCRYPTION_DESCRIPTOR, it, ::serializeEncryptionDocument) }
        input.prefix?.let { field(PREFIX_DESCRIPTOR, it) }
        input.storageClass?.let { field(STORAGECLASS_DESCRIPTOR, it.value) }
        input.tagging?.let { field(TAGGING_DESCRIPTOR, it, ::serializeTaggingDocument) }
        if (input.userMetadata != null) {
            listField(USERMETADATA_DESCRIPTOR) {
                for (el0 in input.userMetadata) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeMetadataEntryDocument))
                }
            }
        }
    }
}