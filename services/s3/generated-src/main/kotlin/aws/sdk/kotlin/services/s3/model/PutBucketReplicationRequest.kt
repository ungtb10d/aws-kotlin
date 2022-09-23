// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class PutBucketReplicationRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket
     */
    public val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see [RFC 1864](http://www.ietf.org/rfc/rfc1864.txt).
     *
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    public val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    public val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
     */
    public val replicationConfiguration: aws.sdk.kotlin.services.s3.model.ReplicationConfiguration? = builder.replicationConfiguration
    /**
     * A token to allow Object Lock to be enabled for an existing bucket.
     */
    public val token: kotlin.String? = builder.token

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketReplicationRequest(")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("replicationConfiguration=$replicationConfiguration,")
        append("token=$token)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (replicationConfiguration?.hashCode() ?: 0)
        result = 31 * result + (token?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketReplicationRequest

        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (replicationConfiguration != other.replicationConfiguration) return false
        if (token != other.token) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of the bucket
         */
        public var bucket: kotlin.String? = null
        /**
         * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see [RFC 1864](http://www.ietf.org/rfc/rfc1864.txt).
         *
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        public var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        public var expectedBucketOwner: kotlin.String? = null
        /**
         * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
         */
        public var replicationConfiguration: aws.sdk.kotlin.services.s3.model.ReplicationConfiguration? = null
        /**
         * A token to allow Object Lock to be enabled for an existing bucket.
         */
        public var token: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest) : this() {
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.replicationConfiguration = x.replicationConfiguration
            this.token = x.token
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketReplicationRequest = PutBucketReplicationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ReplicationConfiguration] inside the given [block]
         */
        public fun replicationConfiguration(block: aws.sdk.kotlin.services.s3.model.ReplicationConfiguration.Builder.() -> kotlin.Unit) {
            this.replicationConfiguration = aws.sdk.kotlin.services.s3.model.ReplicationConfiguration.invoke(block)
        }
    }
}
