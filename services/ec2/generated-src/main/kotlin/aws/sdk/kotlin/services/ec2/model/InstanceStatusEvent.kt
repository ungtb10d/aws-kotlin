// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a scheduled event for an instance.
 */
public class InstanceStatusEvent private constructor(builder: Builder) {
    /**
     * The event code.
     */
    public val code: aws.sdk.kotlin.services.ec2.model.EventCode? = builder.code
    /**
     * A description of the event.
     *
     * After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: &#91;Completed&#93;.
     */
    public val description: kotlin.String? = builder.description
    /**
     * The ID of the event.
     */
    public val instanceEventId: kotlin.String? = builder.instanceEventId
    /**
     * The latest scheduled end time for the event.
     */
    public val notAfter: aws.smithy.kotlin.runtime.time.Instant? = builder.notAfter
    /**
     * The earliest scheduled start time for the event.
     */
    public val notBefore: aws.smithy.kotlin.runtime.time.Instant? = builder.notBefore
    /**
     * The deadline for starting the event.
     */
    public val notBeforeDeadline: aws.smithy.kotlin.runtime.time.Instant? = builder.notBeforeDeadline

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceStatusEvent = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceStatusEvent(")
        append("code=$code,")
        append("description=$description,")
        append("instanceEventId=$instanceEventId,")
        append("notAfter=$notAfter,")
        append("notBefore=$notBefore,")
        append("notBeforeDeadline=$notBeforeDeadline)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (instanceEventId?.hashCode() ?: 0)
        result = 31 * result + (notAfter?.hashCode() ?: 0)
        result = 31 * result + (notBefore?.hashCode() ?: 0)
        result = 31 * result + (notBeforeDeadline?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceStatusEvent

        if (code != other.code) return false
        if (description != other.description) return false
        if (instanceEventId != other.instanceEventId) return false
        if (notAfter != other.notAfter) return false
        if (notBefore != other.notBefore) return false
        if (notBeforeDeadline != other.notBeforeDeadline) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceStatusEvent = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The event code.
         */
        public var code: aws.sdk.kotlin.services.ec2.model.EventCode? = null
        /**
         * A description of the event.
         *
         * After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: &#91;Completed&#93;.
         */
        public var description: kotlin.String? = null
        /**
         * The ID of the event.
         */
        public var instanceEventId: kotlin.String? = null
        /**
         * The latest scheduled end time for the event.
         */
        public var notAfter: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The earliest scheduled start time for the event.
         */
        public var notBefore: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The deadline for starting the event.
         */
        public var notBeforeDeadline: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceStatusEvent) : this() {
            this.code = x.code
            this.description = x.description
            this.instanceEventId = x.instanceEventId
            this.notAfter = x.notAfter
            this.notBefore = x.notBefore
            this.notBeforeDeadline = x.notBeforeDeadline
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceStatusEvent = InstanceStatusEvent(this)
    }
}
