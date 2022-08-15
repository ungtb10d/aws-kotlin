// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Configures the transfer acceleration state for an Amazon S3 bucket. For more information, see [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the *Amazon S3 User Guide*.
 */
public class AccelerateConfiguration private constructor(builder: Builder) {
    /**
     * Specifies the transfer acceleration status of the bucket.
     */
    public val status: aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus? = builder.status

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.AccelerateConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AccelerateConfiguration(")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = status?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AccelerateConfiguration

        if (status != other.status) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.AccelerateConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Specifies the transfer acceleration status of the bucket.
         */
        public var status: aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.AccelerateConfiguration) : this() {
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.AccelerateConfiguration = AccelerateConfiguration(this)
    }
}
