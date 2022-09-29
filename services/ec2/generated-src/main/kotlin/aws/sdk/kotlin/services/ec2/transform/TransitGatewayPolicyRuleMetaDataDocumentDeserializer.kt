// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData
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

internal fun deserializeTransitGatewayPolicyRuleMetaDataDocument(deserializer: Deserializer): TransitGatewayPolicyRuleMetaData {
    val builder = TransitGatewayPolicyRuleMetaData.Builder()
    val METADATAKEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("metaDataKey"))
    val METADATAVALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("metaDataValue"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayPolicyRuleMetaData"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(METADATAKEY_DESCRIPTOR)
        field(METADATAVALUE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                METADATAKEY_DESCRIPTOR.index -> builder.metaDataKey = deserializeString()
                METADATAVALUE_DESCRIPTOR.index -> builder.metaDataValue = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
