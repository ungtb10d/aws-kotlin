// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class VpcEndpointType {

    public abstract val value: kotlin.String

    public object Gateway : aws.sdk.kotlin.services.ec2.model.VpcEndpointType() {
        override val value: kotlin.String = "Gateway"
        override fun toString(): kotlin.String = value
    }

    public object GatewayLoadBalancer : aws.sdk.kotlin.services.ec2.model.VpcEndpointType() {
        override val value: kotlin.String = "GatewayLoadBalancer"
        override fun toString(): kotlin.String = value
    }

    public object Interface : aws.sdk.kotlin.services.ec2.model.VpcEndpointType() {
        override val value: kotlin.String = "Interface"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.VpcEndpointType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.VpcEndpointType = when(str) {
            "Gateway" -> Gateway
            "GatewayLoadBalancer" -> GatewayLoadBalancer
            "Interface" -> Interface
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.VpcEndpointType> = listOf(
            Gateway,
            GatewayLoadBalancer,
            Interface
        )
    }
}
