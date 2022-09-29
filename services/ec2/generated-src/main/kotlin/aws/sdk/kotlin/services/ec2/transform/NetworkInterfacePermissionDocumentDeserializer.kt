// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InterfacePermissionType
import aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission
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

internal fun deserializeNetworkInterfacePermissionDocument(deserializer: Deserializer): NetworkInterfacePermission {
    val builder = NetworkInterfacePermission.Builder()
    val AWSACCOUNTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("awsAccountId"))
    val AWSSERVICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("awsService"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val NETWORKINTERFACEPERMISSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfacePermissionId"))
    val PERMISSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("permission"))
    val PERMISSIONSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("permissionState"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInterfacePermission"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AWSACCOUNTID_DESCRIPTOR)
        field(AWSSERVICE_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(NETWORKINTERFACEPERMISSIONID_DESCRIPTOR)
        field(PERMISSION_DESCRIPTOR)
        field(PERMISSIONSTATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AWSACCOUNTID_DESCRIPTOR.index -> builder.awsAccountId = deserializeString()
                AWSSERVICE_DESCRIPTOR.index -> builder.awsService = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                NETWORKINTERFACEPERMISSIONID_DESCRIPTOR.index -> builder.networkInterfacePermissionId = deserializeString()
                PERMISSION_DESCRIPTOR.index -> builder.permission = deserializeString().let { InterfacePermissionType.fromValue(it) }
                PERMISSIONSTATE_DESCRIPTOR.index -> builder.permissionState = deserializeNetworkInterfacePermissionStateDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
