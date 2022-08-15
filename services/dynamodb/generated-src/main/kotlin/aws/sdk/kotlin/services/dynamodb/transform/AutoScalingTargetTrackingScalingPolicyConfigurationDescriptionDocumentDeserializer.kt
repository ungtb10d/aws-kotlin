// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
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

internal fun deserializeAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionDocument(deserializer: Deserializer): AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
    val builder = AutoScalingTargetTrackingScalingPolicyConfigurationDescription.Builder()
    val DISABLESCALEIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, JsonSerialName("DisableScaleIn"))
    val SCALEINCOOLDOWN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("ScaleInCooldown"))
    val SCALEOUTCOOLDOWN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("ScaleOutCooldown"))
    val TARGETVALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, JsonSerialName("TargetValue"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(DISABLESCALEIN_DESCRIPTOR)
        field(SCALEINCOOLDOWN_DESCRIPTOR)
        field(SCALEOUTCOOLDOWN_DESCRIPTOR)
        field(TARGETVALUE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DISABLESCALEIN_DESCRIPTOR.index -> builder.disableScaleIn = deserializeBoolean()
                SCALEINCOOLDOWN_DESCRIPTOR.index -> builder.scaleInCooldown = deserializeInt()
                SCALEOUTCOOLDOWN_DESCRIPTOR.index -> builder.scaleOutCooldown = deserializeInt()
                TARGETVALUE_DESCRIPTOR.index -> builder.targetValue = deserializeDouble()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
