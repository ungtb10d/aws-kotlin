// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class ListExportsRequest private constructor(builder: Builder) {
    /**
     * Maximum number of results to return per page.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * An optional string that, if supplied, must be copied from the output of a previous call to `ListExports`. When provided in this manner, the API fetches the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * The Amazon Resource Name (ARN) associated with the exported table.
     */
    public val tableArn: kotlin.String? = builder.tableArn

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ListExportsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListExportsRequest(")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("tableArn=$tableArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = maxResults ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (tableArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListExportsRequest

        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (tableArn != other.tableArn) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ListExportsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Maximum number of results to return per page.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * An optional string that, if supplied, must be copied from the output of a previous call to `ListExports`. When provided in this manner, the API fetches the next page of results.
         */
        public var nextToken: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) associated with the exported table.
         */
        public var tableArn: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ListExportsRequest) : this() {
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.tableArn = x.tableArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ListExportsRequest = ListExportsRequest(this)
    }
}
