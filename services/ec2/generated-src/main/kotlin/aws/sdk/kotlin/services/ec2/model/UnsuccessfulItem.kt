// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about items that were not successfully processed in a batch call.
 */
public class UnsuccessfulItem private constructor(builder: Builder) {
    /**
     * Information about the error.
     */
    public val error: aws.sdk.kotlin.services.ec2.model.UnsuccessfulItemError? = builder.error
    /**
     * The ID of the resource.
     */
    public val resourceId: kotlin.String? = builder.resourceId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.UnsuccessfulItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UnsuccessfulItem(")
        append("error=$error,")
        append("resourceId=$resourceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = error?.hashCode() ?: 0
        result = 31 * result + (resourceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UnsuccessfulItem

        if (error != other.error) return false
        if (resourceId != other.resourceId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.UnsuccessfulItem = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the error.
         */
        public var error: aws.sdk.kotlin.services.ec2.model.UnsuccessfulItemError? = null
        /**
         * The ID of the resource.
         */
        public var resourceId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.UnsuccessfulItem) : this() {
            this.error = x.error
            this.resourceId = x.resourceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.UnsuccessfulItem = UnsuccessfulItem(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.UnsuccessfulItemError] inside the given [block]
         */
        public fun error(block: aws.sdk.kotlin.services.ec2.model.UnsuccessfulItemError.Builder.() -> kotlin.Unit) {
            this.error = aws.sdk.kotlin.services.ec2.model.UnsuccessfulItemError.invoke(block)
        }
    }
}
