// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a path.
 */
public class NetworkInsightsPath private constructor(builder: Builder) {
    /**
     * The time stamp when the path was created.
     */
    public val createdDate: aws.smithy.kotlin.runtime.time.Instant? = builder.createdDate
    /**
     * The Amazon Web Services resource that is the destination of the path.
     */
    public val destination: kotlin.String? = builder.destination
    /**
     * The IP address of the Amazon Web Services resource that is the destination of the path.
     */
    public val destinationIp: kotlin.String? = builder.destinationIp
    /**
     * The destination port.
     */
    public val destinationPort: kotlin.Int? = builder.destinationPort
    /**
     * The Amazon Resource Name (ARN) of the path.
     */
    public val networkInsightsPathArn: kotlin.String? = builder.networkInsightsPathArn
    /**
     * The ID of the path.
     */
    public val networkInsightsPathId: kotlin.String? = builder.networkInsightsPathId
    /**
     * The protocol.
     */
    public val protocol: aws.sdk.kotlin.services.ec2.model.Protocol? = builder.protocol
    /**
     * The Amazon Web Services resource that is the source of the path.
     */
    public val source: kotlin.String? = builder.source
    /**
     * The IP address of the Amazon Web Services resource that is the source of the path.
     */
    public val sourceIp: kotlin.String? = builder.sourceIp
    /**
     * The tags associated with the path.
     */
    public val tags: List<Tag>? = builder.tags

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NetworkInsightsPath = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NetworkInsightsPath(")
        append("createdDate=$createdDate,")
        append("destination=$destination,")
        append("destinationIp=$destinationIp,")
        append("destinationPort=$destinationPort,")
        append("networkInsightsPathArn=$networkInsightsPathArn,")
        append("networkInsightsPathId=$networkInsightsPathId,")
        append("protocol=$protocol,")
        append("source=$source,")
        append("sourceIp=$sourceIp,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = createdDate?.hashCode() ?: 0
        result = 31 * result + (destination?.hashCode() ?: 0)
        result = 31 * result + (destinationIp?.hashCode() ?: 0)
        result = 31 * result + (destinationPort ?: 0)
        result = 31 * result + (networkInsightsPathArn?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsPathId?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (source?.hashCode() ?: 0)
        result = 31 * result + (sourceIp?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NetworkInsightsPath

        if (createdDate != other.createdDate) return false
        if (destination != other.destination) return false
        if (destinationIp != other.destinationIp) return false
        if (destinationPort != other.destinationPort) return false
        if (networkInsightsPathArn != other.networkInsightsPathArn) return false
        if (networkInsightsPathId != other.networkInsightsPathId) return false
        if (protocol != other.protocol) return false
        if (source != other.source) return false
        if (sourceIp != other.sourceIp) return false
        if (tags != other.tags) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NetworkInsightsPath = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The time stamp when the path was created.
         */
        public var createdDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The Amazon Web Services resource that is the destination of the path.
         */
        public var destination: kotlin.String? = null
        /**
         * The IP address of the Amazon Web Services resource that is the destination of the path.
         */
        public var destinationIp: kotlin.String? = null
        /**
         * The destination port.
         */
        public var destinationPort: kotlin.Int? = null
        /**
         * The Amazon Resource Name (ARN) of the path.
         */
        public var networkInsightsPathArn: kotlin.String? = null
        /**
         * The ID of the path.
         */
        public var networkInsightsPathId: kotlin.String? = null
        /**
         * The protocol.
         */
        public var protocol: aws.sdk.kotlin.services.ec2.model.Protocol? = null
        /**
         * The Amazon Web Services resource that is the source of the path.
         */
        public var source: kotlin.String? = null
        /**
         * The IP address of the Amazon Web Services resource that is the source of the path.
         */
        public var sourceIp: kotlin.String? = null
        /**
         * The tags associated with the path.
         */
        public var tags: List<Tag>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NetworkInsightsPath) : this() {
            this.createdDate = x.createdDate
            this.destination = x.destination
            this.destinationIp = x.destinationIp
            this.destinationPort = x.destinationPort
            this.networkInsightsPathArn = x.networkInsightsPathArn
            this.networkInsightsPathId = x.networkInsightsPathId
            this.protocol = x.protocol
            this.source = x.source
            this.sourceIp = x.sourceIp
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NetworkInsightsPath = NetworkInsightsPath(this)
    }
}
