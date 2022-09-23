// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class TransactGetItemsResponse private constructor(builder: Builder) {
    /**
     * If the *ReturnConsumedCapacity* value was `TOTAL`, this is an array of `ConsumedCapacity` objects, one for each table addressed by `TransactGetItem` objects in the *TransactItems* parameter. These `ConsumedCapacity` objects report the read-capacity units consumed by the `TransactGetItems` call in that table.
     */
    public val consumedCapacity: List<ConsumedCapacity>? = builder.consumedCapacity
    /**
     * An ordered array of up to 100 `ItemResponse` objects, each of which corresponds to the `TransactGetItem` object in the same position in the *TransactItems* array. Each `ItemResponse` object contains a Map of the name-value pairs that are the projected attributes of the requested item.
     *
     * If a requested item could not be retrieved, the corresponding `ItemResponse` object is Null, or if the requested item has no projected attributes, the corresponding `ItemResponse` object is an empty Map.
     */
    public val responses: List<ItemResponse>? = builder.responses

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.TransactGetItemsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransactGetItemsResponse(")
        append("consumedCapacity=$consumedCapacity,")
        append("responses=$responses)")
    }

    override fun hashCode(): kotlin.Int {
        var result = consumedCapacity?.hashCode() ?: 0
        result = 31 * result + (responses?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransactGetItemsResponse

        if (consumedCapacity != other.consumedCapacity) return false
        if (responses != other.responses) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.TransactGetItemsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * If the *ReturnConsumedCapacity* value was `TOTAL`, this is an array of `ConsumedCapacity` objects, one for each table addressed by `TransactGetItem` objects in the *TransactItems* parameter. These `ConsumedCapacity` objects report the read-capacity units consumed by the `TransactGetItems` call in that table.
         */
        public var consumedCapacity: List<ConsumedCapacity>? = null
        /**
         * An ordered array of up to 100 `ItemResponse` objects, each of which corresponds to the `TransactGetItem` object in the same position in the *TransactItems* array. Each `ItemResponse` object contains a Map of the name-value pairs that are the projected attributes of the requested item.
         *
         * If a requested item could not be retrieved, the corresponding `ItemResponse` object is Null, or if the requested item has no projected attributes, the corresponding `ItemResponse` object is an empty Map.
         */
        public var responses: List<ItemResponse>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.TransactGetItemsResponse) : this() {
            this.consumedCapacity = x.consumedCapacity
            this.responses = x.responses
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.TransactGetItemsResponse = TransactGetItemsResponse(this)
    }
}
