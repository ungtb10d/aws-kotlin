// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a `DeleteTable` operation.
 */
public class DeleteTableRequest private constructor(builder: Builder) {
    /**
     * The name of the table to delete.
     */
    public val tableName: kotlin.String? = builder.tableName

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteTableRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTableRequest(")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tableName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTableRequest

        if (tableName != other.tableName) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteTableRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of the table to delete.
         */
        public var tableName: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteTableRequest) : this() {
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteTableRequest = DeleteTableRequest(this)
    }
}
