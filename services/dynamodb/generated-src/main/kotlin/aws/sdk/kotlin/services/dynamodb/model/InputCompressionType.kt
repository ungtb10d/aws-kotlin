// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

public sealed class InputCompressionType {

    public abstract val value: kotlin.String

    public object Gzip : aws.sdk.kotlin.services.dynamodb.model.InputCompressionType() {
        override val value: kotlin.String = "GZIP"
        override fun toString(): kotlin.String = value
    }

    public object None : aws.sdk.kotlin.services.dynamodb.model.InputCompressionType() {
        override val value: kotlin.String = "NONE"
        override fun toString(): kotlin.String = value
    }

    public object Zstd : aws.sdk.kotlin.services.dynamodb.model.InputCompressionType() {
        override val value: kotlin.String = "ZSTD"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.InputCompressionType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.InputCompressionType = when(str) {
            "GZIP" -> Gzip
            "NONE" -> None
            "ZSTD" -> Zstd
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.InputCompressionType> = listOf(
            Gzip,
            None,
            Zstd
        )
    }
}
