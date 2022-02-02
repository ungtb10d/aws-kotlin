// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ImportVolumeResponse private constructor(builder: Builder) {
    /**
     * Information about the conversion task.
     */
    val conversionTask: aws.sdk.kotlin.services.ec2.model.ConversionTask? = builder.conversionTask

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportVolumeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportVolumeResponse(")
        append("conversionTask=$conversionTask)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conversionTask?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportVolumeResponse

        if (conversionTask != other.conversionTask) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportVolumeResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the conversion task.
         */
        var conversionTask: aws.sdk.kotlin.services.ec2.model.ConversionTask? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportVolumeResponse) : this() {
            this.conversionTask = x.conversionTask
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportVolumeResponse = ImportVolumeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ConversionTask] inside the given [block]
         */
        fun conversionTask(block: aws.sdk.kotlin.services.ec2.model.ConversionTask.Builder.() -> kotlin.Unit) {
            this.conversionTask = aws.sdk.kotlin.services.ec2.model.ConversionTask.invoke(block)
        }
    }
}