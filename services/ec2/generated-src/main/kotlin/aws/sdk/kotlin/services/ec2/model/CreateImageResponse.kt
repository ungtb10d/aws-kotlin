// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateImageResponse private constructor(builder: Builder) {
    /**
     * The ID of the new AMI.
     */
    val imageId: kotlin.String? = builder.imageId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateImageResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateImageResponse(")
        append("imageId=$imageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = imageId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateImageResponse

        if (imageId != other.imageId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateImageResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the new AMI.
         */
        var imageId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateImageResponse) : this() {
            this.imageId = x.imageId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateImageResponse = CreateImageResponse(this)
    }
}