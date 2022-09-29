// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeReservedInstancesListings.
 */
public class DescribeReservedInstancesListingsResponse private constructor(builder: Builder) {
    /**
     * Information about the Reserved Instance listing.
     */
    public val reservedInstancesListings: List<ReservedInstancesListing>? = builder.reservedInstancesListings

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesListingsResponse(")
        append("reservedInstancesListings=$reservedInstancesListings)")
    }

    override fun hashCode(): kotlin.Int {
        var result = reservedInstancesListings?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeReservedInstancesListingsResponse

        if (reservedInstancesListings != other.reservedInstancesListings) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the Reserved Instance listing.
         */
        public var reservedInstancesListings: List<ReservedInstancesListing>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsResponse) : this() {
            this.reservedInstancesListings = x.reservedInstancesListings
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsResponse = DescribeReservedInstancesListingsResponse(this)
    }
}
