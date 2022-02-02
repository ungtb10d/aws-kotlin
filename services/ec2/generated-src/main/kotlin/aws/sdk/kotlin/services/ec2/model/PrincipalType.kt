// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class PrincipalType {

    abstract val value: kotlin.String

    object Account : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "Account"
        override fun toString(): kotlin.String = value
    }

    object All : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "All"
        override fun toString(): kotlin.String = value
    }

    object OrganizationUnit : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "OrganizationUnit"
        override fun toString(): kotlin.String = value
    }

    object Role : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "Role"
        override fun toString(): kotlin.String = value
    }

    object Service : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "Service"
        override fun toString(): kotlin.String = value
    }

    object User : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override val value: kotlin.String = "User"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.PrincipalType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.PrincipalType = when(str) {
            "Account" -> Account
            "All" -> All
            "OrganizationUnit" -> OrganizationUnit
            "Role" -> Role
            "Service" -> Service
            "User" -> User
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.PrincipalType> = listOf(
            Account,
            All,
            OrganizationUnit,
            Role,
            Service,
            User
        )
    }
}