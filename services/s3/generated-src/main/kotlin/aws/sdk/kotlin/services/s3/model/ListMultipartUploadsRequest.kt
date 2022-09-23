// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class ListMultipartUploadsRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket to which the multipart upload was initiated.
     *
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
     *
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
     */
    public val bucket: kotlin.String? = requireNotNull(builder.bucket) { "A non-null value must be provided for bucket" }
    /**
     * Character you use to group keys.
     *
     * All keys that contain the same string between the prefix, if specified, and the first occurrence of the delimiter after the prefix are grouped under a single result element, `CommonPrefixes`. If you don't specify the prefix parameter, then the substring starts at the beginning of the key. The keys that are grouped under `CommonPrefixes` result element are not returned elsewhere in the response.
     */
    public val delimiter: kotlin.String? = builder.delimiter
    /**
     * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
     */
    public val encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = builder.encodingType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
     */
    public val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Together with upload-id-marker, this parameter specifies the multipart upload after which listing should begin.
     *
     * If `upload-id-marker` is not specified, only the keys lexicographically greater than the specified `key-marker` will be included in the list.
     *
     * If `upload-id-marker` is specified, any multipart uploads for a key equal to the `key-marker` might also be included, provided those multipart uploads have upload IDs lexicographically greater than the specified `upload-id-marker`.
     */
    public val keyMarker: kotlin.String? = builder.keyMarker
    /**
     * Sets the maximum number of multipart uploads, from 1 to 1,000, to return in the response body. 1,000 is the maximum number of uploads that can be returned in a response.
     */
    public val maxUploads: kotlin.Int = builder.maxUploads
    /**
     * Lists in-progress uploads only for those keys that begin with the specified prefix. You can use prefixes to separate a bucket into different grouping of keys. (You can think of using prefix to make groups in the same way you'd use a folder in a file system.)
     */
    public val prefix: kotlin.String? = builder.prefix
    /**
     * Together with key-marker, specifies the multipart upload after which listing should begin. If key-marker is not specified, the upload-id-marker parameter is ignored. Otherwise, any multipart uploads for a key equal to the key-marker might be included in the list only if they have an upload ID lexicographically greater than the specified `upload-id-marker`.
     */
    public val uploadIdMarker: kotlin.String? = builder.uploadIdMarker

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListMultipartUploadsRequest(")
        append("bucket=$bucket,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("keyMarker=$keyMarker,")
        append("maxUploads=$maxUploads,")
        append("prefix=$prefix,")
        append("uploadIdMarker=$uploadIdMarker)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (keyMarker?.hashCode() ?: 0)
        result = 31 * result + (maxUploads)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (uploadIdMarker?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListMultipartUploadsRequest

        if (bucket != other.bucket) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (keyMarker != other.keyMarker) return false
        if (maxUploads != other.maxUploads) return false
        if (prefix != other.prefix) return false
        if (uploadIdMarker != other.uploadIdMarker) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of the bucket to which the multipart upload was initiated.
         *
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form *AccessPointName*-*AccountId*.s3-accesspoint.*Region*.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see [Using access points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html) in the *Amazon S3 User Guide*.
         *
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form ` <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com`. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see [Using Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) in the *Amazon S3 User Guide*.
         */
        public var bucket: kotlin.String? = null
        /**
         * Character you use to group keys.
         *
         * All keys that contain the same string between the prefix, if specified, and the first occurrence of the delimiter after the prefix are grouped under a single result element, `CommonPrefixes`. If you don't specify the prefix parameter, then the substring starts at the beginning of the key. The keys that are grouped under `CommonPrefixes` result element are not returned elsewhere in the response.
         */
        public var delimiter: kotlin.String? = null
        /**
         * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
         */
        public var encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code `403 Forbidden` (access denied).
         */
        public var expectedBucketOwner: kotlin.String? = null
        /**
         * Together with upload-id-marker, this parameter specifies the multipart upload after which listing should begin.
         *
         * If `upload-id-marker` is not specified, only the keys lexicographically greater than the specified `key-marker` will be included in the list.
         *
         * If `upload-id-marker` is specified, any multipart uploads for a key equal to the `key-marker` might also be included, provided those multipart uploads have upload IDs lexicographically greater than the specified `upload-id-marker`.
         */
        public var keyMarker: kotlin.String? = null
        /**
         * Sets the maximum number of multipart uploads, from 1 to 1,000, to return in the response body. 1,000 is the maximum number of uploads that can be returned in a response.
         */
        public var maxUploads: kotlin.Int = 0
        /**
         * Lists in-progress uploads only for those keys that begin with the specified prefix. You can use prefixes to separate a bucket into different grouping of keys. (You can think of using prefix to make groups in the same way you'd use a folder in a file system.)
         */
        public var prefix: kotlin.String? = null
        /**
         * Together with key-marker, specifies the multipart upload after which listing should begin. If key-marker is not specified, the upload-id-marker parameter is ignored. Otherwise, any multipart uploads for a key equal to the key-marker might be included in the list only if they have an upload ID lexicographically greater than the specified `upload-id-marker`.
         */
        public var uploadIdMarker: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListMultipartUploadsRequest) : this() {
            this.bucket = x.bucket
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.keyMarker = x.keyMarker
            this.maxUploads = x.maxUploads
            this.prefix = x.prefix
            this.uploadIdMarker = x.uploadIdMarker
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsRequest = ListMultipartUploadsRequest(this)
    }
}
