// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.GetBucketAclResponse
import aws.sdk.kotlin.services.s3.model.Grant
import aws.sdk.kotlin.services.s3.model.Owner
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
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


internal class GetBucketAclOperationDeserializer: HttpDeserialize<GetBucketAclResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetBucketAclResponse {
        if (!response.status.isSuccess()) {
            throwGetBucketAclError(context, response)
        }
        val builder = GetBucketAclResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetBucketAclOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwGetBucketAclError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        if (payload == null && response.status == HttpStatusCode.NotFound) {
            S3ErrorDetails(code = "NotFound")
        } else {
            checkNotNull(payload){ "unable to parse error from empty response" }
            parseS3ErrorResponse(payload)
        }
    } catch (ex: Exception) {
        throw S3Exception("Failed to parse response as 'restXml' error", ex).also {
            setS3ErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        else -> S3Exception(errorDetails.message)
    }

    setS3ErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeGetBucketAclOperationBody(builder: GetBucketAclResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val GRANTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("AccessControlList"), XmlCollectionName("Grant"))
    val OWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Owner"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AccessControlPolicy"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(GRANTS_DESCRIPTOR)
        field(OWNER_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GRANTS_DESCRIPTOR.index -> builder.grants =
                    deserializer.deserializeList(GRANTS_DESCRIPTOR) {
                        val col0 = mutableListOf<Grant>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeGrantDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                OWNER_DESCRIPTOR.index -> builder.owner = deserializeOwnerDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
