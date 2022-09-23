// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AssociateTransitGatewayPolicyTableRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the transit gateway attachment to associate with the policy table.
     */
    public val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway policy table to associate with the transit gateway attachment.
     */
    public val transitGatewayPolicyTableId: kotlin.String? = builder.transitGatewayPolicyTableId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateTransitGatewayPolicyTableRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateTransitGatewayPolicyTableRequest(")
        append("dryRun=$dryRun,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayPolicyTableId=$transitGatewayPolicyTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayPolicyTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateTransitGatewayPolicyTableRequest

        if (dryRun != other.dryRun) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayPolicyTableId != other.transitGatewayPolicyTableId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateTransitGatewayPolicyTableRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the transit gateway attachment to associate with the policy table.
         */
        public var transitGatewayAttachmentId: kotlin.String? = null
        /**
         * The ID of the transit gateway policy table to associate with the transit gateway attachment.
         */
        public var transitGatewayPolicyTableId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateTransitGatewayPolicyTableRequest) : this() {
            this.dryRun = x.dryRun
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayPolicyTableId = x.transitGatewayPolicyTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateTransitGatewayPolicyTableRequest = AssociateTransitGatewayPolicyTableRequest(this)
    }
}
