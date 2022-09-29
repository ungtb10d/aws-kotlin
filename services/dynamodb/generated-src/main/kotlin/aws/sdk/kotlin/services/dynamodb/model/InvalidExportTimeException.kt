// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The specified `ExportTime` is outside of the point in time recovery window.
 */
public class InvalidExportTimeException private constructor(builder: Builder) : DynamoDbException() {

    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.InvalidExportTimeException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InvalidExportTimeException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InvalidExportTimeException

        if (message != other.message) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.InvalidExportTimeException = Builder(this).apply(block).build()

    public class Builder {
        public var message: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.InvalidExportTimeException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.InvalidExportTimeException = InvalidExportTimeException(this)
    }
}
