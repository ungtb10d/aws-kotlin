// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteVpcPeeringConnectionRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC peering connection.
     */
    public val vpcPeeringConnectionId: kotlin.String? = builder.vpcPeeringConnectionId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteVpcPeeringConnectionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpcPeeringConnectionRequest(")
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

        other as DeleteVpcPeeringConnectionRequest

        if (dryRun != other.dryRun) return false
        if (vpcPeeringConnectionId != other.vpcPeeringConnectionId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteVpcPeeringConnectionRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC peering connection.
         */
        public var vpcPeeringConnectionId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteVpcPeeringConnectionRequest) : this() {
            this.dryRun = x.dryRun
            this.vpcPeeringConnectionId = x.vpcPeeringConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteVpcPeeringConnectionRequest = DeleteVpcPeeringConnectionRequest(this)
    }
}
