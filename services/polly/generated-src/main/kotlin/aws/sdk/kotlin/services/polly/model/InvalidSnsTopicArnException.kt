// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The provided SNS topic ARN is invalid. Please provide a valid SNS
 * topic ARN and try again.
 */
class InvalidSnsTopicArnException private constructor(builder: Builder) : PollyException() {

    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.InvalidSnsTopicArnException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InvalidSnsTopicArnException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InvalidSnsTopicArnException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.InvalidSnsTopicArnException = Builder(this).apply(block).build()

    class Builder {
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.InvalidSnsTopicArnException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.InvalidSnsTopicArnException = InvalidSnsTopicArnException(this)
    }
}