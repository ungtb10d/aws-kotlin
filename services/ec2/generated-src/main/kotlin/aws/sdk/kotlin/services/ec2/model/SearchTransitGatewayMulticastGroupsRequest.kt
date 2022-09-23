// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class SearchTransitGatewayMulticastGroupsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters. The possible values are:
     * + `group-ip-address` - The IP address of the transit gateway multicast group.
     * + `is-group-member` - The resource is a group member. Valid values are `true` | `false`.
     * + `is-group-source` - The resource is a group source. Valid values are `true` | `false`.
     * + `member-type` - The member type. Valid values are `igmp` | `static`.
     * + `resource-id` - The ID of the resource.
     * + `resource-type` - The type of resource. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `tgw-peering`.
     * + `source-type` - The source type. Valid values are `igmp` | `static`.
     * + `subnet-id` - The ID of the subnet.
     * + `transit-gateway-attachment-id` - The id of the transit gateway attachment.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * The ID of the transit gateway multicast domain.
     */
    public val transitGatewayMulticastDomainId: kotlin.String? = builder.transitGatewayMulticastDomainId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SearchTransitGatewayMulticastGroupsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SearchTransitGatewayMulticastGroupsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters. The possible values are:
         * + `group-ip-address` - The IP address of the transit gateway multicast group.
         * + `is-group-member` - The resource is a group member. Valid values are `true` | `false`.
         * + `is-group-source` - The resource is a group source. Valid values are `true` | `false`.
         * + `member-type` - The member type. Valid values are `igmp` | `static`.
         * + `resource-id` - The ID of the resource.
         * + `resource-type` - The type of resource. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `tgw-peering`.
         * + `source-type` - The source type. Valid values are `igmp` | `static`.
         * + `subnet-id` - The ID of the subnet.
         * + `transit-gateway-attachment-id` - The id of the transit gateway attachment.
         */
        public var filters: List<Filter>? = null
        /**
         * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        public var nextToken: kotlin.String? = null
        /**
         * The ID of the transit gateway multicast domain.
         */
        public var transitGatewayMulticastDomainId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsRequest = SearchTransitGatewayMulticastGroupsRequest(this)
    }
}
