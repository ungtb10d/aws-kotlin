// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



/**
 * Describes the content of the lexicon.
 */
public class LexiconDescription private constructor(builder: Builder) {
    /**
     * Provides lexicon metadata.
     */
    public val attributes: aws.sdk.kotlin.services.polly.model.LexiconAttributes? = builder.attributes
    /**
     * Name of the lexicon.
     */
    public val name: kotlin.String? = builder.name

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.LexiconDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LexiconDescription(")
        append("attributes=$attributes,")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attributes?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LexiconDescription

        if (attributes != other.attributes) return false
        if (name != other.name) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.LexiconDescription = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Provides lexicon metadata.
         */
        public var attributes: aws.sdk.kotlin.services.polly.model.LexiconAttributes? = null
        /**
         * Name of the lexicon.
         */
        public var name: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.LexiconDescription) : this() {
            this.attributes = x.attributes
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.LexiconDescription = LexiconDescription(this)

        /**
         * construct an [aws.sdk.kotlin.services.polly.model.LexiconAttributes] inside the given [block]
         */
        public fun attributes(block: aws.sdk.kotlin.services.polly.model.LexiconAttributes.Builder.() -> kotlin.Unit) {
            this.attributes = aws.sdk.kotlin.services.polly.model.LexiconAttributes.invoke(block)
        }
    }
}
