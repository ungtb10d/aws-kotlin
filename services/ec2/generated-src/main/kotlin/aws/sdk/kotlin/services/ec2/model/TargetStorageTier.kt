// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class TargetStorageTier {

    public abstract val value: kotlin.String

    public object Archive : aws.sdk.kotlin.services.ec2.model.TargetStorageTier() {
        override val value: kotlin.String = "archive"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TargetStorageTier() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TargetStorageTier = when(str) {
            "archive" -> Archive
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TargetStorageTier> = listOf(
            Archive
        )
    }
}
