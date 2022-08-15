// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DisableTransitGatewayRouteTablePropagationResponse private constructor(builder: Builder) {
    /**
     * Information about route propagation.
     */
    public val propagation: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation? = builder.propagation

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisableTransitGatewayRouteTablePropagationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisableTransitGatewayRouteTablePropagationResponse(")
        append("propagation=$propagation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = propagation?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisableTransitGatewayRouteTablePropagationResponse

        if (propagation != other.propagation) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisableTransitGatewayRouteTablePropagationResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about route propagation.
         */
        public var propagation: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisableTransitGatewayRouteTablePropagationResponse) : this() {
            this.propagation = x.propagation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisableTransitGatewayRouteTablePropagationResponse = DisableTransitGatewayRouteTablePropagationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation] inside the given [block]
         */
        public fun propagation(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation.Builder.() -> kotlin.Unit) {
            this.propagation = aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation.invoke(block)
        }
    }
}
