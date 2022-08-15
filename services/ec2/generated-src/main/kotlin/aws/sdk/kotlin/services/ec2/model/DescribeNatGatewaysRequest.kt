// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeNatGatewaysRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * + `nat-gateway-id` - The ID of the NAT gateway.
     * + `state` - The state of the NAT gateway (`pending` | `failed` | `available` | `deleting` | `deleted`).
     * + `subnet-id` - The ID of the subnet in which the NAT gateway resides.
     * + `tag`:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
     * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * + `vpc-id` - The ID of the VPC in which the NAT gateway resides.
     */
    public val filter: List<Filter>? = builder.filter
    /**
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * One or more NAT gateway IDs.
     */
    public val natGatewayIds: List<String>? = builder.natGatewayIds
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNatGatewaysRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNatGatewaysRequest(")
        append("dryRun=$dryRun,")
        append("filter=$filter,")
        append("maxResults=$maxResults,")
        append("natGatewayIds=$natGatewayIds,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filter?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (natGatewayIds?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNatGatewaysRequest

        if (dryRun != other.dryRun) return false
        if (filter != other.filter) return false
        if (maxResults != other.maxResults) return false
        if (natGatewayIds != other.natGatewayIds) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNatGatewaysRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * + `nat-gateway-id` - The ID of the NAT gateway.
         * + `state` - The state of the NAT gateway (`pending` | `failed` | `available` | `deleting` | `deleted`).
         * + `subnet-id` - The ID of the subnet in which the NAT gateway resides.
         * + `tag`:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
         * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * + `vpc-id` - The ID of the VPC in which the NAT gateway resides.
         */
        public var filter: List<Filter>? = null
        /**
         * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * One or more NAT gateway IDs.
         */
        public var natGatewayIds: List<String>? = null
        /**
         * The token for the next page of results.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNatGatewaysRequest) : this() {
            this.dryRun = x.dryRun
            this.filter = x.filter
            this.maxResults = x.maxResults
            this.natGatewayIds = x.natGatewayIds
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNatGatewaysRequest = DescribeNatGatewaysRequest(this)
    }
}
