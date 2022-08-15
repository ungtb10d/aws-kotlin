// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the resources associated with the transit gateway multicast domain.
 */
public class TransitGatewayMulticastDomainAssociation private constructor(builder: Builder) {
    /**
     * The ID of the resource.
     */
    public val resourceId: kotlin.String? = builder.resourceId
    /**
     * The ID of the Amazon Web Services account that owns the transit gateway multicast domain association resource.
     */
    public val resourceOwnerId: kotlin.String? = builder.resourceOwnerId
    /**
     * The type of resource, for example a VPC attachment.
     */
    public val resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = builder.resourceType
    /**
     * The subnet associated with the transit gateway multicast domain.
     */
    public val subnet: aws.sdk.kotlin.services.ec2.model.SubnetAssociation? = builder.subnet
    /**
     * The ID of the transit gateway attachment.
     */
    public val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayMulticastDomainAssociation(")
        append("resourceId=$resourceId,")
        append("resourceOwnerId=$resourceOwnerId,")
        append("resourceType=$resourceType,")
        append("subnet=$subnet,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceId?.hashCode() ?: 0
        result = 31 * result + (resourceOwnerId?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (subnet?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayMulticastDomainAssociation

        if (resourceId != other.resourceId) return false
        if (resourceOwnerId != other.resourceOwnerId) return false
        if (resourceType != other.resourceType) return false
        if (subnet != other.subnet) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociation = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the resource.
         */
        public var resourceId: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the transit gateway multicast domain association resource.
         */
        public var resourceOwnerId: kotlin.String? = null
        /**
         * The type of resource, for example a VPC attachment.
         */
        public var resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = null
        /**
         * The subnet associated with the transit gateway multicast domain.
         */
        public var subnet: aws.sdk.kotlin.services.ec2.model.SubnetAssociation? = null
        /**
         * The ID of the transit gateway attachment.
         */
        public var transitGatewayAttachmentId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociation) : this() {
            this.resourceId = x.resourceId
            this.resourceOwnerId = x.resourceOwnerId
            this.resourceType = x.resourceType
            this.subnet = x.subnet
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociation = TransitGatewayMulticastDomainAssociation(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SubnetAssociation] inside the given [block]
         */
        public fun subnet(block: aws.sdk.kotlin.services.ec2.model.SubnetAssociation.Builder.() -> kotlin.Unit) {
            this.subnet = aws.sdk.kotlin.services.ec2.model.SubnetAssociation.invoke(block)
        }
    }
}
