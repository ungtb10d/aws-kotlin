// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes the cross-origin access configuration for objects in an Amazon S3 bucket. For more information, see [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User Guide*.
 */
public class CorsConfiguration private constructor(builder: Builder) {
    /**
     * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
     */
    public val corsRules: List<CorsRule>? = builder.corsRules

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.CorsConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CorsConfiguration(")
        append("corsRules=$corsRules)")
    }

    override fun hashCode(): kotlin.Int {
        var result = corsRules?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CorsConfiguration

        if (corsRules != other.corsRules) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.CorsConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
         */
        public var corsRules: List<CorsRule>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.CorsConfiguration) : this() {
            this.corsRules = x.corsRules
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.CorsConfiguration = CorsConfiguration(this)
    }
}
