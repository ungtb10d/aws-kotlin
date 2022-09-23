// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The minimum and maximum number of network interfaces.
 */
public class NetworkInterfaceCount private constructor(builder: Builder) {
    /**
     * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
     */
    public val max: kotlin.Int? = builder.max
    /**
     * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
     */
    public val min: kotlin.Int? = builder.min

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCount = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NetworkInterfaceCount(")
        append("max=$max,")
        append("min=$min)")
    }

    override fun hashCode(): kotlin.Int {
        var result = max ?: 0
        result = 31 * result + (min ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NetworkInterfaceCount

        if (max != other.max) return false
        if (min != other.min) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCount = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The maximum number of network interfaces. If this parameter is not specified, there is no maximum limit.
         */
        public var max: kotlin.Int? = null
        /**
         * The minimum number of network interfaces. If this parameter is not specified, there is no minimum limit.
         */
        public var min: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCount) : this() {
            this.max = x.max
            this.min = x.min
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NetworkInterfaceCount = NetworkInterfaceCount(this)
    }
}
