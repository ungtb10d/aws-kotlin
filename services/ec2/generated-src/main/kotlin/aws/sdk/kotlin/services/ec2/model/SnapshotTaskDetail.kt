// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Details about the import snapshot task.
 */
class SnapshotTaskDetail private constructor(builder: Builder) {
    /**
     * The description of the snapshot.
     */
    val description: kotlin.String? = builder.description
    /**
     * The size of the disk in the snapshot, in GiB.
     */
    val diskImageSize: kotlin.Double? = builder.diskImageSize
    /**
     * Indicates whether the snapshot is encrypted.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * The format of the disk image from which the snapshot is created.
     */
    val format: kotlin.String? = builder.format
    /**
     * The identifier for the KMS key that was used to create the encrypted snapshot.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId
    /**
     * The percentage of completion for the import snapshot task.
     */
    val progress: kotlin.String? = builder.progress
    /**
     * The snapshot ID of the disk being imported.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * A brief status for the import snapshot task.
     */
    val status: kotlin.String? = builder.status
    /**
     * A detailed status message for the import snapshot task.
     */
    val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * The URL of the disk image from which the snapshot is created.
     */
    val url: kotlin.String? = builder.url
    /**
     * The Amazon S3 bucket for the disk image.
     */
    val userBucket: aws.sdk.kotlin.services.ec2.model.UserBucketDetails? = builder.userBucket

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SnapshotTaskDetail(")
        append("description=$description,")
        append("diskImageSize=$diskImageSize,")
        append("encrypted=$encrypted,")
        append("format=$format,")
        append("kmsKeyId=$kmsKeyId,")
        append("progress=$progress,")
        append("snapshotId=$snapshotId,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("url=$url,")
        append("userBucket=$userBucket)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (diskImageSize?.hashCode() ?: 0)
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (format?.hashCode() ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (progress?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (url?.hashCode() ?: 0)
        result = 31 * result + (userBucket?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SnapshotTaskDetail

        if (description != other.description) return false
        if (diskImageSize != other.diskImageSize) return false
        if (encrypted != other.encrypted) return false
        if (format != other.format) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (progress != other.progress) return false
        if (snapshotId != other.snapshotId) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (url != other.url) return false
        if (userBucket != other.userBucket) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail = Builder(this).apply(block).build()

    class Builder {
        /**
         * The description of the snapshot.
         */
        var description: kotlin.String? = null
        /**
         * The size of the disk in the snapshot, in GiB.
         */
        var diskImageSize: kotlin.Double? = null
        /**
         * Indicates whether the snapshot is encrypted.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * The format of the disk image from which the snapshot is created.
         */
        var format: kotlin.String? = null
        /**
         * The identifier for the KMS key that was used to create the encrypted snapshot.
         */
        var kmsKeyId: kotlin.String? = null
        /**
         * The percentage of completion for the import snapshot task.
         */
        var progress: kotlin.String? = null
        /**
         * The snapshot ID of the disk being imported.
         */
        var snapshotId: kotlin.String? = null
        /**
         * A brief status for the import snapshot task.
         */
        var status: kotlin.String? = null
        /**
         * A detailed status message for the import snapshot task.
         */
        var statusMessage: kotlin.String? = null
        /**
         * The URL of the disk image from which the snapshot is created.
         */
        var url: kotlin.String? = null
        /**
         * The Amazon S3 bucket for the disk image.
         */
        var userBucket: aws.sdk.kotlin.services.ec2.model.UserBucketDetails? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail) : this() {
            this.description = x.description
            this.diskImageSize = x.diskImageSize
            this.encrypted = x.encrypted
            this.format = x.format
            this.kmsKeyId = x.kmsKeyId
            this.progress = x.progress
            this.snapshotId = x.snapshotId
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.url = x.url
            this.userBucket = x.userBucket
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail = SnapshotTaskDetail(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.UserBucketDetails] inside the given [block]
         */
        fun userBucket(block: aws.sdk.kotlin.services.ec2.model.UserBucketDetails.Builder.() -> kotlin.Unit) {
            this.userBucket = aws.sdk.kotlin.services.ec2.model.UserBucketDetails.invoke(block)
        }
    }
}