// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DisassociateClientVpnTargetNetworkRequest private constructor(builder: Builder) {
    /**
     * The ID of the target network association.
     */
    public val associationId: kotlin.String? = builder.associationId
    /**
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     */
    public val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateClientVpnTargetNetworkRequest(")
        append("associationId=$associationId,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateClientVpnTargetNetworkRequest

        if (associationId != other.associationId) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the target network association.
         */
        public var associationId: kotlin.String? = null
        /**
         * The ID of the Client VPN endpoint from which to disassociate the target network.
         */
        public var clientVpnEndpointId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest) : this() {
            this.associationId = x.associationId
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest = DisassociateClientVpnTargetNetworkRequest(this)
    }
}
