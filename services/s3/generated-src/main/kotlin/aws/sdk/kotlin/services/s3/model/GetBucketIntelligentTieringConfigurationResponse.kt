// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class GetBucketIntelligentTieringConfigurationResponse private constructor(builder: Builder) {
    /**
     * Container for S3 Intelligent-Tiering configuration.
     */
    public val intelligentTieringConfiguration: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration? = builder.intelligentTieringConfiguration

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketIntelligentTieringConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketIntelligentTieringConfigurationResponse(")
        append("intelligentTieringConfiguration=$intelligentTieringConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = intelligentTieringConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketIntelligentTieringConfigurationResponse

        if (intelligentTieringConfiguration != other.intelligentTieringConfiguration) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketIntelligentTieringConfigurationResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Container for S3 Intelligent-Tiering configuration.
         */
        public var intelligentTieringConfiguration: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketIntelligentTieringConfigurationResponse) : this() {
            this.intelligentTieringConfiguration = x.intelligentTieringConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketIntelligentTieringConfigurationResponse = GetBucketIntelligentTieringConfigurationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration] inside the given [block]
         */
        public fun intelligentTieringConfiguration(block: aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration.Builder.() -> kotlin.Unit) {
            this.intelligentTieringConfiguration = aws.sdk.kotlin.services.s3.model.IntelligentTieringConfiguration.invoke(block)
        }
    }
}
