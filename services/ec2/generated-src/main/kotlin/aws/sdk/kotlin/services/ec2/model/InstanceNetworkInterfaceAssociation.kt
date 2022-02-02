// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes association information for an Elastic IP address (IPv4).
 */
class InstanceNetworkInterfaceAssociation private constructor(builder: Builder) {
    /**
     * The carrier IP address associated with the network interface.
     */
    val carrierIp: kotlin.String? = builder.carrierIp
    /**
     * The customer-owned IP address associated with the network interface.
     */
    val customerOwnedIp: kotlin.String? = builder.customerOwnedIp
    /**
     * The ID of the owner of the Elastic IP address.
     */
    val ipOwnerId: kotlin.String? = builder.ipOwnerId
    /**
     * The public DNS name.
     */
    val publicDnsName: kotlin.String? = builder.publicDnsName
    /**
     * The public IP address or Elastic IP address bound to the network interface.
     */
    val publicIp: kotlin.String? = builder.publicIp

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceNetworkInterfaceAssociation(")
        append("carrierIp=$carrierIp,")
        append("customerOwnedIp=$customerOwnedIp,")
        append("ipOwnerId=$ipOwnerId,")
        append("publicDnsName=$publicDnsName,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = carrierIp?.hashCode() ?: 0
        result = 31 * result + (customerOwnedIp?.hashCode() ?: 0)
        result = 31 * result + (ipOwnerId?.hashCode() ?: 0)
        result = 31 * result + (publicDnsName?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceNetworkInterfaceAssociation

        if (carrierIp != other.carrierIp) return false
        if (customerOwnedIp != other.customerOwnedIp) return false
        if (ipOwnerId != other.ipOwnerId) return false
        if (publicDnsName != other.publicDnsName) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation = Builder(this).apply(block).build()

    class Builder {
        /**
         * The carrier IP address associated with the network interface.
         */
        var carrierIp: kotlin.String? = null
        /**
         * The customer-owned IP address associated with the network interface.
         */
        var customerOwnedIp: kotlin.String? = null
        /**
         * The ID of the owner of the Elastic IP address.
         */
        var ipOwnerId: kotlin.String? = null
        /**
         * The public DNS name.
         */
        var publicDnsName: kotlin.String? = null
        /**
         * The public IP address or Elastic IP address bound to the network interface.
         */
        var publicIp: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation) : this() {
            this.carrierIp = x.carrierIp
            this.customerOwnedIp = x.customerOwnedIp
            this.ipOwnerId = x.ipOwnerId
            this.publicDnsName = x.publicDnsName
            this.publicIp = x.publicIp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation = InstanceNetworkInterfaceAssociation(this)
    }
}