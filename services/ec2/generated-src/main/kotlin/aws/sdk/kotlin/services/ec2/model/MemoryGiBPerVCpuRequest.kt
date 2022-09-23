// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The minimum and maximum amount of memory per vCPU, in GiB.
 */
public class MemoryGiBPerVCpuRequest private constructor(builder: Builder) {
    /**
     * The maximum amount of memory per vCPU, in GiB. To specify no maximum limit, omit this parameter.
     */
    public val max: kotlin.Double? = builder.max
    /**
     * The minimum amount of memory per vCPU, in GiB. To specify no minimum limit, omit this parameter.
     */
    public val min: kotlin.Double? = builder.min

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("MemoryGiBPerVCpuRequest(")
        append("max=$max,")
        append("min=$min)")
    }

    override fun hashCode(): kotlin.Int {
        var result = max?.hashCode() ?: 0
        result = 31 * result + (min?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as MemoryGiBPerVCpuRequest

        if (max != other.max) return false
        if (min != other.min) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The maximum amount of memory per vCPU, in GiB. To specify no maximum limit, omit this parameter.
         */
        public var max: kotlin.Double? = null
        /**
         * The minimum amount of memory per vCPU, in GiB. To specify no minimum limit, omit this parameter.
         */
        public var min: kotlin.Double? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest) : this() {
            this.max = x.max
            this.min = x.min
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.MemoryGiBPerVCpuRequest = MemoryGiBPerVCpuRequest(this)
    }
}
