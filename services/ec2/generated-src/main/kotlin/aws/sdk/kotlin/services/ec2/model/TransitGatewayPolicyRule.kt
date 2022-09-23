// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a rule associated with a transit gateway policy.
 */
public class TransitGatewayPolicyRule private constructor(builder: Builder) {
    /**
     * The destination CIDR block for the transit gateway policy rule.
     */
    public val destinationCidrBlock: kotlin.String? = builder.destinationCidrBlock
    /**
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     */
    public val destinationPortRange: kotlin.String? = builder.destinationPortRange
    /**
     * The meta data tags used for the transit gateway policy rule.
     */
    public val metaData: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData? = builder.metaData
    /**
     * The protocol used by the transit gateway policy rule.
     */
    public val protocol: kotlin.String? = builder.protocol
    /**
     * The source CIDR block for the transit gateway policy rule.
     */
    public val sourceCidrBlock: kotlin.String? = builder.sourceCidrBlock
    /**
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     */
    public val sourcePortRange: kotlin.String? = builder.sourcePortRange

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayPolicyRule(")
        append("destinationCidrBlock=$destinationCidrBlock,")
        append("destinationPortRange=$destinationPortRange,")
        append("metaData=$metaData,")
        append("protocol=$protocol,")
        append("sourceCidrBlock=$sourceCidrBlock,")
        append("sourcePortRange=$sourcePortRange)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationCidrBlock?.hashCode() ?: 0
        result = 31 * result + (destinationPortRange?.hashCode() ?: 0)
        result = 31 * result + (metaData?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (sourceCidrBlock?.hashCode() ?: 0)
        result = 31 * result + (sourcePortRange?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayPolicyRule

        if (destinationCidrBlock != other.destinationCidrBlock) return false
        if (destinationPortRange != other.destinationPortRange) return false
        if (metaData != other.metaData) return false
        if (protocol != other.protocol) return false
        if (sourceCidrBlock != other.sourceCidrBlock) return false
        if (sourcePortRange != other.sourcePortRange) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The destination CIDR block for the transit gateway policy rule.
         */
        public var destinationCidrBlock: kotlin.String? = null
        /**
         * The port range for the transit gateway policy rule. Currently this is set to * (all).
         */
        public var destinationPortRange: kotlin.String? = null
        /**
         * The meta data tags used for the transit gateway policy rule.
         */
        public var metaData: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData? = null
        /**
         * The protocol used by the transit gateway policy rule.
         */
        public var protocol: kotlin.String? = null
        /**
         * The source CIDR block for the transit gateway policy rule.
         */
        public var sourceCidrBlock: kotlin.String? = null
        /**
         * The port range for the transit gateway policy rule. Currently this is set to * (all).
         */
        public var sourcePortRange: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule) : this() {
            this.destinationCidrBlock = x.destinationCidrBlock
            this.destinationPortRange = x.destinationPortRange
            this.metaData = x.metaData
            this.protocol = x.protocol
            this.sourceCidrBlock = x.sourceCidrBlock
            this.sourcePortRange = x.sourcePortRange
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule = TransitGatewayPolicyRule(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData] inside the given [block]
         */
        public fun metaData(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData.Builder.() -> kotlin.Unit) {
            this.metaData = aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRuleMetaData.invoke(block)
        }
    }
}
