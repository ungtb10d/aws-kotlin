// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateTransitGatewayConnectResponse private constructor(builder: Builder) {
    /**
     * Information about the Connect attachment.
     */
    public val transitGatewayConnect: aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect? = builder.transitGatewayConnect

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayConnectResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTransitGatewayConnectResponse(")
        append("transitGatewayConnect=$transitGatewayConnect)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayConnect?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTransitGatewayConnectResponse

        if (transitGatewayConnect != other.transitGatewayConnect) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayConnectResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the Connect attachment.
         */
        public var transitGatewayConnect: aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayConnectResponse) : this() {
            this.transitGatewayConnect = x.transitGatewayConnect
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayConnectResponse = CreateTransitGatewayConnectResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect] inside the given [block]
         */
        public fun transitGatewayConnect(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect.Builder.() -> kotlin.Unit) {
            this.transitGatewayConnect = aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect.invoke(block)
        }
    }
}
