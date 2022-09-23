// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class IpAddressType {

    public abstract val value: kotlin.String

    public object Dualstack : aws.sdk.kotlin.services.ec2.model.IpAddressType() {
        override val value: kotlin.String = "dualstack"
        override fun toString(): kotlin.String = value
    }

    public object Ipv4 : aws.sdk.kotlin.services.ec2.model.IpAddressType() {
        override val value: kotlin.String = "ipv4"
        override fun toString(): kotlin.String = value
    }

    public object Ipv6 : aws.sdk.kotlin.services.ec2.model.IpAddressType() {
        override val value: kotlin.String = "ipv6"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.IpAddressType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.IpAddressType = when(str) {
            "dualstack" -> Dualstack
            "ipv4" -> Ipv4
            "ipv6" -> Ipv6
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.IpAddressType> = listOf(
            Dualstack,
            Ipv4,
            Ipv6
        )
    }
}
