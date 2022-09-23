// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

public sealed class Payer {

    public abstract val value: kotlin.String

    public object BucketOwner : aws.sdk.kotlin.services.s3.model.Payer() {
        override val value: kotlin.String = "BucketOwner"
        override fun toString(): kotlin.String = value
    }

    public object Requester : aws.sdk.kotlin.services.s3.model.Payer() {
        override val value: kotlin.String = "Requester"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.Payer() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.Payer = when(str) {
            "BucketOwner" -> BucketOwner
            "Requester" -> Requester
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.Payer> = listOf(
            BucketOwner,
            Requester
        )
    }
}
