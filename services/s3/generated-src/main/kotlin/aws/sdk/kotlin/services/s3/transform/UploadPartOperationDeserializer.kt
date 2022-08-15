// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.RequestCharged
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
import aws.sdk.kotlin.services.s3.model.UploadPartResponse
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse


internal class UploadPartOperationDeserializer: HttpDeserialize<UploadPartResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): UploadPartResponse {
        if (!response.status.isSuccess()) {
            throwUploadPartError(context, response)
        }
        val builder = UploadPartResponse.Builder()

        builder.bucketKeyEnabled = response.headers["x-amz-server-side-encryption-bucket-key-enabled"]?.toBoolean() ?: false
        builder.checksumCrc32 = response.headers["x-amz-checksum-crc32"]
        builder.checksumCrc32C = response.headers["x-amz-checksum-crc32c"]
        builder.checksumSha1 = response.headers["x-amz-checksum-sha1"]
        builder.checksumSha256 = response.headers["x-amz-checksum-sha256"]
        builder.eTag = response.headers["ETag"]
        builder.requestCharged = response.headers["x-amz-request-charged"]?.let { RequestCharged.fromValue(it) }
        builder.sseCustomerAlgorithm = response.headers["x-amz-server-side-encryption-customer-algorithm"]
        builder.sseCustomerKeyMd5 = response.headers["x-amz-server-side-encryption-customer-key-MD5"]
        builder.ssekmsKeyId = response.headers["x-amz-server-side-encryption-aws-kms-key-id"]
        builder.serverSideEncryption = response.headers["x-amz-server-side-encryption"]?.let { ServerSideEncryption.fromValue(it) }

        return builder.build()
    }
}

private suspend fun throwUploadPartError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
