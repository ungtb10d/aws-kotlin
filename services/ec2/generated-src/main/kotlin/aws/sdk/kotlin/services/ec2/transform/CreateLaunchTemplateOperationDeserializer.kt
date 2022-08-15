// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.LaunchTemplate
import aws.sdk.kotlin.services.ec2.model.ValidationWarning
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


internal class CreateLaunchTemplateOperationDeserializer: HttpDeserialize<CreateLaunchTemplateResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CreateLaunchTemplateResponse {
        if (!response.status.isSuccess()) {
            throwCreateLaunchTemplateError(context, response)
        }
        val builder = CreateLaunchTemplateResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCreateLaunchTemplateOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwCreateLaunchTemplateError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeCreateLaunchTemplateOperationBody(builder: CreateLaunchTemplateResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val LAUNCHTEMPLATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("launchTemplate"))
    val WARNING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("warning"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("CreateLaunchTemplateResult"))
        field(LAUNCHTEMPLATE_DESCRIPTOR)
        field(WARNING_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LAUNCHTEMPLATE_DESCRIPTOR.index -> builder.launchTemplate = deserializeLaunchTemplateDocument(deserializer)
                WARNING_DESCRIPTOR.index -> builder.warning = deserializeValidationWarningDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
