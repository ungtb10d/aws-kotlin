// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class LaunchTemplateInstanceMetadataProtocolIpv6 {

    public abstract val value: kotlin.String

    public object Disabled : aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMetadataProtocolIpv6() {
        override val value: kotlin.String = "disabled"
        override fun toString(): kotlin.String = value
    }

    public object Enabled : aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMetadataProtocolIpv6() {
        override val value: kotlin.String = "enabled"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMetadataProtocolIpv6() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMetadataProtocolIpv6 = when(str) {
            "disabled" -> Disabled
            "enabled" -> Enabled
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMetadataProtocolIpv6> = listOf(
            Disabled,
            Enabled
        )
    }
}
