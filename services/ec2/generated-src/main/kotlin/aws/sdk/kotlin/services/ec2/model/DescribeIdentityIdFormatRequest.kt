// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIdentityIdFormatRequest private constructor(builder: Builder) {
    /**
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     */
    val principalArn: kotlin.String? = builder.principalArn
    /**
     * The type of resource: bundle |
     * conversion-task | customer-gateway | dhcp-options |
     * elastic-ip-allocation | elastic-ip-association |
     * export-task | flow-log | image |
     * import-task | instance | internet-gateway |
     * network-acl | network-acl-association |
     * network-interface | network-interface-attachment |
     * prefix-list | reservation | route-table |
     * route-table-association | security-group |
     * snapshot | subnet |
     * subnet-cidr-block-association | volume | vpc
     * | vpc-cidr-block-association | vpc-endpoint |
     * vpc-peering-connection | vpn-connection | vpn-gateway
     */
    val resource: kotlin.String? = builder.resource

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeIdentityIdFormatRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIdentityIdFormatRequest(")
        append("principalArn=$principalArn,")
        append("resource=$resource)")
    }

    override fun hashCode(): kotlin.Int {
        var result = principalArn?.hashCode() ?: 0
        result = 31 * result + (resource?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeIdentityIdFormatRequest

        if (principalArn != other.principalArn) return false
        if (resource != other.resource) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeIdentityIdFormatRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
         */
        var principalArn: kotlin.String? = null
        /**
         * The type of resource: bundle |
         * conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | instance | internet-gateway |
         * network-acl | network-acl-association |
         * network-interface | network-interface-attachment |
         * prefix-list | reservation | route-table |
         * route-table-association | security-group |
         * snapshot | subnet |
         * subnet-cidr-block-association | volume | vpc
         * | vpc-cidr-block-association | vpc-endpoint |
         * vpc-peering-connection | vpn-connection | vpn-gateway
         */
        var resource: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeIdentityIdFormatRequest) : this() {
            this.principalArn = x.principalArn
            this.resource = x.resource
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeIdentityIdFormatRequest = DescribeIdentityIdFormatRequest(this)
    }
}