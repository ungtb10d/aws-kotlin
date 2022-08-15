// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a disk image.
 */
public class DiskImage private constructor(builder: Builder) {
    /**
     * A description of the disk image.
     */
    public val description: kotlin.String? = builder.description
    /**
     * Information about the disk image.
     */
    public val image: aws.sdk.kotlin.services.ec2.model.DiskImageDetail? = builder.image
    /**
     * Information about the volume.
     */
    public val volume: aws.sdk.kotlin.services.ec2.model.VolumeDetail? = builder.volume

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DiskImage = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DiskImage(")
        append("description=$description,")
        append("image=$image,")
        append("volume=$volume)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (image?.hashCode() ?: 0)
        result = 31 * result + (volume?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DiskImage

        if (description != other.description) return false
        if (image != other.image) return false
        if (volume != other.volume) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DiskImage = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A description of the disk image.
         */
        public var description: kotlin.String? = null
        /**
         * Information about the disk image.
         */
        public var image: aws.sdk.kotlin.services.ec2.model.DiskImageDetail? = null
        /**
         * Information about the volume.
         */
        public var volume: aws.sdk.kotlin.services.ec2.model.VolumeDetail? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DiskImage) : this() {
            this.description = x.description
            this.image = x.image
            this.volume = x.volume
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DiskImage = DiskImage(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DiskImageDetail] inside the given [block]
         */
        public fun image(block: aws.sdk.kotlin.services.ec2.model.DiskImageDetail.Builder.() -> kotlin.Unit) {
            this.image = aws.sdk.kotlin.services.ec2.model.DiskImageDetail.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VolumeDetail] inside the given [block]
         */
        public fun volume(block: aws.sdk.kotlin.services.ec2.model.VolumeDetail.Builder.() -> kotlin.Unit) {
            this.volume = aws.sdk.kotlin.services.ec2.model.VolumeDetail.invoke(block)
        }
    }
}
