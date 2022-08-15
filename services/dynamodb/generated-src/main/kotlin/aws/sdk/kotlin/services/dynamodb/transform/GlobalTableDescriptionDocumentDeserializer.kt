// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription
import aws.sdk.kotlin.services.dynamodb.model.GlobalTableStatus
import aws.sdk.kotlin.services.dynamodb.model.ReplicaDescription
import aws.smithy.kotlin.runtime.serde.Deserializer
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
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeGlobalTableDescriptionDocument(deserializer: Deserializer): GlobalTableDescription {
    val builder = GlobalTableDescription.Builder()
    val CREATIONDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("CreationDateTime"))
    val GLOBALTABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableArn"))
    val GLOBALTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableName"))
    val GLOBALTABLESTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableStatus"))
    val REPLICATIONGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ReplicationGroup"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CREATIONDATETIME_DESCRIPTOR)
        field(GLOBALTABLEARN_DESCRIPTOR)
        field(GLOBALTABLENAME_DESCRIPTOR)
        field(GLOBALTABLESTATUS_DESCRIPTOR)
        field(REPLICATIONGROUP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATIONDATETIME_DESCRIPTOR.index -> builder.creationDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                GLOBALTABLEARN_DESCRIPTOR.index -> builder.globalTableArn = deserializeString()
                GLOBALTABLENAME_DESCRIPTOR.index -> builder.globalTableName = deserializeString()
                GLOBALTABLESTATUS_DESCRIPTOR.index -> builder.globalTableStatus = deserializeString().let { GlobalTableStatus.fromValue(it) }
                REPLICATIONGROUP_DESCRIPTOR.index -> builder.replicationGroup =
                    deserializer.deserializeList(REPLICATIONGROUP_DESCRIPTOR) {
                        val col0 = mutableListOf<ReplicaDescription>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeReplicaDescriptionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
