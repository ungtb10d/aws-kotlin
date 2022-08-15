// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for specifying the notification configuration of the bucket. If this element is empty, notifications are turned off for the bucket.
 */
public class GetBucketNotificationConfigurationResponse private constructor(builder: Builder) {
    /**
     * Enables delivery of events to Amazon EventBridge.
     */
    public val eventBridgeConfiguration: aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration? = builder.eventBridgeConfiguration
    /**
     * Describes the Lambda functions to invoke and the events for which to invoke them.
     */
    public val lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>? = builder.lambdaFunctionConfigurations
    /**
     * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
     */
    public val queueConfigurations: List<QueueConfiguration>? = builder.queueConfigurations
    /**
     * The topic to which notifications are sent and the events for which notifications are generated.
     */
    public val topicConfigurations: List<TopicConfiguration>? = builder.topicConfigurations

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketNotificationConfigurationResponse(")
        append("eventBridgeConfiguration=$eventBridgeConfiguration,")
        append("lambdaFunctionConfigurations=$lambdaFunctionConfigurations,")
        append("queueConfigurations=$queueConfigurations,")
        append("topicConfigurations=$topicConfigurations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eventBridgeConfiguration?.hashCode() ?: 0
        result = 31 * result + (lambdaFunctionConfigurations?.hashCode() ?: 0)
        result = 31 * result + (queueConfigurations?.hashCode() ?: 0)
        result = 31 * result + (topicConfigurations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketNotificationConfigurationResponse

        if (eventBridgeConfiguration != other.eventBridgeConfiguration) return false
        if (lambdaFunctionConfigurations != other.lambdaFunctionConfigurations) return false
        if (queueConfigurations != other.queueConfigurations) return false
        if (topicConfigurations != other.topicConfigurations) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Enables delivery of events to Amazon EventBridge.
         */
        public var eventBridgeConfiguration: aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration? = null
        /**
         * Describes the Lambda functions to invoke and the events for which to invoke them.
         */
        public var lambdaFunctionConfigurations: List<LambdaFunctionConfiguration>? = null
        /**
         * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
         */
        public var queueConfigurations: List<QueueConfiguration>? = null
        /**
         * The topic to which notifications are sent and the events for which notifications are generated.
         */
        public var topicConfigurations: List<TopicConfiguration>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationResponse) : this() {
            this.eventBridgeConfiguration = x.eventBridgeConfiguration
            this.lambdaFunctionConfigurations = x.lambdaFunctionConfigurations
            this.queueConfigurations = x.queueConfigurations
            this.topicConfigurations = x.topicConfigurations
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketNotificationConfigurationResponse = GetBucketNotificationConfigurationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration] inside the given [block]
         */
        public fun eventBridgeConfiguration(block: aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration.Builder.() -> kotlin.Unit) {
            this.eventBridgeConfiguration = aws.sdk.kotlin.services.s3.model.EventBridgeConfiguration.invoke(block)
        }
    }
}
