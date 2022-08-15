// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table, or tried to delete a table currently in the `CREATING` state.
 */
public class ResourceInUseException private constructor(builder: Builder) : DynamoDbException() {

    /**
     * The resource which is being attempted to be changed is in use.
     */
    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ResourceInUseException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ResourceInUseException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ResourceInUseException

        if (message != other.message) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ResourceInUseException = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The resource which is being attempted to be changed is in use.
         */
        public var message: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ResourceInUseException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ResourceInUseException = ResourceInUseException(this)
    }
}
