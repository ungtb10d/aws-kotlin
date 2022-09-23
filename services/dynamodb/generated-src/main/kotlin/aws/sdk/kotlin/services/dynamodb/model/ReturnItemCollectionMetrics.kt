// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

public sealed class ReturnItemCollectionMetrics {

    public abstract val value: kotlin.String

    public object None : aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics() {
        override val value: kotlin.String = "NONE"
        override fun toString(): kotlin.String = value
    }

    public object Size : aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics() {
        override val value: kotlin.String = "SIZE"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics = when(str) {
            "NONE" -> None
            "SIZE" -> Size
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.ReturnItemCollectionMetrics> = listOf(
            None,
            Size
        )
    }
}
