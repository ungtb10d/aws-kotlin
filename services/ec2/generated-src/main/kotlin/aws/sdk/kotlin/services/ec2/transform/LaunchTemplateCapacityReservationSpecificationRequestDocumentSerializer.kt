// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateCapacityReservationSpecificationRequest
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

internal fun serializeLaunchTemplateCapacityReservationSpecificationRequestDocument(serializer: Serializer, input: LaunchTemplateCapacityReservationSpecificationRequest) {
    val CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("CapacityReservationPreference"))
    val CAPACITYRESERVATIONTARGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("CapacityReservationTarget"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateCapacityReservationSpecificationRequest"))
        field(CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR)
        field(CAPACITYRESERVATIONTARGET_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.capacityReservationPreference?.let { field(CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR, it.value) }
        input.capacityReservationTarget?.let { field(CAPACITYRESERVATIONTARGET_DESCRIPTOR, it, ::serializeCapacityReservationTargetDocument) }
    }
}
