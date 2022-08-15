// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class PutObjectRetentionResponse private constructor(builder: Builder) {
    /**
     * If present, indicates that the requester was successfully charged for the request.
     */
    public val requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = builder.requestCharged

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutObjectRetentionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutObjectRetentionResponse(")
        append("requestCharged=$requestCharged)")
    }

    override fun hashCode(): kotlin.Int {
        var result = requestCharged?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutObjectRetentionResponse

        if (requestCharged != other.requestCharged) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutObjectRetentionResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * If present, indicates that the requester was successfully charged for the request.
         */
        public var requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutObjectRetentionResponse) : this() {
            this.requestCharged = x.requestCharged
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutObjectRetentionResponse = PutObjectRetentionResponse(this)
    }
}
