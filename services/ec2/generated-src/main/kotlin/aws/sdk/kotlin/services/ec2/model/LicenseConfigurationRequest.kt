// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a license configuration.
 */
public class LicenseConfigurationRequest private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the license configuration.
     */
    public val licenseConfigurationArn: kotlin.String? = builder.licenseConfigurationArn

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LicenseConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LicenseConfigurationRequest(")
        append("licenseConfigurationArn=$licenseConfigurationArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = licenseConfigurationArn?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LicenseConfigurationRequest

        if (licenseConfigurationArn != other.licenseConfigurationArn) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LicenseConfigurationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The Amazon Resource Name (ARN) of the license configuration.
         */
        public var licenseConfigurationArn: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LicenseConfigurationRequest) : this() {
            this.licenseConfigurationArn = x.licenseConfigurationArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LicenseConfigurationRequest = LicenseConfigurationRequest(this)
    }
}
