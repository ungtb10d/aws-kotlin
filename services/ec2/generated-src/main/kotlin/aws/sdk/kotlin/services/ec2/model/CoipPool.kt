// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a customer-owned address pool.
 */
public class CoipPool private constructor(builder: Builder) {
    /**
     * The ID of the local gateway route table.
     */
    public val localGatewayRouteTableId: kotlin.String? = builder.localGatewayRouteTableId
    /**
     * The ARN of the address pool.
     */
    public val poolArn: kotlin.String? = builder.poolArn
    /**
     * The address ranges of the address pool.
     */
    public val poolCidrs: List<String>? = builder.poolCidrs
    /**
     * The ID of the address pool.
     */
    public val poolId: kotlin.String? = builder.poolId
    /**
     * The tags.
     */
    public val tags: List<Tag>? = builder.tags

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CoipPool = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CoipPool(")
        append("localGatewayRouteTableId=$localGatewayRouteTableId,")
        append("poolArn=$poolArn,")
        append("poolCidrs=$poolCidrs,")
        append("poolId=$poolId,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = localGatewayRouteTableId?.hashCode() ?: 0
        result = 31 * result + (poolArn?.hashCode() ?: 0)
        result = 31 * result + (poolCidrs?.hashCode() ?: 0)
        result = 31 * result + (poolId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CoipPool

        if (localGatewayRouteTableId != other.localGatewayRouteTableId) return false
        if (poolArn != other.poolArn) return false
        if (poolCidrs != other.poolCidrs) return false
        if (poolId != other.poolId) return false
        if (tags != other.tags) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CoipPool = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the local gateway route table.
         */
        public var localGatewayRouteTableId: kotlin.String? = null
        /**
         * The ARN of the address pool.
         */
        public var poolArn: kotlin.String? = null
        /**
         * The address ranges of the address pool.
         */
        public var poolCidrs: List<String>? = null
        /**
         * The ID of the address pool.
         */
        public var poolId: kotlin.String? = null
        /**
         * The tags.
         */
        public var tags: List<Tag>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CoipPool) : this() {
            this.localGatewayRouteTableId = x.localGatewayRouteTableId
            this.poolArn = x.poolArn
            this.poolCidrs = x.poolCidrs
            this.poolId = x.poolId
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CoipPool = CoipPool(this)
    }
}
