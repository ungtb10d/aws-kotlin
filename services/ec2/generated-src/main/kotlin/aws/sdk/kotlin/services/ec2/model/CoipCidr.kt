// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about a customer-owned IP address range.
 */
public class CoipCidr private constructor(builder: Builder) {
    /**
     * An address range in a customer-owned IP address space.
     */
    public val cidr: kotlin.String? = builder.cidr
    /**
     * The ID of the address pool.
     */
    public val coipPoolId: kotlin.String? = builder.coipPoolId
    /**
     * The ID of the local gateway route table.
     */
    public val localGatewayRouteTableId: kotlin.String? = builder.localGatewayRouteTableId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CoipCidr = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CoipCidr(")
        append("cidr=$cidr,")
        append("coipPoolId=$coipPoolId,")
        append("localGatewayRouteTableId=$localGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (coipPoolId?.hashCode() ?: 0)
        result = 31 * result + (localGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CoipCidr

        if (cidr != other.cidr) return false
        if (coipPoolId != other.coipPoolId) return false
        if (localGatewayRouteTableId != other.localGatewayRouteTableId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CoipCidr = Builder(this).apply(block).build()

    public class Builder {
        /**
         * An address range in a customer-owned IP address space.
         */
        public var cidr: kotlin.String? = null
        /**
         * The ID of the address pool.
         */
        public var coipPoolId: kotlin.String? = null
        /**
         * The ID of the local gateway route table.
         */
        public var localGatewayRouteTableId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CoipCidr) : this() {
            this.cidr = x.cidr
            this.coipPoolId = x.coipPoolId
            this.localGatewayRouteTableId = x.localGatewayRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CoipCidr = CoipCidr(this)
    }
}
