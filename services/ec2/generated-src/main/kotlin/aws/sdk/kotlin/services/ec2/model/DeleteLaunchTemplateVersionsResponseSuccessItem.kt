// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a launch template version that was successfully deleted.
 */
public class DeleteLaunchTemplateVersionsResponseSuccessItem private constructor(builder: Builder) {
    /**
     * The ID of the launch template.
     */
    public val launchTemplateId: kotlin.String? = builder.launchTemplateId
    /**
     * The name of the launch template.
     */
    public val launchTemplateName: kotlin.String? = builder.launchTemplateName
    /**
     * The version number of the launch template.
     */
    public val versionNumber: kotlin.Long? = builder.versionNumber

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteLaunchTemplateVersionsResponseSuccessItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteLaunchTemplateVersionsResponseSuccessItem(")
        append("launchTemplateId=$launchTemplateId,")
        append("launchTemplateName=$launchTemplateName,")
        append("versionNumber=$versionNumber)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplateId?.hashCode() ?: 0
        result = 31 * result + (launchTemplateName?.hashCode() ?: 0)
        result = 31 * result + (versionNumber?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteLaunchTemplateVersionsResponseSuccessItem

        if (launchTemplateId != other.launchTemplateId) return false
        if (launchTemplateName != other.launchTemplateName) return false
        if (versionNumber != other.versionNumber) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteLaunchTemplateVersionsResponseSuccessItem = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the launch template.
         */
        public var launchTemplateId: kotlin.String? = null
        /**
         * The name of the launch template.
         */
        public var launchTemplateName: kotlin.String? = null
        /**
         * The version number of the launch template.
         */
        public var versionNumber: kotlin.Long? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteLaunchTemplateVersionsResponseSuccessItem) : this() {
            this.launchTemplateId = x.launchTemplateId
            this.launchTemplateName = x.launchTemplateName
            this.versionNumber = x.versionNumber
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteLaunchTemplateVersionsResponseSuccessItem = DeleteLaunchTemplateVersionsResponseSuccessItem(this)
    }
}
