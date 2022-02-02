// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an EBS volume.
 */
class VolumeDetail private constructor(builder: Builder) {
    /**
     * The size of the volume, in GiB.
     */
    val size: kotlin.Long? = builder.size

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VolumeDetail = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VolumeDetail(")
        append("size=$size)")
    }

    override fun hashCode(): kotlin.Int {
        var result = size?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VolumeDetail

        if (size != other.size) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VolumeDetail = Builder(this).apply(block).build()

    class Builder {
        /**
         * The size of the volume, in GiB.
         */
        var size: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VolumeDetail) : this() {
            this.size = x.size
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VolumeDetail = VolumeDetail(this)
    }
}