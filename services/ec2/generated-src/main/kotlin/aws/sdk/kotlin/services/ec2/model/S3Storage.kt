// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the storage parameters for Amazon S3 and Amazon S3 buckets for an instance store-backed AMI.
 */
class S3Storage private constructor(builder: Builder) {
    /**
     * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance
     * in <a href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for Managing Amazon Web Services Access Keys.
     */
    val awsAccessKeyId: kotlin.String? = builder.awsAccessKeyId
    /**
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The beginning of the file name of the AMI.
     */
    val prefix: kotlin.String? = builder.prefix
    /**
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
     */
    val uploadPolicy: kotlin.ByteArray? = builder.uploadPolicy
    /**
     * The signature of the JSON document.
     */
    val uploadPolicySignature: kotlin.String? = builder.uploadPolicySignature

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.S3Storage = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("S3Storage(")
        append("awsAccessKeyId=$awsAccessKeyId,")
        append("bucket=$bucket,")
        append("prefix=$prefix,")
        append("uploadPolicy=$uploadPolicy,")
        append("uploadPolicySignature=$uploadPolicySignature)")
    }

    override fun hashCode(): kotlin.Int {
        var result = awsAccessKeyId?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (uploadPolicy?.contentHashCode() ?: 0)
        result = 31 * result + (uploadPolicySignature?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as S3Storage

        if (awsAccessKeyId != other.awsAccessKeyId) return false
        if (bucket != other.bucket) return false
        if (prefix != other.prefix) return false
        if (uploadPolicy != null) {
            if (other.uploadPolicy == null) return false
            if (!uploadPolicy.contentEquals(other.uploadPolicy)) return false
        } else if (other.uploadPolicy != null) return false
        if (uploadPolicySignature != other.uploadPolicySignature) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.S3Storage = Builder(this).apply(block).build()

    class Builder {
        /**
         * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance
         * in <a href="https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html">Best Practices for Managing Amazon Web Services Access Keys.
         */
        var awsAccessKeyId: kotlin.String? = null
        /**
         * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
         */
        var bucket: kotlin.String? = null
        /**
         * The beginning of the file name of the AMI.
         */
        var prefix: kotlin.String? = null
        /**
         * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
         */
        var uploadPolicy: kotlin.ByteArray? = null
        /**
         * The signature of the JSON document.
         */
        var uploadPolicySignature: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.S3Storage) : this() {
            this.awsAccessKeyId = x.awsAccessKeyId
            this.bucket = x.bucket
            this.prefix = x.prefix
            this.uploadPolicy = x.uploadPolicy
            this.uploadPolicySignature = x.uploadPolicySignature
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.S3Storage = S3Storage(this)
    }
}