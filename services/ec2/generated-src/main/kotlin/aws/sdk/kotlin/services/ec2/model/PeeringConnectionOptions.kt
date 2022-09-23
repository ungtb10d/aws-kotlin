// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * We are retiring EC2-Classic. We recommend that you migrate from EC2-Classic to a VPC. For more information, see [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html) in the *Amazon Elastic Compute Cloud User Guide*.
 *
 * Describes the VPC peering connection options.
 */
public class PeeringConnectionOptions private constructor(builder: Builder) {
    /**
     * If true, the public DNS hostnames of instances in the specified VPC resolve to private IP addresses when queried from instances in the peer VPC.
     */
    public val allowDnsResolutionFromRemoteVpc: kotlin.Boolean? = builder.allowDnsResolutionFromRemoteVpc
    /**
     * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
     */
    public val allowEgressFromLocalClassicLinkToRemoteVpc: kotlin.Boolean? = builder.allowEgressFromLocalClassicLinkToRemoteVpc
    /**
     * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
     */
    public val allowEgressFromLocalVpcToRemoteClassicLink: kotlin.Boolean? = builder.allowEgressFromLocalVpcToRemoteClassicLink

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PeeringConnectionOptions(")
        append("allowDnsResolutionFromRemoteVpc=$allowDnsResolutionFromRemoteVpc,")
        append("allowEgressFromLocalClassicLinkToRemoteVpc=$allowEgressFromLocalClassicLinkToRemoteVpc,")
        append("allowEgressFromLocalVpcToRemoteClassicLink=$allowEgressFromLocalVpcToRemoteClassicLink)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allowDnsResolutionFromRemoteVpc?.hashCode() ?: 0
        result = 31 * result + (allowEgressFromLocalClassicLinkToRemoteVpc?.hashCode() ?: 0)
        result = 31 * result + (allowEgressFromLocalVpcToRemoteClassicLink?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PeeringConnectionOptions

        if (allowDnsResolutionFromRemoteVpc != other.allowDnsResolutionFromRemoteVpc) return false
        if (allowEgressFromLocalClassicLinkToRemoteVpc != other.allowEgressFromLocalClassicLinkToRemoteVpc) return false
        if (allowEgressFromLocalVpcToRemoteClassicLink != other.allowEgressFromLocalVpcToRemoteClassicLink) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions = Builder(this).apply(block).build()

    public class Builder {
        /**
         * If true, the public DNS hostnames of instances in the specified VPC resolve to private IP addresses when queried from instances in the peer VPC.
         */
        public var allowDnsResolutionFromRemoteVpc: kotlin.Boolean? = null
        /**
         * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
         */
        public var allowEgressFromLocalClassicLinkToRemoteVpc: kotlin.Boolean? = null
        /**
         * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
         */
        public var allowEgressFromLocalVpcToRemoteClassicLink: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions) : this() {
            this.allowDnsResolutionFromRemoteVpc = x.allowDnsResolutionFromRemoteVpc
            this.allowEgressFromLocalClassicLinkToRemoteVpc = x.allowEgressFromLocalClassicLinkToRemoteVpc
            this.allowEgressFromLocalVpcToRemoteClassicLink = x.allowEgressFromLocalVpcToRemoteClassicLink
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions = PeeringConnectionOptions(this)
    }
}
