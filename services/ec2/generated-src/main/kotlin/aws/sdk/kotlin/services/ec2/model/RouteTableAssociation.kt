// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an association between a route table and a subnet or gateway.
 */
public class RouteTableAssociation private constructor(builder: Builder) {
    /**
     * The state of the association.
     */
    public val associationState: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState? = builder.associationState
    /**
     * The ID of the internet gateway or virtual private gateway.
     */
    public val gatewayId: kotlin.String? = builder.gatewayId
    /**
     * Indicates whether this is the main route table.
     */
    public val main: kotlin.Boolean? = builder.main
    /**
     * The ID of the association.
     */
    public val routeTableAssociationId: kotlin.String? = builder.routeTableAssociationId
    /**
     * The ID of the route table.
     */
    public val routeTableId: kotlin.String? = builder.routeTableId
    /**
     * The ID of the subnet. A subnet ID is not returned for an implicit association.
     */
    public val subnetId: kotlin.String? = builder.subnetId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RouteTableAssociation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RouteTableAssociation(")
        append("associationState=$associationState,")
        append("gatewayId=$gatewayId,")
        append("main=$main,")
        append("routeTableAssociationId=$routeTableAssociationId,")
        append("routeTableId=$routeTableId,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationState?.hashCode() ?: 0
        result = 31 * result + (gatewayId?.hashCode() ?: 0)
        result = 31 * result + (main?.hashCode() ?: 0)
        result = 31 * result + (routeTableAssociationId?.hashCode() ?: 0)
        result = 31 * result + (routeTableId?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RouteTableAssociation

        if (associationState != other.associationState) return false
        if (gatewayId != other.gatewayId) return false
        if (main != other.main) return false
        if (routeTableAssociationId != other.routeTableAssociationId) return false
        if (routeTableId != other.routeTableId) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RouteTableAssociation = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The state of the association.
         */
        public var associationState: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState? = null
        /**
         * The ID of the internet gateway or virtual private gateway.
         */
        public var gatewayId: kotlin.String? = null
        /**
         * Indicates whether this is the main route table.
         */
        public var main: kotlin.Boolean? = null
        /**
         * The ID of the association.
         */
        public var routeTableAssociationId: kotlin.String? = null
        /**
         * The ID of the route table.
         */
        public var routeTableId: kotlin.String? = null
        /**
         * The ID of the subnet. A subnet ID is not returned for an implicit association.
         */
        public var subnetId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RouteTableAssociation) : this() {
            this.associationState = x.associationState
            this.gatewayId = x.gatewayId
            this.main = x.main
            this.routeTableAssociationId = x.routeTableAssociationId
            this.routeTableId = x.routeTableId
            this.subnetId = x.subnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RouteTableAssociation = RouteTableAssociation(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState] inside the given [block]
         */
        public fun associationState(block: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState.Builder.() -> kotlin.Unit) {
            this.associationState = aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState.invoke(block)
        }
    }
}
