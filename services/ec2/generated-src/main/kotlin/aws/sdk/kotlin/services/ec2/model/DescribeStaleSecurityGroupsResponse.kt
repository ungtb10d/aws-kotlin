// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeStaleSecurityGroupsResponse private constructor(builder: Builder) {
    /**
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the stale security groups.
     */
    public val staleSecurityGroupSet: List<StaleSecurityGroup>? = builder.staleSecurityGroupSet

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeStaleSecurityGroupsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeStaleSecurityGroupsResponse(")
        append("nextToken=$nextToken,")
        append("staleSecurityGroupSet=$staleSecurityGroupSet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (staleSecurityGroupSet?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeStaleSecurityGroupsResponse

        if (nextToken != other.nextToken) return false
        if (staleSecurityGroupSet != other.staleSecurityGroupSet) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeStaleSecurityGroupsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
        public var nextToken: kotlin.String? = null
        /**
         * Information about the stale security groups.
         */
        public var staleSecurityGroupSet: List<StaleSecurityGroup>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeStaleSecurityGroupsResponse) : this() {
            this.nextToken = x.nextToken
            this.staleSecurityGroupSet = x.staleSecurityGroupSet
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeStaleSecurityGroupsResponse = DescribeStaleSecurityGroupsResponse(this)
    }
}
