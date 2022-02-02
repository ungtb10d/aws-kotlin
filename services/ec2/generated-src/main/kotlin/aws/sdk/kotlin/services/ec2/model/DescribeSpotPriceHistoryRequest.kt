// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains the parameters for DescribeSpotPriceHistory.
 */
class DescribeSpotPriceHistoryRequest private constructor(builder: Builder) {
    /**
     * Filters the results by the specified Availability Zone.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The date and time, up to the current date, from which to stop retrieving the price
     * history data, in UTC format (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     */
    val endTime: aws.smithy.kotlin.runtime.time.Instant? = builder.endTime
    /**
     * One or more filters.
     * availability-zone - The Availability Zone for which prices should
     * be returned.
     * instance-type - The type of instance (for example,
     * m3.medium).
     * product-description - The product description for the Spot price
     * (Linux/UNIX | Red Hat Enterprise Linux |
     * SUSE Linux | Windows | Linux/UNIX (Amazon
     * VPC) | Red Hat Enterprise Linux (Amazon VPC) |
     * SUSE Linux (Amazon VPC) | Windows (Amazon
     * VPC)).
     * spot-price - The Spot price. The value must match exactly (or use
     * wildcards; greater than or less than comparison is not supported).
     * timestamp - The time stamp of the Spot price history, in UTC format
     * (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     * You can use wildcards (* and ?). Greater than or less than comparison is not
     * supported.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * Filters the results by the specified instance types.
     */
    val instanceTypes: List<InstanceType>? = builder.instanceTypes
    /**
     * The maximum number of results to return in a single call. Specify a value between 1
     * and 1000. The default value is 1000. To retrieve the remaining results, make another
     * call with the returned NextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Filters the results by the specified basic product descriptions.
     */
    val productDescriptions: List<String>? = builder.productDescriptions
    /**
     * The date and time, up to the past 90 days, from which to start retrieving the price
     * history data, in UTC format (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     */
    val startTime: aws.smithy.kotlin.runtime.time.Instant? = builder.startTime

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeSpotPriceHistoryRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeSpotPriceHistoryRequest(")
        append("availabilityZone=$availabilityZone,")
        append("dryRun=$dryRun,")
        append("endTime=$endTime,")
        append("filters=$filters,")
        append("instanceTypes=$instanceTypes,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("productDescriptions=$productDescriptions,")
        append("startTime=$startTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (endTime?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (instanceTypes?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (productDescriptions?.hashCode() ?: 0)
        result = 31 * result + (startTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeSpotPriceHistoryRequest

        if (availabilityZone != other.availabilityZone) return false
        if (dryRun != other.dryRun) return false
        if (endTime != other.endTime) return false
        if (filters != other.filters) return false
        if (instanceTypes != other.instanceTypes) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (productDescriptions != other.productDescriptions) return false
        if (startTime != other.startTime) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeSpotPriceHistoryRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Filters the results by the specified Availability Zone.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The date and time, up to the current date, from which to stop retrieving the price
         * history data, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         */
        var endTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * One or more filters.
         * availability-zone - The Availability Zone for which prices should
         * be returned.
         * instance-type - The type of instance (for example,
         * m3.medium).
         * product-description - The product description for the Spot price
         * (Linux/UNIX | Red Hat Enterprise Linux |
         * SUSE Linux | Windows | Linux/UNIX (Amazon
         * VPC) | Red Hat Enterprise Linux (Amazon VPC) |
         * SUSE Linux (Amazon VPC) | Windows (Amazon
         * VPC)).
         * spot-price - The Spot price. The value must match exactly (or use
         * wildcards; greater than or less than comparison is not supported).
         * timestamp - The time stamp of the Spot price history, in UTC format
         * (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         * You can use wildcards (* and ?). Greater than or less than comparison is not
         * supported.
         */
        var filters: List<Filter>? = null
        /**
         * Filters the results by the specified instance types.
         */
        var instanceTypes: List<InstanceType>? = null
        /**
         * The maximum number of results to return in a single call. Specify a value between 1
         * and 1000. The default value is 1000. To retrieve the remaining results, make another
         * call with the returned NextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * Filters the results by the specified basic product descriptions.
         */
        var productDescriptions: List<String>? = null
        /**
         * The date and time, up to the past 90 days, from which to start retrieving the price
         * history data, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         */
        var startTime: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeSpotPriceHistoryRequest) : this() {
            this.availabilityZone = x.availabilityZone
            this.dryRun = x.dryRun
            this.endTime = x.endTime
            this.filters = x.filters
            this.instanceTypes = x.instanceTypes
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.productDescriptions = x.productDescriptions
            this.startTime = x.startTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeSpotPriceHistoryRequest = DescribeSpotPriceHistoryRequest(this)
    }
}