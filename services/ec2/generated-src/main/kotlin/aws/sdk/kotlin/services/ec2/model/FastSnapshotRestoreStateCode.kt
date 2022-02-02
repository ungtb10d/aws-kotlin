// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class FastSnapshotRestoreStateCode {

    abstract val value: kotlin.String

    object Disabled : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override val value: kotlin.String = "disabled"
        override fun toString(): kotlin.String = value
    }

    object Disabling : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override val value: kotlin.String = "disabling"
        override fun toString(): kotlin.String = value
    }

    object Enabled : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override val value: kotlin.String = "enabled"
        override fun toString(): kotlin.String = value
    }

    object Enabling : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override val value: kotlin.String = "enabling"
        override fun toString(): kotlin.String = value
    }

    object Optimizing : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override val value: kotlin.String = "optimizing"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode = when(str) {
            "disabled" -> Disabled
            "disabling" -> Disabling
            "enabled" -> Enabled
            "enabling" -> Enabling
            "optimizing" -> Optimizing
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode> = listOf(
            Disabled,
            Disabling,
            Enabled,
            Enabling,
            Optimizing
        )
    }
}