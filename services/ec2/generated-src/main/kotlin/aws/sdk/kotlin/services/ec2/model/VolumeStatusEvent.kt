// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a volume status event.
 */
public class VolumeStatusEvent private constructor(builder: Builder) {
    /**
     * A description of the event.
     */
    public val description: kotlin.String? = builder.description
    /**
     * The ID of this event.
     */
    public val eventId: kotlin.String? = builder.eventId
    /**
     * The type of this event.
     */
    public val eventType: kotlin.String? = builder.eventType
    /**
     * The ID of the instance associated with the event.
     */
    public val instanceId: kotlin.String? = builder.instanceId
    /**
     * The latest end time of the event.
     */
    public val notAfter: aws.smithy.kotlin.runtime.time.Instant? = builder.notAfter
    /**
     * The earliest start time of the event.
     */
    public val notBefore: aws.smithy.kotlin.runtime.time.Instant? = builder.notBefore

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VolumeStatusEvent = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VolumeStatusEvent(")
        append("description=$description,")
        append("eventId=$eventId,")
        append("eventType=$eventType,")
        append("instanceId=$instanceId,")
        append("notAfter=$notAfter,")
        append("notBefore=$notBefore)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (eventId?.hashCode() ?: 0)
        result = 31 * result + (eventType?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (notAfter?.hashCode() ?: 0)
        result = 31 * result + (notBefore?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VolumeStatusEvent

        if (description != other.description) return false
        if (eventId != other.eventId) return false
        if (eventType != other.eventType) return false
        if (instanceId != other.instanceId) return false
        if (notAfter != other.notAfter) return false
        if (notBefore != other.notBefore) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VolumeStatusEvent = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A description of the event.
         */
        public var description: kotlin.String? = null
        /**
         * The ID of this event.
         */
        public var eventId: kotlin.String? = null
        /**
         * The type of this event.
         */
        public var eventType: kotlin.String? = null
        /**
         * The ID of the instance associated with the event.
         */
        public var instanceId: kotlin.String? = null
        /**
         * The latest end time of the event.
         */
        public var notAfter: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The earliest start time of the event.
         */
        public var notBefore: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VolumeStatusEvent) : this() {
            this.description = x.description
            this.eventId = x.eventId
            this.eventType = x.eventType
            this.instanceId = x.instanceId
            this.notAfter = x.notAfter
            this.notBefore = x.notBefore
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VolumeStatusEvent = VolumeStatusEvent(this)
    }
}
