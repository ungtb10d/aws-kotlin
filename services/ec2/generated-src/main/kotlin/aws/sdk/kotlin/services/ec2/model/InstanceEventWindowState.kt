// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class InstanceEventWindowState {

    public abstract val value: kotlin.String

    public object Active : aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    public object Creating : aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState() {
        override val value: kotlin.String = "creating"
        override fun toString(): kotlin.String = value
    }

    public object Deleted : aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState() {
        override val value: kotlin.String = "deleted"
        override fun toString(): kotlin.String = value
    }

    public object Deleting : aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState() {
        override val value: kotlin.String = "deleting"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState = when(str) {
            "active" -> Active
            "creating" -> Creating
            "deleted" -> Deleted
            "deleting" -> Deleting
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceEventWindowState> = listOf(
            Active,
            Creating,
            Deleted,
            Deleting
        )
    }
}
