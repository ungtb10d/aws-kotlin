// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a request to perform a `DeleteItem` operation on an item.
 */
public class DeleteRequest private constructor(builder: Builder) {
    /**
     * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
     */
    public val key: Map<String, AttributeValue>? = builder.key

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteRequest(")
        append("key=$key)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteRequest

        if (key != other.key) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
         */
        public var key: Map<String, AttributeValue>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteRequest) : this() {
            this.key = x.key
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteRequest = DeleteRequest(this)
    }
}
