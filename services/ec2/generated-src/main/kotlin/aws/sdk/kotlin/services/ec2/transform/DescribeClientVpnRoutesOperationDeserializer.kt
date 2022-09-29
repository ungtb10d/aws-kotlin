// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.ClientVpnRoute
import aws.sdk.kotlin.services.ec2.model.DescribeClientVpnRoutesResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
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


internal class DescribeClientVpnRoutesOperationDeserializer: HttpDeserialize<DescribeClientVpnRoutesResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeClientVpnRoutesResponse {
        if (!response.status.isSuccess()) {
            throwDescribeClientVpnRoutesError(context, response)
        }
        val builder = DescribeClientVpnRoutesResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeClientVpnRoutesOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwDescribeClientVpnRoutesError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeDescribeClientVpnRoutesOperationBody(builder: DescribeClientVpnRoutesResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val ROUTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("routes"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DescribeClientVpnRoutesResult"))
        field(NEXTTOKEN_DESCRIPTOR)
        field(ROUTES_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                ROUTES_DESCRIPTOR.index -> builder.routes =
                    deserializer.deserializeList(ROUTES_DESCRIPTOR) {
                        val col0 = mutableListOf<ClientVpnRoute>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeClientVpnRouteDocument(deserializer) } else { deserializeNull(); continue }
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
