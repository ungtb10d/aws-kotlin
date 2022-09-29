// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AssociateRouteTableRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the internet gateway or virtual private gateway.
     */
    public val gatewayId: kotlin.String? = builder.gatewayId
    /**
     * The ID of the route table.
     */
    public val routeTableId: kotlin.String? = builder.routeTableId
    /**
     * The ID of the subnet.
     */
    public val subnetId: kotlin.String? = builder.subnetId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateRouteTableRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateRouteTableRequest(")
        append("dryRun=$dryRun,")
        append("gatewayId=$gatewayId,")
        append("routeTableId=$routeTableId,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (gatewayId?.hashCode() ?: 0)
        result = 31 * result + (routeTableId?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateRouteTableRequest

        if (dryRun != other.dryRun) return false
        if (gatewayId != other.gatewayId) return false
        if (routeTableId != other.routeTableId) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateRouteTableRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the internet gateway or virtual private gateway.
         */
        public var gatewayId: kotlin.String? = null
        /**
         * The ID of the route table.
         */
        public var routeTableId: kotlin.String? = null
        /**
         * The ID of the subnet.
         */
        public var subnetId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateRouteTableRequest) : this() {
            this.dryRun = x.dryRun
            this.gatewayId = x.gatewayId
            this.routeTableId = x.routeTableId
            this.subnetId = x.subnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateRouteTableRequest = AssociateRouteTableRequest(this)
    }
}
