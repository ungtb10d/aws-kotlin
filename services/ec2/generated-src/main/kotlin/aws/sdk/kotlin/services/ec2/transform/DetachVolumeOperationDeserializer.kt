// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DetachVolumeResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.VolumeAttachmentState
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
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
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant


internal class DetachVolumeOperationDeserializer: HttpDeserialize<DetachVolumeResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DetachVolumeResponse {
        if (!response.status.isSuccess()) {
            throwDetachVolumeError(context, response)
        }
        val builder = DetachVolumeResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDetachVolumeOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDetachVolumeError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw Ec2Exception("Failed to parse response as 'ec2Query' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        else -> Ec2Exception(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeDetachVolumeOperationBody(builder: DetachVolumeResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ATTACHTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("attachTime"))
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("deleteOnTermination"))
    val DEVICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("device"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("status"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DetachVolumeResult"))
        field(ATTACHTIME_DESCRIPTOR)
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(DEVICE_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTACHTIME_DESCRIPTOR.index -> builder.attachTime = deserializeString().let { Instant.fromIso8601(it) }
                DELETEONTERMINATION_DESCRIPTOR.index -> builder.deleteOnTermination = deserializeBoolean()
                DEVICE_DESCRIPTOR.index -> builder.device = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { VolumeAttachmentState.fromValue(it) }
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
