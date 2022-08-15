// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class AuthorizeSecurityGroupIngressRequest private constructor(builder: Builder) {
    /**
     * The IPv4 address range, in CIDR format. You can't specify this parameter when specifying a source security group. To specify an IPv6 address range, use a set of IP permissions.
     *
     * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
     */
    public val cidrIp: kotlin.String? = builder.cidrIp
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use `-1` to specify all types. If you specify all ICMP types, you must specify all codes.
     *
     * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
     */
    public val fromPort: kotlin.Int? = builder.fromPort
    /**
     * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
     */
    public val groupId: kotlin.String? = builder.groupId
    /**
     * &#91;EC2-Classic, default VPC&#93; The name of the security group. You must specify either the security group ID or the security group name in the request.
     */
    public val groupName: kotlin.String? = builder.groupName
    /**
     * The sets of IP permissions.
     */
    public val ipPermissions: List<IpPermission>? = builder.ipPermissions
    /**
     * The IP protocol name (`tcp`, `udp`, `icmp`) or number (see [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)). To specify `icmpv6`, use a set of IP permissions.
     *
     * &#91;VPC only&#93; Use `-1` to specify all protocols. If you specify `-1` or a protocol other than `tcp`, `udp`, or `icmp`, traffic on all ports is allowed, regardless of any ports you specify.
     *
     * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
     */
    public val ipProtocol: kotlin.String? = builder.ipProtocol
    /**
     * &#91;EC2-Classic, default VPC&#93; The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be in the same VPC.
     */
    public val sourceSecurityGroupName: kotlin.String? = builder.sourceSecurityGroupName
    /**
     * &#91;nondefault VPC&#93; The Amazon Web Services account ID for the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead.
     */
    public val sourceSecurityGroupOwnerId: kotlin.String? = builder.sourceSecurityGroupOwnerId
    /**
     * &#91;VPC Only&#93; The tags applied to the security group rule.
     */
    public val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use `-1` to specify all codes. If you specify all ICMP types, you must specify all codes.
     *
     * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
     */
    public val toPort: kotlin.Int? = builder.toPort

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AuthorizeSecurityGroupIngressRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AuthorizeSecurityGroupIngressRequest(")
        append("cidrIp=$cidrIp,")
        append("dryRun=$dryRun,")
        append("fromPort=$fromPort,")
        append("groupId=$groupId,")
        append("groupName=$groupName,")
        append("ipPermissions=$ipPermissions,")
        append("ipProtocol=$ipProtocol,")
        append("sourceSecurityGroupName=$sourceSecurityGroupName,")
        append("sourceSecurityGroupOwnerId=$sourceSecurityGroupOwnerId,")
        append("tagSpecifications=$tagSpecifications,")
        append("toPort=$toPort)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrIp?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (fromPort ?: 0)
        result = 31 * result + (groupId?.hashCode() ?: 0)
        result = 31 * result + (groupName?.hashCode() ?: 0)
        result = 31 * result + (ipPermissions?.hashCode() ?: 0)
        result = 31 * result + (ipProtocol?.hashCode() ?: 0)
        result = 31 * result + (sourceSecurityGroupName?.hashCode() ?: 0)
        result = 31 * result + (sourceSecurityGroupOwnerId?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (toPort ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AuthorizeSecurityGroupIngressRequest

        if (cidrIp != other.cidrIp) return false
        if (dryRun != other.dryRun) return false
        if (fromPort != other.fromPort) return false
        if (groupId != other.groupId) return false
        if (groupName != other.groupName) return false
        if (ipPermissions != other.ipPermissions) return false
        if (ipProtocol != other.ipProtocol) return false
        if (sourceSecurityGroupName != other.sourceSecurityGroupName) return false
        if (sourceSecurityGroupOwnerId != other.sourceSecurityGroupOwnerId) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (toPort != other.toPort) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AuthorizeSecurityGroupIngressRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The IPv4 address range, in CIDR format. You can't specify this parameter when specifying a source security group. To specify an IPv6 address range, use a set of IP permissions.
         *
         * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
         */
        public var cidrIp: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use `-1` to specify all types. If you specify all ICMP types, you must specify all codes.
         *
         * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
         */
        public var fromPort: kotlin.Int? = null
        /**
         * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
         */
        public var groupId: kotlin.String? = null
        /**
         * &#91;EC2-Classic, default VPC&#93; The name of the security group. You must specify either the security group ID or the security group name in the request.
         */
        public var groupName: kotlin.String? = null
        /**
         * The sets of IP permissions.
         */
        public var ipPermissions: List<IpPermission>? = null
        /**
         * The IP protocol name (`tcp`, `udp`, `icmp`) or number (see [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)). To specify `icmpv6`, use a set of IP permissions.
         *
         * &#91;VPC only&#93; Use `-1` to specify all protocols. If you specify `-1` or a protocol other than `tcp`, `udp`, or `icmp`, traffic on all ports is allowed, regardless of any ports you specify.
         *
         * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
         */
        public var ipProtocol: kotlin.String? = null
        /**
         * &#91;EC2-Classic, default VPC&#93; The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be in the same VPC.
         */
        public var sourceSecurityGroupName: kotlin.String? = null
        /**
         * &#91;nondefault VPC&#93; The Amazon Web Services account ID for the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead.
         */
        public var sourceSecurityGroupOwnerId: kotlin.String? = null
        /**
         * &#91;VPC Only&#93; The tags applied to the security group rule.
         */
        public var tagSpecifications: List<TagSpecification>? = null
        /**
         * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use `-1` to specify all codes. If you specify all ICMP types, you must specify all codes.
         *
         * Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
         */
        public var toPort: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AuthorizeSecurityGroupIngressRequest) : this() {
            this.cidrIp = x.cidrIp
            this.dryRun = x.dryRun
            this.fromPort = x.fromPort
            this.groupId = x.groupId
            this.groupName = x.groupName
            this.ipPermissions = x.ipPermissions
            this.ipProtocol = x.ipProtocol
            this.sourceSecurityGroupName = x.sourceSecurityGroupName
            this.sourceSecurityGroupOwnerId = x.sourceSecurityGroupOwnerId
            this.tagSpecifications = x.tagSpecifications
            this.toPort = x.toPort
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AuthorizeSecurityGroupIngressRequest = AuthorizeSecurityGroupIngressRequest(this)
    }
}
