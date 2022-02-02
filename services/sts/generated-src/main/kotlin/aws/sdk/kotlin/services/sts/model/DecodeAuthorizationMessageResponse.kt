// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



/**
 * A document that contains additional information about the authorization status of a
 * request from an encoded message that is returned in response to an Amazon Web Services request.
 */
class DecodeAuthorizationMessageResponse private constructor(builder: Builder) {
    /**
     * The API returns a response with the decoded message.
     */
    val decodedMessage: kotlin.String? = builder.decodedMessage

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.DecodeAuthorizationMessageResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DecodeAuthorizationMessageResponse(")
        append("decodedMessage=$decodedMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = decodedMessage?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DecodeAuthorizationMessageResponse

        if (decodedMessage != other.decodedMessage) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.DecodeAuthorizationMessageResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The API returns a response with the decoded message.
         */
        var decodedMessage: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.DecodeAuthorizationMessageResponse) : this() {
            this.decodedMessage = x.decodedMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.DecodeAuthorizationMessageResponse = DecodeAuthorizationMessageResponse(this)
    }
}