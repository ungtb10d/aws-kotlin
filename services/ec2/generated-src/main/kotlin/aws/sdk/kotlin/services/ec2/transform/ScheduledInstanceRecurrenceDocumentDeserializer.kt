// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence
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

internal fun deserializeScheduledInstanceRecurrenceDocument(deserializer: Deserializer): ScheduledInstanceRecurrence {
    val builder = ScheduledInstanceRecurrence.Builder()
    val FREQUENCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("frequency"))
    val INTERVAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("interval"))
    val OCCURRENCEDAYSET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("occurrenceDaySet"), XmlCollectionName("item"))
    val OCCURRENCERELATIVETOEND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("occurrenceRelativeToEnd"))
    val OCCURRENCEUNIT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("occurrenceUnit"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ScheduledInstanceRecurrence"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(FREQUENCY_DESCRIPTOR)
        field(INTERVAL_DESCRIPTOR)
        field(OCCURRENCEDAYSET_DESCRIPTOR)
        field(OCCURRENCERELATIVETOEND_DESCRIPTOR)
        field(OCCURRENCEUNIT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FREQUENCY_DESCRIPTOR.index -> builder.frequency = deserializeString()
                INTERVAL_DESCRIPTOR.index -> builder.interval = deserializeInt()
                OCCURRENCEDAYSET_DESCRIPTOR.index -> builder.occurrenceDaySet =
                    deserializer.deserializeList(OCCURRENCEDAYSET_DESCRIPTOR) {
                        val col0 = mutableListOf<Int>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInt() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                OCCURRENCERELATIVETOEND_DESCRIPTOR.index -> builder.occurrenceRelativeToEnd = deserializeBoolean()
                OCCURRENCEUNIT_DESCRIPTOR.index -> builder.occurrenceUnit = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}