// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the state of a CIDR block.
 */
public class SubnetCidrBlockState private constructor(builder: Builder) {
    /**
     * The state of a CIDR block.
     */
    public val state: aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockStateCode? = builder.state
    /**
     * A message about the status of the CIDR block, if applicable.
     */
    public val statusMessage: kotlin.String? = builder.statusMessage

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockState = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SubnetCidrBlockState(")
        append("state=$state,")
        append("statusMessage=$statusMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = state?.hashCode() ?: 0
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SubnetCidrBlockState

        if (state != other.state) return false
        if (statusMessage != other.statusMessage) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockState = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The state of a CIDR block.
         */
        public var state: aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockStateCode? = null
        /**
         * A message about the status of the CIDR block, if applicable.
         */
        public var statusMessage: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockState) : this() {
            this.state = x.state
            this.statusMessage = x.statusMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SubnetCidrBlockState = SubnetCidrBlockState(this)
    }
}
