// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Details related to why an IPAM pool CIDR failed to be provisioned.
 */
public class IpamPoolCidrFailureReason private constructor(builder: Builder) {
    /**
     * An error code related to why an IPAM pool CIDR failed to be provisioned.
     */
    public val code: aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureCode? = builder.code
    /**
     * A message related to why an IPAM pool CIDR failed to be provisioned.
     */
    public val message: kotlin.String? = builder.message

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureReason = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IpamPoolCidrFailureReason(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IpamPoolCidrFailureReason

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureReason = Builder(this).apply(block).build()

    public class Builder {
        /**
         * An error code related to why an IPAM pool CIDR failed to be provisioned.
         */
        public var code: aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureCode? = null
        /**
         * A message related to why an IPAM pool CIDR failed to be provisioned.
         */
        public var message: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureReason) : this() {
            this.code = x.code
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureReason = IpamPoolCidrFailureReason(this)
    }
}
