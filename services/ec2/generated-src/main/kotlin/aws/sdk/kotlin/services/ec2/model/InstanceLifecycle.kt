// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class InstanceLifecycle {

    abstract val value: kotlin.String

    object OnDemand : aws.sdk.kotlin.services.ec2.model.InstanceLifecycle() {
        override val value: kotlin.String = "on-demand"
        override fun toString(): kotlin.String = value
    }

    object Spot : aws.sdk.kotlin.services.ec2.model.InstanceLifecycle() {
        override val value: kotlin.String = "spot"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceLifecycle() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceLifecycle = when(str) {
            "on-demand" -> OnDemand
            "spot" -> Spot
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceLifecycle> = listOf(
            OnDemand,
            Spot
        )
    }
}