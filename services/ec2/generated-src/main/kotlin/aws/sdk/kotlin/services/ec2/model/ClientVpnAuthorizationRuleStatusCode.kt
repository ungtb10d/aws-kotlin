// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class ClientVpnAuthorizationRuleStatusCode {

    public abstract val value: kotlin.String

    public object Active : aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    public object Authorizing : aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode() {
        override val value: kotlin.String = "authorizing"
        override fun toString(): kotlin.String = value
    }

    public object Failed : aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    public object Revoking : aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode() {
        override val value: kotlin.String = "revoking"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode = when(str) {
            "active" -> Active
            "authorizing" -> Authorizing
            "failed" -> Failed
            "revoking" -> Revoking
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatusCode> = listOf(
            Active,
            Authorizing,
            Failed,
            Revoking
        )
    }
}
