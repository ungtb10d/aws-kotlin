// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class GetTransitGatewayPolicyTableEntriesResponse private constructor(builder: Builder) {
    /**
     * The entries for the transit gateway policy table.
     */
    public val transitGatewayPolicyTableEntries: List<TransitGatewayPolicyTableEntry>? = builder.transitGatewayPolicyTableEntries

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayPolicyTableEntriesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetTransitGatewayPolicyTableEntriesResponse(")
        append("transitGatewayPolicyTableEntries=$transitGatewayPolicyTableEntries)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayPolicyTableEntries?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetTransitGatewayPolicyTableEntriesResponse

        if (transitGatewayPolicyTableEntries != other.transitGatewayPolicyTableEntries) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayPolicyTableEntriesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The entries for the transit gateway policy table.
         */
        public var transitGatewayPolicyTableEntries: List<TransitGatewayPolicyTableEntry>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetTransitGatewayPolicyTableEntriesResponse) : this() {
            this.transitGatewayPolicyTableEntries = x.transitGatewayPolicyTableEntries
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetTransitGatewayPolicyTableEntriesResponse = GetTransitGatewayPolicyTableEntriesResponse(this)
    }
}
