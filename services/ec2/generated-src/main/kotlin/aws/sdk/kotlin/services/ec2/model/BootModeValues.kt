// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class BootModeValues {

    abstract val value: kotlin.String

    object LegacyBios : aws.sdk.kotlin.services.ec2.model.BootModeValues() {
        override val value: kotlin.String = "legacy-bios"
        override fun toString(): kotlin.String = value
    }

    object Uefi : aws.sdk.kotlin.services.ec2.model.BootModeValues() {
        override val value: kotlin.String = "uefi"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.BootModeValues() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.BootModeValues = when(str) {
            "legacy-bios" -> LegacyBios
            "uefi" -> Uefi
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.BootModeValues> = listOf(
            LegacyBios,
            Uefi
        )
    }
}