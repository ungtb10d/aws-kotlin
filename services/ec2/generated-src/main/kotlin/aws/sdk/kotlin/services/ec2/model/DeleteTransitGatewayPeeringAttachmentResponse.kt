// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteTransitGatewayPeeringAttachmentResponse private constructor(builder: Builder) {
    /**
     * The transit gateway peering attachment.
     */
    public val transitGatewayPeeringAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment? = builder.transitGatewayPeeringAttachment

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPeeringAttachmentResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayPeeringAttachmentResponse(")
        append("transitGatewayPeeringAttachment=$transitGatewayPeeringAttachment)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayPeeringAttachment?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTransitGatewayPeeringAttachmentResponse

        if (transitGatewayPeeringAttachment != other.transitGatewayPeeringAttachment) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPeeringAttachmentResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The transit gateway peering attachment.
         */
        public var transitGatewayPeeringAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPeeringAttachmentResponse) : this() {
            this.transitGatewayPeeringAttachment = x.transitGatewayPeeringAttachment
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPeeringAttachmentResponse = DeleteTransitGatewayPeeringAttachmentResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment] inside the given [block]
         */
        public fun transitGatewayPeeringAttachment(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment.Builder.() -> kotlin.Unit) {
            this.transitGatewayPeeringAttachment = aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment.invoke(block)
        }
    }
}
