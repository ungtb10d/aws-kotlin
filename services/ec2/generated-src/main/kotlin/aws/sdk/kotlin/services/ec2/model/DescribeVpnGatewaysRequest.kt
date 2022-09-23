// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeVpnGateways.
 */
public class DescribeVpnGatewaysRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * + `amazon-side-asn` - The Autonomous System Number (ASN) for the Amazon side of the gateway.
     * + `attachment.state` - The current state of the attachment between the gateway and the VPC (`attaching` | `attached` | `detaching` | `detached`).
     * + `attachment.vpc-id` - The ID of an attached VPC.
     * + `availability-zone` - The Availability Zone for the virtual private gateway (if applicable).
     * + `state` - The state of the virtual private gateway (`pending` | `available` | `deleting` | `deleted`).
     * + `tag`:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
     * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * + `type` - The type of virtual private gateway. Currently the only supported type is `ipsec.1`.
     * + `vpn-gateway-id` - The ID of the virtual private gateway.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * One or more virtual private gateway IDs.
     *
     * Default: Describes all your virtual private gateways.
     */
    public val vpnGatewayIds: List<String>? = builder.vpnGatewayIds

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVpnGatewaysRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpnGatewaysRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("vpnGatewayIds=$vpnGatewayIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (vpnGatewayIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVpnGatewaysRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (vpnGatewayIds != other.vpnGatewayIds) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVpnGatewaysRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * + `amazon-side-asn` - The Autonomous System Number (ASN) for the Amazon side of the gateway.
         * + `attachment.state` - The current state of the attachment between the gateway and the VPC (`attaching` | `attached` | `detaching` | `detached`).
         * + `attachment.vpc-id` - The ID of an attached VPC.
         * + `availability-zone` - The Availability Zone for the virtual private gateway (if applicable).
         * + `state` - The state of the virtual private gateway (`pending` | `available` | `deleting` | `deleted`).
         * + `tag`:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
         * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * + `type` - The type of virtual private gateway. Currently the only supported type is `ipsec.1`.
         * + `vpn-gateway-id` - The ID of the virtual private gateway.
         */
        public var filters: List<Filter>? = null
        /**
         * One or more virtual private gateway IDs.
         *
         * Default: Describes all your virtual private gateways.
         */
        public var vpnGatewayIds: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVpnGatewaysRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.vpnGatewayIds = x.vpnGatewayIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVpnGatewaysRequest = DescribeVpnGatewaysRequest(this)
    }
}
