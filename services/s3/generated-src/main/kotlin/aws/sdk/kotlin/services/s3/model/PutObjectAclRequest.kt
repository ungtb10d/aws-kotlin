// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutObjectAclRequest private constructor(builder: Builder) {
    /**
     * Contains the elements that set the ACL permissions for an object per grantee.
     */
    val accessControlPolicy: aws.sdk.kotlin.services.s3.model.AccessControlPolicy? = builder.accessControlPolicy
    /**
     * The canned ACL to apply to the object. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL.
     */
    val acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = builder.acl
    /**
     * The bucket name that contains the object to which you want to attach the ACL.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message
     * integrity check to verify that the request body was not corrupted in transit. For more
     * information, go to <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC
     * 1864.>
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Allows grantee the read, write, read ACP, and write ACP permissions on the
     * bucket.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantFullControl: kotlin.String? = builder.grantFullControl
    /**
     * Allows grantee to list the objects in the
     * bucket.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantRead: kotlin.String? = builder.grantRead
    /**
     * Allows grantee to read the bucket ACL.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantReadAcp: kotlin.String? = builder.grantReadAcp
    /**
     * Allows grantee to create new objects in the bucket.
     * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
     */
    val grantWrite: kotlin.String? = builder.grantWrite
    /**
     * Allows grantee to write the ACL for the applicable
     * bucket.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantWriteAcp: kotlin.String? = builder.grantWriteAcp
    /**
     * Key for which the PUT action was initiated.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val key: kotlin.String? = builder.key
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * VersionId used to reference a specific version of the object.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutObjectAclRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutObjectAclRequest(")
        append("accessControlPolicy=$accessControlPolicy,")
        append("acl=$acl,")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("grantFullControl=$grantFullControl,")
        append("grantRead=$grantRead,")
        append("grantReadAcp=$grantReadAcp,")
        append("grantWrite=$grantWrite,")
        append("grantWriteAcp=$grantWriteAcp,")
        append("key=$key,")
        append("requestPayer=$requestPayer,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accessControlPolicy?.hashCode() ?: 0
        result = 31 * result + (acl?.hashCode() ?: 0)
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (grantFullControl?.hashCode() ?: 0)
        result = 31 * result + (grantRead?.hashCode() ?: 0)
        result = 31 * result + (grantReadAcp?.hashCode() ?: 0)
        result = 31 * result + (grantWrite?.hashCode() ?: 0)
        result = 31 * result + (grantWriteAcp?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutObjectAclRequest

        if (accessControlPolicy != other.accessControlPolicy) return false
        if (acl != other.acl) return false
        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (grantFullControl != other.grantFullControl) return false
        if (grantRead != other.grantRead) return false
        if (grantReadAcp != other.grantReadAcp) return false
        if (grantWrite != other.grantWrite) return false
        if (grantWriteAcp != other.grantWriteAcp) return false
        if (key != other.key) return false
        if (requestPayer != other.requestPayer) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutObjectAclRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Contains the elements that set the ACL permissions for an object per grantee.
         */
        var accessControlPolicy: aws.sdk.kotlin.services.s3.model.AccessControlPolicy? = null
        /**
         * The canned ACL to apply to the object. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL.
         */
        var acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = null
        /**
         * The bucket name that contains the object to which you want to attach the ACL.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message
         * integrity check to verify that the request body was not corrupted in transit. For more
         * information, go to <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC
         * 1864.>
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Allows grantee the read, write, read ACP, and write ACP permissions on the
         * bucket.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantFullControl: kotlin.String? = null
        /**
         * Allows grantee to list the objects in the
         * bucket.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantRead: kotlin.String? = null
        /**
         * Allows grantee to read the bucket ACL.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantReadAcp: kotlin.String? = null
        /**
         * Allows grantee to create new objects in the bucket.
         * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
         */
        var grantWrite: kotlin.String? = null
        /**
         * Allows grantee to write the ACL for the applicable
         * bucket.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantWriteAcp: kotlin.String? = null
        /**
         * Key for which the PUT action was initiated.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var key: kotlin.String? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * VersionId used to reference a specific version of the object.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutObjectAclRequest) : this() {
            this.accessControlPolicy = x.accessControlPolicy
            this.acl = x.acl
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.grantFullControl = x.grantFullControl
            this.grantRead = x.grantRead
            this.grantReadAcp = x.grantReadAcp
            this.grantWrite = x.grantWrite
            this.grantWriteAcp = x.grantWriteAcp
            this.key = x.key
            this.requestPayer = x.requestPayer
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutObjectAclRequest = PutObjectAclRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.AccessControlPolicy] inside the given [block]
         */
        fun accessControlPolicy(block: aws.sdk.kotlin.services.s3.model.AccessControlPolicy.Builder.() -> kotlin.Unit) {
            this.accessControlPolicy = aws.sdk.kotlin.services.s3.model.AccessControlPolicy.invoke(block)
        }
    }
}