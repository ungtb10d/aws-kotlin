// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class CreateBucketRequest private constructor(builder: Builder) {
    /**
     * The canned ACL to apply to the bucket.
     */
    public val acl: aws.sdk.kotlin.services.s3.model.BucketCannedAcl? = builder.acl
    /**
     * The name of the bucket to create.
     */
    public val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * The configuration information for the bucket.
     */
    public val createBucketConfiguration: aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration? = builder.createBucketConfiguration
    /**
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     */
    public val grantFullControl: kotlin.String? = builder.grantFullControl
    /**
     * Allows grantee to list the objects in the bucket.
     */
    public val grantRead: kotlin.String? = builder.grantRead
    /**
     * Allows grantee to read the bucket ACL.
     */
    public val grantReadAcp: kotlin.String? = builder.grantReadAcp
    /**
     * Allows grantee to create new objects in the bucket.
     *
     * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
     */
    public val grantWrite: kotlin.String? = builder.grantWrite
    /**
     * Allows grantee to write the ACL for the applicable bucket.
     */
    public val grantWriteAcp: kotlin.String? = builder.grantWriteAcp
    /**
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     */
    public val objectLockEnabledForBucket: kotlin.Boolean = builder.objectLockEnabledForBucket
    /**
     * The container element for object ownership for a bucket's ownership controls.
     *
     * BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
     *
     * ObjectWriter - The uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
     *
     * BucketOwnerEnforced - Access control lists (ACLs) are disabled and no longer affect permissions. The bucket owner automatically owns and has full control over every object in the bucket. The bucket only accepts PUT requests that don't specify an ACL or bucket owner full control ACLs, such as the `bucket-owner-full-control` canned ACL or an equivalent form of this ACL expressed in the XML format.
     */
    public val objectOwnership: aws.sdk.kotlin.services.s3.model.ObjectOwnership? = builder.objectOwnership

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.CreateBucketRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateBucketRequest(")
        append("acl=$acl,")
        append("bucket=$bucket,")
        append("createBucketConfiguration=$createBucketConfiguration,")
        append("grantFullControl=$grantFullControl,")
        append("grantRead=$grantRead,")
        append("grantReadAcp=$grantReadAcp,")
        append("grantWrite=$grantWrite,")
        append("grantWriteAcp=$grantWriteAcp,")
        append("objectLockEnabledForBucket=$objectLockEnabledForBucket,")
        append("objectOwnership=$objectOwnership)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acl?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (createBucketConfiguration?.hashCode() ?: 0)
        result = 31 * result + (grantFullControl?.hashCode() ?: 0)
        result = 31 * result + (grantRead?.hashCode() ?: 0)
        result = 31 * result + (grantReadAcp?.hashCode() ?: 0)
        result = 31 * result + (grantWrite?.hashCode() ?: 0)
        result = 31 * result + (grantWriteAcp?.hashCode() ?: 0)
        result = 31 * result + (objectLockEnabledForBucket.hashCode())
        result = 31 * result + (objectOwnership?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateBucketRequest

        if (acl != other.acl) return false
        if (bucket != other.bucket) return false
        if (createBucketConfiguration != other.createBucketConfiguration) return false
        if (grantFullControl != other.grantFullControl) return false
        if (grantRead != other.grantRead) return false
        if (grantReadAcp != other.grantReadAcp) return false
        if (grantWrite != other.grantWrite) return false
        if (grantWriteAcp != other.grantWriteAcp) return false
        if (objectLockEnabledForBucket != other.objectLockEnabledForBucket) return false
        if (objectOwnership != other.objectOwnership) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.CreateBucketRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The canned ACL to apply to the bucket.
         */
        public var acl: aws.sdk.kotlin.services.s3.model.BucketCannedAcl? = null
        /**
         * The name of the bucket to create.
         */
        public var bucket: kotlin.String? = null
        /**
         * The configuration information for the bucket.
         */
        public var createBucketConfiguration: aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration? = null
        /**
         * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
         */
        public var grantFullControl: kotlin.String? = null
        /**
         * Allows grantee to list the objects in the bucket.
         */
        public var grantRead: kotlin.String? = null
        /**
         * Allows grantee to read the bucket ACL.
         */
        public var grantReadAcp: kotlin.String? = null
        /**
         * Allows grantee to create new objects in the bucket.
         *
         * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
         */
        public var grantWrite: kotlin.String? = null
        /**
         * Allows grantee to write the ACL for the applicable bucket.
         */
        public var grantWriteAcp: kotlin.String? = null
        /**
         * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
         */
        public var objectLockEnabledForBucket: kotlin.Boolean = false
        /**
         * The container element for object ownership for a bucket's ownership controls.
         *
         * BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
         *
         * ObjectWriter - The uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
         *
         * BucketOwnerEnforced - Access control lists (ACLs) are disabled and no longer affect permissions. The bucket owner automatically owns and has full control over every object in the bucket. The bucket only accepts PUT requests that don't specify an ACL or bucket owner full control ACLs, such as the `bucket-owner-full-control` canned ACL or an equivalent form of this ACL expressed in the XML format.
         */
        public var objectOwnership: aws.sdk.kotlin.services.s3.model.ObjectOwnership? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.CreateBucketRequest) : this() {
            this.acl = x.acl
            this.bucket = x.bucket
            this.createBucketConfiguration = x.createBucketConfiguration
            this.grantFullControl = x.grantFullControl
            this.grantRead = x.grantRead
            this.grantReadAcp = x.grantReadAcp
            this.grantWrite = x.grantWrite
            this.grantWriteAcp = x.grantWriteAcp
            this.objectLockEnabledForBucket = x.objectLockEnabledForBucket
            this.objectOwnership = x.objectOwnership
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.CreateBucketRequest = CreateBucketRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration] inside the given [block]
         */
        public fun createBucketConfiguration(block: aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration.Builder.() -> kotlin.Unit) {
            this.createBucketConfiguration = aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration.invoke(block)
        }
    }
}
