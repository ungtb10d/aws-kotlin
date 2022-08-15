// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for AssignPrivateIpAddresses.
 */
public class AssignPrivateIpAddressesRequest private constructor(builder: Builder) {
    /**
     * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
     */
    public val allowReassignment: kotlin.Boolean? = builder.allowReassignment
    /**
     * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot use this option if you use the `Ipv4 Prefixes` option.
     */
    public val ipv4PrefixCount: kotlin.Int? = builder.ipv4PrefixCount
    /**
     * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the `Ipv4PrefixCount` option.
     */
    public val ipv4Prefixes: List<String>? = builder.ipv4Prefixes
    /**
     * The ID of the network interface.
     */
    public val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses.
     *
     * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
     */
    public val privateIpAddresses: List<String>? = builder.privateIpAddresses
    /**
     * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
     */
    public val secondaryPrivateIpAddressCount: kotlin.Int? = builder.secondaryPrivateIpAddressCount

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssignPrivateIpAddressesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssignPrivateIpAddressesRequest(")
        append("allowReassignment=$allowReassignment,")
        append("ipv4PrefixCount=$ipv4PrefixCount,")
        append("ipv4Prefixes=$ipv4Prefixes,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("privateIpAddresses=$privateIpAddresses,")
        append("secondaryPrivateIpAddressCount=$secondaryPrivateIpAddressCount)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allowReassignment?.hashCode() ?: 0
        result = 31 * result + (ipv4PrefixCount ?: 0)
        result = 31 * result + (ipv4Prefixes?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddresses?.hashCode() ?: 0)
        result = 31 * result + (secondaryPrivateIpAddressCount ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssignPrivateIpAddressesRequest

        if (allowReassignment != other.allowReassignment) return false
        if (ipv4PrefixCount != other.ipv4PrefixCount) return false
        if (ipv4Prefixes != other.ipv4Prefixes) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (privateIpAddresses != other.privateIpAddresses) return false
        if (secondaryPrivateIpAddressCount != other.secondaryPrivateIpAddressCount) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssignPrivateIpAddressesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
         */
        public var allowReassignment: kotlin.Boolean? = null
        /**
         * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot use this option if you use the `Ipv4 Prefixes` option.
         */
        public var ipv4PrefixCount: kotlin.Int? = null
        /**
         * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the `Ipv4PrefixCount` option.
         */
        public var ipv4Prefixes: List<String>? = null
        /**
         * The ID of the network interface.
         */
        public var networkInterfaceId: kotlin.String? = null
        /**
         * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses.
         *
         * If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
         */
        public var privateIpAddresses: List<String>? = null
        /**
         * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
         */
        public var secondaryPrivateIpAddressCount: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssignPrivateIpAddressesRequest) : this() {
            this.allowReassignment = x.allowReassignment
            this.ipv4PrefixCount = x.ipv4PrefixCount
            this.ipv4Prefixes = x.ipv4Prefixes
            this.networkInterfaceId = x.networkInterfaceId
            this.privateIpAddresses = x.privateIpAddresses
            this.secondaryPrivateIpAddressCount = x.secondaryPrivateIpAddressCount
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssignPrivateIpAddressesRequest = AssignPrivateIpAddressesRequest(this)
    }
}
