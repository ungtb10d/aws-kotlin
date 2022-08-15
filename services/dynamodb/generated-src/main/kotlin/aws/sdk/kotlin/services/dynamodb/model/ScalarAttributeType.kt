// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import kotlin.collections.List

public sealed class ScalarAttributeType {

    public abstract val value: kotlin.String

    public object B : aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType() {
        override val value: kotlin.String = "B"
        override fun toString(): kotlin.String = value
    }

    public object N : aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType() {
        override val value: kotlin.String = "N"
        override fun toString(): kotlin.String = value
    }

    public object S : aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType() {
        override val value: kotlin.String = "S"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType = when(str) {
            "B" -> B
            "N" -> N
            "S" -> S
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType> = listOf(
            B,
            N,
            S
        )
    }
}
