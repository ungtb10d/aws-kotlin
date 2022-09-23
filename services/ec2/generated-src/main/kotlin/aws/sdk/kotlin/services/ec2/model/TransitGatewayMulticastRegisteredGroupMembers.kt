// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the registered transit gateway multicast group members.
 */
public class TransitGatewayMulticastRegisteredGroupMembers private constructor(builder: Builder) {
    /**
     * The IP address assigned to the transit gateway multicast group.
     */
    public val groupIpAddress: kotlin.String? = builder.groupIpAddress
    /**
     * The ID of the registered network interfaces.
     */
    public val registeredNetworkInterfaceIds: List<String>? = builder.registeredNetworkInterfaceIds
    /**
     * The ID of the transit gateway multicast domain.
     */
    public val transitGatewayMulticastDomainId: kotlin.String? = builder.transitGatewayMulticastDomainId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastRegisteredGroupMembers = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayMulticastRegisteredGroupMembers(")
        append("groupIpAddress=$groupIpAddress,")
        append("registeredNetworkInterfaceIds=$registeredNetworkInterfaceIds,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groupIpAddress?.hashCode() ?: 0
        result = 31 * result + (registeredNetworkInterfaceIds?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayMulticastRegisteredGroupMembers

        if (groupIpAddress != other.groupIpAddress) return false
        if (registeredNetworkInterfaceIds != other.registeredNetworkInterfaceIds) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastRegisteredGroupMembers = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The IP address assigned to the transit gateway multicast group.
         */
        public var groupIpAddress: kotlin.String? = null
        /**
         * The ID of the registered network interfaces.
         */
        public var registeredNetworkInterfaceIds: List<String>? = null
        /**
         * The ID of the transit gateway multicast domain.
         */
        public var transitGatewayMulticastDomainId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastRegisteredGroupMembers) : this() {
            this.groupIpAddress = x.groupIpAddress
            this.registeredNetworkInterfaceIds = x.registeredNetworkInterfaceIds
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastRegisteredGroupMembers = TransitGatewayMulticastRegisteredGroupMembers(this)
    }
}
