// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateReplaceRootVolumeTaskResponse private constructor(builder: Builder) {
    /**
     * Information about the root volume replacement task.
     */
    val replaceRootVolumeTask: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask? = builder.replaceRootVolumeTask

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateReplaceRootVolumeTaskResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateReplaceRootVolumeTaskResponse(")
        append("replaceRootVolumeTask=$replaceRootVolumeTask)")
    }

    override fun hashCode(): kotlin.Int {
        var result = replaceRootVolumeTask?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateReplaceRootVolumeTaskResponse

        if (replaceRootVolumeTask != other.replaceRootVolumeTask) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateReplaceRootVolumeTaskResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the root volume replacement task.
         */
        var replaceRootVolumeTask: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateReplaceRootVolumeTaskResponse) : this() {
            this.replaceRootVolumeTask = x.replaceRootVolumeTask
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateReplaceRootVolumeTaskResponse = CreateReplaceRootVolumeTaskResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask] inside the given [block]
         */
        fun replaceRootVolumeTask(block: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask.Builder.() -> kotlin.Unit) {
            this.replaceRootVolumeTask = aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask.invoke(block)
        }
    }
}