// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

public sealed class TimeToLiveStatus {

    public abstract val value: kotlin.String

    public object Disabled : aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus() {
        override val value: kotlin.String = "DISABLED"
        override fun toString(): kotlin.String = value
    }

    public object Disabling : aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus() {
        override val value: kotlin.String = "DISABLING"
        override fun toString(): kotlin.String = value
    }

    public object Enabled : aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus() {
        override val value: kotlin.String = "ENABLED"
        override fun toString(): kotlin.String = value
    }

    public object Enabling : aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus() {
        override val value: kotlin.String = "ENABLING"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus = when(str) {
            "DISABLED" -> Disabled
            "DISABLING" -> Disabling
            "ENABLED" -> Enabled
            "ENABLING" -> Enabling
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.TimeToLiveStatus> = listOf(
            Disabled,
            Disabling,
            Enabled,
            Enabling
        )
    }
}
