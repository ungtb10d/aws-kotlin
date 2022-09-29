// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AllocateIpamPoolCidrRequest private constructor(builder: Builder) {
    /**
     * The CIDR you would like to allocate from the IPAM pool. Note the following:
     * + If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.
     * + If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible values: Any available IPv4 or IPv6 CIDR.
     */
    public val cidr: kotlin.String? = builder.cidr
    /**
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    public val clientToken: kotlin.String? = builder.clientToken
    /**
     * A description for the allocation.
     */
    public val description: kotlin.String? = builder.description
    /**
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using netmask length for allocation.
     */
    public val disallowedCidrs: List<String>? = builder.disallowedCidrs
    /**
     * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     */
    public val ipamPoolId: kotlin.String? = builder.ipamPoolId
    /**
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
     * + If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.
     * + If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */
    public val netmaskLength: kotlin.Int? = builder.netmaskLength
    /**
     * A preview of the next available CIDR in a pool.
     */
    public val previewNextCidr: kotlin.Boolean? = builder.previewNextCidr

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AllocateIpamPoolCidrRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AllocateIpamPoolCidrRequest(")
        append("cidr=$cidr,")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("disallowedCidrs=$disallowedCidrs,")
        append("dryRun=$dryRun,")
        append("ipamPoolId=$ipamPoolId,")
        append("netmaskLength=$netmaskLength,")
        append("previewNextCidr=$previewNextCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (disallowedCidrs?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (ipamPoolId?.hashCode() ?: 0)
        result = 31 * result + (netmaskLength ?: 0)
        result = 31 * result + (previewNextCidr?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AllocateIpamPoolCidrRequest

        if (cidr != other.cidr) return false
        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (disallowedCidrs != other.disallowedCidrs) return false
        if (dryRun != other.dryRun) return false
        if (ipamPoolId != other.ipamPoolId) return false
        if (netmaskLength != other.netmaskLength) return false
        if (previewNextCidr != other.previewNextCidr) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AllocateIpamPoolCidrRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The CIDR you would like to allocate from the IPAM pool. Note the following:
         * + If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.
         * + If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
         *
         * Possible values: Any available IPv4 or IPv6 CIDR.
         */
        public var cidr: kotlin.String? = null
        /**
         * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [Ensuring Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        public var clientToken: kotlin.String? = null
        /**
         * A description for the allocation.
         */
        public var description: kotlin.String? = null
        /**
         * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using netmask length for allocation.
         */
        public var disallowedCidrs: List<String>? = null
        /**
         * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the IPAM pool from which you would like to allocate a CIDR.
         */
        public var ipamPoolId: kotlin.String? = null
        /**
         * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
         * + If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or the CIDR.
         * + If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
         *
         * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
         */
        public var netmaskLength: kotlin.Int? = null
        /**
         * A preview of the next available CIDR in a pool.
         */
        public var previewNextCidr: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AllocateIpamPoolCidrRequest) : this() {
            this.cidr = x.cidr
            this.clientToken = x.clientToken
            this.description = x.description
            this.disallowedCidrs = x.disallowedCidrs
            this.dryRun = x.dryRun
            this.ipamPoolId = x.ipamPoolId
            this.netmaskLength = x.netmaskLength
            this.previewNextCidr = x.previewNextCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AllocateIpamPoolCidrRequest = AllocateIpamPoolCidrRequest(this)
    }
}
