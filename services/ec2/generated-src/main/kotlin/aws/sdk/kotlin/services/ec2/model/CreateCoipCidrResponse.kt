// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateCoipCidrResponse private constructor(builder: Builder) {
    /**
     * Information about a range of customer-owned IP addresses.
     */
    public val coipCidr: aws.sdk.kotlin.services.ec2.model.CoipCidr? = builder.coipCidr

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateCoipCidrResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateCoipCidrResponse(")
        append("coipCidr=$coipCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = coipCidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateCoipCidrResponse

        if (coipCidr != other.coipCidr) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateCoipCidrResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about a range of customer-owned IP addresses.
         */
        public var coipCidr: aws.sdk.kotlin.services.ec2.model.CoipCidr? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateCoipCidrResponse) : this() {
            this.coipCidr = x.coipCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateCoipCidrResponse = CreateCoipCidrResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CoipCidr] inside the given [block]
         */
        public fun coipCidr(block: aws.sdk.kotlin.services.ec2.model.CoipCidr.Builder.() -> kotlin.Unit) {
            this.coipCidr = aws.sdk.kotlin.services.ec2.model.CoipCidr.invoke(block)
        }
    }
}
