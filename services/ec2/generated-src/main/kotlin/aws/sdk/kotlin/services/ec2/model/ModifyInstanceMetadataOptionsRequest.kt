// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyInstanceMetadataOptionsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is
     * DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Enables or disables the HTTP metadata endpoint on your instances. If
     * this parameter is not specified, the existing state is maintained.
     * If you specify a value of disabled, you cannot access your
     * instance metadata.
     */
    val httpEndpoint: aws.sdk.kotlin.services.ec2.model.InstanceMetadataEndpointState? = builder.httpEndpoint
    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service. This setting
     * applies only if you have enabled the HTTP metadata endpoint.
     */
    val httpProtocolIpv6: aws.sdk.kotlin.services.ec2.model.InstanceMetadataProtocolState? = builder.httpProtocolIpv6
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
     * number, the further instance metadata requests can travel. If no parameter is specified, the existing state is maintained.
     * Possible values: Integers from 1 to 64
     */
    val httpPutResponseHopLimit: kotlin.Int? = builder.httpPutResponseHopLimit
    /**
     * The state of token usage for your instance metadata requests. If the parameter is not
     * specified in the request, the default state is optional.
     * If the state is optional, you can choose to retrieve instance metadata
     * with or without a signed token header on your request. If you retrieve the IAM role
     * credentials without a token, the version 1.0 role credentials are returned. If you
     * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
     * credentials are returned.
     * If the state is required, you must send a signed token header with any
     * instance metadata retrieval requests. In this state, retrieving the IAM role credential
     * always returns the version 2.0 credentials; the version 1.0 credentials are not
     * available.
     */
    val httpTokens: aws.sdk.kotlin.services.ec2.model.HttpTokensState? = builder.httpTokens
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * Set to enabled to allow access to instance tags from the instance
     * metadata. Set to disabled to turn off access to instance tags from the
     * instance metadata. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
     * instance tags using the instance metadata.
     * Default: disabled
     */
    val instanceMetadataTags: aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState? = builder.instanceMetadataTags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstanceMetadataOptionsRequest(")
        append("dryRun=$dryRun,")
        append("httpEndpoint=$httpEndpoint,")
        append("httpProtocolIpv6=$httpProtocolIpv6,")
        append("httpPutResponseHopLimit=$httpPutResponseHopLimit,")
        append("httpTokens=$httpTokens,")
        append("instanceId=$instanceId,")
        append("instanceMetadataTags=$instanceMetadataTags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (httpEndpoint?.hashCode() ?: 0)
        result = 31 * result + (httpProtocolIpv6?.hashCode() ?: 0)
        result = 31 * result + (httpPutResponseHopLimit ?: 0)
        result = 31 * result + (httpTokens?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (instanceMetadataTags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyInstanceMetadataOptionsRequest

        if (dryRun != other.dryRun) return false
        if (httpEndpoint != other.httpEndpoint) return false
        if (httpProtocolIpv6 != other.httpProtocolIpv6) return false
        if (httpPutResponseHopLimit != other.httpPutResponseHopLimit) return false
        if (httpTokens != other.httpTokens) return false
        if (instanceId != other.instanceId) return false
        if (instanceMetadataTags != other.instanceMetadataTags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is
         * DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Enables or disables the HTTP metadata endpoint on your instances. If
         * this parameter is not specified, the existing state is maintained.
         * If you specify a value of disabled, you cannot access your
         * instance metadata.
         */
        var httpEndpoint: aws.sdk.kotlin.services.ec2.model.InstanceMetadataEndpointState? = null
        /**
         * Enables or disables the IPv6 endpoint for the instance metadata service. This setting
         * applies only if you have enabled the HTTP metadata endpoint.
         */
        var httpProtocolIpv6: aws.sdk.kotlin.services.ec2.model.InstanceMetadataProtocolState? = null
        /**
         * The desired HTTP PUT response hop limit for instance metadata requests. The larger the
         * number, the further instance metadata requests can travel. If no parameter is specified, the existing state is maintained.
         * Possible values: Integers from 1 to 64
         */
        var httpPutResponseHopLimit: kotlin.Int? = null
        /**
         * The state of token usage for your instance metadata requests. If the parameter is not
         * specified in the request, the default state is optional.
         * If the state is optional, you can choose to retrieve instance metadata
         * with or without a signed token header on your request. If you retrieve the IAM role
         * credentials without a token, the version 1.0 role credentials are returned. If you
         * retrieve the IAM role credentials using a valid signed token, the version 2.0 role
         * credentials are returned.
         * If the state is required, you must send a signed token header with any
         * instance metadata retrieval requests. In this state, retrieving the IAM role credential
         * always returns the version 2.0 credentials; the version 1.0 credentials are not
         * available.
         */
        var httpTokens: aws.sdk.kotlin.services.ec2.model.HttpTokensState? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * Set to enabled to allow access to instance tags from the instance
         * metadata. Set to disabled to turn off access to instance tags from the
         * instance metadata. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS">Work with
         * instance tags using the instance metadata.
         * Default: disabled
         */
        var instanceMetadataTags: aws.sdk.kotlin.services.ec2.model.InstanceMetadataTagsState? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsRequest) : this() {
            this.dryRun = x.dryRun
            this.httpEndpoint = x.httpEndpoint
            this.httpProtocolIpv6 = x.httpProtocolIpv6
            this.httpPutResponseHopLimit = x.httpPutResponseHopLimit
            this.httpTokens = x.httpTokens
            this.instanceId = x.instanceId
            this.instanceMetadataTags = x.instanceMetadataTags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsRequest = ModifyInstanceMetadataOptionsRequest(this)
    }
}