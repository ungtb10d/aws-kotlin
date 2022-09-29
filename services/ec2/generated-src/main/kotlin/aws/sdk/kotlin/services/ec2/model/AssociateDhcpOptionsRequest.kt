// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AssociateDhcpOptionsRequest private constructor(builder: Builder) {
    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     */
    public val dhcpOptionsId: kotlin.String? = builder.dhcpOptionsId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPC.
     */
    public val vpcId: kotlin.String? = builder.vpcId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateDhcpOptionsRequest(")
        append("dhcpOptionsId=$dhcpOptionsId,")
        append("dryRun=$dryRun,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dhcpOptionsId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateDhcpOptionsRequest

        if (dhcpOptionsId != other.dhcpOptionsId) return false
        if (dryRun != other.dryRun) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
         */
        public var dhcpOptionsId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPC.
         */
        public var vpcId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest) : this() {
            this.dhcpOptionsId = x.dhcpOptionsId
            this.dryRun = x.dryRun
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateDhcpOptionsRequest = AssociateDhcpOptionsRequest(this)
    }
}
