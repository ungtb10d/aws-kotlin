// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class ListTagsOfResourceRequest private constructor(builder: Builder) {
    /**
     * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
     */
    public val resourceArn: kotlin.String? = builder.resourceArn

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ListTagsOfResourceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListTagsOfResourceRequest(")
        append("nextToken=$nextToken,")
        append("resourceArn=$resourceArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (resourceArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListTagsOfResourceRequest

        if (nextToken != other.nextToken) return false
        if (resourceArn != other.resourceArn) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ListTagsOfResourceRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
         */
        public var nextToken: kotlin.String? = null
        /**
         * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
         */
        public var resourceArn: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ListTagsOfResourceRequest) : this() {
            this.nextToken = x.nextToken
            this.resourceArn = x.resourceArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ListTagsOfResourceRequest = ListTagsOfResourceRequest(this)
    }
}
