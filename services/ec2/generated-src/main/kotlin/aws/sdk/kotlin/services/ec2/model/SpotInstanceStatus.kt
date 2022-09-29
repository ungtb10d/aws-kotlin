// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the status of a Spot Instance request.
 */
public class SpotInstanceStatus private constructor(builder: Builder) {
    /**
     * The status code. For a list of status codes, see [Spot request status codes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-request-status.html#spot-instance-request-status-understand) in the *Amazon EC2 User Guide for Linux Instances*.
     */
    public val code: kotlin.String? = builder.code
    /**
     * The description for the status code.
     */
    public val message: kotlin.String? = builder.message
    /**
     * The date and time of the most recent status update, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
     */
    public val updateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.updateTime

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotInstanceStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotInstanceStatus(")
        append("code=$code,")
        append("message=$message,")
        append("updateTime=$updateTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        result = 31 * result + (updateTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotInstanceStatus

        if (code != other.code) return false
        if (message != other.message) return false
        if (updateTime != other.updateTime) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotInstanceStatus = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The status code. For a list of status codes, see [Spot request status codes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-request-status.html#spot-instance-request-status-understand) in the *Amazon EC2 User Guide for Linux Instances*.
         */
        public var code: kotlin.String? = null
        /**
         * The description for the status code.
         */
        public var message: kotlin.String? = null
        /**
         * The date and time of the most recent status update, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
         */
        public var updateTime: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotInstanceStatus) : this() {
            this.code = x.code
            this.message = x.message
            this.updateTime = x.updateTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotInstanceStatus = SpotInstanceStatus(this)
    }
}
