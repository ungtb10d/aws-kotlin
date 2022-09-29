// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus
import aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode
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

internal fun deserializeClientVpnAuthorizationRuleStatusDocument(deserializer: Deserializer): ClientVpnAuthorizationRuleStatus {
    val builder = ClientVpnAuthorizationRuleStatus.Builder()
    val CODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("code"))
    val MESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("message"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ClientVpnAuthorizationRuleStatus"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CODE_DESCRIPTOR)
        field(MESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CODE_DESCRIPTOR.index -> builder.code = deserializeString().let { ClientVpnAuthorizationRuleStatusCode.fromValue(it) }
                MESSAGE_DESCRIPTOR.index -> builder.message = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
