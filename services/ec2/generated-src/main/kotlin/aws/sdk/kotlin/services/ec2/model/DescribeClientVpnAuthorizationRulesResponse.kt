// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeClientVpnAuthorizationRulesResponse private constructor(builder: Builder) {
    /**
     * Information about the authorization rules.
     */
    public val authorizationRules: List<AuthorizationRule>? = builder.authorizationRules
    /**
     * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnAuthorizationRulesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeClientVpnAuthorizationRulesResponse(")
        append("authorizationRules=$authorizationRules,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = authorizationRules?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeClientVpnAuthorizationRulesResponse

        if (authorizationRules != other.authorizationRules) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnAuthorizationRulesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the authorization rules.
         */
        public var authorizationRules: List<AuthorizationRule>? = null
        /**
         * The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeClientVpnAuthorizationRulesResponse) : this() {
            this.authorizationRules = x.authorizationRules
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeClientVpnAuthorizationRulesResponse = DescribeClientVpnAuthorizationRulesResponse(this)
    }
}
