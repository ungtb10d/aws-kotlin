// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PathStatement
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

internal fun deserializePathStatementDocument(deserializer: Deserializer): PathStatement {
    val builder = PathStatement.Builder()
    val PACKETHEADERSTATEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("packetHeaderStatement"))
    val RESOURCESTATEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("resourceStatement"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PathStatement"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(PACKETHEADERSTATEMENT_DESCRIPTOR)
        field(RESOURCESTATEMENT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                PACKETHEADERSTATEMENT_DESCRIPTOR.index -> builder.packetHeaderStatement = deserializePacketHeaderStatementDocument(deserializer)
                RESOURCESTATEMENT_DESCRIPTOR.index -> builder.resourceStatement = deserializeResourceStatementDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
