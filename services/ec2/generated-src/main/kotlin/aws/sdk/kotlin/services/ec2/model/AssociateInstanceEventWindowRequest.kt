// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AssociateInstanceEventWindowRequest private constructor(builder: Builder) {
    /**
     * One or more targets associated with the specified event window.
     */
    public val associationTarget: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest? = builder.associationTarget
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the event window.
     */
    public val instanceEventWindowId: kotlin.String? = builder.instanceEventWindowId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateInstanceEventWindowRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateInstanceEventWindowRequest(")
        append("associationTarget=$associationTarget,")
        append("dryRun=$dryRun,")
        append("instanceEventWindowId=$instanceEventWindowId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationTarget?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceEventWindowId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateInstanceEventWindowRequest

        if (associationTarget != other.associationTarget) return false
        if (dryRun != other.dryRun) return false
        if (instanceEventWindowId != other.instanceEventWindowId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateInstanceEventWindowRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * One or more targets associated with the specified event window.
         */
        public var associationTarget: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the event window.
         */
        public var instanceEventWindowId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateInstanceEventWindowRequest) : this() {
            this.associationTarget = x.associationTarget
            this.dryRun = x.dryRun
            this.instanceEventWindowId = x.instanceEventWindowId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateInstanceEventWindowRequest = AssociateInstanceEventWindowRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest] inside the given [block]
         */
        public fun associationTarget(block: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest.Builder.() -> kotlin.Unit) {
            this.associationTarget = aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest.invoke(block)
        }
    }
}
