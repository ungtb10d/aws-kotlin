// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyLaunchTemplateResponse private constructor(builder: Builder) {
    /**
     * Information about the launch template.
     */
    public val launchTemplate: aws.sdk.kotlin.services.ec2.model.LaunchTemplate? = builder.launchTemplate

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyLaunchTemplateResponse(")
        append("launchTemplate=$launchTemplate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplate?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyLaunchTemplateResponse

        if (launchTemplate != other.launchTemplate) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the launch template.
         */
        public var launchTemplate: aws.sdk.kotlin.services.ec2.model.LaunchTemplate? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse) : this() {
            this.launchTemplate = x.launchTemplate
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = ModifyLaunchTemplateResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchTemplate] inside the given [block]
         */
        public fun launchTemplate(block: aws.sdk.kotlin.services.ec2.model.LaunchTemplate.Builder.() -> kotlin.Unit) {
            this.launchTemplate = aws.sdk.kotlin.services.ec2.model.LaunchTemplate.invoke(block)
        }
    }
}
