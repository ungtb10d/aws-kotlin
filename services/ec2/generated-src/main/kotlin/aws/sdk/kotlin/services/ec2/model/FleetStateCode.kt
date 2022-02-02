// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class FleetStateCode {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    object Deleted : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "deleted"
        override fun toString(): kotlin.String = value
    }

    object DeletedRunning : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "deleted_running"
        override fun toString(): kotlin.String = value
    }

    object DeletedTerminatingInstances : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "deleted_terminating"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    object Modifying : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "modifying"
        override fun toString(): kotlin.String = value
    }

    object Submitted : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override val value: kotlin.String = "submitted"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FleetStateCode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FleetStateCode = when(str) {
            "active" -> Active
            "deleted" -> Deleted
            "deleted_running" -> DeletedRunning
            "deleted_terminating" -> DeletedTerminatingInstances
            "failed" -> Failed
            "modifying" -> Modifying
            "submitted" -> Submitted
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FleetStateCode> = listOf(
            Active,
            Deleted,
            DeletedRunning,
            DeletedTerminatingInstances,
            Failed,
            Modifying,
            Submitted
        )
    }
}