// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class GetTransitGatewayRouteTableAssociationsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters. The possible values are:
     * + `resource-id` - The ID of the resource.
     * + `resource-type` - The resource type. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `peering` | `connect`.
     * + `transit-gateway-attachment-id` - The ID of the attachment.
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
     * The ID of the transit gateway route table.
     */
    public val transitGatewayRouteTableId: kotlin.String? = builder.transitGatewayRouteTableId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetTransitGatewayRouteTableAssociationsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("transitGatewayRouteTableId=$transitGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetTransitGatewayRouteTableAssociationsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (transitGatewayRouteTableId != other.transitGatewayRouteTableId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters. The possible values are:
         * + `resource-id` - The ID of the resource.
         * + `resource-type` - The resource type. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `peering` | `connect`.
         * + `transit-gateway-attachment-id` - The ID of the attachment.
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
         * The ID of the transit gateway route table.
         */
        public var transitGatewayRouteTableId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.transitGatewayRouteTableId = x.transitGatewayRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest = GetTransitGatewayRouteTableAssociationsRequest(this)
    }
}
