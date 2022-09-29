// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 */
public class RedirectAllRequestsTo private constructor(builder: Builder) {
    /**
     * Name of the host where requests are redirected.
     */
    public val hostName: kotlin.String? = builder.hostName
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     */
    public val protocol: aws.sdk.kotlin.services.s3.model.Protocol? = builder.protocol

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.RedirectAllRequestsTo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RedirectAllRequestsTo(")
        append("hostName=$hostName,")
        append("protocol=$protocol)")
    }

    override fun hashCode(): kotlin.Int {
        var result = hostName?.hashCode() ?: 0
        result = 31 * result + (protocol?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RedirectAllRequestsTo

        if (hostName != other.hostName) return false
        if (protocol != other.protocol) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.RedirectAllRequestsTo = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Name of the host where requests are redirected.
         */
        public var hostName: kotlin.String? = null
        /**
         * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         */
        public var protocol: aws.sdk.kotlin.services.s3.model.Protocol? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.RedirectAllRequestsTo) : this() {
            this.hostName = x.hostName
            this.protocol = x.protocol
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.RedirectAllRequestsTo = RedirectAllRequestsTo(this)
    }
}
