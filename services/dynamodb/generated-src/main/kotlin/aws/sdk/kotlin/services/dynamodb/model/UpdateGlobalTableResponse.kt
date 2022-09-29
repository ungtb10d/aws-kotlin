// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class UpdateGlobalTableResponse private constructor(builder: Builder) {
    /**
     * Contains the details of the global table.
     */
    public val globalTableDescription: aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription? = builder.globalTableDescription

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateGlobalTableResponse(")
        append("globalTableDescription=$globalTableDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalTableDescription?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateGlobalTableResponse

        if (globalTableDescription != other.globalTableDescription) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Contains the details of the global table.
         */
        public var globalTableDescription: aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableResponse) : this() {
            this.globalTableDescription = x.globalTableDescription
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableResponse = UpdateGlobalTableResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription] inside the given [block]
         */
        public fun globalTableDescription(block: aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription.Builder.() -> kotlin.Unit) {
            this.globalTableDescription = aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription.invoke(block)
        }
    }
}
