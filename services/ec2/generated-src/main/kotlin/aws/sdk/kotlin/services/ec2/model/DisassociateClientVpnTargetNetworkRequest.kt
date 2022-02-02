// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateClientVpnTargetNetworkRequest private constructor(builder: Builder) {
    /**
     * The ID of the target network association.
     */
    val associationId: kotlin.String? = builder.associationId
    /**
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest = Builder().apply(block).build()
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

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateClientVpnTargetNetworkRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the target network association.
         */
        var associationId: kotlin.String? = null
        /**
         * The ID of the Client VPN endpoint from which to disassociate the target network.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

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