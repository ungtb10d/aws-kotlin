// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class TrafficMirrorFilterRuleField {

    public abstract val value: kotlin.String

    public object Description : aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField() {
        override val value: kotlin.String = "description"
        override fun toString(): kotlin.String = value
    }

    public object DestinationPortRange : aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField() {
        override val value: kotlin.String = "destination-port-range"
        override fun toString(): kotlin.String = value
    }

    public object Protocol : aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField() {
        override val value: kotlin.String = "protocol"
        override fun toString(): kotlin.String = value
    }

    public object SourcePortRange : aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField() {
        override val value: kotlin.String = "source-port-range"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField = when(str) {
            "description" -> Description
            "destination-port-range" -> DestinationPortRange
            "protocol" -> Protocol
            "source-port-range" -> SourcePortRange
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField> = listOf(
            Description,
            DestinationPortRange,
            Protocol,
            SourcePortRange
        )
    }
}
