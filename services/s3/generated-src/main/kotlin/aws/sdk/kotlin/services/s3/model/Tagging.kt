// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for `TagSet` elements.
 */
public class Tagging private constructor(builder: Builder) {
    /**
     * A collection for a set of tags
     */
    public val tagSet: List<Tag>? = builder.tagSet

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Tagging = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Tagging(")
        append("tagSet=$tagSet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tagSet?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Tagging

        if (tagSet != other.tagSet) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Tagging = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A collection for a set of tags
         */
        public var tagSet: List<Tag>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Tagging) : this() {
            this.tagSet = x.tagSet
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Tagging = Tagging(this)
    }
}
