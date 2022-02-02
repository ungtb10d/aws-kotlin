// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * An object consists of data and its descriptive metadata.
 */
class Object private constructor(builder: Builder) {
    /**
     * The entity tag is a hash of the object. The ETag reflects changes only to the contents
     * of an object, not its metadata. The ETag may or may not be an MD5 digest of the object
     * data. Whether or not it is depends on how the object was created and how it is encrypted as
     * described below:
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the
     * Amazon Web Services Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are
     * an MD5 digest of their object data.
     * Objects created by the PUT Object, POST Object, or Copy operation, or through the
     * Amazon Web Services Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are
     * not an MD5 digest of their object data.
     * If an object is created by either the Multipart Upload or Part Copy operation, the
     * ETag is not an MD5 digest, regardless of the method of encryption.
     */
    val eTag: kotlin.String? = builder.eTag
    /**
     * The name that you assign to an object. You use the object key to retrieve the
     * object.
     */
    val key: kotlin.String? = builder.key
    /**
     * Creation date of the object.
     */
    val lastModified: aws.smithy.kotlin.runtime.time.Instant? = builder.lastModified
    /**
     * The owner of the object
     */
    val owner: aws.sdk.kotlin.services.s3.model.Owner? = builder.owner
    /**
     * Size in bytes of the object
     */
    val size: kotlin.Long = builder.size
    /**
     * The class of storage used to store the object.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.ObjectStorageClass? = builder.storageClass

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Object = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Object(")
        append("eTag=$eTag,")
        append("key=$key,")
        append("lastModified=$lastModified,")
        append("owner=$owner,")
        append("size=$size,")
        append("storageClass=$storageClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eTag?.hashCode() ?: 0
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        result = 31 * result + (owner?.hashCode() ?: 0)
        result = 31 * result + (size.hashCode())
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Object

        if (eTag != other.eTag) return false
        if (key != other.key) return false
        if (lastModified != other.lastModified) return false
        if (owner != other.owner) return false
        if (size != other.size) return false
        if (storageClass != other.storageClass) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Object = Builder(this).apply(block).build()

    class Builder {
        /**
         * The entity tag is a hash of the object. The ETag reflects changes only to the contents
         * of an object, not its metadata. The ETag may or may not be an MD5 digest of the object
         * data. Whether or not it is depends on how the object was created and how it is encrypted as
         * described below:
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are
         * an MD5 digest of their object data.
         * Objects created by the PUT Object, POST Object, or Copy operation, or through the
         * Amazon Web Services Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are
         * not an MD5 digest of their object data.
         * If an object is created by either the Multipart Upload or Part Copy operation, the
         * ETag is not an MD5 digest, regardless of the method of encryption.
         */
        var eTag: kotlin.String? = null
        /**
         * The name that you assign to an object. You use the object key to retrieve the
         * object.
         */
        var key: kotlin.String? = null
        /**
         * Creation date of the object.
         */
        var lastModified: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The owner of the object
         */
        var owner: aws.sdk.kotlin.services.s3.model.Owner? = null
        /**
         * Size in bytes of the object
         */
        var size: kotlin.Long = 0L
        /**
         * The class of storage used to store the object.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.ObjectStorageClass? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Object) : this() {
            this.eTag = x.eTag
            this.key = x.key
            this.lastModified = x.lastModified
            this.owner = x.owner
            this.size = x.size
            this.storageClass = x.storageClass
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Object = Object(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Owner] inside the given [block]
         */
        fun owner(block: aws.sdk.kotlin.services.s3.model.Owner.Builder.() -> kotlin.Unit) {
            this.owner = aws.sdk.kotlin.services.s3.model.Owner.invoke(block)
        }
    }
}