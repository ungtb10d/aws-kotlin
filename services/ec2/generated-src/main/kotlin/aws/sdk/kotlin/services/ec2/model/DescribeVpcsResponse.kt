// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeVpcsResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about one or more VPCs.
     */
    public val vpcs: List<Vpc>? = builder.vpcs

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVpcsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpcsResponse(")
        append("nextToken=$nextToken,")
        append("vpcs=$vpcs)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (vpcs?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVpcsResponse

        if (nextToken != other.nextToken) return false
        if (vpcs != other.vpcs) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVpcsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        public var nextToken: kotlin.String? = null
        /**
         * Information about one or more VPCs.
         */
        public var vpcs: List<Vpc>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVpcsResponse) : this() {
            this.nextToken = x.nextToken
            this.vpcs = x.vpcs
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVpcsResponse = DescribeVpcsResponse(this)
    }
}
