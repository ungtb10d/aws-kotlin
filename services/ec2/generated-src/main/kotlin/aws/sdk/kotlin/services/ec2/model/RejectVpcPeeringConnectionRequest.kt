// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RejectVpcPeeringConnectionRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC peering connection.
     */
    val vpcPeeringConnectionId: kotlin.String? = builder.vpcPeeringConnectionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RejectVpcPeeringConnectionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RejectVpcPeeringConnectionRequest(")
        append("dryRun=$dryRun,")
        append("vpcPeeringConnectionId=$vpcPeeringConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (vpcPeeringConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RejectVpcPeeringConnectionRequest

        if (dryRun != other.dryRun) return false
        if (vpcPeeringConnectionId != other.vpcPeeringConnectionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RejectVpcPeeringConnectionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC peering connection.
         */
        var vpcPeeringConnectionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RejectVpcPeeringConnectionRequest) : this() {
            this.dryRun = x.dryRun
            this.vpcPeeringConnectionId = x.vpcPeeringConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RejectVpcPeeringConnectionRequest = RejectVpcPeeringConnectionRequest(this)
    }
}