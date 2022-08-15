// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeReservedInstancesListings.
 */
public class DescribeReservedInstancesListingsRequest private constructor(builder: Builder) {
    /**
     * One or more filters.
     * + `reserved-instances-id` - The ID of the Reserved Instances.
     * + `reserved-instances-listing-id` - The ID of the Reserved Instances listing.
     * + `status` - The status of the Reserved Instance listing (`pending` | `active` | `cancelled` | `closed`).
     * + `status-message` - The reason for the status.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * One or more Reserved Instance IDs.
     */
    public val reservedInstancesId: kotlin.String? = builder.reservedInstancesId
    /**
     * One or more Reserved Instance listing IDs.
     */
    public val reservedInstancesListingId: kotlin.String? = builder.reservedInstancesListingId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesListingsRequest(")
        append("filters=$filters,")
        append("reservedInstancesId=$reservedInstancesId,")
        append("reservedInstancesListingId=$reservedInstancesListingId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = filters?.hashCode() ?: 0
        result = 31 * result + (reservedInstancesId?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesListingId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeReservedInstancesListingsRequest

        if (filters != other.filters) return false
        if (reservedInstancesId != other.reservedInstancesId) return false
        if (reservedInstancesListingId != other.reservedInstancesListingId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * One or more filters.
         * + `reserved-instances-id` - The ID of the Reserved Instances.
         * + `reserved-instances-listing-id` - The ID of the Reserved Instances listing.
         * + `status` - The status of the Reserved Instance listing (`pending` | `active` | `cancelled` | `closed`).
         * + `status-message` - The reason for the status.
         */
        public var filters: List<Filter>? = null
        /**
         * One or more Reserved Instance IDs.
         */
        public var reservedInstancesId: kotlin.String? = null
        /**
         * One or more Reserved Instance listing IDs.
         */
        public var reservedInstancesListingId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsRequest) : this() {
            this.filters = x.filters
            this.reservedInstancesId = x.reservedInstancesId
            this.reservedInstancesListingId = x.reservedInstancesListingId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsRequest = DescribeReservedInstancesListingsRequest(this)
    }
}
