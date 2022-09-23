// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IPv6 CIDR block.
 */
public class Ipv6CidrBlock private constructor(builder: Builder) {
    /**
     * The IPv6 CIDR block.
     */
    public val ipv6CidrBlock: kotlin.String? = builder.ipv6CidrBlock

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Ipv6CidrBlock = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Ipv6CidrBlock(")
        append("ipv6CidrBlock=$ipv6CidrBlock)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv6CidrBlock?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Ipv6CidrBlock

        if (ipv6CidrBlock != other.ipv6CidrBlock) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Ipv6CidrBlock = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The IPv6 CIDR block.
         */
        public var ipv6CidrBlock: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Ipv6CidrBlock) : this() {
            this.ipv6CidrBlock = x.ipv6CidrBlock
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Ipv6CidrBlock = Ipv6CidrBlock(this)
    }
}
