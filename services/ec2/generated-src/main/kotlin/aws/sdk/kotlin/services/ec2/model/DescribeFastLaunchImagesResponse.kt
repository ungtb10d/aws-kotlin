// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeFastLaunchImagesResponse private constructor(builder: Builder) {
    /**
     * A collection of details about the fast-launch enabled Windows images that meet
     * the requested criteria.
     */
    val fastLaunchImages: List<DescribeFastLaunchImagesSuccessItem>? = builder.fastLaunchImages
    /**
     * The token to use for the next set of results. This value is null when there are
     * no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFastLaunchImagesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFastLaunchImagesResponse(")
        append("fastLaunchImages=$fastLaunchImages,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = fastLaunchImages?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFastLaunchImagesResponse

        if (fastLaunchImages != other.fastLaunchImages) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFastLaunchImagesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * A collection of details about the fast-launch enabled Windows images that meet
         * the requested criteria.
         */
        var fastLaunchImages: List<DescribeFastLaunchImagesSuccessItem>? = null
        /**
         * The token to use for the next set of results. This value is null when there are
         * no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFastLaunchImagesResponse) : this() {
            this.fastLaunchImages = x.fastLaunchImages
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFastLaunchImagesResponse = DescribeFastLaunchImagesResponse(this)
    }
}