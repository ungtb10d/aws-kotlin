// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeCapacityReservationFleetsResponse private constructor(builder: Builder) {
    /**
     * Information about the Capacity Reservation Fleets.
     */
    public val capacityReservationFleets: List<CapacityReservationFleet>? = builder.capacityReservationFleets
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeCapacityReservationFleetsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeCapacityReservationFleetsResponse(")
        append("capacityReservationFleets=$capacityReservationFleets,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityReservationFleets?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeCapacityReservationFleetsResponse

        if (capacityReservationFleets != other.capacityReservationFleets) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeCapacityReservationFleetsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the Capacity Reservation Fleets.
         */
        public var capacityReservationFleets: List<CapacityReservationFleet>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeCapacityReservationFleetsResponse) : this() {
            this.capacityReservationFleets = x.capacityReservationFleets
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeCapacityReservationFleetsResponse = DescribeCapacityReservationFleetsResponse(this)
    }
}
