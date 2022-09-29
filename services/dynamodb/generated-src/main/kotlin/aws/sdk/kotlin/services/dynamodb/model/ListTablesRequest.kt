// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a `ListTables` operation.
 */
public class ListTablesRequest private constructor(builder: Builder) {
    /**
     * The first table name that this operation will evaluate. Use the value that was returned for `LastEvaluatedTableName` in a previous operation, so that you can obtain the next page of results.
     */
    public val exclusiveStartTableName: kotlin.String? = builder.exclusiveStartTableName
    /**
     * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
     */
    public val limit: kotlin.Int? = builder.limit

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ListTablesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListTablesRequest(")
        append("exclusiveStartTableName=$exclusiveStartTableName,")
        append("limit=$limit)")
    }

    override fun hashCode(): kotlin.Int {
        var result = exclusiveStartTableName?.hashCode() ?: 0
        result = 31 * result + (limit ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListTablesRequest

        if (exclusiveStartTableName != other.exclusiveStartTableName) return false
        if (limit != other.limit) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ListTablesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The first table name that this operation will evaluate. Use the value that was returned for `LastEvaluatedTableName` in a previous operation, so that you can obtain the next page of results.
         */
        public var exclusiveStartTableName: kotlin.String? = null
        /**
         * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
         */
        public var limit: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ListTablesRequest) : this() {
            this.exclusiveStartTableName = x.exclusiveStartTableName
            this.limit = x.limit
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ListTablesRequest = ListTablesRequest(this)
    }
}
