// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class IpamPoolAllocationResourceType {

    public abstract val value: kotlin.String

    public object Custom : aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType() {
        override val value: kotlin.String = "custom"
        override fun toString(): kotlin.String = value
    }

    public object Ec2PublicIpv4Pool : aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType() {
        override val value: kotlin.String = "ec2-public-ipv4-pool"
        override fun toString(): kotlin.String = value
    }

    public object IpamPool : aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType() {
        override val value: kotlin.String = "ipam-pool"
        override fun toString(): kotlin.String = value
    }

    public object Vpc : aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType() {
        override val value: kotlin.String = "vpc"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType = when(str) {
            "custom" -> Custom
            "ec2-public-ipv4-pool" -> Ec2PublicIpv4Pool
            "ipam-pool" -> IpamPool
            "vpc" -> Vpc
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.IpamPoolAllocationResourceType> = listOf(
            Custom,
            Ec2PublicIpv4Pool,
            IpamPool,
            Vpc
        )
    }
}
