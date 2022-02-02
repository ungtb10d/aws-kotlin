// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a secondary private IPv4 address for a network interface.
 */
class PrivateIpAddressSpecification private constructor(builder: Builder) {
    /**
     * Indicates whether the private IPv4 address is the primary private IPv4 address. Only
     * one IPv4 address can be designated as primary.
     */
    val primary: kotlin.Boolean? = builder.primary
    /**
     * The private IPv4 addresses.
     */
    val privateIpAddress: kotlin.String? = builder.privateIpAddress

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PrivateIpAddressSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PrivateIpAddressSpecification(")
        append("primary=$primary,")
        append("privateIpAddress=$privateIpAddress)")
    }

    override fun hashCode(): kotlin.Int {
        var result = primary?.hashCode() ?: 0
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PrivateIpAddressSpecification

        if (primary != other.primary) return false
        if (privateIpAddress != other.privateIpAddress) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PrivateIpAddressSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the private IPv4 address is the primary private IPv4 address. Only
         * one IPv4 address can be designated as primary.
         */
        var primary: kotlin.Boolean? = null
        /**
         * The private IPv4 addresses.
         */
        var privateIpAddress: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PrivateIpAddressSpecification) : this() {
            this.primary = x.primary
            this.privateIpAddress = x.privateIpAddress
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PrivateIpAddressSpecification = PrivateIpAddressSpecification(this)
    }
}