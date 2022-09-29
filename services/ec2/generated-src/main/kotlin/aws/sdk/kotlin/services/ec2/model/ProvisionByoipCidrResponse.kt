// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ProvisionByoipCidrResponse private constructor(builder: Builder) {
    /**
     * Information about the address range.
     */
    public val byoipCidr: aws.sdk.kotlin.services.ec2.model.ByoipCidr? = builder.byoipCidr

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ProvisionByoipCidrResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ProvisionByoipCidrResponse(")
        append("byoipCidr=$byoipCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = byoipCidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ProvisionByoipCidrResponse

        if (byoipCidr != other.byoipCidr) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ProvisionByoipCidrResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the address range.
         */
        public var byoipCidr: aws.sdk.kotlin.services.ec2.model.ByoipCidr? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ProvisionByoipCidrResponse) : this() {
            this.byoipCidr = x.byoipCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ProvisionByoipCidrResponse = ProvisionByoipCidrResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ByoipCidr] inside the given [block]
         */
        public fun byoipCidr(block: aws.sdk.kotlin.services.ec2.model.ByoipCidr.Builder.() -> kotlin.Unit) {
            this.byoipCidr = aws.sdk.kotlin.services.ec2.model.ByoipCidr.invoke(block)
        }
    }
}
