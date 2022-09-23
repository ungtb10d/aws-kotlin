// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



public class ListSpeechSynthesisTasksResponse private constructor(builder: Builder) {
    /**
     * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
     */
    public val synthesisTasks: List<SynthesisTask>? = builder.synthesisTasks

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.ListSpeechSynthesisTasksResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListSpeechSynthesisTasksResponse(")
        append("nextToken=$nextToken,")
        append("synthesisTasks=$synthesisTasks)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (synthesisTasks?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListSpeechSynthesisTasksResponse

        if (nextToken != other.nextToken) return false
        if (synthesisTasks != other.synthesisTasks) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.ListSpeechSynthesisTasksResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
         */
        public var nextToken: kotlin.String? = null
        /**
         * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
         */
        public var synthesisTasks: List<SynthesisTask>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.ListSpeechSynthesisTasksResponse) : this() {
            this.nextToken = x.nextToken
            this.synthesisTasks = x.synthesisTasks
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.ListSpeechSynthesisTasksResponse = ListSpeechSynthesisTasksResponse(this)
    }
}
