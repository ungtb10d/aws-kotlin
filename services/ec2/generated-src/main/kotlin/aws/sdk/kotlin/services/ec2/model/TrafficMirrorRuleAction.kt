// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class TrafficMirrorRuleAction {

    public abstract val value: kotlin.String

    public object Accept : aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction() {
        override val value: kotlin.String = "accept"
        override fun toString(): kotlin.String = value
    }

    public object Reject : aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction() {
        override val value: kotlin.String = "reject"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction = when(str) {
            "accept" -> Accept
            "reject" -> Reject
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction> = listOf(
            Accept,
            Reject
        )
    }
}
