// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The response information for license configurations.
 */
class ImportImageLicenseConfigurationResponse private constructor(builder: Builder) {
    /**
     * The ARN of a license configuration.
     */
    val licenseConfigurationArn: kotlin.String? = builder.licenseConfigurationArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportImageLicenseConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportImageLicenseConfigurationResponse(")
        append("licenseConfigurationArn=$licenseConfigurationArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = licenseConfigurationArn?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportImageLicenseConfigurationResponse

        if (licenseConfigurationArn != other.licenseConfigurationArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportImageLicenseConfigurationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of a license configuration.
         */
        var licenseConfigurationArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportImageLicenseConfigurationResponse) : this() {
            this.licenseConfigurationArn = x.licenseConfigurationArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportImageLicenseConfigurationResponse = ImportImageLicenseConfigurationResponse(this)
    }
}