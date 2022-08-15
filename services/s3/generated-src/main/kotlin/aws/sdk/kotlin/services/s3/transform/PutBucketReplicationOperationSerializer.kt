// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest
import aws.sdk.kotlin.services.s3.model.ReplicationConfiguration
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


internal class PutBucketReplicationOperationSerializer: HttpSerialize<PutBucketReplicationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutBucketReplicationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("replication", "")
            }
        }

        builder.headers {
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.token?.isNotEmpty() == true) append("x-amz-bucket-object-lock-token", input.token)
        }

        if (input.replicationConfiguration != null) {
            val payload = serializeReplicationConfigurationPayloadWithXmlNameReplicationConfiguration(input.replicationConfiguration)
            builder.body = ByteArrayContent(payload)
        }
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/xml")
        }
        return builder
    }
}
