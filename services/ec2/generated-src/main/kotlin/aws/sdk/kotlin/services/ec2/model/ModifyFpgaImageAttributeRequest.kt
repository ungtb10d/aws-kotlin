// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyFpgaImageAttributeRequest private constructor(builder: Builder) {
    /**
     * The name of the attribute.
     */
    public val attribute: aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName? = builder.attribute
    /**
     * A description for the AFI.
     */
    public val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the AFI.
     */
    public val fpgaImageId: kotlin.String? = builder.fpgaImageId
    /**
     * The load permission for the AFI.
     */
    public val loadPermission: aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications? = builder.loadPermission
    /**
     * A name for the AFI.
     */
    public val name: kotlin.String? = builder.name
    /**
     * The operation type.
     */
    public val operationType: aws.sdk.kotlin.services.ec2.model.OperationType? = builder.operationType
    /**
     * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the `productCodes` attribute.
     */
    public val productCodes: List<String>? = builder.productCodes
    /**
     * The user groups. This parameter is valid only when modifying the `loadPermission` attribute.
     */
    public val userGroups: List<String>? = builder.userGroups
    /**
     * The Amazon Web Services account IDs. This parameter is valid only when modifying the `loadPermission` attribute.
     */
    public val userIds: List<String>? = builder.userIds

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyFpgaImageAttributeRequest(")
        append("attribute=$attribute,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("fpgaImageId=$fpgaImageId,")
        append("loadPermission=$loadPermission,")
        append("name=$name,")
        append("operationType=$operationType,")
        append("productCodes=$productCodes,")
        append("userGroups=$userGroups,")
        append("userIds=$userIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageId?.hashCode() ?: 0)
        result = 31 * result + (loadPermission?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (operationType?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (userGroups?.hashCode() ?: 0)
        result = 31 * result + (userIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyFpgaImageAttributeRequest

        if (attribute != other.attribute) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (fpgaImageId != other.fpgaImageId) return false
        if (loadPermission != other.loadPermission) return false
        if (name != other.name) return false
        if (operationType != other.operationType) return false
        if (productCodes != other.productCodes) return false
        if (userGroups != other.userGroups) return false
        if (userIds != other.userIds) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of the attribute.
         */
        public var attribute: aws.sdk.kotlin.services.ec2.model.FpgaImageAttributeName? = null
        /**
         * A description for the AFI.
         */
        public var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the AFI.
         */
        public var fpgaImageId: kotlin.String? = null
        /**
         * The load permission for the AFI.
         */
        public var loadPermission: aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications? = null
        /**
         * A name for the AFI.
         */
        public var name: kotlin.String? = null
        /**
         * The operation type.
         */
        public var operationType: aws.sdk.kotlin.services.ec2.model.OperationType? = null
        /**
         * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the `productCodes` attribute.
         */
        public var productCodes: List<String>? = null
        /**
         * The user groups. This parameter is valid only when modifying the `loadPermission` attribute.
         */
        public var userGroups: List<String>? = null
        /**
         * The Amazon Web Services account IDs. This parameter is valid only when modifying the `loadPermission` attribute.
         */
        public var userIds: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeRequest) : this() {
            this.attribute = x.attribute
            this.description = x.description
            this.dryRun = x.dryRun
            this.fpgaImageId = x.fpgaImageId
            this.loadPermission = x.loadPermission
            this.name = x.name
            this.operationType = x.operationType
            this.productCodes = x.productCodes
            this.userGroups = x.userGroups
            this.userIds = x.userIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyFpgaImageAttributeRequest = ModifyFpgaImageAttributeRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications] inside the given [block]
         */
        public fun loadPermission(block: aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications.Builder.() -> kotlin.Unit) {
            this.loadPermission = aws.sdk.kotlin.services.ec2.model.LoadPermissionModifications.invoke(block)
        }
    }
}
