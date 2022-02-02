// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplatesMonitoring
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

internal fun deserializeLaunchTemplatesMonitoringDocument(deserializer: Deserializer): LaunchTemplatesMonitoring {
    val builder = LaunchTemplatesMonitoring.Builder()
    val ENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("enabled"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LaunchTemplatesMonitoring"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ENABLED_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ENABLED_DESCRIPTOR.index -> builder.enabled = deserializeBoolean()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}