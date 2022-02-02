// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.UnsuccessfulItem
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


internal class DeleteVpcEndpointConnectionNotificationsOperationDeserializer: HttpDeserialize<DeleteVpcEndpointConnectionNotificationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DeleteVpcEndpointConnectionNotificationsResponse {
        if (!response.status.isSuccess()) {
            throwDeleteVpcEndpointConnectionNotificationsError(context, response)
        }
        val builder = DeleteVpcEndpointConnectionNotificationsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDeleteVpcEndpointConnectionNotificationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDeleteVpcEndpointConnectionNotificationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeDeleteVpcEndpointConnectionNotificationsOperationBody(builder: DeleteVpcEndpointConnectionNotificationsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val UNSUCCESSFUL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("unsuccessful"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DeleteVpcEndpointConnectionNotificationsResult"))
        field(UNSUCCESSFUL_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                UNSUCCESSFUL_DESCRIPTOR.index -> builder.unsuccessful =
                    deserializer.deserializeList(UNSUCCESSFUL_DESCRIPTOR) {
                        val col0 = mutableListOf<UnsuccessfulItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeUnsuccessfulItemDocument(deserializer) } else { deserializeNull(); continue }
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