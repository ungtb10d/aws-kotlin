// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class ConnectionNotificationType {

    public abstract val value: kotlin.String

    public object Topic : aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType() {
        override val value: kotlin.String = "Topic"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType = when(str) {
            "Topic" -> Topic
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType> = listOf(
            Topic
        )
    }
}
