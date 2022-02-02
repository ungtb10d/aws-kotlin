// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.NotificationConfiguration
import aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest
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


internal class PutBucketNotificationConfigurationOperationSerializer: HttpSerialize<PutBucketNotificationConfigurationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutBucketNotificationConfigurationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("notification", "")
            }
        }

        builder.headers {
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.skipDestinationValidation != false) append("x-amz-skip-destination-validation", "${input.skipDestinationValidation}")
        }

        if (input.notificationConfiguration != null) {
            val payload = serializeNotificationConfigurationPayloadWithXmlNameNotificationConfiguration(input.notificationConfiguration)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}