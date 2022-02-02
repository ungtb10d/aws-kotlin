// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.services.sts.model.PackedPolicyTooLargeException
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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
import aws.smithy.kotlin.runtime.serde.xml.XmlError
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class PackedPolicyTooLargeExceptionDeserializer: HttpDeserialize<PackedPolicyTooLargeException> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): PackedPolicyTooLargeException {
        val builder = PackedPolicyTooLargeException.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializePackedPolicyTooLargeExceptionError(builder, payload)
        }
        return builder.build()
    }
}

internal fun deserializePackedPolicyTooLargeExceptionError(builder: PackedPolicyTooLargeException.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val MESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("message"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Error"))
        trait(XmlError)
        trait(XmlNamespace("https://sts.amazonaws.com/doc/2011-06-15/"))
        field(MESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                MESSAGE_DESCRIPTOR.index -> builder.message = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}