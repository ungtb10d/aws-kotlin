// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateTransitGatewayVpcAttachmentRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The VPC attachment options.
     */
    public val options: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions? = builder.options
    /**
     * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one IP address from each specified subnet.
     */
    public val subnetIds: List<String>? = builder.subnetIds
    /**
     * The tags to apply to the VPC attachment.
     */
    public val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the transit gateway.
     */
    public val transitGatewayId: kotlin.String? = builder.transitGatewayId
    /**
     * The ID of the VPC.
     */
    public val vpcId: kotlin.String? = builder.vpcId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTransitGatewayVpcAttachmentRequest(")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("subnetIds=$subnetIds,")
        append("tagSpecifications=$tagSpecifications,")
        append("transitGatewayId=$transitGatewayId,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (subnetIds?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTransitGatewayVpcAttachmentRequest

        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (subnetIds != other.subnetIds) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The VPC attachment options.
         */
        public var options: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions? = null
        /**
         * The IDs of one or more subnets. You can specify only one subnet per Availability Zone. You must specify at least one subnet, but we recommend that you specify two subnets for better availability. The transit gateway uses one IP address from each specified subnet.
         */
        public var subnetIds: List<String>? = null
        /**
         * The tags to apply to the VPC attachment.
         */
        public var tagSpecifications: List<TagSpecification>? = null
        /**
         * The ID of the transit gateway.
         */
        public var transitGatewayId: kotlin.String? = null
        /**
         * The ID of the VPC.
         */
        public var vpcId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest) : this() {
            this.dryRun = x.dryRun
            this.options = x.options
            this.subnetIds = x.subnetIds
            this.tagSpecifications = x.tagSpecifications
            this.transitGatewayId = x.transitGatewayId
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest = CreateTransitGatewayVpcAttachmentRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions] inside the given [block]
         */
        public fun options(block: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions.Builder.() -> kotlin.Unit) {
            this.options = aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayVpcAttachmentRequestOptions.invoke(block)
        }
    }
}
