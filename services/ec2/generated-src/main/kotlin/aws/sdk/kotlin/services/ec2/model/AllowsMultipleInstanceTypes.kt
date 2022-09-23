// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class AllowsMultipleInstanceTypes {

    public abstract val value: kotlin.String

    public object Off : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override val value: kotlin.String = "off"
        override fun toString(): kotlin.String = value
    }

    public object On : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override val value: kotlin.String = "on"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes = when(str) {
            "off" -> Off
            "on" -> On
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes> = listOf(
            Off,
            On
        )
    }
}
