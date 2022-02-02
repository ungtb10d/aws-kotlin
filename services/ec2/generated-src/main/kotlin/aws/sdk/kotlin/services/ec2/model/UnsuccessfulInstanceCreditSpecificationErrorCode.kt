// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class UnsuccessfulInstanceCreditSpecificationErrorCode {

    abstract val value: kotlin.String

    object IncorrectInstanceState : aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode() {
        override val value: kotlin.String = "IncorrectInstanceState"
        override fun toString(): kotlin.String = value
    }

    object InstanceCreditSpecificationNotSupported : aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode() {
        override val value: kotlin.String = "InstanceCreditSpecification.NotSupported"
        override fun toString(): kotlin.String = value
    }

    object InstanceNotFound : aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode() {
        override val value: kotlin.String = "InvalidInstanceID.NotFound"
        override fun toString(): kotlin.String = value
    }

    object InvalidInstanceId : aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode() {
        override val value: kotlin.String = "InvalidInstanceID.Malformed"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode = when(str) {
            "IncorrectInstanceState" -> IncorrectInstanceState
            "InstanceCreditSpecification.NotSupported" -> InstanceCreditSpecificationNotSupported
            "InvalidInstanceID.NotFound" -> InstanceNotFound
            "InvalidInstanceID.Malformed" -> InvalidInstanceId
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationErrorCode> = listOf(
            IncorrectInstanceState,
            InstanceCreditSpecificationNotSupported,
            InstanceNotFound,
            InvalidInstanceId
        )
    }
}