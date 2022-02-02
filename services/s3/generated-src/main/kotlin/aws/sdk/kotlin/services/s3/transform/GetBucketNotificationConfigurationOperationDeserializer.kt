// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration
import aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationResponse
import aws.sdk.kotlin.services.s3.model.LambdaFunctionConfiguration
import aws.sdk.kotlin.services.s3.model.QueueConfiguration
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.TopicConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class GetBucketNotificationConfigurationOperationDeserializer: HttpDeserialize<GetBucketNotificationConfigurationResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetBucketNotificationConfigurationResponse {
        if (!response.status.isSuccess()) {
            throwGetBucketNotificationConfigurationError(context, response)
        }
        val builder = GetBucketNotificationConfigurationResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetBucketNotificationConfigurationOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwGetBucketNotificationConfigurationError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

private fun deserializeGetBucketNotificationConfigurationOperationBody(builder: GetBucketNotificationConfigurationResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val EVENTBRIDGECONFIGURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("EventBridgeConfiguration"))
    val LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("CloudFunctionConfiguration"), Flattened)
    val QUEUECONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("QueueConfiguration"), Flattened)
    val TOPICCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("TopicConfiguration"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NotificationConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(EVENTBRIDGECONFIGURATION_DESCRIPTOR)
        field(LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR)
        field(QUEUECONFIGURATIONS_DESCRIPTOR)
        field(TOPICCONFIGURATIONS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EVENTBRIDGECONFIGURATION_DESCRIPTOR.index -> builder.eventBridgeConfiguration = deserializeEventBridgeConfigurationDocument(deserializer)
                LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR.index -> builder.lambdaFunctionConfigurations =
                    deserializer.deserializeList(LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<LambdaFunctionConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeLambdaFunctionConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                QUEUECONFIGURATIONS_DESCRIPTOR.index -> builder.queueConfigurations =
                    deserializer.deserializeList(QUEUECONFIGURATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<QueueConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeQueueConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TOPICCONFIGURATIONS_DESCRIPTOR.index -> builder.topicConfigurations =
                    deserializer.deserializeList(TOPICCONFIGURATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<TopicConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTopicConfigurationDocument(deserializer) } else { deserializeNull(); continue }
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