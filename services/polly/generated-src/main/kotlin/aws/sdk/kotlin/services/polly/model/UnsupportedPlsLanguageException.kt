// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The language specified in the lexicon is unsupported. For a list of
 * supported languages, see <a href="https://docs.aws.amazon.com/polly/latest/dg/API_LexiconAttributes.html">Lexicon Attributes.
 */
class UnsupportedPlsLanguageException private constructor(builder: Builder) : PollyException() {

    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.UnsupportedPlsLanguageException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UnsupportedPlsLanguageException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UnsupportedPlsLanguageException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.UnsupportedPlsLanguageException = Builder(this).apply(block).build()

    class Builder {
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.UnsupportedPlsLanguageException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.UnsupportedPlsLanguageException = UnsupportedPlsLanguageException(this)
    }
}