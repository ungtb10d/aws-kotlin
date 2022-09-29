// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Indicates whether the instance is enabled for Amazon Web Services Nitro Enclaves.
 */
public class LaunchTemplateEnclaveOptions private constructor(builder: Builder) {
    /**
     * If this parameter is set to `true`, the instance is enabled for Amazon Web Services Nitro Enclaves; otherwise, it is not enabled for Amazon Web Services Nitro Enclaves.
     */
    public val enabled: kotlin.Boolean? = builder.enabled

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEnclaveOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateEnclaveOptions(")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateEnclaveOptions

        if (enabled != other.enabled) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEnclaveOptions = Builder(this).apply(block).build()

    public class Builder {
        /**
         * If this parameter is set to `true`, the instance is enabled for Amazon Web Services Nitro Enclaves; otherwise, it is not enabled for Amazon Web Services Nitro Enclaves.
         */
        public var enabled: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateEnclaveOptions) : this() {
            this.enabled = x.enabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEnclaveOptions = LaunchTemplateEnclaveOptions(this)
    }
}
