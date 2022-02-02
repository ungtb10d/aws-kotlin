// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class ListingStatus {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.ec2.model.ListingStatus() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    object Cancelled : aws.sdk.kotlin.services.ec2.model.ListingStatus() {
        override val value: kotlin.String = "cancelled"
        override fun toString(): kotlin.String = value
    }

    object Closed : aws.sdk.kotlin.services.ec2.model.ListingStatus() {
        override val value: kotlin.String = "closed"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.ListingStatus() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ListingStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ListingStatus = when(str) {
            "active" -> Active
            "cancelled" -> Cancelled
            "closed" -> Closed
            "pending" -> Pending
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ListingStatus> = listOf(
            Active,
            Cancelled,
            Closed,
            Pending
        )
    }
}