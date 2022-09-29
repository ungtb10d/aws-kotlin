// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of AttachNetworkInterface.
 */
public class AttachNetworkInterfaceResponse private constructor(builder: Builder) {
    /**
     * The ID of the network interface attachment.
     */
    public val attachmentId: kotlin.String? = builder.attachmentId
    /**
     * The index of the network card.
     */
    public val networkCardIndex: kotlin.Int? = builder.networkCardIndex

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AttachNetworkInterfaceResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AttachNetworkInterfaceResponse(")
        append("attachmentId=$attachmentId,")
        append("networkCardIndex=$networkCardIndex)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attachmentId?.hashCode() ?: 0
        result = 31 * result + (networkCardIndex ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AttachNetworkInterfaceResponse

        if (attachmentId != other.attachmentId) return false
        if (networkCardIndex != other.networkCardIndex) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AttachNetworkInterfaceResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the network interface attachment.
         */
        public var attachmentId: kotlin.String? = null
        /**
         * The index of the network card.
         */
        public var networkCardIndex: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AttachNetworkInterfaceResponse) : this() {
            this.attachmentId = x.attachmentId
            this.networkCardIndex = x.networkCardIndex
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AttachNetworkInterfaceResponse = AttachNetworkInterfaceResponse(this)
    }
}
