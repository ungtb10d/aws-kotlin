// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.CancellationReason
import aws.sdk.kotlin.services.dynamodb.model.TransactionCanceledException
import aws.smithy.kotlin.runtime.client.ExecutionContext
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
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class TransactionCanceledExceptionDeserializer: HttpDeserialize<TransactionCanceledException> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): TransactionCanceledException {
        val builder = TransactionCanceledException.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeTransactionCanceledExceptionError(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeTransactionCanceledExceptionError(builder: TransactionCanceledException.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val CANCELLATIONREASONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("CancellationReasons"))
    val MESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("Message"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CANCELLATIONREASONS_DESCRIPTOR)
        field(MESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CANCELLATIONREASONS_DESCRIPTOR.index -> builder.cancellationReasons =
                    deserializer.deserializeList(CANCELLATIONREASONS_DESCRIPTOR) {
                        val col0 = mutableListOf<CancellationReason>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeCancellationReasonDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                MESSAGE_DESCRIPTOR.index -> builder.message = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}