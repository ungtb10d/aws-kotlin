// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The minimum and maximum number of vCPUs.
 */
class VCpuCountRange private constructor(builder: Builder) {
    /**
     * The maximum number of vCPUs. If this parameter is not specified, there is no maximum
     * limit.
     */
    val max: kotlin.Int? = builder.max
    /**
     * The minimum number of vCPUs. If the value is 0, there is no minimum
     * limit.
     */
    val min: kotlin.Int? = builder.min

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VCpuCountRange = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VCpuCountRange(")
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

        other as VCpuCountRange

        if (max != other.max) return false
        if (min != other.min) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VCpuCountRange = Builder(this).apply(block).build()

    class Builder {
        /**
         * The maximum number of vCPUs. If this parameter is not specified, there is no maximum
         * limit.
         */
        var max: kotlin.Int? = null
        /**
         * The minimum number of vCPUs. If the value is 0, there is no minimum
         * limit.
         */
        var min: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VCpuCountRange) : this() {
            this.max = x.max
            this.min = x.min
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VCpuCountRange = VCpuCountRange(this)
    }
}