// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * The information about the AMI store task, including the progress of the task.
 */
public class StoreImageTaskResult private constructor(builder: Builder) {
    /**
     * The ID of the AMI that is being stored.
     */
    public val amiId: kotlin.String? = builder.amiId
    /**
     * The name of the Amazon S3 bucket that contains the stored AMI object.
     */
    public val bucket: kotlin.String? = builder.bucket
    /**
     * The progress of the task as a percentage.
     */
    public val progressPercentage: kotlin.Int? = builder.progressPercentage
    /**
     * The name of the stored AMI object in the bucket.
     */
    public val s3ObjectKey: kotlin.String? = builder.s3ObjectKey
    /**
     * If the tasks fails, the reason for the failure is returned. If the task succeeds, `null` is returned.
     */
    public val storeTaskFailureReason: kotlin.String? = builder.storeTaskFailureReason
    /**
     * The state of the store task (`InProgress`, `Completed`, or `Failed`).
     */
    public val storeTaskState: kotlin.String? = builder.storeTaskState
    /**
     * The time the task started.
     */
    public val taskStartTime: aws.smithy.kotlin.runtime.time.Instant? = builder.taskStartTime

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.StoreImageTaskResult = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("StoreImageTaskResult(")
        append("amiId=$amiId,")
        append("bucket=$bucket,")
        append("progressPercentage=$progressPercentage,")
        append("s3ObjectKey=$s3ObjectKey,")
        append("storeTaskFailureReason=$storeTaskFailureReason,")
        append("storeTaskState=$storeTaskState,")
        append("taskStartTime=$taskStartTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amiId?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (progressPercentage ?: 0)
        result = 31 * result + (s3ObjectKey?.hashCode() ?: 0)
        result = 31 * result + (storeTaskFailureReason?.hashCode() ?: 0)
        result = 31 * result + (storeTaskState?.hashCode() ?: 0)
        result = 31 * result + (taskStartTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as StoreImageTaskResult

        if (amiId != other.amiId) return false
        if (bucket != other.bucket) return false
        if (progressPercentage != other.progressPercentage) return false
        if (s3ObjectKey != other.s3ObjectKey) return false
        if (storeTaskFailureReason != other.storeTaskFailureReason) return false
        if (storeTaskState != other.storeTaskState) return false
        if (taskStartTime != other.taskStartTime) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.StoreImageTaskResult = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the AMI that is being stored.
         */
        public var amiId: kotlin.String? = null
        /**
         * The name of the Amazon S3 bucket that contains the stored AMI object.
         */
        public var bucket: kotlin.String? = null
        /**
         * The progress of the task as a percentage.
         */
        public var progressPercentage: kotlin.Int? = null
        /**
         * The name of the stored AMI object in the bucket.
         */
        public var s3ObjectKey: kotlin.String? = null
        /**
         * If the tasks fails, the reason for the failure is returned. If the task succeeds, `null` is returned.
         */
        public var storeTaskFailureReason: kotlin.String? = null
        /**
         * The state of the store task (`InProgress`, `Completed`, or `Failed`).
         */
        public var storeTaskState: kotlin.String? = null
        /**
         * The time the task started.
         */
        public var taskStartTime: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.StoreImageTaskResult) : this() {
            this.amiId = x.amiId
            this.bucket = x.bucket
            this.progressPercentage = x.progressPercentage
            this.s3ObjectKey = x.s3ObjectKey
            this.storeTaskFailureReason = x.storeTaskFailureReason
            this.storeTaskState = x.storeTaskState
            this.taskStartTime = x.taskStartTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.StoreImageTaskResult = StoreImageTaskResult(this)
    }
}
