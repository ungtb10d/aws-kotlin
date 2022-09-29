// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ReplacementStrategy
import aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance
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

internal fun deserializeSpotCapacityRebalanceDocument(deserializer: Deserializer): SpotCapacityRebalance {
    val builder = SpotCapacityRebalance.Builder()
    val REPLACEMENTSTRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("replacementStrategy"))
    val TERMINATIONDELAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("terminationDelay"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SpotCapacityRebalance"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(REPLACEMENTSTRATEGY_DESCRIPTOR)
        field(TERMINATIONDELAY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                REPLACEMENTSTRATEGY_DESCRIPTOR.index -> builder.replacementStrategy = deserializeString().let { ReplacementStrategy.fromValue(it) }
                TERMINATIONDELAY_DESCRIPTOR.index -> builder.terminationDelay = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
