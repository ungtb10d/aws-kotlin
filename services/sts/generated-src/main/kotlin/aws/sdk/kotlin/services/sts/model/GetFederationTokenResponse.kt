// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



/**
 * Contains the response to a successful GetFederationToken request, including temporary Amazon Web Services credentials that can be used to make Amazon Web Services requests.
 */
public class GetFederationTokenResponse private constructor(builder: Builder) {
    /**
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.
     *
     * The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size.
     */
    public val credentials: aws.sdk.kotlin.services.sts.model.Credentials? = builder.credentials
    /**
     * Identifiers for the federated user associated with the credentials (such as `arn:aws:sts::123456789012:federated-user/Bob` or `123456789012:Bob`). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy.
     */
    public val federatedUser: aws.sdk.kotlin.services.sts.model.FederatedUser? = builder.federatedUser
    /**
     * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
     */
    public val packedPolicySize: kotlin.Int? = builder.packedPolicySize

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.GetFederationTokenResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetFederationTokenResponse(")
        append("credentials=$credentials,")
        append("federatedUser=$federatedUser,")
        append("packedPolicySize=$packedPolicySize)")
    }

    override fun hashCode(): kotlin.Int {
        var result = credentials?.hashCode() ?: 0
        result = 31 * result + (federatedUser?.hashCode() ?: 0)
        result = 31 * result + (packedPolicySize ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetFederationTokenResponse

        if (credentials != other.credentials) return false
        if (federatedUser != other.federatedUser) return false
        if (packedPolicySize != other.packedPolicySize) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.GetFederationTokenResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.
         *
         * The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size.
         */
        public var credentials: aws.sdk.kotlin.services.sts.model.Credentials? = null
        /**
         * Identifiers for the federated user associated with the credentials (such as `arn:aws:sts::123456789012:federated-user/Bob` or `123456789012:Bob`). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy.
         */
        public var federatedUser: aws.sdk.kotlin.services.sts.model.FederatedUser? = null
        /**
         * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
         */
        public var packedPolicySize: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.GetFederationTokenResponse) : this() {
            this.credentials = x.credentials
            this.federatedUser = x.federatedUser
            this.packedPolicySize = x.packedPolicySize
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.GetFederationTokenResponse = GetFederationTokenResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.sts.model.Credentials] inside the given [block]
         */
        public fun credentials(block: aws.sdk.kotlin.services.sts.model.Credentials.Builder.() -> kotlin.Unit) {
            this.credentials = aws.sdk.kotlin.services.sts.model.Credentials.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.sts.model.FederatedUser] inside the given [block]
         */
        public fun federatedUser(block: aws.sdk.kotlin.services.sts.model.FederatedUser.Builder.() -> kotlin.Unit) {
            this.federatedUser = aws.sdk.kotlin.services.sts.model.FederatedUser.invoke(block)
        }
    }
}
