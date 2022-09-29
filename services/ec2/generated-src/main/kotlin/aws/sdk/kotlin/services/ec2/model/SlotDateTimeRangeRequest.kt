// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the time period for a Scheduled Instance to start its first schedule. The time period must span less than one day.
 */
public class SlotDateTimeRangeRequest private constructor(builder: Builder) {
    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     */
    public val earliestTime: aws.smithy.kotlin.runtime.time.Instant? = builder.earliestTime
    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
     */
    public val latestTime: aws.smithy.kotlin.runtime.time.Instant? = builder.latestTime

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SlotDateTimeRangeRequest(")
        append("earliestTime=$earliestTime,")
        append("latestTime=$latestTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = earliestTime?.hashCode() ?: 0
        result = 31 * result + (latestTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SlotDateTimeRangeRequest

        if (earliestTime != other.earliestTime) return false
        if (latestTime != other.latestTime) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The earliest date and time, in UTC, for the Scheduled Instance to start.
         */
        public var earliestTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
         */
        public var latestTime: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest) : this() {
            this.earliestTime = x.earliestTime
            this.latestTime = x.latestTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest = SlotDateTimeRangeRequest(this)
    }
}
