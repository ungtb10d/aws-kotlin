// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.FilterRule
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

internal fun serializeFilterRuleDocument(serializer: Serializer, input: FilterRule) {
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Name"))
    val VALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Value"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("FilterRule"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(NAME_DESCRIPTOR)
        field(VALUE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.name?.let { field(NAME_DESCRIPTOR, it.value) }
        input.value?.let { field(VALUE_DESCRIPTOR, it) }
    }
}
