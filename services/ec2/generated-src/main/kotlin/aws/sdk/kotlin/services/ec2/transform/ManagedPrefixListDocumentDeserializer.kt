// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ManagedPrefixList
import aws.sdk.kotlin.services.ec2.model.PrefixListState
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

internal fun deserializeManagedPrefixListDocument(deserializer: Deserializer): ManagedPrefixList {
    val builder = ManagedPrefixList.Builder()
    val ADDRESSFAMILY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("addressFamily"))
    val MAXENTRIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("maxEntries"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PREFIXLISTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("prefixListArn"))
    val PREFIXLISTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("prefixListId"))
    val PREFIXLISTNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("prefixListName"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STATEMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("stateMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("version"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ManagedPrefixList"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ADDRESSFAMILY_DESCRIPTOR)
        field(MAXENTRIES_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PREFIXLISTARN_DESCRIPTOR)
        field(PREFIXLISTID_DESCRIPTOR)
        field(PREFIXLISTNAME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATEMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VERSION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ADDRESSFAMILY_DESCRIPTOR.index -> builder.addressFamily = deserializeString()
                MAXENTRIES_DESCRIPTOR.index -> builder.maxEntries = deserializeInt()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PREFIXLISTARN_DESCRIPTOR.index -> builder.prefixListArn = deserializeString()
                PREFIXLISTID_DESCRIPTOR.index -> builder.prefixListId = deserializeString()
                PREFIXLISTNAME_DESCRIPTOR.index -> builder.prefixListName = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { PrefixListState.fromValue(it) }
                STATEMESSAGE_DESCRIPTOR.index -> builder.stateMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VERSION_DESCRIPTOR.index -> builder.version = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}