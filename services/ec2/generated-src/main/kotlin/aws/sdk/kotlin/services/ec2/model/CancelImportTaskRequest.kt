// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CancelImportTaskRequest private constructor(builder: Builder) {
    /**
     * The reason for canceling the task.
     */
    val cancelReason: kotlin.String? = builder.cancelReason
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the import image or import snapshot task to be canceled.
     */
    val importTaskId: kotlin.String? = builder.importTaskId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CancelImportTaskRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CancelImportTaskRequest(")
        append("cancelReason=$cancelReason,")
        append("dryRun=$dryRun,")
        append("importTaskId=$importTaskId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cancelReason?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (importTaskId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CancelImportTaskRequest

        if (cancelReason != other.cancelReason) return false
        if (dryRun != other.dryRun) return false
        if (importTaskId != other.importTaskId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CancelImportTaskRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The reason for canceling the task.
         */
        var cancelReason: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the import image or import snapshot task to be canceled.
         */
        var importTaskId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CancelImportTaskRequest) : this() {
            this.cancelReason = x.cancelReason
            this.dryRun = x.dryRun
            this.importTaskId = x.importTaskId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CancelImportTaskRequest = CancelImportTaskRequest(this)
    }
}