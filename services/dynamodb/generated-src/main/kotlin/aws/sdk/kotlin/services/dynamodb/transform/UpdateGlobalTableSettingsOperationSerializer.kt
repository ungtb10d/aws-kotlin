// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate
import aws.sdk.kotlin.services.dynamodb.model.BillingMode
import aws.sdk.kotlin.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate
import aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsUpdate
import aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableSettingsRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
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
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class UpdateGlobalTableSettingsOperationSerializer: HttpSerialize<UpdateGlobalTableSettingsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: UpdateGlobalTableSettingsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeUpdateGlobalTableSettingsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        }
        return builder
    }
}

private fun serializeUpdateGlobalTableSettingsOperationBody(context: ExecutionContext, input: UpdateGlobalTableSettingsRequest): ByteArray {
    val serializer = JsonSerializer()
    val GLOBALTABLEBILLINGMODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableBillingMode"))
    val GLOBALTABLEGLOBALSECONDARYINDEXSETTINGSUPDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("GlobalTableGlobalSecondaryIndexSettingsUpdate"))
    val GLOBALTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableName"))
    val GLOBALTABLEPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate"))
    val GLOBALTABLEPROVISIONEDWRITECAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("GlobalTableProvisionedWriteCapacityUnits"))
    val REPLICASETTINGSUPDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ReplicaSettingsUpdate"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALTABLEBILLINGMODE_DESCRIPTOR)
        field(GLOBALTABLEGLOBALSECONDARYINDEXSETTINGSUPDATE_DESCRIPTOR)
        field(GLOBALTABLENAME_DESCRIPTOR)
        field(GLOBALTABLEPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_DESCRIPTOR)
        field(GLOBALTABLEPROVISIONEDWRITECAPACITYUNITS_DESCRIPTOR)
        field(REPLICASETTINGSUPDATE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.globalTableBillingMode?.let { field(GLOBALTABLEBILLINGMODE_DESCRIPTOR, it.value) }
        if (input.globalTableGlobalSecondaryIndexSettingsUpdate != null) {
            listField(GLOBALTABLEGLOBALSECONDARYINDEXSETTINGSUPDATE_DESCRIPTOR) {
                for (el0 in input.globalTableGlobalSecondaryIndexSettingsUpdate) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGlobalTableGlobalSecondaryIndexSettingsUpdateDocument))
                }
            }
        }
        input.globalTableName?.let { field(GLOBALTABLENAME_DESCRIPTOR, it) }
        input.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate?.let { field(GLOBALTABLEPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_DESCRIPTOR, it, ::serializeAutoScalingSettingsUpdateDocument) }
        input.globalTableProvisionedWriteCapacityUnits?.let { field(GLOBALTABLEPROVISIONEDWRITECAPACITYUNITS_DESCRIPTOR, it) }
        if (input.replicaSettingsUpdate != null) {
            listField(REPLICASETTINGSUPDATE_DESCRIPTOR) {
                for (el0 in input.replicaSettingsUpdate) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeReplicaSettingsUpdateDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
