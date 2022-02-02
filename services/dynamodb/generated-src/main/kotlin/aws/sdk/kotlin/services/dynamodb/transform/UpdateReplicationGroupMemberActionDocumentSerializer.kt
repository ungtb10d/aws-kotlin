// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.UpdateReplicationGroupMemberAction
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

internal fun serializeUpdateReplicationGroupMemberActionDocument(serializer: Serializer, input: UpdateReplicationGroupMemberAction) {
    val GLOBALSECONDARYINDEXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("GlobalSecondaryIndexes"))
    val KMSMASTERKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("KMSMasterKeyId"))
    val PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("ProvisionedThroughputOverride"))
    val REGIONNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("RegionName"))
    val TABLECLASSOVERRIDE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableClassOverride"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALSECONDARYINDEXES_DESCRIPTOR)
        field(KMSMASTERKEYID_DESCRIPTOR)
        field(PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR)
        field(REGIONNAME_DESCRIPTOR)
        field(TABLECLASSOVERRIDE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.regionName?.let { field(REGIONNAME_DESCRIPTOR, it) }
        input.kmsMasterKeyId?.let { field(KMSMASTERKEYID_DESCRIPTOR, it) }
        input.provisionedThroughputOverride?.let { field(PROVISIONEDTHROUGHPUTOVERRIDE_DESCRIPTOR, it, ::serializeProvisionedThroughputOverrideDocument) }
        if (input.globalSecondaryIndexes != null) {
            listField(GLOBALSECONDARYINDEXES_DESCRIPTOR) {
                for (el0 in input.globalSecondaryIndexes) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeReplicaGlobalSecondaryIndexDocument))
                }
            }
        }
        input.tableClassOverride?.let { field(TABLECLASSOVERRIDE_DESCRIPTOR, it.value) }
    }
}