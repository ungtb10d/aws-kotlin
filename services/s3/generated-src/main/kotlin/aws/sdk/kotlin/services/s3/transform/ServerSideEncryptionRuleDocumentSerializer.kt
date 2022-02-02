// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ServerSideEncryptionRule
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun serializeServerSideEncryptionRuleDocument(serializer: Serializer, input: ServerSideEncryptionRule) {
    val APPLYSERVERSIDEENCRYPTIONBYDEFAULT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ApplyServerSideEncryptionByDefault"))
    val BUCKETKEYENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("BucketKeyEnabled"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ServerSideEncryptionRule"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(APPLYSERVERSIDEENCRYPTIONBYDEFAULT_DESCRIPTOR)
        field(BUCKETKEYENABLED_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.applyServerSideEncryptionByDefault?.let { field(APPLYSERVERSIDEENCRYPTIONBYDEFAULT_DESCRIPTOR, it, ::serializeServerSideEncryptionByDefaultDocument) }
        if (input.bucketKeyEnabled != false) field(BUCKETKEYENABLED_DESCRIPTOR, input.bucketKeyEnabled)
    }
}