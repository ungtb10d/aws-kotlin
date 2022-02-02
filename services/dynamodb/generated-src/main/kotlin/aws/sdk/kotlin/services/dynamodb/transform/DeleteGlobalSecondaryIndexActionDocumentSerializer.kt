// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.DeleteGlobalSecondaryIndexAction
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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

internal fun serializeDeleteGlobalSecondaryIndexActionDocument(serializer: Serializer, input: DeleteGlobalSecondaryIndexAction) {
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(INDEXNAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.indexName?.let { field(INDEXNAME_DESCRIPTOR, it) }
    }
}