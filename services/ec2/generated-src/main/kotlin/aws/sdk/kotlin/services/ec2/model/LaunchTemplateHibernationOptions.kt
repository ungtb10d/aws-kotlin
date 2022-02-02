// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Indicates whether an instance is configured for hibernation.
 */
class LaunchTemplateHibernationOptions private constructor(builder: Builder) {
    /**
     * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
     */
    val configured: kotlin.Boolean? = builder.configured

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateHibernationOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateHibernationOptions(")
        append("configured=$configured)")
    }

    override fun hashCode(): kotlin.Int {
        var result = configured?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateHibernationOptions

        if (configured != other.configured) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateHibernationOptions = Builder(this).apply(block).build()

    class Builder {
        /**
         * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
         */
        var configured: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateHibernationOptions) : this() {
            this.configured = x.configured
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateHibernationOptions = LaunchTemplateHibernationOptions(this)
    }
}