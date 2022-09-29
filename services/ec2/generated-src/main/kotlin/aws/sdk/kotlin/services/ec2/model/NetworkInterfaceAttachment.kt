// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a network interface attachment.
 */
public class NetworkInterfaceAttachment private constructor(builder: Builder) {
    /**
     * The timestamp indicating when the attachment initiated.
     */
    public val attachTime: aws.smithy.kotlin.runtime.time.Instant? = builder.attachTime
    /**
     * The ID of the network interface attachment.
     */
    public val attachmentId: kotlin.String? = builder.attachmentId
    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     */
    public val deleteOnTermination: kotlin.Boolean? = builder.deleteOnTermination
    /**
     * The device index of the network interface attachment on the instance.
     */
    public val deviceIndex: kotlin.Int? = builder.deviceIndex
    /**
     * The ID of the instance.
     */
    public val instanceId: kotlin.String? = builder.instanceId
    /**
     * The Amazon Web Services account ID of the owner of the instance.
     */
    public val instanceOwnerId: kotlin.String? = builder.instanceOwnerId
    /**
     * The index of the network card.
     */
    public val networkCardIndex: kotlin.Int? = builder.networkCardIndex
    /**
     * The attachment state.
     */
    public val status: aws.sdk.kotlin.services.ec2.model.AttachmentStatus? = builder.status

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttachment = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NetworkInterfaceAttachment(")
        append("attachTime=$attachTime,")
        append("attachmentId=$attachmentId,")
        append("deleteOnTermination=$deleteOnTermination,")
        append("deviceIndex=$deviceIndex,")
        append("instanceId=$instanceId,")
        append("instanceOwnerId=$instanceOwnerId,")
        append("networkCardIndex=$networkCardIndex,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attachTime?.hashCode() ?: 0
        result = 31 * result + (attachmentId?.hashCode() ?: 0)
        result = 31 * result + (deleteOnTermination?.hashCode() ?: 0)
        result = 31 * result + (deviceIndex ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (instanceOwnerId?.hashCode() ?: 0)
        result = 31 * result + (networkCardIndex ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NetworkInterfaceAttachment

        if (attachTime != other.attachTime) return false
        if (attachmentId != other.attachmentId) return false
        if (deleteOnTermination != other.deleteOnTermination) return false
        if (deviceIndex != other.deviceIndex) return false
        if (instanceId != other.instanceId) return false
        if (instanceOwnerId != other.instanceOwnerId) return false
        if (networkCardIndex != other.networkCardIndex) return false
        if (status != other.status) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttachment = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The timestamp indicating when the attachment initiated.
         */
        public var attachTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The ID of the network interface attachment.
         */
        public var attachmentId: kotlin.String? = null
        /**
         * Indicates whether the network interface is deleted when the instance is terminated.
         */
        public var deleteOnTermination: kotlin.Boolean? = null
        /**
         * The device index of the network interface attachment on the instance.
         */
        public var deviceIndex: kotlin.Int? = null
        /**
         * The ID of the instance.
         */
        public var instanceId: kotlin.String? = null
        /**
         * The Amazon Web Services account ID of the owner of the instance.
         */
        public var instanceOwnerId: kotlin.String? = null
        /**
         * The index of the network card.
         */
        public var networkCardIndex: kotlin.Int? = null
        /**
         * The attachment state.
         */
        public var status: aws.sdk.kotlin.services.ec2.model.AttachmentStatus? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttachment) : this() {
            this.attachTime = x.attachTime
            this.attachmentId = x.attachmentId
            this.deleteOnTermination = x.deleteOnTermination
            this.deviceIndex = x.deviceIndex
            this.instanceId = x.instanceId
            this.instanceOwnerId = x.instanceOwnerId
            this.networkCardIndex = x.networkCardIndex
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAttachment = NetworkInterfaceAttachment(this)
    }
}
