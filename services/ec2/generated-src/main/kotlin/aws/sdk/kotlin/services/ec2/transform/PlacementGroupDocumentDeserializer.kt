// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PlacementGroup
import aws.sdk.kotlin.services.ec2.model.PlacementGroupState
import aws.sdk.kotlin.services.ec2.model.PlacementStrategy
import aws.sdk.kotlin.services.ec2.model.SpreadLevel
import aws.sdk.kotlin.services.ec2.model.Tag
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

internal fun deserializePlacementGroupDocument(deserializer: Deserializer): PlacementGroup {
    val builder = PlacementGroup.Builder()
    val GROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupArn"))
    val GROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupId"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupName"))
    val PARTITIONCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("partitionCount"))
    val SPREADLEVEL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("spreadLevel"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STRATEGY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("strategy"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PlacementGroup"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(GROUPARN_DESCRIPTOR)
        field(GROUPID_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(PARTITIONCOUNT_DESCRIPTOR)
        field(SPREADLEVEL_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STRATEGY_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GROUPARN_DESCRIPTOR.index -> builder.groupArn = deserializeString()
                GROUPID_DESCRIPTOR.index -> builder.groupId = deserializeString()
                GROUPNAME_DESCRIPTOR.index -> builder.groupName = deserializeString()
                PARTITIONCOUNT_DESCRIPTOR.index -> builder.partitionCount = deserializeInt()
                SPREADLEVEL_DESCRIPTOR.index -> builder.spreadLevel = deserializeString().let { SpreadLevel.fromValue(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { PlacementGroupState.fromValue(it) }
                STRATEGY_DESCRIPTOR.index -> builder.strategy = deserializeString().let { PlacementStrategy.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
