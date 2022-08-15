// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IPv4 CIDR block.
 */
public class CidrBlock private constructor(builder: Builder) {
    /**
     * The IPv4 CIDR block.
     */
    public val cidrBlock: kotlin.String? = builder.cidrBlock

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CidrBlock = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CidrBlock(")
        append("cidrBlock=$cidrBlock)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrBlock?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CidrBlock

        if (cidrBlock != other.cidrBlock) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CidrBlock = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The IPv4 CIDR block.
         */
        public var cidrBlock: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CidrBlock) : this() {
            this.cidrBlock = x.cidrBlock
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CidrBlock = CidrBlock(this)
    }
}
