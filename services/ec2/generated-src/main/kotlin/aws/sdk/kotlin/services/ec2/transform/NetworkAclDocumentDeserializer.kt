// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.NetworkAcl
import aws.sdk.kotlin.services.ec2.model.NetworkAclAssociation
import aws.sdk.kotlin.services.ec2.model.NetworkAclEntry
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

internal fun deserializeNetworkAclDocument(deserializer: Deserializer): NetworkAcl {
    val builder = NetworkAcl.Builder()
    val ASSOCIATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("associationSet"), XmlCollectionName("item"))
    val ENTRIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("entrySet"), XmlCollectionName("item"))
    val ISDEFAULT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("default"))
    val NETWORKACLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkAclId"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkAcl"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATIONS_DESCRIPTOR)
        field(ENTRIES_DESCRIPTOR)
        field(ISDEFAULT_DESCRIPTOR)
        field(NETWORKACLID_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATIONS_DESCRIPTOR.index -> builder.associations =
                    deserializer.deserializeList(ASSOCIATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<NetworkAclAssociation>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNetworkAclAssociationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ENTRIES_DESCRIPTOR.index -> builder.entries =
                    deserializer.deserializeList(ENTRIES_DESCRIPTOR) {
                        val col0 = mutableListOf<NetworkAclEntry>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNetworkAclEntryDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                ISDEFAULT_DESCRIPTOR.index -> builder.isDefault = deserializeBoolean()
                NETWORKACLID_DESCRIPTOR.index -> builder.networkAclId = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
