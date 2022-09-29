// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteTransitGatewayVpcAttachmentResponse private constructor(builder: Builder) {
    /**
     * Information about the deleted VPC attachment.
     */
    public val transitGatewayVpcAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment? = builder.transitGatewayVpcAttachment

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayVpcAttachmentResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayVpcAttachmentResponse(")
        append("transitGatewayVpcAttachment=$transitGatewayVpcAttachment)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayVpcAttachment?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTransitGatewayVpcAttachmentResponse

        if (transitGatewayVpcAttachment != other.transitGatewayVpcAttachment) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayVpcAttachmentResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the deleted VPC attachment.
         */
        public var transitGatewayVpcAttachment: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayVpcAttachmentResponse) : this() {
            this.transitGatewayVpcAttachment = x.transitGatewayVpcAttachment
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayVpcAttachmentResponse = DeleteTransitGatewayVpcAttachmentResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment] inside the given [block]
         */
        public fun transitGatewayVpcAttachment(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment.Builder.() -> kotlin.Unit) {
            this.transitGatewayVpcAttachment = aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment.invoke(block)
        }
    }
}
