// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class CopyTagsFromSource {

    public abstract val value: kotlin.String

    public object Volume : aws.sdk.kotlin.services.ec2.model.CopyTagsFromSource() {
        override val value: kotlin.String = "volume"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.CopyTagsFromSource() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.CopyTagsFromSource = when(str) {
            "volume" -> Volume
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.CopyTagsFromSource> = listOf(
            Volume
        )
    }
}
