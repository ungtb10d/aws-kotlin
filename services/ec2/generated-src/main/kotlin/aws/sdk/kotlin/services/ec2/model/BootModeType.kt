// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class BootModeType {

    abstract val value: kotlin.String

    object LegacyBios : aws.sdk.kotlin.services.ec2.model.BootModeType() {
        override val value: kotlin.String = "legacy-bios"
        override fun toString(): kotlin.String = value
    }

    object Uefi : aws.sdk.kotlin.services.ec2.model.BootModeType() {
        override val value: kotlin.String = "uefi"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.BootModeType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.BootModeType = when(str) {
            "legacy-bios" -> LegacyBios
            "uefi" -> Uefi
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.BootModeType> = listOf(
            LegacyBios,
            Uefi
        )
    }
}