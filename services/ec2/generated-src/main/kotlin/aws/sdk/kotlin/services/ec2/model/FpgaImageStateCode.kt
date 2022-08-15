// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class FpgaImageStateCode {

    public abstract val value: kotlin.String

    public object Available : aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    public object Failed : aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    public object Pending : aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    public object Unavailable : aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode() {
        override val value: kotlin.String = "unavailable"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode = when(str) {
            "available" -> Available
            "failed" -> Failed
            "pending" -> Pending
            "unavailable" -> Unavailable
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FpgaImageStateCode> = listOf(
            Available,
            Failed,
            Pending,
            Unavailable
        )
    }
}
