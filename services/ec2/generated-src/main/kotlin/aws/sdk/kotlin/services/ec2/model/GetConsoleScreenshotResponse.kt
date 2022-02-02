// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetConsoleScreenshotResponse private constructor(builder: Builder) {
    /**
     * The data that comprises the image.
     */
    val imageData: kotlin.String? = builder.imageData
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetConsoleScreenshotResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetConsoleScreenshotResponse(")
        append("imageData=$imageData,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = imageData?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetConsoleScreenshotResponse

        if (imageData != other.imageData) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetConsoleScreenshotResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The data that comprises the image.
         */
        var imageData: kotlin.String? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetConsoleScreenshotResponse) : this() {
            this.imageData = x.imageData
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetConsoleScreenshotResponse = GetConsoleScreenshotResponse(this)
    }
}