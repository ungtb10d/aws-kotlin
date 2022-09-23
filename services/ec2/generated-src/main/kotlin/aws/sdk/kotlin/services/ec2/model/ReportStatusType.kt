// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import kotlin.collections.List

public sealed class ReportStatusType {

    public abstract val value: kotlin.String

    public object Impaired : aws.sdk.kotlin.services.ec2.model.ReportStatusType() {
        override val value: kotlin.String = "impaired"
        override fun toString(): kotlin.String = value
    }

    public object Ok : aws.sdk.kotlin.services.ec2.model.ReportStatusType() {
        override val value: kotlin.String = "ok"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ReportStatusType() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ReportStatusType = when(str) {
            "impaired" -> Impaired
            "ok" -> Ok
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ReportStatusType> = listOf(
            Impaired,
            Ok
        )
    }
}
