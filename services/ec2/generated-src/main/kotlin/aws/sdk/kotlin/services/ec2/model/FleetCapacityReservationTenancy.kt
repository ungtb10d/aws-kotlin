// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class FleetCapacityReservationTenancy {

    public abstract val value: kotlin.String

    public object Default : aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy() {
        override val value: kotlin.String = "default"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy = when(str) {
            "default" -> Default
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy> = listOf(
            Default
        )
    }
}
