// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ObjectLockRetention
import aws.sdk.kotlin.services.s3.model.PutObjectRetentionRequest
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


internal class PutObjectRetentionOperationSerializer: HttpSerialize<PutObjectRetentionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutObjectRetentionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("retention", "")
                if (input.versionId != null) append("versionId", input.versionId)
            }
        }

        builder.headers {
            if (input.bypassGovernanceRetention != false) append("x-amz-bypass-governance-retention", "${input.bypassGovernanceRetention}")
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
        }

        if (input.retention != null) {
            val payload = serializeObjectLockRetentionPayloadWithXmlNameRetention(input.retention)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}