// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AssociateAddressRequest private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; The allocation ID. This is required for EC2-VPC.
     */
    public val allocationId: kotlin.String? = builder.allocationId
    /**
     * &#91;EC2-VPC&#93; For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already associated with an instance or network interface to be reassociated with the specified instance or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated with another resource.
     */
    public val allowReassociation: kotlin.Boolean? = builder.allowReassociation
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the instance. The instance must have exactly one attached network interface. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. For EC2-Classic, you must specify an instance ID and the instance must be in the running state.
     */
    public val instanceId: kotlin.String? = builder.instanceId
    /**
     * &#91;EC2-VPC&#93; The ID of the network interface. If the instance has more than one network interface, you must specify a network interface ID.
     *
     * For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both.
     */
    public val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * &#91;EC2-VPC&#93; The primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     */
    public val privateIpAddress: kotlin.String? = builder.privateIpAddress
    /**
     * &#91;EC2-Classic&#93; The Elastic IP address to associate with the instance. This is required for EC2-Classic.
     */
    public val publicIp: kotlin.String? = builder.publicIp

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateAddressRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateAddressRequest(")
        append("allocationId=$allocationId,")
        append("allowReassociation=$allowReassociation,")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("privateIpAddress=$privateIpAddress,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (allowReassociation?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateAddressRequest

        if (allocationId != other.allocationId) return false
        if (allowReassociation != other.allowReassociation) return false
        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (privateIpAddress != other.privateIpAddress) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateAddressRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * &#91;EC2-VPC&#93; The allocation ID. This is required for EC2-VPC.
         */
        public var allocationId: kotlin.String? = null
        /**
         * &#91;EC2-VPC&#93; For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already associated with an instance or network interface to be reassociated with the specified instance or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated with another resource.
         */
        public var allowReassociation: kotlin.Boolean? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the instance. The instance must have exactly one attached network interface. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. For EC2-Classic, you must specify an instance ID and the instance must be in the running state.
         */
        public var instanceId: kotlin.String? = null
        /**
         * &#91;EC2-VPC&#93; The ID of the network interface. If the instance has more than one network interface, you must specify a network interface ID.
         *
         * For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both.
         */
        public var networkInterfaceId: kotlin.String? = null
        /**
         * &#91;EC2-VPC&#93; The primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
         */
        public var privateIpAddress: kotlin.String? = null
        /**
         * &#91;EC2-Classic&#93; The Elastic IP address to associate with the instance. This is required for EC2-Classic.
         */
        public var publicIp: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateAddressRequest) : this() {
            this.allocationId = x.allocationId
            this.allowReassociation = x.allowReassociation
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
            this.networkInterfaceId = x.networkInterfaceId
            this.privateIpAddress = x.privateIpAddress
            this.publicIp = x.publicIp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateAddressRequest = AssociateAddressRequest(this)
    }
}
