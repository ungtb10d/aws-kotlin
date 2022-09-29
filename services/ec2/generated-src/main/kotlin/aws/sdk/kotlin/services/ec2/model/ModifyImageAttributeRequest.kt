// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for ModifyImageAttribute.
 */
public class ModifyImageAttributeRequest private constructor(builder: Builder) {
    /**
     * The name of the attribute to modify.
     *
     * Valid values: `description` | `launchPermission`
     */
    public val attribute: kotlin.String? = builder.attribute
    /**
     * A new description for the AMI.
     */
    public val description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the AMI.
     */
    public val imageId: kotlin.String? = builder.imageId
    /**
     * A new launch permission for the AMI.
     */
    public val launchPermission: aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications? = builder.launchPermission
    /**
     * The operation type. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
     */
    public val operationType: aws.sdk.kotlin.services.ec2.model.OperationType? = builder.operationType
    /**
     * The Amazon Resource Name (ARN) of an organization. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
     */
    public val organizationArns: List<String>? = builder.organizationArns
    /**
     * The Amazon Resource Name (ARN) of an organizational unit (OU). This parameter can be used only when the `Attribute` parameter is `launchPermission`.
     */
    public val organizationalUnitArns: List<String>? = builder.organizationalUnitArns
    /**
     * Not supported.
     */
    public val productCodes: List<String>? = builder.productCodes
    /**
     * The user groups. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
     */
    public val userGroups: List<String>? = builder.userGroups
    /**
     * The Amazon Web Services account IDs. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
     */
    public val userIds: List<String>? = builder.userIds
    /**
     * The value of the attribute being modified. This parameter can be used only when the `Attribute` parameter is `description`.
     */
    public val value: kotlin.String? = builder.value

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyImageAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyImageAttributeRequest(")
        append("attribute=$attribute,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("imageId=$imageId,")
        append("launchPermission=$launchPermission,")
        append("operationType=$operationType,")
        append("organizationArns=$organizationArns,")
        append("organizationalUnitArns=$organizationalUnitArns,")
        append("productCodes=$productCodes,")
        append("userGroups=$userGroups,")
        append("userIds=$userIds,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (launchPermission?.hashCode() ?: 0)
        result = 31 * result + (operationType?.hashCode() ?: 0)
        result = 31 * result + (organizationArns?.hashCode() ?: 0)
        result = 31 * result + (organizationalUnitArns?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (userGroups?.hashCode() ?: 0)
        result = 31 * result + (userIds?.hashCode() ?: 0)
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyImageAttributeRequest

        if (attribute != other.attribute) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (imageId != other.imageId) return false
        if (launchPermission != other.launchPermission) return false
        if (operationType != other.operationType) return false
        if (organizationArns != other.organizationArns) return false
        if (organizationalUnitArns != other.organizationalUnitArns) return false
        if (productCodes != other.productCodes) return false
        if (userGroups != other.userGroups) return false
        if (userIds != other.userIds) return false
        if (value != other.value) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyImageAttributeRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of the attribute to modify.
         *
         * Valid values: `description` | `launchPermission`
         */
        public var attribute: kotlin.String? = null
        /**
         * A new description for the AMI.
         */
        public var description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the AMI.
         */
        public var imageId: kotlin.String? = null
        /**
         * A new launch permission for the AMI.
         */
        public var launchPermission: aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications? = null
        /**
         * The operation type. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
         */
        public var operationType: aws.sdk.kotlin.services.ec2.model.OperationType? = null
        /**
         * The Amazon Resource Name (ARN) of an organization. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
         */
        public var organizationArns: List<String>? = null
        /**
         * The Amazon Resource Name (ARN) of an organizational unit (OU). This parameter can be used only when the `Attribute` parameter is `launchPermission`.
         */
        public var organizationalUnitArns: List<String>? = null
        /**
         * Not supported.
         */
        public var productCodes: List<String>? = null
        /**
         * The user groups. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
         */
        public var userGroups: List<String>? = null
        /**
         * The Amazon Web Services account IDs. This parameter can be used only when the `Attribute` parameter is `launchPermission`.
         */
        public var userIds: List<String>? = null
        /**
         * The value of the attribute being modified. This parameter can be used only when the `Attribute` parameter is `description`.
         */
        public var value: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyImageAttributeRequest) : this() {
            this.attribute = x.attribute
            this.description = x.description
            this.dryRun = x.dryRun
            this.imageId = x.imageId
            this.launchPermission = x.launchPermission
            this.operationType = x.operationType
            this.organizationArns = x.organizationArns
            this.organizationalUnitArns = x.organizationalUnitArns
            this.productCodes = x.productCodes
            this.userGroups = x.userGroups
            this.userIds = x.userIds
            this.value = x.value
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyImageAttributeRequest = ModifyImageAttributeRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun description(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.description = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications] inside the given [block]
         */
        public fun launchPermission(block: aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications.Builder.() -> kotlin.Unit) {
            this.launchPermission = aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications.invoke(block)
        }
    }
}
