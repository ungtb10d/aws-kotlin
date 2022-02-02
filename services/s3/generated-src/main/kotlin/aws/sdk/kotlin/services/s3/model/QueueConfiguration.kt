// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the configuration for publishing messages to an Amazon Simple Queue Service
 * (Amazon SQS) queue when Amazon S3 detects specified events.
 */
class QueueConfiguration private constructor(builder: Builder) {
    /**
     * A collection of bucket events for which to send notifications
     */
    val events: List<Event>? = builder.events
    /**
     * Specifies object key name filtering rules. For information about key name filtering, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Event Notifications in the Amazon S3 User Guide.
     */
    val filter: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter? = builder.filter
    /**
     * An optional unique identifier for configurations in a notification configuration. If you
     * don't provide one, Amazon S3 will assign an ID.
     */
    val id: kotlin.String? = builder.id
    /**
     * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message
     * when it detects events of the specified type.
     */
    val queueArn: kotlin.String? = builder.queueArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.QueueConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("QueueConfiguration(")
        append("events=$events,")
        append("filter=$filter,")
        append("id=$id,")
        append("queueArn=$queueArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = events?.hashCode() ?: 0
        result = 31 * result + (filter?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (queueArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as QueueConfiguration

        if (events != other.events) return false
        if (filter != other.filter) return false
        if (id != other.id) return false
        if (queueArn != other.queueArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.QueueConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * A collection of bucket events for which to send notifications
         */
        var events: List<Event>? = null
        /**
         * Specifies object key name filtering rules. For information about key name filtering, see
         * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
         * Event Notifications in the Amazon S3 User Guide.
         */
        var filter: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter? = null
        /**
         * An optional unique identifier for configurations in a notification configuration. If you
         * don't provide one, Amazon S3 will assign an ID.
         */
        var id: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message
         * when it detects events of the specified type.
         */
        var queueArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.QueueConfiguration) : this() {
            this.events = x.events
            this.filter = x.filter
            this.id = x.id
            this.queueArn = x.queueArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.QueueConfiguration = QueueConfiguration(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter] inside the given [block]
         */
        fun filter(block: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter.Builder.() -> kotlin.Unit) {
            this.filter = aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter.invoke(block)
        }
    }
}