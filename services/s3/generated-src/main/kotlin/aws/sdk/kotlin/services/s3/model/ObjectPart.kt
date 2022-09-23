// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for elements related to an individual part.
 */
public class ObjectPart private constructor(builder: Builder) {
    /**
     * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more information, see [Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html) in the *Amazon S3 User Guide*.
     */
    public val checksumCrc32: kotlin.String? = builder.checksumCrc32
    /**
     * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    public val checksumCrc32C: kotlin.String? = builder.checksumCrc32C
    /**
     * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    public val checksumSha1: kotlin.String? = builder.checksumSha1
    /**
     * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
     */
    public val checksumSha256: kotlin.String? = builder.checksumSha256
    /**
     * The part number identifying the part. This value is a positive integer between 1 and 10,000.
     */
    public val partNumber: kotlin.Int = builder.partNumber
    /**
     * The size of the uploaded part in bytes.
     */
    public val size: kotlin.Long = builder.size

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ObjectPart = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ObjectPart(")
        append("checksumCrc32=$checksumCrc32,")
        append("checksumCrc32C=$checksumCrc32C,")
        append("checksumSha1=$checksumSha1,")
        append("checksumSha256=$checksumSha256,")
        append("partNumber=$partNumber,")
        append("size=$size)")
    }

    override fun hashCode(): kotlin.Int {
        var result = checksumCrc32?.hashCode() ?: 0
        result = 31 * result + (checksumCrc32C?.hashCode() ?: 0)
        result = 31 * result + (checksumSha1?.hashCode() ?: 0)
        result = 31 * result + (checksumSha256?.hashCode() ?: 0)
        result = 31 * result + (partNumber)
        result = 31 * result + (size.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ObjectPart

        if (checksumCrc32 != other.checksumCrc32) return false
        if (checksumCrc32C != other.checksumCrc32C) return false
        if (checksumSha1 != other.checksumSha1) return false
        if (checksumSha256 != other.checksumSha256) return false
        if (partNumber != other.partNumber) return false
        if (size != other.size) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ObjectPart = Builder(this).apply(block).build()

    public class Builder {
        /**
         * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more information, see [Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html) in the *Amazon S3 User Guide*.
         */
        public var checksumCrc32: kotlin.String? = null
        /**
         * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        public var checksumCrc32C: kotlin.String? = null
        /**
         * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        public var checksumSha1: kotlin.String? = null
        /**
         * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see [ Checking object integrity](https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums) in the *Amazon S3 User Guide*.
         */
        public var checksumSha256: kotlin.String? = null
        /**
         * The part number identifying the part. This value is a positive integer between 1 and 10,000.
         */
        public var partNumber: kotlin.Int = 0
        /**
         * The size of the uploaded part in bytes.
         */
        public var size: kotlin.Long = 0L

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ObjectPart) : this() {
            this.checksumCrc32 = x.checksumCrc32
            this.checksumCrc32C = x.checksumCrc32C
            this.checksumSha1 = x.checksumSha1
            this.checksumSha256 = x.checksumSha256
            this.partNumber = x.partNumber
            this.size = x.size
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ObjectPart = ObjectPart(this)
    }
}
