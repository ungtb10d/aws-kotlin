// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DetachVpnGateway.
 */
public class DetachVpnGatewayRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC.
     */
    public val vpcId: kotlin.String? = builder.vpcId
    /**
     * The ID of the virtual private gateway.
     */
    public val vpnGatewayId: kotlin.String? = builder.vpnGatewayId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DetachVpnGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DetachVpnGatewayRequest(")
        append("dryRun=$dryRun,")
        append("vpcId=$vpcId,")
        append("vpnGatewayId=$vpnGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpnGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DetachVpnGatewayRequest

        if (dryRun != other.dryRun) return false
        if (vpcId != other.vpcId) return false
        if (vpnGatewayId != other.vpnGatewayId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DetachVpnGatewayRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC.
         */
        public var vpcId: kotlin.String? = null
        /**
         * The ID of the virtual private gateway.
         */
        public var vpnGatewayId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DetachVpnGatewayRequest) : this() {
            this.dryRun = x.dryRun
            this.vpcId = x.vpcId
            this.vpnGatewayId = x.vpnGatewayId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DetachVpnGatewayRequest = DetachVpnGatewayRequest(this)
    }
}
