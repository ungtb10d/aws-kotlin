// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a local secondary index for the table when the backup was created.
 */
public class LocalSecondaryIndexInfo private constructor(builder: Builder) {
    /**
     * Represents the name of the local secondary index.
     */
    public val indexName: kotlin.String? = builder.indexName
    /**
     * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:
     * + `HASH` - partition key
     * + `RANGE` - sort key
     *
     * The partition key of an item is also known as its *hash attribute*. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute*. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
     */
    public val keySchema: List<KeySchemaElement>? = builder.keySchema
    /**
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
     */
    public val projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = builder.projection

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LocalSecondaryIndexInfo(")
        append("indexName=$indexName,")
        append("keySchema=$keySchema,")
        append("projection=$projection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        result = 31 * result + (keySchema?.hashCode() ?: 0)
        result = 31 * result + (projection?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LocalSecondaryIndexInfo

        if (indexName != other.indexName) return false
        if (keySchema != other.keySchema) return false
        if (projection != other.projection) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexInfo = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Represents the name of the local secondary index.
         */
        public var indexName: kotlin.String? = null
        /**
         * The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:
         * + `HASH` - partition key
         * + `RANGE` - sort key
         *
         * The partition key of an item is also known as its *hash attribute*. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.
         *
         * The sort key of an item is also known as its *range attribute*. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.
         */
        public var keySchema: List<KeySchemaElement>? = null
        /**
         * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
         */
        public var projection: aws.sdk.kotlin.services.dynamodb.model.Projection? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexInfo) : this() {
            this.indexName = x.indexName
            this.keySchema = x.keySchema
            this.projection = x.projection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexInfo = LocalSecondaryIndexInfo(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.Projection] inside the given [block]
         */
        public fun projection(block: aws.sdk.kotlin.services.dynamodb.model.Projection.Builder.() -> kotlin.Unit) {
            this.projection = aws.sdk.kotlin.services.dynamodb.model.Projection.invoke(block)
        }
    }
}
