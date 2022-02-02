// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



/**
 * Identifiers for the federated user that is associated with the credentials.
 */
class FederatedUser private constructor(builder: Builder) {
    /**
     * The ARN that specifies the federated user that is associated with the credentials. For
     * more information about ARNs and how to use them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
     * Identifiers in the IAM User Guide.
     */
    val arn: kotlin.String? = builder.arn
    /**
     * The string that identifies the federated user associated with the credentials, similar
     * to the unique ID of an IAM user.
     */
    val federatedUserId: kotlin.String? = builder.federatedUserId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.FederatedUser = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FederatedUser(")
        append("arn=$arn,")
        append("federatedUserId=$federatedUserId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = arn?.hashCode() ?: 0
        result = 31 * result + (federatedUserId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FederatedUser

        if (arn != other.arn) return false
        if (federatedUserId != other.federatedUserId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.FederatedUser = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN that specifies the federated user that is associated with the credentials. For
         * more information about ARNs and how to use them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
         * Identifiers in the IAM User Guide.
         */
        var arn: kotlin.String? = null
        /**
         * The string that identifies the federated user associated with the credentials, similar
         * to the unique ID of an IAM user.
         */
        var federatedUserId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.FederatedUser) : this() {
            this.arn = x.arn
            this.federatedUserId = x.federatedUserId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.FederatedUser = FederatedUser(this)
    }
}