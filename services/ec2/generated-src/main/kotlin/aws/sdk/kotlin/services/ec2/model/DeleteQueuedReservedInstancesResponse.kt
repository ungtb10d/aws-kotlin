// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteQueuedReservedInstancesResponse private constructor(builder: Builder) {
    /**
     * Information about the queued purchases that could not be deleted.
     */
    public val failedQueuedPurchaseDeletions: List<FailedQueuedPurchaseDeletion>? = builder.failedQueuedPurchaseDeletions
    /**
     * Information about the queued purchases that were successfully deleted.
     */
    public val successfulQueuedPurchaseDeletions: List<SuccessfulQueuedPurchaseDeletion>? = builder.successfulQueuedPurchaseDeletions

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteQueuedReservedInstancesResponse(")
        append("failedQueuedPurchaseDeletions=$failedQueuedPurchaseDeletions,")
        append("successfulQueuedPurchaseDeletions=$successfulQueuedPurchaseDeletions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = failedQueuedPurchaseDeletions?.hashCode() ?: 0
        result = 31 * result + (successfulQueuedPurchaseDeletions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteQueuedReservedInstancesResponse

        if (failedQueuedPurchaseDeletions != other.failedQueuedPurchaseDeletions) return false
        if (successfulQueuedPurchaseDeletions != other.successfulQueuedPurchaseDeletions) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the queued purchases that could not be deleted.
         */
        public var failedQueuedPurchaseDeletions: List<FailedQueuedPurchaseDeletion>? = null
        /**
         * Information about the queued purchases that were successfully deleted.
         */
        public var successfulQueuedPurchaseDeletions: List<SuccessfulQueuedPurchaseDeletion>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesResponse) : this() {
            this.failedQueuedPurchaseDeletions = x.failedQueuedPurchaseDeletions
            this.successfulQueuedPurchaseDeletions = x.successfulQueuedPurchaseDeletions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesResponse = DeleteQueuedReservedInstancesResponse(this)
    }
}
