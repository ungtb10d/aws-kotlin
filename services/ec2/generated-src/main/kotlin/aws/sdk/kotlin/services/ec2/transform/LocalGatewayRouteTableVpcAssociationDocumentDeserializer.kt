// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteTableVpcAssociation
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

internal fun deserializeLocalGatewayRouteTableVpcAssociationDocument(deserializer: Deserializer): LocalGatewayRouteTableVpcAssociation {
    val builder = LocalGatewayRouteTableVpcAssociation.Builder()
    val LOCALGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayId"))
    val LOCALGATEWAYROUTETABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableArn"))
    val LOCALGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableId"))
    val LOCALGATEWAYROUTETABLEVPCASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableVpcAssociationId"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LocalGatewayRouteTableVpcAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(LOCALGATEWAYID_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEARN_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEID_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEVPCASSOCIATIONID_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LOCALGATEWAYID_DESCRIPTOR.index -> builder.localGatewayId = deserializeString()
                LOCALGATEWAYROUTETABLEARN_DESCRIPTOR.index -> builder.localGatewayRouteTableArn = deserializeString()
                LOCALGATEWAYROUTETABLEID_DESCRIPTOR.index -> builder.localGatewayRouteTableId = deserializeString()
                LOCALGATEWAYROUTETABLEVPCASSOCIATIONID_DESCRIPTOR.index -> builder.localGatewayRouteTableVpcAssociationId = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString()
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