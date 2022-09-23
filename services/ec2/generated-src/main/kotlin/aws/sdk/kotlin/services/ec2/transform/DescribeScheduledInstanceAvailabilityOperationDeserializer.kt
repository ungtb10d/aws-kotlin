// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.ScheduledInstanceAvailability
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class DescribeScheduledInstanceAvailabilityOperationDeserializer: HttpDeserialize<DescribeScheduledInstanceAvailabilityResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeScheduledInstanceAvailabilityResponse {
        if (!response.status.isSuccess()) {
            throwDescribeScheduledInstanceAvailabilityError(context, response)
        }
        val builder = DescribeScheduledInstanceAvailabilityResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeScheduledInstanceAvailabilityOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDescribeScheduledInstanceAvailabilityError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeDescribeScheduledInstanceAvailabilityOperationBody(builder: DescribeScheduledInstanceAvailabilityResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val SCHEDULEDINSTANCEAVAILABILITYSET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("scheduledInstanceAvailabilitySet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DescribeScheduledInstanceAvailabilityResult"))
        field(NEXTTOKEN_DESCRIPTOR)
        field(SCHEDULEDINSTANCEAVAILABILITYSET_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                SCHEDULEDINSTANCEAVAILABILITYSET_DESCRIPTOR.index -> builder.scheduledInstanceAvailabilitySet =
                    deserializer.deserializeList(SCHEDULEDINSTANCEAVAILABILITYSET_DESCRIPTOR) {
                        val col0 = mutableListOf<ScheduledInstanceAvailability>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeScheduledInstanceAvailabilityDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
