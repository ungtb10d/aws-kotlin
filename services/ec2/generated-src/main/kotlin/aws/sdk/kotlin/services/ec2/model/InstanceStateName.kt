// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class InstanceStateName {

    public abstract val value: kotlin.String

    public object Pending : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    public object Running : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "running"
        override fun toString(): kotlin.String = value
    }

    public object ShuttingDown : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "shutting-down"
        override fun toString(): kotlin.String = value
    }

    public object Stopped : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "stopped"
        override fun toString(): kotlin.String = value
    }

    public object Stopping : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "stopping"
        override fun toString(): kotlin.String = value
    }

    public object Terminated : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override val value: kotlin.String = "terminated"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceStateName() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceStateName = when(str) {
            "pending" -> Pending
            "running" -> Running
            "shutting-down" -> ShuttingDown
            "stopped" -> Stopped
            "stopping" -> Stopping
            "terminated" -> Terminated
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceStateName> = listOf(
            Pending,
            Running,
            ShuttingDown,
            Stopped,
            Stopping,
            Terminated
        )
    }
}
