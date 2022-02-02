// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Client VPN endpoint.
 */
class ClientVpnEndpoint private constructor(builder: Builder) {
    /**
     * Information about the associated target networks. A target network is a subnet in a VPC.
     */
    @Deprecated("No longer recommended for use. See AWS API documentation for more details.")
    val associatedTargetNetworks: List<AssociatedTargetNetwork>? = builder.associatedTargetNetworks
    /**
     * Information about the authentication method used by the Client VPN endpoint.
     */
    val authenticationOptions: List<ClientVpnAuthentication>? = builder.authenticationOptions
    /**
     * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     */
    val clientCidrBlock: kotlin.String? = builder.clientCidrBlock
    /**
     * The options for managing connection authorization for new client connections.
     */
    val clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectResponseOptions? = builder.clientConnectOptions
    val clientLoginBannerOptions: aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions? = builder.clientLoginBannerOptions
    /**
     * The ID of the Client VPN endpoint.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Information about the client connection logging options for the Client VPN endpoint.
     */
    val connectionLogOptions: aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions? = builder.connectionLogOptions
    /**
     * The date and time the Client VPN endpoint was created.
     */
    val creationTime: kotlin.String? = builder.creationTime
    /**
     * The date and time the Client VPN endpoint was deleted, if applicable.
     */
    val deletionTime: kotlin.String? = builder.deletionTime
    /**
     * A brief description of the endpoint.
     */
    val description: kotlin.String? = builder.description
    /**
     * The DNS name to be used by clients when connecting to the Client VPN endpoint.
     */
    val dnsName: kotlin.String? = builder.dnsName
    /**
     * Information about the DNS servers to be used for DNS resolution.
     */
    val dnsServers: List<String>? = builder.dnsServers
    /**
     * The IDs of the security groups for the target network.
     */
    val securityGroupIds: List<String>? = builder.securityGroupIds
    /**
     * The URL of the self-service portal.
     */
    val selfServicePortalUrl: kotlin.String? = builder.selfServicePortalUrl
    /**
     * The ARN of the server certificate.
     */
    val serverCertificateArn: kotlin.String? = builder.serverCertificateArn
    val sessionTimeoutHours: kotlin.Int? = builder.sessionTimeoutHours
    /**
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel Client VPN endpoint
     * in the Client VPN Administrator Guide.
     */
    val splitTunnel: kotlin.Boolean? = builder.splitTunnel
    /**
     * The current state of the Client VPN endpoint.
     */
    val status: aws.sdk.kotlin.services.ec2.model.ClientVpnEndpointStatus? = builder.status
    /**
     * Any tags assigned to the Client VPN endpoint.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The transport protocol used by the Client VPN endpoint.
     */
    val transportProtocol: aws.sdk.kotlin.services.ec2.model.TransportProtocol? = builder.transportProtocol
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId
    /**
     * The port number for the  Client VPN endpoint.
     */
    val vpnPort: kotlin.Int? = builder.vpnPort
    /**
     * The protocol used by the VPN session.
     */
    val vpnProtocol: aws.sdk.kotlin.services.ec2.model.VpnProtocol? = builder.vpnProtocol

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClientVpnEndpoint = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnEndpoint(")
        append("associatedTargetNetworks=$associatedTargetNetworks,")
        append("authenticationOptions=$authenticationOptions,")
        append("clientCidrBlock=$clientCidrBlock,")
        append("clientConnectOptions=$clientConnectOptions,")
        append("clientLoginBannerOptions=$clientLoginBannerOptions,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("connectionLogOptions=$connectionLogOptions,")
        append("creationTime=$creationTime,")
        append("deletionTime=$deletionTime,")
        append("description=$description,")
        append("dnsName=$dnsName,")
        append("dnsServers=$dnsServers,")
        append("securityGroupIds=$securityGroupIds,")
        append("selfServicePortalUrl=$selfServicePortalUrl,")
        append("serverCertificateArn=$serverCertificateArn,")
        append("sessionTimeoutHours=$sessionTimeoutHours,")
        append("splitTunnel=$splitTunnel,")
        append("status=$status,")
        append("tags=$tags,")
        append("transportProtocol=$transportProtocol,")
        append("vpcId=$vpcId,")
        append("vpnPort=$vpnPort,")
        append("vpnProtocol=$vpnProtocol)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associatedTargetNetworks?.hashCode() ?: 0
        result = 31 * result + (authenticationOptions?.hashCode() ?: 0)
        result = 31 * result + (clientCidrBlock?.hashCode() ?: 0)
        result = 31 * result + (clientConnectOptions?.hashCode() ?: 0)
        result = 31 * result + (clientLoginBannerOptions?.hashCode() ?: 0)
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (connectionLogOptions?.hashCode() ?: 0)
        result = 31 * result + (creationTime?.hashCode() ?: 0)
        result = 31 * result + (deletionTime?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dnsName?.hashCode() ?: 0)
        result = 31 * result + (dnsServers?.hashCode() ?: 0)
        result = 31 * result + (securityGroupIds?.hashCode() ?: 0)
        result = 31 * result + (selfServicePortalUrl?.hashCode() ?: 0)
        result = 31 * result + (serverCertificateArn?.hashCode() ?: 0)
        result = 31 * result + (sessionTimeoutHours ?: 0)
        result = 31 * result + (splitTunnel?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (transportProtocol?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpnPort ?: 0)
        result = 31 * result + (vpnProtocol?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClientVpnEndpoint

        if (associatedTargetNetworks != other.associatedTargetNetworks) return false
        if (authenticationOptions != other.authenticationOptions) return false
        if (clientCidrBlock != other.clientCidrBlock) return false
        if (clientConnectOptions != other.clientConnectOptions) return false
        if (clientLoginBannerOptions != other.clientLoginBannerOptions) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (connectionLogOptions != other.connectionLogOptions) return false
        if (creationTime != other.creationTime) return false
        if (deletionTime != other.deletionTime) return false
        if (description != other.description) return false
        if (dnsName != other.dnsName) return false
        if (dnsServers != other.dnsServers) return false
        if (securityGroupIds != other.securityGroupIds) return false
        if (selfServicePortalUrl != other.selfServicePortalUrl) return false
        if (serverCertificateArn != other.serverCertificateArn) return false
        if (sessionTimeoutHours != other.sessionTimeoutHours) return false
        if (splitTunnel != other.splitTunnel) return false
        if (status != other.status) return false
        if (tags != other.tags) return false
        if (transportProtocol != other.transportProtocol) return false
        if (vpcId != other.vpcId) return false
        if (vpnPort != other.vpnPort) return false
        if (vpnProtocol != other.vpnProtocol) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClientVpnEndpoint = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the associated target networks. A target network is a subnet in a VPC.
         */
        @Deprecated("No longer recommended for use. See AWS API documentation for more details.")
        var associatedTargetNetworks: List<AssociatedTargetNetwork>? = null
        /**
         * Information about the authentication method used by the Client VPN endpoint.
         */
        var authenticationOptions: List<ClientVpnAuthentication>? = null
        /**
         * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
         */
        var clientCidrBlock: kotlin.String? = null
        /**
         * The options for managing connection authorization for new client connections.
         */
        var clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectResponseOptions? = null
        var clientLoginBannerOptions: aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions? = null
        /**
         * The ID of the Client VPN endpoint.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * Information about the client connection logging options for the Client VPN endpoint.
         */
        var connectionLogOptions: aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions? = null
        /**
         * The date and time the Client VPN endpoint was created.
         */
        var creationTime: kotlin.String? = null
        /**
         * The date and time the Client VPN endpoint was deleted, if applicable.
         */
        var deletionTime: kotlin.String? = null
        /**
         * A brief description of the endpoint.
         */
        var description: kotlin.String? = null
        /**
         * The DNS name to be used by clients when connecting to the Client VPN endpoint.
         */
        var dnsName: kotlin.String? = null
        /**
         * Information about the DNS servers to be used for DNS resolution.
         */
        var dnsServers: List<String>? = null
        /**
         * The IDs of the security groups for the target network.
         */
        var securityGroupIds: List<String>? = null
        /**
         * The URL of the self-service portal.
         */
        var selfServicePortalUrl: kotlin.String? = null
        /**
         * The ARN of the server certificate.
         */
        var serverCertificateArn: kotlin.String? = null
        var sessionTimeoutHours: kotlin.Int? = null
        /**
         * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
         * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel Client VPN endpoint
         * in the Client VPN Administrator Guide.
         */
        var splitTunnel: kotlin.Boolean? = null
        /**
         * The current state of the Client VPN endpoint.
         */
        var status: aws.sdk.kotlin.services.ec2.model.ClientVpnEndpointStatus? = null
        /**
         * Any tags assigned to the Client VPN endpoint.
         */
        var tags: List<Tag>? = null
        /**
         * The transport protocol used by the Client VPN endpoint.
         */
        var transportProtocol: aws.sdk.kotlin.services.ec2.model.TransportProtocol? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null
        /**
         * The port number for the  Client VPN endpoint.
         */
        var vpnPort: kotlin.Int? = null
        /**
         * The protocol used by the VPN session.
         */
        var vpnProtocol: aws.sdk.kotlin.services.ec2.model.VpnProtocol? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClientVpnEndpoint) : this() {
            this.associatedTargetNetworks = x.associatedTargetNetworks
            this.authenticationOptions = x.authenticationOptions
            this.clientCidrBlock = x.clientCidrBlock
            this.clientConnectOptions = x.clientConnectOptions
            this.clientLoginBannerOptions = x.clientLoginBannerOptions
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.connectionLogOptions = x.connectionLogOptions
            this.creationTime = x.creationTime
            this.deletionTime = x.deletionTime
            this.description = x.description
            this.dnsName = x.dnsName
            this.dnsServers = x.dnsServers
            this.securityGroupIds = x.securityGroupIds
            this.selfServicePortalUrl = x.selfServicePortalUrl
            this.serverCertificateArn = x.serverCertificateArn
            this.sessionTimeoutHours = x.sessionTimeoutHours
            this.splitTunnel = x.splitTunnel
            this.status = x.status
            this.tags = x.tags
            this.transportProtocol = x.transportProtocol
            this.vpcId = x.vpcId
            this.vpnPort = x.vpnPort
            this.vpnProtocol = x.vpnProtocol
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClientVpnEndpoint = ClientVpnEndpoint(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientConnectResponseOptions] inside the given [block]
         */
        fun clientConnectOptions(block: aws.sdk.kotlin.services.ec2.model.ClientConnectResponseOptions.Builder.() -> kotlin.Unit) {
            this.clientConnectOptions = aws.sdk.kotlin.services.ec2.model.ClientConnectResponseOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions] inside the given [block]
         */
        fun clientLoginBannerOptions(block: aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions.Builder.() -> kotlin.Unit) {
            this.clientLoginBannerOptions = aws.sdk.kotlin.services.ec2.model.ClientLoginBannerResponseOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions] inside the given [block]
         */
        fun connectionLogOptions(block: aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions.Builder.() -> kotlin.Unit) {
            this.connectionLogOptions = aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientVpnEndpointStatus] inside the given [block]
         */
        fun status(block: aws.sdk.kotlin.services.ec2.model.ClientVpnEndpointStatus.Builder.() -> kotlin.Unit) {
            this.status = aws.sdk.kotlin.services.ec2.model.ClientVpnEndpointStatus.invoke(block)
        }
    }
}