// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeTransitGatewayPolicyTablesResponse private constructor(builder: Builder) {
    /**
     * The token for the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * Describes the transit gateway policy tables.
     */
    public val transitGatewayPolicyTables: List<TransitGatewayPolicyTable>? = builder.transitGatewayPolicyTables

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayPolicyTablesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayPolicyTablesResponse(")
        append("nextToken=$nextToken,")
        append("transitGatewayPolicyTables=$transitGatewayPolicyTables)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (transitGatewayPolicyTables?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTransitGatewayPolicyTablesResponse

        if (nextToken != other.nextToken) return false
        if (transitGatewayPolicyTables != other.transitGatewayPolicyTables) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayPolicyTablesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The token for the next page of results.
         */
        public var nextToken: kotlin.String? = null
        /**
         * Describes the transit gateway policy tables.
         */
        public var transitGatewayPolicyTables: List<TransitGatewayPolicyTable>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayPolicyTablesResponse) : this() {
            this.nextToken = x.nextToken
            this.transitGatewayPolicyTables = x.transitGatewayPolicyTables
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayPolicyTablesResponse = DescribeTransitGatewayPolicyTablesResponse(this)
    }
}
