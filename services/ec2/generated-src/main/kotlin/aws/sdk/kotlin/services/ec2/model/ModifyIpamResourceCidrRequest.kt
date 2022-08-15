// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyIpamResourceCidrRequest private constructor(builder: Builder) {
    /**
     * The ID of the current scope that the resource CIDR is in.
     */
    public val currentIpamScopeId: kotlin.String? = builder.currentIpamScopeId
    /**
     * The ID of the scope you want to transfer the resource CIDR to.
     */
    public val destinationIpamScopeId: kotlin.String? = builder.destinationIpamScopeId
    /**
     * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM and you can view details about the resource’s CIDR.
     */
    public val monitored: kotlin.Boolean? = builder.monitored
    /**
     * The CIDR of the resource you want to modify.
     */
    public val resourceCidr: kotlin.String? = builder.resourceCidr
    /**
     * The ID of the resource you want to modify.
     */
    public val resourceId: kotlin.String? = builder.resourceId
    /**
     * The Amazon Web Services Region of the resource you want to modify.
     */
    public val resourceRegion: kotlin.String? = builder.resourceRegion

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIpamResourceCidrRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIpamResourceCidrRequest(")
        append("currentIpamScopeId=$currentIpamScopeId,")
        append("destinationIpamScopeId=$destinationIpamScopeId,")
        append("dryRun=$dryRun,")
        append("monitored=$monitored,")
        append("resourceCidr=$resourceCidr,")
        append("resourceId=$resourceId,")
        append("resourceRegion=$resourceRegion)")
    }

    override fun hashCode(): kotlin.Int {
        var result = currentIpamScopeId?.hashCode() ?: 0
        result = 31 * result + (destinationIpamScopeId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (monitored?.hashCode() ?: 0)
        result = 31 * result + (resourceCidr?.hashCode() ?: 0)
        result = 31 * result + (resourceId?.hashCode() ?: 0)
        result = 31 * result + (resourceRegion?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIpamResourceCidrRequest

        if (currentIpamScopeId != other.currentIpamScopeId) return false
        if (destinationIpamScopeId != other.destinationIpamScopeId) return false
        if (dryRun != other.dryRun) return false
        if (monitored != other.monitored) return false
        if (resourceCidr != other.resourceCidr) return false
        if (resourceId != other.resourceId) return false
        if (resourceRegion != other.resourceRegion) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIpamResourceCidrRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the current scope that the resource CIDR is in.
         */
        public var currentIpamScopeId: kotlin.String? = null
        /**
         * The ID of the scope you want to transfer the resource CIDR to.
         */
        public var destinationIpamScopeId: kotlin.String? = null
        /**
         * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * Determines if the resource is monitored by IPAM. If a resource is monitored, the resource is discovered by IPAM and you can view details about the resource’s CIDR.
         */
        public var monitored: kotlin.Boolean? = null
        /**
         * The CIDR of the resource you want to modify.
         */
        public var resourceCidr: kotlin.String? = null
        /**
         * The ID of the resource you want to modify.
         */
        public var resourceId: kotlin.String? = null
        /**
         * The Amazon Web Services Region of the resource you want to modify.
         */
        public var resourceRegion: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIpamResourceCidrRequest) : this() {
            this.currentIpamScopeId = x.currentIpamScopeId
            this.destinationIpamScopeId = x.destinationIpamScopeId
            this.dryRun = x.dryRun
            this.monitored = x.monitored
            this.resourceCidr = x.resourceCidr
            this.resourceId = x.resourceId
            this.resourceRegion = x.resourceRegion
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIpamResourceCidrRequest = ModifyIpamResourceCidrRequest(this)
    }
}
