// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The VPN tunnel options.
 */
class TunnelOption private constructor(builder: Builder) {
    /**
     * The action to take after a DPD timeout occurs.
     */
    val dpdTimeoutAction: kotlin.String? = builder.dpdTimeoutAction
    /**
     * The number of seconds after which a DPD timeout occurs.
     */
    val dpdTimeoutSeconds: kotlin.Int? = builder.dpdTimeoutSeconds
    /**
     * The IKE versions that are permitted for the VPN tunnel.
     */
    val ikeVersions: List<IkeVersionsListValue>? = builder.ikeVersions
    /**
     * The external IP address of the VPN tunnel.
     */
    val outsideIpAddress: kotlin.String? = builder.outsideIpAddress
    /**
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE
     * negotiations.
     */
    val phase1DhGroupNumbers: List<Phase1DhGroupNumbersListValue>? = builder.phase1DhGroupNumbers
    /**
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     */
    val phase1EncryptionAlgorithms: List<Phase1EncryptionAlgorithmsListValue>? = builder.phase1EncryptionAlgorithms
    /**
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
     * negotiations.
     */
    val phase1IntegrityAlgorithms: List<Phase1IntegrityAlgorithmsListValue>? = builder.phase1IntegrityAlgorithms
    /**
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     */
    val phase1LifetimeSeconds: kotlin.Int? = builder.phase1LifetimeSeconds
    /**
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE
     * negotiations.
     */
    val phase2DhGroupNumbers: List<Phase2DhGroupNumbersListValue>? = builder.phase2DhGroupNumbers
    /**
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     */
    val phase2EncryptionAlgorithms: List<Phase2EncryptionAlgorithmsListValue>? = builder.phase2EncryptionAlgorithms
    /**
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
     * negotiations.
     */
    val phase2IntegrityAlgorithms: List<Phase2IntegrityAlgorithmsListValue>? = builder.phase2IntegrityAlgorithms
    /**
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     */
    val phase2LifetimeSeconds: kotlin.Int? = builder.phase2LifetimeSeconds
    /**
     * The pre-shared key (PSK) to establish initial authentication between the virtual
     * private gateway and the customer gateway.
     */
    val preSharedKey: kotlin.String? = builder.preSharedKey
    /**
     * The percentage of the rekey window determined by RekeyMarginTimeSeconds
     * during which the rekey time is randomly selected.
     */
    val rekeyFuzzPercentage: kotlin.Int? = builder.rekeyFuzzPercentage
    /**
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the
     * Amazon Web Services side of the VPN connection performs an IKE rekey.
     */
    val rekeyMarginTimeSeconds: kotlin.Int? = builder.rekeyMarginTimeSeconds
    /**
     * The number of packets in an IKE replay window.
     */
    val replayWindowSize: kotlin.Int? = builder.replayWindowSize
    /**
     * The action to take when the establishing the VPN tunnels for a VPN connection.
     */
    val startupAction: kotlin.String? = builder.startupAction
    /**
     * The range of inside IPv4 addresses for the tunnel.
     */
    val tunnelInsideCidr: kotlin.String? = builder.tunnelInsideCidr
    /**
     * The range of inside IPv6 addresses for the tunnel.
     */
    val tunnelInsideIpv6Cidr: kotlin.String? = builder.tunnelInsideIpv6Cidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TunnelOption = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TunnelOption(")
        append("dpdTimeoutAction=$dpdTimeoutAction,")
        append("dpdTimeoutSeconds=$dpdTimeoutSeconds,")
        append("ikeVersions=$ikeVersions,")
        append("outsideIpAddress=$outsideIpAddress,")
        append("phase1DhGroupNumbers=$phase1DhGroupNumbers,")
        append("phase1EncryptionAlgorithms=$phase1EncryptionAlgorithms,")
        append("phase1IntegrityAlgorithms=$phase1IntegrityAlgorithms,")
        append("phase1LifetimeSeconds=$phase1LifetimeSeconds,")
        append("phase2DhGroupNumbers=$phase2DhGroupNumbers,")
        append("phase2EncryptionAlgorithms=$phase2EncryptionAlgorithms,")
        append("phase2IntegrityAlgorithms=$phase2IntegrityAlgorithms,")
        append("phase2LifetimeSeconds=$phase2LifetimeSeconds,")
        append("preSharedKey=$preSharedKey,")
        append("rekeyFuzzPercentage=$rekeyFuzzPercentage,")
        append("rekeyMarginTimeSeconds=$rekeyMarginTimeSeconds,")
        append("replayWindowSize=$replayWindowSize,")
        append("startupAction=$startupAction,")
        append("tunnelInsideCidr=$tunnelInsideCidr,")
        append("tunnelInsideIpv6Cidr=$tunnelInsideIpv6Cidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dpdTimeoutAction?.hashCode() ?: 0
        result = 31 * result + (dpdTimeoutSeconds ?: 0)
        result = 31 * result + (ikeVersions?.hashCode() ?: 0)
        result = 31 * result + (outsideIpAddress?.hashCode() ?: 0)
        result = 31 * result + (phase1DhGroupNumbers?.hashCode() ?: 0)
        result = 31 * result + (phase1EncryptionAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase1IntegrityAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase1LifetimeSeconds ?: 0)
        result = 31 * result + (phase2DhGroupNumbers?.hashCode() ?: 0)
        result = 31 * result + (phase2EncryptionAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase2IntegrityAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase2LifetimeSeconds ?: 0)
        result = 31 * result + (preSharedKey?.hashCode() ?: 0)
        result = 31 * result + (rekeyFuzzPercentage ?: 0)
        result = 31 * result + (rekeyMarginTimeSeconds ?: 0)
        result = 31 * result + (replayWindowSize ?: 0)
        result = 31 * result + (startupAction?.hashCode() ?: 0)
        result = 31 * result + (tunnelInsideCidr?.hashCode() ?: 0)
        result = 31 * result + (tunnelInsideIpv6Cidr?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TunnelOption

        if (dpdTimeoutAction != other.dpdTimeoutAction) return false
        if (dpdTimeoutSeconds != other.dpdTimeoutSeconds) return false
        if (ikeVersions != other.ikeVersions) return false
        if (outsideIpAddress != other.outsideIpAddress) return false
        if (phase1DhGroupNumbers != other.phase1DhGroupNumbers) return false
        if (phase1EncryptionAlgorithms != other.phase1EncryptionAlgorithms) return false
        if (phase1IntegrityAlgorithms != other.phase1IntegrityAlgorithms) return false
        if (phase1LifetimeSeconds != other.phase1LifetimeSeconds) return false
        if (phase2DhGroupNumbers != other.phase2DhGroupNumbers) return false
        if (phase2EncryptionAlgorithms != other.phase2EncryptionAlgorithms) return false
        if (phase2IntegrityAlgorithms != other.phase2IntegrityAlgorithms) return false
        if (phase2LifetimeSeconds != other.phase2LifetimeSeconds) return false
        if (preSharedKey != other.preSharedKey) return false
        if (rekeyFuzzPercentage != other.rekeyFuzzPercentage) return false
        if (rekeyMarginTimeSeconds != other.rekeyMarginTimeSeconds) return false
        if (replayWindowSize != other.replayWindowSize) return false
        if (startupAction != other.startupAction) return false
        if (tunnelInsideCidr != other.tunnelInsideCidr) return false
        if (tunnelInsideIpv6Cidr != other.tunnelInsideIpv6Cidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TunnelOption = Builder(this).apply(block).build()

    class Builder {
        /**
         * The action to take after a DPD timeout occurs.
         */
        var dpdTimeoutAction: kotlin.String? = null
        /**
         * The number of seconds after which a DPD timeout occurs.
         */
        var dpdTimeoutSeconds: kotlin.Int? = null
        /**
         * The IKE versions that are permitted for the VPN tunnel.
         */
        var ikeVersions: List<IkeVersionsListValue>? = null
        /**
         * The external IP address of the VPN tunnel.
         */
        var outsideIpAddress: kotlin.String? = null
        /**
         * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE
         * negotiations.
         */
        var phase1DhGroupNumbers: List<Phase1DhGroupNumbersListValue>? = null
        /**
         * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE
         * negotiations.
         */
        var phase1EncryptionAlgorithms: List<Phase1EncryptionAlgorithmsListValue>? = null
        /**
         * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE
         * negotiations.
         */
        var phase1IntegrityAlgorithms: List<Phase1IntegrityAlgorithmsListValue>? = null
        /**
         * The lifetime for phase 1 of the IKE negotiation, in seconds.
         */
        var phase1LifetimeSeconds: kotlin.Int? = null
        /**
         * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE
         * negotiations.
         */
        var phase2DhGroupNumbers: List<Phase2DhGroupNumbersListValue>? = null
        /**
         * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE
         * negotiations.
         */
        var phase2EncryptionAlgorithms: List<Phase2EncryptionAlgorithmsListValue>? = null
        /**
         * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE
         * negotiations.
         */
        var phase2IntegrityAlgorithms: List<Phase2IntegrityAlgorithmsListValue>? = null
        /**
         * The lifetime for phase 2 of the IKE negotiation, in seconds.
         */
        var phase2LifetimeSeconds: kotlin.Int? = null
        /**
         * The pre-shared key (PSK) to establish initial authentication between the virtual
         * private gateway and the customer gateway.
         */
        var preSharedKey: kotlin.String? = null
        /**
         * The percentage of the rekey window determined by RekeyMarginTimeSeconds
         * during which the rekey time is randomly selected.
         */
        var rekeyFuzzPercentage: kotlin.Int? = null
        /**
         * The margin time, in seconds, before the phase 2 lifetime expires, during which the
         * Amazon Web Services side of the VPN connection performs an IKE rekey.
         */
        var rekeyMarginTimeSeconds: kotlin.Int? = null
        /**
         * The number of packets in an IKE replay window.
         */
        var replayWindowSize: kotlin.Int? = null
        /**
         * The action to take when the establishing the VPN tunnels for a VPN connection.
         */
        var startupAction: kotlin.String? = null
        /**
         * The range of inside IPv4 addresses for the tunnel.
         */
        var tunnelInsideCidr: kotlin.String? = null
        /**
         * The range of inside IPv6 addresses for the tunnel.
         */
        var tunnelInsideIpv6Cidr: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TunnelOption) : this() {
            this.dpdTimeoutAction = x.dpdTimeoutAction
            this.dpdTimeoutSeconds = x.dpdTimeoutSeconds
            this.ikeVersions = x.ikeVersions
            this.outsideIpAddress = x.outsideIpAddress
            this.phase1DhGroupNumbers = x.phase1DhGroupNumbers
            this.phase1EncryptionAlgorithms = x.phase1EncryptionAlgorithms
            this.phase1IntegrityAlgorithms = x.phase1IntegrityAlgorithms
            this.phase1LifetimeSeconds = x.phase1LifetimeSeconds
            this.phase2DhGroupNumbers = x.phase2DhGroupNumbers
            this.phase2EncryptionAlgorithms = x.phase2EncryptionAlgorithms
            this.phase2IntegrityAlgorithms = x.phase2IntegrityAlgorithms
            this.phase2LifetimeSeconds = x.phase2LifetimeSeconds
            this.preSharedKey = x.preSharedKey
            this.rekeyFuzzPercentage = x.rekeyFuzzPercentage
            this.rekeyMarginTimeSeconds = x.rekeyMarginTimeSeconds
            this.replayWindowSize = x.replayWindowSize
            this.startupAction = x.startupAction
            this.tunnelInsideCidr = x.tunnelInsideCidr
            this.tunnelInsideIpv6Cidr = x.tunnelInsideIpv6Cidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TunnelOption = TunnelOption(this)
    }
}