// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.CompleteMultipartUploadResponse
import aws.sdk.kotlin.services.s3.model.RequestCharged
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class CompleteMultipartUploadOperationDeserializer: HttpDeserialize<CompleteMultipartUploadResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CompleteMultipartUploadResponse {
        if (!response.status.isSuccess()) {
            throwCompleteMultipartUploadError(context, response)
        }
        val builder = CompleteMultipartUploadResponse.Builder()

        builder.bucketKeyEnabled = response.headers["x-amz-server-side-encryption-bucket-key-enabled"]?.toBoolean() ?: false
        builder.expiration = response.headers["x-amz-expiration"]
        builder.requestCharged = response.headers["x-amz-request-charged"]?.let { RequestCharged.fromValue(it) }
        builder.ssekmsKeyId = response.headers["x-amz-server-side-encryption-aws-kms-key-id"]
        builder.serverSideEncryption = response.headers["x-amz-server-side-encryption"]?.let { ServerSideEncryption.fromValue(it) }
        builder.versionId = response.headers["x-amz-version-id"]

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCompleteMultipartUploadOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwCompleteMultipartUploadError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeCompleteMultipartUploadOperationBody(builder: CompleteMultipartUploadResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Bucket"))
    val ETAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ETag"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Key"))
    val LOCATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Location"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("CompleteMultipartUploadResult"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(BUCKET_DESCRIPTOR)
        field(ETAG_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(LOCATION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BUCKET_DESCRIPTOR.index -> builder.bucket = deserializeString()
                ETAG_DESCRIPTOR.index -> builder.eTag = deserializeString()
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                LOCATION_DESCRIPTOR.index -> builder.location = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}