// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Placement
import aws.sdk.kotlin.services.ec2.model.Tenancy
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

internal fun deserializePlacementDocument(deserializer: Deserializer): Placement {
    val builder = Placement.Builder()
    val AFFINITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("affinity"))
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupName"))
    val HOSTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hostId"))
    val HOSTRESOURCEGROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hostResourceGroupArn"))
    val PARTITIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("partitionNumber"))
    val SPREADDOMAIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("spreadDomain"))
    val TENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("tenancy"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Placement"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AFFINITY_DESCRIPTOR)
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(HOSTID_DESCRIPTOR)
        field(HOSTRESOURCEGROUPARN_DESCRIPTOR)
        field(PARTITIONNUMBER_DESCRIPTOR)
        field(SPREADDOMAIN_DESCRIPTOR)
        field(TENANCY_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AFFINITY_DESCRIPTOR.index -> builder.affinity = deserializeString()
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                GROUPNAME_DESCRIPTOR.index -> builder.groupName = deserializeString()
                HOSTID_DESCRIPTOR.index -> builder.hostId = deserializeString()
                HOSTRESOURCEGROUPARN_DESCRIPTOR.index -> builder.hostResourceGroupArn = deserializeString()
                PARTITIONNUMBER_DESCRIPTOR.index -> builder.partitionNumber = deserializeInt()
                SPREADDOMAIN_DESCRIPTOR.index -> builder.spreadDomain = deserializeString()
                TENANCY_DESCRIPTOR.index -> builder.tenancy = deserializeString().let { Tenancy.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
