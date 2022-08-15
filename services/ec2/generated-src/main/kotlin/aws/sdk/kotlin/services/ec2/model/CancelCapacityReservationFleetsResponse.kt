// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CancelCapacityReservationFleetsResponse private constructor(builder: Builder) {
    /**
     * Information about the Capacity Reservation Fleets that could not be cancelled.
     */
    public val failedFleetCancellations: List<FailedCapacityReservationFleetCancellationResult>? = builder.failedFleetCancellations
    /**
     * Information about the Capacity Reservation Fleets that were successfully cancelled.
     */
    public val successfulFleetCancellations: List<CapacityReservationFleetCancellationState>? = builder.successfulFleetCancellations

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CancelCapacityReservationFleetsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CancelCapacityReservationFleetsResponse(")
        append("failedFleetCancellations=$failedFleetCancellations,")
        append("successfulFleetCancellations=$successfulFleetCancellations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = failedFleetCancellations?.hashCode() ?: 0
        result = 31 * result + (successfulFleetCancellations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CancelCapacityReservationFleetsResponse

        if (failedFleetCancellations != other.failedFleetCancellations) return false
        if (successfulFleetCancellations != other.successfulFleetCancellations) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CancelCapacityReservationFleetsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the Capacity Reservation Fleets that could not be cancelled.
         */
        public var failedFleetCancellations: List<FailedCapacityReservationFleetCancellationResult>? = null
        /**
         * Information about the Capacity Reservation Fleets that were successfully cancelled.
         */
        public var successfulFleetCancellations: List<CapacityReservationFleetCancellationState>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CancelCapacityReservationFleetsResponse) : this() {
            this.failedFleetCancellations = x.failedFleetCancellations
            this.successfulFleetCancellations = x.successfulFleetCancellations
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CancelCapacityReservationFleetsResponse = CancelCapacityReservationFleetsResponse(this)
    }
}
