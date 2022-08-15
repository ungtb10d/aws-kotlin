// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes route propagation.
 */
public class TransitGatewayPropagation private constructor(builder: Builder) {
    /**
     * The ID of the resource.
     */
    public val resourceId: kotlin.String? = builder.resourceId
    /**
     * The resource type. Note that the `tgw-peering` resource type has been deprecated.
     */
    public val resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = builder.resourceType
    /**
     * The state.
     */
    public val state: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagationState? = builder.state
    /**
     * The ID of the attachment.
     */
    public val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway route table announcement.
     */
    public val transitGatewayRouteTableAnnouncementId: kotlin.String? = builder.transitGatewayRouteTableAnnouncementId
    /**
     * The ID of the transit gateway route table.
     */
    public val transitGatewayRouteTableId: kotlin.String? = builder.transitGatewayRouteTableId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayPropagation(")
        append("resourceId=$resourceId,")
        append("resourceType=$resourceType,")
        append("state=$state,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayRouteTableAnnouncementId=$transitGatewayRouteTableAnnouncementId,")
        append("transitGatewayRouteTableId=$transitGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceId?.hashCode() ?: 0
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableAnnouncementId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayPropagation

        if (resourceId != other.resourceId) return false
        if (resourceType != other.resourceType) return false
        if (state != other.state) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayRouteTableAnnouncementId != other.transitGatewayRouteTableAnnouncementId) return false
        if (transitGatewayRouteTableId != other.transitGatewayRouteTableId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the resource.
         */
        public var resourceId: kotlin.String? = null
        /**
         * The resource type. Note that the `tgw-peering` resource type has been deprecated.
         */
        public var resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = null
        /**
         * The state.
         */
        public var state: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagationState? = null
        /**
         * The ID of the attachment.
         */
        public var transitGatewayAttachmentId: kotlin.String? = null
        /**
         * The ID of the transit gateway route table announcement.
         */
        public var transitGatewayRouteTableAnnouncementId: kotlin.String? = null
        /**
         * The ID of the transit gateway route table.
         */
        public var transitGatewayRouteTableId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation) : this() {
            this.resourceId = x.resourceId
            this.resourceType = x.resourceType
            this.state = x.state
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayRouteTableAnnouncementId = x.transitGatewayRouteTableAnnouncementId
            this.transitGatewayRouteTableId = x.transitGatewayRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagation = TransitGatewayPropagation(this)
    }
}
