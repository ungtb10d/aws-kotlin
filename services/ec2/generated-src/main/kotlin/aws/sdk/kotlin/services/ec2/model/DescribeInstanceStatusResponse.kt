// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeInstanceStatusResponse private constructor(builder: Builder) {
    /**
     * Information about the status of the instances.
     */
    public val instanceStatuses: List<InstanceStatus>? = builder.instanceStatuses
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeInstanceStatusResponse(")
        append("instanceStatuses=$instanceStatuses,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceStatuses?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeInstanceStatusResponse

        if (instanceStatuses != other.instanceStatuses) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the status of the instances.
         */
        public var instanceStatuses: List<InstanceStatus>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusResponse) : this() {
            this.instanceStatuses = x.instanceStatuses
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusResponse = DescribeInstanceStatusResponse(this)
    }
}
