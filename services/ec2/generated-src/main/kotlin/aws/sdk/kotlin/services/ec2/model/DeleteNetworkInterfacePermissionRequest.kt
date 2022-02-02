// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DeleteNetworkInterfacePermission.
 */
class DeleteNetworkInterfacePermissionRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Specify true to remove the permission even if the network interface is
     * attached to an instance.
     */
    val force: kotlin.Boolean? = builder.force
    /**
     * The ID of the network interface permission.
     */
    val networkInterfacePermissionId: kotlin.String? = builder.networkInterfacePermissionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInterfacePermissionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteNetworkInterfacePermissionRequest(")
        append("dryRun=$dryRun,")
        append("force=$force,")
        append("networkInterfacePermissionId=$networkInterfacePermissionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (force?.hashCode() ?: 0)
        result = 31 * result + (networkInterfacePermissionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteNetworkInterfacePermissionRequest

        if (dryRun != other.dryRun) return false
        if (force != other.force) return false
        if (networkInterfacePermissionId != other.networkInterfacePermissionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInterfacePermissionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Specify true to remove the permission even if the network interface is
         * attached to an instance.
         */
        var force: kotlin.Boolean? = null
        /**
         * The ID of the network interface permission.
         */
        var networkInterfacePermissionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteNetworkInterfacePermissionRequest) : this() {
            this.dryRun = x.dryRun
            this.force = x.force
            this.networkInterfacePermissionId = x.networkInterfacePermissionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInterfacePermissionRequest = DeleteNetworkInterfacePermissionRequest(this)
    }
}