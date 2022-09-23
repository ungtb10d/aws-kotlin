// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class NetworkInterfacePermissionStateCode {

    public abstract val value: kotlin.String

    public object Granted : aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode() {
        override val value: kotlin.String = "granted"
        override fun toString(): kotlin.String = value
    }

    public object Pending : aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    public object Revoked : aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode() {
        override val value: kotlin.String = "revoked"
        override fun toString(): kotlin.String = value
    }

    public object Revoking : aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode() {
        override val value: kotlin.String = "revoking"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode = when(str) {
            "granted" -> Granted
            "pending" -> Pending
            "revoked" -> Revoked
            "revoking" -> Revoking
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermissionStateCode> = listOf(
            Granted,
            Pending,
            Revoked,
            Revoking
        )
    }
}
