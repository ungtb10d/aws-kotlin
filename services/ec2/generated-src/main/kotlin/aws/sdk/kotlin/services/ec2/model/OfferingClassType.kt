// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class OfferingClassType {

    public abstract val value: kotlin.String

    public object Convertible : aws.sdk.kotlin.services.ec2.model.OfferingClassType() {
        override val value: kotlin.String = "convertible"
        override fun toString(): kotlin.String = value
    }

    public object Standard : aws.sdk.kotlin.services.ec2.model.OfferingClassType() {
        override val value: kotlin.String = "standard"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.OfferingClassType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.OfferingClassType = when(str) {
            "convertible" -> Convertible
            "standard" -> Standard
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.OfferingClassType> = listOf(
            Convertible,
            Standard
        )
    }
}
