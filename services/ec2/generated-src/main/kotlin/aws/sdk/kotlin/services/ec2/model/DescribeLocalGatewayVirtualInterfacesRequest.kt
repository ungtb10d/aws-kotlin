// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeLocalGatewayVirtualInterfacesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * + `local-address` - The local address.
     * + `local-bgp-asn` - The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
     * + `local-gateway-id` - The ID of the local gateway.
     * + `local-gateway-virtual-interface-id` - The ID of the virtual interface.
     * + `owner-id` - The ID of the Amazon Web Services account that owns the local gateway virtual interface.
     * + `peer-address` - The peer address.
     * + `peer-bgp-asn` - The peer BGP ASN.
     * + `vlan` - The ID of the VLAN.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the virtual interfaces.
     */
    public val localGatewayVirtualInterfaceIds: List<String>? = builder.localGatewayVirtualInterfaceIds
    /**
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned `nextToken` value.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfacesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLocalGatewayVirtualInterfacesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("localGatewayVirtualInterfaceIds=$localGatewayVirtualInterfaceIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (localGatewayVirtualInterfaceIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeLocalGatewayVirtualInterfacesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (localGatewayVirtualInterfaceIds != other.localGatewayVirtualInterfaceIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfacesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * + `local-address` - The local address.
         * + `local-bgp-asn` - The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
         * + `local-gateway-id` - The ID of the local gateway.
         * + `local-gateway-virtual-interface-id` - The ID of the virtual interface.
         * + `owner-id` - The ID of the Amazon Web Services account that owns the local gateway virtual interface.
         * + `peer-address` - The peer address.
         * + `peer-bgp-asn` - The peer BGP ASN.
         * + `vlan` - The ID of the VLAN.
         */
        public var filters: List<Filter>? = null
        /**
         * The IDs of the virtual interfaces.
         */
        public var localGatewayVirtualInterfaceIds: List<String>? = null
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
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfacesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.localGatewayVirtualInterfaceIds = x.localGatewayVirtualInterfaceIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayVirtualInterfacesRequest = DescribeLocalGatewayVirtualInterfacesRequest(this)
    }
}
