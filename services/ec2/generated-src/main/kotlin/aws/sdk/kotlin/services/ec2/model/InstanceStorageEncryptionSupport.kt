// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class InstanceStorageEncryptionSupport {

    abstract val value: kotlin.String

    object Required : aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport() {
        override val value: kotlin.String = "required"
        override fun toString(): kotlin.String = value
    }

    object Unsupported : aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport() {
        override val value: kotlin.String = "unsupported"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport = when(str) {
            "required" -> Required
            "unsupported" -> Unsupported
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.InstanceStorageEncryptionSupport> = listOf(
            Required,
            Unsupported
        )
    }
}