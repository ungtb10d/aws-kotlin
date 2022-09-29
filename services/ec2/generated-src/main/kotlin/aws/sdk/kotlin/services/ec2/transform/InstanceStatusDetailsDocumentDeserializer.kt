// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceStatusDetails
import aws.sdk.kotlin.services.ec2.model.StatusName
import aws.sdk.kotlin.services.ec2.model.StatusType
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
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeInstanceStatusDetailsDocument(deserializer: Deserializer): InstanceStatusDetails {
    val builder = InstanceStatusDetails.Builder()
    val IMPAIREDSINCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("impairedSince"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("name"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceStatusDetails"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(IMPAIREDSINCE_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                IMPAIREDSINCE_DESCRIPTOR.index -> builder.impairedSince = deserializeString().let { Instant.fromIso8601(it) }
                NAME_DESCRIPTOR.index -> builder.name = deserializeString().let { StatusName.fromValue(it) }
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { StatusType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
