// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeNetworkInterfacePermissions.
 */
public class DescribeNetworkInterfacePermissionsRequest private constructor(builder: Builder) {
    /**
     * One or more filters.
     * + `network-interface-permission.network-interface-permission-id` - The ID of the permission.
     * + `network-interface-permission.network-interface-id` - The ID of the network interface.
     * + `network-interface-permission.aws-account-id` - The Amazon Web Services account ID.
     * + `network-interface-permission.aws-service` - The Amazon Web Service.
     * + `network-interface-permission.permission` - The type of permission (`INSTANCE-ATTACH` | `EIP-ASSOCIATE`).
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned `NextToken` value. If this parameter is not specified, up to 50 results are returned by default.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The network interface permission IDs.
     */
    public val networkInterfacePermissionIds: List<String>? = builder.networkInterfacePermissionIds
    /**
     * The token to request the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfacePermissionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkInterfacePermissionsRequest(")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("networkInterfacePermissionIds=$networkInterfacePermissionIds,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = filters?.hashCode() ?: 0
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (networkInterfacePermissionIds?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkInterfacePermissionsRequest

        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (networkInterfacePermissionIds != other.networkInterfacePermissionIds) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfacePermissionsRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * One or more filters.
         * + `network-interface-permission.network-interface-permission-id` - The ID of the permission.
         * + `network-interface-permission.network-interface-id` - The ID of the network interface.
         * + `network-interface-permission.aws-account-id` - The Amazon Web Services account ID.
         * + `network-interface-permission.aws-service` - The Amazon Web Service.
         * + `network-interface-permission.permission` - The type of permission (`INSTANCE-ATTACH` | `EIP-ASSOCIATE`).
         */
        public var filters: List<Filter>? = null
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned `NextToken` value. If this parameter is not specified, up to 50 results are returned by default.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * The network interface permission IDs.
         */
        public var networkInterfacePermissionIds: List<String>? = null
        /**
         * The token to request the next page of results.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfacePermissionsRequest) : this() {
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.networkInterfacePermissionIds = x.networkInterfacePermissionIds
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfacePermissionsRequest = DescribeNetworkInterfacePermissionsRequest(this)
    }
}
