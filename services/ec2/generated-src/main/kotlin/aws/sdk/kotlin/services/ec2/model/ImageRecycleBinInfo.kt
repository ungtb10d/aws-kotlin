// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Information about an AMI that is currently in the Recycle Bin.
 */
public class ImageRecycleBinInfo private constructor(builder: Builder) {
    /**
     * The description of the AMI.
     */
    public val description: kotlin.String? = builder.description
    /**
     * The ID of the AMI.
     */
    public val imageId: kotlin.String? = builder.imageId
    /**
     * The name of the AMI.
     */
    public val name: kotlin.String? = builder.name
    /**
     * The date and time when the AMI entered the Recycle Bin.
     */
    public val recycleBinEnterTime: aws.smithy.kotlin.runtime.time.Instant? = builder.recycleBinEnterTime
    /**
     * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     */
    public val recycleBinExitTime: aws.smithy.kotlin.runtime.time.Instant? = builder.recycleBinExitTime

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImageRecycleBinInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImageRecycleBinInfo(")
        append("description=$description,")
        append("imageId=$imageId,")
        append("name=$name,")
        append("recycleBinEnterTime=$recycleBinEnterTime,")
        append("recycleBinExitTime=$recycleBinExitTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (recycleBinEnterTime?.hashCode() ?: 0)
        result = 31 * result + (recycleBinExitTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImageRecycleBinInfo

        if (description != other.description) return false
        if (imageId != other.imageId) return false
        if (name != other.name) return false
        if (recycleBinEnterTime != other.recycleBinEnterTime) return false
        if (recycleBinExitTime != other.recycleBinExitTime) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImageRecycleBinInfo = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The description of the AMI.
         */
        public var description: kotlin.String? = null
        /**
         * The ID of the AMI.
         */
        public var imageId: kotlin.String? = null
        /**
         * The name of the AMI.
         */
        public var name: kotlin.String? = null
        /**
         * The date and time when the AMI entered the Recycle Bin.
         */
        public var recycleBinEnterTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
         */
        public var recycleBinExitTime: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImageRecycleBinInfo) : this() {
            this.description = x.description
            this.imageId = x.imageId
            this.name = x.name
            this.recycleBinEnterTime = x.recycleBinEnterTime
            this.recycleBinExitTime = x.recycleBinExitTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImageRecycleBinInfo = ImageRecycleBinInfo(this)
    }
}
