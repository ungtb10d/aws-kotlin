// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ProvisionIpamPoolCidrResponse private constructor(builder: Builder) {
    /**
     * Information about the provisioned CIDR.
     */
    val ipamPoolCidr: aws.sdk.kotlin.services.ec2.model.IpamPoolCidr? = builder.ipamPoolCidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ProvisionIpamPoolCidrResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ProvisionIpamPoolCidrResponse(")
        append("ipamPoolCidr=$ipamPoolCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipamPoolCidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ProvisionIpamPoolCidrResponse

        if (ipamPoolCidr != other.ipamPoolCidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ProvisionIpamPoolCidrResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the provisioned CIDR.
         */
        var ipamPoolCidr: aws.sdk.kotlin.services.ec2.model.IpamPoolCidr? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ProvisionIpamPoolCidrResponse) : this() {
            this.ipamPoolCidr = x.ipamPoolCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ProvisionIpamPoolCidrResponse = ProvisionIpamPoolCidrResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IpamPoolCidr] inside the given [block]
         */
        fun ipamPoolCidr(block: aws.sdk.kotlin.services.ec2.model.IpamPoolCidr.Builder.() -> kotlin.Unit) {
            this.ipamPoolCidr = aws.sdk.kotlin.services.ec2.model.IpamPoolCidr.invoke(block)
        }
    }
}