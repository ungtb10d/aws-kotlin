// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a transit gateway policy table entry
 */
public class TransitGatewayPolicyTableEntry private constructor(builder: Builder) {
    /**
     * The policy rule associated with the transit gateway policy table.
     */
    public val policyRule: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule? = builder.policyRule
    /**
     * The rule number for the transit gateway policy table entry.
     */
    public val policyRuleNumber: kotlin.String? = builder.policyRuleNumber
    /**
     * The ID of the target route table.
     */
    public val targetRouteTableId: kotlin.String? = builder.targetRouteTableId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyTableEntry = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayPolicyTableEntry(")
        append("policyRule=$policyRule,")
        append("policyRuleNumber=$policyRuleNumber,")
        append("targetRouteTableId=$targetRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = policyRule?.hashCode() ?: 0
        result = 31 * result + (policyRuleNumber?.hashCode() ?: 0)
        result = 31 * result + (targetRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayPolicyTableEntry

        if (policyRule != other.policyRule) return false
        if (policyRuleNumber != other.policyRuleNumber) return false
        if (targetRouteTableId != other.targetRouteTableId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyTableEntry = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The policy rule associated with the transit gateway policy table.
         */
        public var policyRule: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule? = null
        /**
         * The rule number for the transit gateway policy table entry.
         */
        public var policyRuleNumber: kotlin.String? = null
        /**
         * The ID of the target route table.
         */
        public var targetRouteTableId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyTableEntry) : this() {
            this.policyRule = x.policyRule
            this.policyRuleNumber = x.policyRuleNumber
            this.targetRouteTableId = x.targetRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyTableEntry = TransitGatewayPolicyTableEntry(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule] inside the given [block]
         */
        public fun policyRule(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule.Builder.() -> kotlin.Unit) {
            this.policyRule = aws.sdk.kotlin.services.ec2.model.TransitGatewayPolicyRule.invoke(block)
        }
    }
}
