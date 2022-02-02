// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a target Capacity Reservation or Capacity Reservation group.
 */
class CapacityReservationTarget private constructor(builder: Builder) {
    /**
     * The ID of the Capacity Reservation in which to run the instance.
     */
    val capacityReservationId: kotlin.String? = builder.capacityReservationId
    /**
     * The ARN of the Capacity Reservation resource group in which to run the instance.
     */
    val capacityReservationResourceGroupArn: kotlin.String? = builder.capacityReservationResourceGroupArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CapacityReservationTarget = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CapacityReservationTarget(")
        append("capacityReservationId=$capacityReservationId,")
        append("capacityReservationResourceGroupArn=$capacityReservationResourceGroupArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityReservationId?.hashCode() ?: 0
        result = 31 * result + (capacityReservationResourceGroupArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CapacityReservationTarget

        if (capacityReservationId != other.capacityReservationId) return false
        if (capacityReservationResourceGroupArn != other.capacityReservationResourceGroupArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CapacityReservationTarget = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the Capacity Reservation in which to run the instance.
         */
        var capacityReservationId: kotlin.String? = null
        /**
         * The ARN of the Capacity Reservation resource group in which to run the instance.
         */
        var capacityReservationResourceGroupArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CapacityReservationTarget) : this() {
            this.capacityReservationId = x.capacityReservationId
            this.capacityReservationResourceGroupArn = x.capacityReservationResourceGroupArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CapacityReservationTarget = CapacityReservationTarget(this)
    }
}