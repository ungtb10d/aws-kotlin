// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceState
import aws.sdk.kotlin.services.ec2.model.InstanceStateName
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

internal fun deserializeInstanceStateDocument(deserializer: Deserializer): InstanceState {
    val builder = InstanceState.Builder()
    val CODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("code"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("name"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceState"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CODE_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CODE_DESCRIPTOR.index -> builder.code = deserializeInt()
                NAME_DESCRIPTOR.index -> builder.name = deserializeString().let { InstanceStateName.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
