// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



public class DescribeVoicesResponse private constructor(builder: Builder) {
    /**
     * The pagination token to use in the next request to continue the listing of voices. `NextToken` is returned only if the response is truncated.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * A list of voices with their properties.
     */
    public val voices: List<Voice>? = builder.voices

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.DescribeVoicesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVoicesResponse(")
        append("nextToken=$nextToken,")
        append("voices=$voices)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (voices?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVoicesResponse

        if (nextToken != other.nextToken) return false
        if (voices != other.voices) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.DescribeVoicesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The pagination token to use in the next request to continue the listing of voices. `NextToken` is returned only if the response is truncated.
         */
        public var nextToken: kotlin.String? = null
        /**
         * A list of voices with their properties.
         */
        public var voices: List<Voice>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.DescribeVoicesResponse) : this() {
            this.nextToken = x.nextToken
            this.voices = x.voices
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.DescribeVoicesResponse = DescribeVoicesResponse(this)
    }
}
