// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the error for a Reserved Instance whose queued purchase could not be deleted.
 */
public class DeleteQueuedReservedInstancesError private constructor(builder: Builder) {
    /**
     * The error code.
     */
    public val code: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesErrorCode? = builder.code
    /**
     * The error message.
     */
    public val message: kotlin.String? = builder.message

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteQueuedReservedInstancesError(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteQueuedReservedInstancesError

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The error code.
         */
        public var code: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesErrorCode? = null
        /**
         * The error message.
         */
        public var message: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError) : this() {
            this.code = x.code
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError = DeleteQueuedReservedInstancesError(this)
    }
}
