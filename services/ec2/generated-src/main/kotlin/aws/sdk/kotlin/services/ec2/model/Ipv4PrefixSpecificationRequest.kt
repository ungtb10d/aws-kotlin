// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the IPv4 prefix option for a network interface.
 */
public class Ipv4PrefixSpecificationRequest private constructor(builder: Builder) {
    /**
     * The IPv4 prefix. For information, see [ Assigning prefixes to Amazon EC2 network interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    public val ipv4Prefix: kotlin.String? = builder.ipv4Prefix

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Ipv4PrefixSpecificationRequest(")
        append("ipv4Prefix=$ipv4Prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv4Prefix?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Ipv4PrefixSpecificationRequest

        if (ipv4Prefix != other.ipv4Prefix) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecificationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The IPv4 prefix. For information, see [ Assigning prefixes to Amazon EC2 network interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        public var ipv4Prefix: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecificationRequest) : this() {
            this.ipv4Prefix = x.ipv4Prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecificationRequest = Ipv4PrefixSpecificationRequest(this)
    }
}
