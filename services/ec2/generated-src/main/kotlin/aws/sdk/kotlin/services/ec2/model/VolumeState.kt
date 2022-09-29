// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class VolumeState {

    public abstract val value: kotlin.String

    public object Available : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    public object Creating : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "creating"
        override fun toString(): kotlin.String = value
    }

    public object Deleted : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "deleted"
        override fun toString(): kotlin.String = value
    }

    public object Deleting : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "deleting"
        override fun toString(): kotlin.String = value
    }

    public object Error : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "error"
        override fun toString(): kotlin.String = value
    }

    public object InUse : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override val value: kotlin.String = "in-use"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.VolumeState() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.VolumeState = when(str) {
            "available" -> Available
            "creating" -> Creating
            "deleted" -> Deleted
            "deleting" -> Deleting
            "error" -> Error
            "in-use" -> InUse
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.VolumeState> = listOf(
            Available,
            Creating,
            Deleted,
            Deleting,
            Error,
            InUse
        )
    }
}
