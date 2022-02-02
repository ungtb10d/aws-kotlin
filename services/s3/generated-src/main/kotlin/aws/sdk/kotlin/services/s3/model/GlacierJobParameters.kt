// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for S3 Glacier job parameters.
 */
class GlacierJobParameters private constructor(builder: Builder) {
    /**
     * Retrieval tier at which the restore will be processed.
     */
    val tier: aws.sdk.kotlin.services.s3.model.Tier? = builder.tier

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GlacierJobParameters = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GlacierJobParameters(")
        append("tier=$tier)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tier?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GlacierJobParameters

        if (tier != other.tier) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GlacierJobParameters = Builder(this).apply(block).build()

    class Builder {
        /**
         * Retrieval tier at which the restore will be processed.
         */
        var tier: aws.sdk.kotlin.services.s3.model.Tier? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GlacierJobParameters) : this() {
            this.tier = x.tier
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GlacierJobParameters = GlacierJobParameters(this)
    }
}