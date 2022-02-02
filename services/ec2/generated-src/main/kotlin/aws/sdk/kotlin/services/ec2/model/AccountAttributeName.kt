// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class AccountAttributeName {

    abstract val value: kotlin.String

    object DefaultVpc : aws.sdk.kotlin.services.ec2.model.AccountAttributeName() {
        override val value: kotlin.String = "default-vpc"
        override fun toString(): kotlin.String = value
    }

    object SupportedPlatforms : aws.sdk.kotlin.services.ec2.model.AccountAttributeName() {
        override val value: kotlin.String = "supported-platforms"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AccountAttributeName() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AccountAttributeName = when(str) {
            "default-vpc" -> DefaultVpc
            "supported-platforms" -> SupportedPlatforms
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AccountAttributeName> = listOf(
            DefaultVpc,
            SupportedPlatforms
        )
    }
}