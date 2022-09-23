// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class ModifyAvailabilityZoneOptInStatus {

    public abstract val value: kotlin.String

    public object NotOptedIn : aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus() {
        override val value: kotlin.String = "not-opted-in"
        override fun toString(): kotlin.String = value
    }

    public object OptedIn : aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus() {
        override val value: kotlin.String = "opted-in"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus = when(str) {
            "not-opted-in" -> NotOptedIn
            "opted-in" -> OptedIn
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus> = listOf(
            NotOptedIn,
            OptedIn
        )
    }
}
