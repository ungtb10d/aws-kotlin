// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class SearchLocalGatewayRoutesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * + `route-search.exact-match` - The exact match of the specified filter.
     * + `route-search.longest-prefix-match` - The longest prefix that matches the route.
     * + `route-search.subnet-of-match` - The routes with a subnet that match the specified CIDR filter.
     * + `route-search.supernet-of-match` - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify `supernet-of-match` as 10.0.1.0/30, then the result returns 10.0.1.0/29.
     * + `state` - The state of the route.
     * + `type` - The route type.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The ID of the local gateway route table.
     */
    public val localGatewayRouteTableId: kotlin.String? = builder.localGatewayRouteTableId
    /**
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SearchLocalGatewayRoutesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SearchLocalGatewayRoutesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("localGatewayRouteTableId=$localGatewayRouteTableId,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (localGatewayRouteTableId?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SearchLocalGatewayRoutesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (localGatewayRouteTableId != other.localGatewayRouteTableId) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SearchLocalGatewayRoutesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * + `route-search.exact-match` - The exact match of the specified filter.
         * + `route-search.longest-prefix-match` - The longest prefix that matches the route.
         * + `route-search.subnet-of-match` - The routes with a subnet that match the specified CIDR filter.
         * + `route-search.supernet-of-match` - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify `supernet-of-match` as 10.0.1.0/30, then the result returns 10.0.1.0/29.
         * + `state` - The state of the route.
         * + `type` - The route type.
         */
        public var filters: List<Filter>? = null
        /**
         * The ID of the local gateway route table.
         */
        public var localGatewayRouteTableId: kotlin.String? = null
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
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SearchLocalGatewayRoutesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.localGatewayRouteTableId = x.localGatewayRouteTableId
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SearchLocalGatewayRoutesRequest = SearchLocalGatewayRoutesRequest(this)
    }
}
