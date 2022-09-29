// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a route table route.
 */
public class AnalysisRouteTableRoute private constructor(builder: Builder) {
    /**
     * The destination IPv4 address, in CIDR notation.
     */
    public val destinationCidr: kotlin.String? = builder.destinationCidr
    /**
     * The prefix of the Amazon Web Service.
     */
    public val destinationPrefixListId: kotlin.String? = builder.destinationPrefixListId
    /**
     * The ID of an egress-only internet gateway.
     */
    public val egressOnlyInternetGatewayId: kotlin.String? = builder.egressOnlyInternetGatewayId
    /**
     * The ID of the gateway, such as an internet gateway or virtual private gateway.
     */
    public val gatewayId: kotlin.String? = builder.gatewayId
    /**
     * The ID of the instance, such as a NAT instance.
     */
    public val instanceId: kotlin.String? = builder.instanceId
    /**
     * The ID of a NAT gateway.
     */
    public val natGatewayId: kotlin.String? = builder.natGatewayId
    /**
     * The ID of a network interface.
     */
    public val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * Describes how the route was created. The following are the possible values:
     * + CreateRouteTable - The route was automatically created when the route table was created.
     * + CreateRoute - The route was manually added to the route table.
     * + EnableVgwRoutePropagation - The route was propagated by route propagation.
     */
    public val origin: kotlin.String? = builder.origin
    /**
     * The state. The following are the possible values:
     * + active
     * + blackhole
     */
    public val state: kotlin.String? = builder.state
    /**
     * The ID of a transit gateway.
     */
    public val transitGatewayId: kotlin.String? = builder.transitGatewayId
    /**
     * The ID of a VPC peering connection.
     */
    public val vpcPeeringConnectionId: kotlin.String? = builder.vpcPeeringConnectionId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AnalysisRouteTableRoute(")
        append("destinationCidr=$destinationCidr,")
        append("destinationPrefixListId=$destinationPrefixListId,")
        append("egressOnlyInternetGatewayId=$egressOnlyInternetGatewayId,")
        append("gatewayId=$gatewayId,")
        append("instanceId=$instanceId,")
        append("natGatewayId=$natGatewayId,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("origin=$origin,")
        append("state=$state,")
        append("transitGatewayId=$transitGatewayId,")
        append("vpcPeeringConnectionId=$vpcPeeringConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationCidr?.hashCode() ?: 0
        result = 31 * result + (destinationPrefixListId?.hashCode() ?: 0)
        result = 31 * result + (egressOnlyInternetGatewayId?.hashCode() ?: 0)
        result = 31 * result + (gatewayId?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (natGatewayId?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (origin?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (vpcPeeringConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AnalysisRouteTableRoute

        if (destinationCidr != other.destinationCidr) return false
        if (destinationPrefixListId != other.destinationPrefixListId) return false
        if (egressOnlyInternetGatewayId != other.egressOnlyInternetGatewayId) return false
        if (gatewayId != other.gatewayId) return false
        if (instanceId != other.instanceId) return false
        if (natGatewayId != other.natGatewayId) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (origin != other.origin) return false
        if (state != other.state) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (vpcPeeringConnectionId != other.vpcPeeringConnectionId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The destination IPv4 address, in CIDR notation.
         */
        public var destinationCidr: kotlin.String? = null
        /**
         * The prefix of the Amazon Web Service.
         */
        public var destinationPrefixListId: kotlin.String? = null
        /**
         * The ID of an egress-only internet gateway.
         */
        public var egressOnlyInternetGatewayId: kotlin.String? = null
        /**
         * The ID of the gateway, such as an internet gateway or virtual private gateway.
         */
        public var gatewayId: kotlin.String? = null
        /**
         * The ID of the instance, such as a NAT instance.
         */
        public var instanceId: kotlin.String? = null
        /**
         * The ID of a NAT gateway.
         */
        public var natGatewayId: kotlin.String? = null
        /**
         * The ID of a network interface.
         */
        public var networkInterfaceId: kotlin.String? = null
        /**
         * Describes how the route was created. The following are the possible values:
         * + CreateRouteTable - The route was automatically created when the route table was created.
         * + CreateRoute - The route was manually added to the route table.
         * + EnableVgwRoutePropagation - The route was propagated by route propagation.
         */
        public var origin: kotlin.String? = null
        /**
         * The state. The following are the possible values:
         * + active
         * + blackhole
         */
        public var state: kotlin.String? = null
        /**
         * The ID of a transit gateway.
         */
        public var transitGatewayId: kotlin.String? = null
        /**
         * The ID of a VPC peering connection.
         */
        public var vpcPeeringConnectionId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute) : this() {
            this.destinationCidr = x.destinationCidr
            this.destinationPrefixListId = x.destinationPrefixListId
            this.egressOnlyInternetGatewayId = x.egressOnlyInternetGatewayId
            this.gatewayId = x.gatewayId
            this.instanceId = x.instanceId
            this.natGatewayId = x.natGatewayId
            this.networkInterfaceId = x.networkInterfaceId
            this.origin = x.origin
            this.state = x.state
            this.transitGatewayId = x.transitGatewayId
            this.vpcPeeringConnectionId = x.vpcPeeringConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute = AnalysisRouteTableRoute(this)
    }
}
