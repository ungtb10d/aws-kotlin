// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class StaticSourcesSupportValue {

    public abstract val value: kotlin.String

    public object Disable : aws.sdk.kotlin.services.ec2.model.StaticSourcesSupportValue() {
        override val value: kotlin.String = "disable"
        override fun toString(): kotlin.String = value
    }

    public object Enable : aws.sdk.kotlin.services.ec2.model.StaticSourcesSupportValue() {
        override val value: kotlin.String = "enable"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.StaticSourcesSupportValue() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.StaticSourcesSupportValue = when(str) {
            "disable" -> Disable
            "enable" -> Enable
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.StaticSourcesSupportValue> = listOf(
            Disable,
            Enable
        )
    }
}
