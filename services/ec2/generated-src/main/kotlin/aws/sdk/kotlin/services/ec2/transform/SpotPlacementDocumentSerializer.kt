// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SpotPlacement
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeSpotPlacementDocument(serializer: Serializer, input: SpotPlacement) {
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AvailabilityZone"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("GroupName"))
    val TENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("Tenancy"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SpotPlacement"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(TENANCY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.availabilityZone?.let { field(AVAILABILITYZONE_DESCRIPTOR, it) }
        input.groupName?.let { field(GROUPNAME_DESCRIPTOR, it) }
        input.tenancy?.let { field(TENANCY_DESCRIPTOR, it.value) }
    }
}
