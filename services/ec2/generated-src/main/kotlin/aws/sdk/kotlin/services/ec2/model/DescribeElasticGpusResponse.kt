// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeElasticGpusResponse private constructor(builder: Builder) {
    /**
     * Information about the Elastic Graphics accelerators.
     */
    public val elasticGpuSet: List<ElasticGpus>? = builder.elasticGpuSet
    /**
     * The total number of items to return. If the total number of items available is more than the value specified in max-items then a Next-Token will be provided in the output that you can use to resume pagination.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeElasticGpusResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeElasticGpusResponse(")
        append("elasticGpuSet=$elasticGpuSet,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = elasticGpuSet?.hashCode() ?: 0
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeElasticGpusResponse

        if (elasticGpuSet != other.elasticGpuSet) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeElasticGpusResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the Elastic Graphics accelerators.
         */
        public var elasticGpuSet: List<ElasticGpus>? = null
        /**
         * The total number of items to return. If the total number of items available is more than the value specified in max-items then a Next-Token will be provided in the output that you can use to resume pagination.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeElasticGpusResponse) : this() {
            this.elasticGpuSet = x.elasticGpuSet
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeElasticGpusResponse = DescribeElasticGpusResponse(this)
    }
}
