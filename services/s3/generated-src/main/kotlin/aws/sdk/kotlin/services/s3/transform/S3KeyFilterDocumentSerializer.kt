// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.S3KeyFilter
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun serializeS3KeyFilterDocument(serializer: Serializer, input: S3KeyFilter) {
    val FILTERRULES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("FilterRule"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("S3KeyFilter"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(FILTERRULES_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.filterRules != null) {
            listField(FILTERRULES_DESCRIPTOR) {
                for (el0 in input.filterRules) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterRuleDocument))
                }
            }
        }
    }
}