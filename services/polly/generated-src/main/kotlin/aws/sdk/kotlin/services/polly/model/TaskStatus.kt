// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import kotlin.collections.List

public sealed class TaskStatus {

    public abstract val value: kotlin.String

    public object Completed : aws.sdk.kotlin.services.polly.model.TaskStatus() {
        override val value: kotlin.String = "completed"
        override fun toString(): kotlin.String = value
    }

    public object Failed : aws.sdk.kotlin.services.polly.model.TaskStatus() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    public object InProgress : aws.sdk.kotlin.services.polly.model.TaskStatus() {
        override val value: kotlin.String = "inProgress"
        override fun toString(): kotlin.String = value
    }

    public object Scheduled : aws.sdk.kotlin.services.polly.model.TaskStatus() {
        override val value: kotlin.String = "scheduled"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.polly.model.TaskStatus() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.polly.model.TaskStatus = when(str) {
            "completed" -> Completed
            "failed" -> Failed
            "inProgress" -> InProgress
            "scheduled" -> Scheduled
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.polly.model.TaskStatus> = listOf(
            Completed,
            Failed,
            InProgress,
            Scheduled
        )
    }
}
