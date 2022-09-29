// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeLocalGatewayRouteTablesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * + `local-gateway-id` - The ID of a local gateway.
     * + `local-gateway-route-table-arn` - The Amazon Resource Name (ARN) of the local gateway route table.
     * + `local-gateway-route-table-id` - The ID of a local gateway route table.
     * + `outpost-arn` - The Amazon Resource Name (ARN) of the Outpost.
     * + `owner-id` - The ID of the Amazon Web Services account that owns the local gateway route table.
     * + `state` - The state of the local gateway route table.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the local gateway route tables.
     */
    public val localGatewayRouteTableIds: List<String>? = builder.localGatewayRouteTableIds
    /**
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTablesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLocalGatewayRouteTablesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("localGatewayRouteTableIds=$localGatewayRouteTableIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (localGatewayRouteTableIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeLocalGatewayRouteTablesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (localGatewayRouteTableIds != other.localGatewayRouteTableIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTablesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * + `local-gateway-id` - The ID of a local gateway.
         * + `local-gateway-route-table-arn` - The Amazon Resource Name (ARN) of the local gateway route table.
         * + `local-gateway-route-table-id` - The ID of a local gateway route table.
         * + `outpost-arn` - The Amazon Resource Name (ARN) of the Outpost.
         * + `owner-id` - The ID of the Amazon Web Services account that owns the local gateway route table.
         * + `state` - The state of the local gateway route table.
         */
        public var filters: List<Filter>? = null
        /**
         * The IDs of the local gateway route tables.
         */
        public var localGatewayRouteTableIds: List<String>? = null
        /**
         * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTablesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.localGatewayRouteTableIds = x.localGatewayRouteTableIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTablesRequest = DescribeLocalGatewayRouteTablesRequest(this)
    }
}
