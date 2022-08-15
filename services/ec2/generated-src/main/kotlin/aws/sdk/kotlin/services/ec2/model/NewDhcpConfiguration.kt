// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a DHCP configuration option.
 */
public class NewDhcpConfiguration private constructor(builder: Builder) {
    /**
     * The name of a DHCP option.
     */
    public val key: kotlin.String? = builder.key
    /**
     * One or more values for the DHCP option.
     */
    public val values: List<String>? = builder.values

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NewDhcpConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NewDhcpConfiguration(")
        append("key=$key,")
        append("values=$values)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (values?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NewDhcpConfiguration

        if (key != other.key) return false
        if (values != other.values) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NewDhcpConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The name of a DHCP option.
         */
        public var key: kotlin.String? = null
        /**
         * One or more values for the DHCP option.
         */
        public var values: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NewDhcpConfiguration) : this() {
            this.key = x.key
            this.values = x.values
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NewDhcpConfiguration = NewDhcpConfiguration(this)
    }
}
