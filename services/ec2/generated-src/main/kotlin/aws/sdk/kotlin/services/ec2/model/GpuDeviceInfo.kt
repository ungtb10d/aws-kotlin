// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the GPU accelerators for the instance type.
 */
public class GpuDeviceInfo private constructor(builder: Builder) {
    /**
     * The number of GPUs for the instance type.
     */
    public val count: kotlin.Int? = builder.count
    /**
     * The manufacturer of the GPU accelerator.
     */
    public val manufacturer: kotlin.String? = builder.manufacturer
    /**
     * Describes the memory available to the GPU accelerator.
     */
    public val memoryInfo: aws.sdk.kotlin.services.ec2.model.GpuDeviceMemoryInfo? = builder.memoryInfo
    /**
     * The name of the GPU accelerator.
     */
    public val name: kotlin.String? = builder.name

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GpuDeviceInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GpuDeviceInfo(")
        append("count=$count,")
        append("manufacturer=$manufacturer,")
        append("memoryInfo=$memoryInfo,")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = count ?: 0
        result = 31 * result + (manufacturer?.hashCode() ?: 0)
        result = 31 * result + (memoryInfo?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GpuDeviceInfo

        if (count != other.count) return false
        if (manufacturer != other.manufacturer) return false
        if (memoryInfo != other.memoryInfo) return false
        if (name != other.name) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GpuDeviceInfo = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The number of GPUs for the instance type.
         */
        public var count: kotlin.Int? = null
        /**
         * The manufacturer of the GPU accelerator.
         */
        public var manufacturer: kotlin.String? = null
        /**
         * Describes the memory available to the GPU accelerator.
         */
        public var memoryInfo: aws.sdk.kotlin.services.ec2.model.GpuDeviceMemoryInfo? = null
        /**
         * The name of the GPU accelerator.
         */
        public var name: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GpuDeviceInfo) : this() {
            this.count = x.count
            this.manufacturer = x.manufacturer
            this.memoryInfo = x.memoryInfo
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GpuDeviceInfo = GpuDeviceInfo(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.GpuDeviceMemoryInfo] inside the given [block]
         */
        public fun memoryInfo(block: aws.sdk.kotlin.services.ec2.model.GpuDeviceMemoryInfo.Builder.() -> kotlin.Unit) {
            this.memoryInfo = aws.sdk.kotlin.services.ec2.model.GpuDeviceMemoryInfo.invoke(block)
        }
    }
}
