// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
 */
public class InventoryS3BucketDestination private constructor(builder: Builder) {
    /**
     * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.
     *
     *  Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.
     */
    public val accountId: kotlin.String? = builder.accountId
    /**
     * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
     */
    public val bucket: kotlin.String? = builder.bucket
    /**
     * Contains the type of server-side encryption used to encrypt the inventory results.
     */
    public val encryption: aws.sdk.kotlin.services.s3.model.InventoryEncryption? = builder.encryption
    /**
     * Specifies the output format of the inventory results.
     */
    public val format: aws.sdk.kotlin.services.s3.model.InventoryFormat? = builder.format
    /**
     * The prefix that is prepended to all inventory results.
     */
    public val prefix: kotlin.String? = builder.prefix

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.InventoryS3BucketDestination = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InventoryS3BucketDestination(")
        append("accountId=$accountId,")
        append("bucket=$bucket,")
        append("encryption=$encryption,")
        append("format=$format,")
        append("prefix=$prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accountId?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (encryption?.hashCode() ?: 0)
        result = 31 * result + (format?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InventoryS3BucketDestination

        if (accountId != other.accountId) return false
        if (bucket != other.bucket) return false
        if (encryption != other.encryption) return false
        if (format != other.format) return false
        if (prefix != other.prefix) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.InventoryS3BucketDestination = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.
         *
         *  Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.
         */
        public var accountId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
         */
        public var bucket: kotlin.String? = null
        /**
         * Contains the type of server-side encryption used to encrypt the inventory results.
         */
        public var encryption: aws.sdk.kotlin.services.s3.model.InventoryEncryption? = null
        /**
         * Specifies the output format of the inventory results.
         */
        public var format: aws.sdk.kotlin.services.s3.model.InventoryFormat? = null
        /**
         * The prefix that is prepended to all inventory results.
         */
        public var prefix: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.InventoryS3BucketDestination) : this() {
            this.accountId = x.accountId
            this.bucket = x.bucket
            this.encryption = x.encryption
            this.format = x.format
            this.prefix = x.prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.InventoryS3BucketDestination = InventoryS3BucketDestination(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.InventoryEncryption] inside the given [block]
         */
        public fun encryption(block: aws.sdk.kotlin.services.s3.model.InventoryEncryption.Builder.() -> kotlin.Unit) {
            this.encryption = aws.sdk.kotlin.services.s3.model.InventoryEncryption.invoke(block)
        }
    }
}
