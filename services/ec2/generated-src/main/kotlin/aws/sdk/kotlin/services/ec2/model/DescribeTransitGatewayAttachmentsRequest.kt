// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeTransitGatewayAttachmentsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters. The possible values are:
     * + `association.state` - The state of the association (`associating` | `associated` | `disassociating`).
     * + `association.transit-gateway-route-table-id` - The ID of the route table for the transit gateway.
     * + `resource-id` - The ID of the resource.
     * + `resource-owner-id` - The ID of the Amazon Web Services account that owns the resource.
     * + `resource-type` - The resource type. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `peering` | `connect`.
     * + `state` - The state of the attachment. Valid values are `available` | `deleted` | `deleting` | `failed` | `failing` | `initiatingRequest` | `modifying` | `pendingAcceptance` | `pending` | `rollingBack` | `rejected` | `rejecting`.
     * + `transit-gateway-attachment-id` - The ID of the attachment.
     * + `transit-gateway-id` - The ID of the transit gateway.
     * + `transit-gateway-owner-id` - The ID of the Amazon Web Services account that owns the transit gateway.
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
     * The IDs of the attachments.
     */
    public val transitGatewayAttachmentIds: List<String>? = builder.transitGatewayAttachmentIds

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayAttachmentsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("transitGatewayAttachmentIds=$transitGatewayAttachmentIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTransitGatewayAttachmentsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (transitGatewayAttachmentIds != other.transitGatewayAttachmentIds) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters. The possible values are:
         * + `association.state` - The state of the association (`associating` | `associated` | `disassociating`).
         * + `association.transit-gateway-route-table-id` - The ID of the route table for the transit gateway.
         * + `resource-id` - The ID of the resource.
         * + `resource-owner-id` - The ID of the Amazon Web Services account that owns the resource.
         * + `resource-type` - The resource type. Valid values are `vpc` | `vpn` | `direct-connect-gateway` | `peering` | `connect`.
         * + `state` - The state of the attachment. Valid values are `available` | `deleted` | `deleting` | `failed` | `failing` | `initiatingRequest` | `modifying` | `pendingAcceptance` | `pending` | `rollingBack` | `rejected` | `rejecting`.
         * + `transit-gateway-attachment-id` - The ID of the attachment.
         * + `transit-gateway-id` - The ID of the transit gateway.
         * + `transit-gateway-owner-id` - The ID of the Amazon Web Services account that owns the transit gateway.
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
         * The IDs of the attachments.
         */
        public var transitGatewayAttachmentIds: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.transitGatewayAttachmentIds = x.transitGatewayAttachmentIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsRequest = DescribeTransitGatewayAttachmentsRequest(this)
    }
}
