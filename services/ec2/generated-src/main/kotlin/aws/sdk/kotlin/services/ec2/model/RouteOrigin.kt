// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class RouteOrigin {

    public abstract val value: kotlin.String

    public object CreateRoute : aws.sdk.kotlin.services.ec2.model.RouteOrigin() {
        override val value: kotlin.String = "CreateRoute"
        override fun toString(): kotlin.String = value
    }

    public object CreateRouteTable : aws.sdk.kotlin.services.ec2.model.RouteOrigin() {
        override val value: kotlin.String = "CreateRouteTable"
        override fun toString(): kotlin.String = value
    }

    public object EnableVgwRoutePropagation : aws.sdk.kotlin.services.ec2.model.RouteOrigin() {
        override val value: kotlin.String = "EnableVgwRoutePropagation"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.RouteOrigin() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.RouteOrigin = when(str) {
            "CreateRoute" -> CreateRoute
            "CreateRouteTable" -> CreateRouteTable
            "EnableVgwRoutePropagation" -> EnableVgwRoutePropagation
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.RouteOrigin> = listOf(
            CreateRoute,
            CreateRouteTable,
            EnableVgwRoutePropagation
        )
    }
}
