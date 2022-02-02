// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Details for the requested item.
 */
class ItemResponse private constructor(builder: Builder) {
    /**
     * Map of attribute data consisting of the data type and attribute value.
     */
    val item: Map<String, AttributeValue>? = builder.item

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ItemResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ItemResponse(")
        append("item=$item)")
    }

    override fun hashCode(): kotlin.Int {
        var result = item?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ItemResponse

        if (item != other.item) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ItemResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Map of attribute data consisting of the data type and attribute value.
         */
        var item: Map<String, AttributeValue>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ItemResponse) : this() {
            this.item = x.item
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ItemResponse = ItemResponse(this)
    }
}