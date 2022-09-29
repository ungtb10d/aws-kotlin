// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ChecksumMode
import aws.sdk.kotlin.services.s3.model.HeadObjectRequest
import aws.sdk.kotlin.services.s3.model.RequestPayer
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class HeadObjectOperationSerializer: HttpSerialize<HeadObjectRequest> {
    override suspend fun serialize(context: ExecutionContext, input: HeadObjectRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.HEAD

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                if (input.partNumber != 0) append("partNumber", "${input.partNumber}")
                if (input.versionId != null) append("versionId", input.versionId)
            }
        }

        builder.headers {
            if (input.checksumMode != null) append("x-amz-checksum-mode", input.checksumMode.value)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.ifMatch?.isNotEmpty() == true) append("If-Match", input.ifMatch)
            if (input.ifModifiedSince != null) append("If-Modified-Since", input.ifModifiedSince.format(TimestampFormat.RFC_5322))
            if (input.ifNoneMatch?.isNotEmpty() == true) append("If-None-Match", input.ifNoneMatch)
            if (input.ifUnmodifiedSince != null) append("If-Unmodified-Since", input.ifUnmodifiedSince.format(TimestampFormat.RFC_5322))
            if (input.range?.isNotEmpty() == true) append("Range", input.range)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
            if (input.sseCustomerAlgorithm?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-algorithm", input.sseCustomerAlgorithm)
            if (input.sseCustomerKey?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-key", input.sseCustomerKey)
            if (input.sseCustomerKeyMd5?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-key-MD5", input.sseCustomerKeyMd5)
        }

        return builder
    }
}
