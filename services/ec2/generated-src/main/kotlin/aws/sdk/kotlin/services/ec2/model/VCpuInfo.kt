// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the vCPU configurations for the instance type.
 */
public class VCpuInfo private constructor(builder: Builder) {
    /**
     * The default number of cores for the instance type.
     */
    public val defaultCores: kotlin.Int? = builder.defaultCores
    /**
     * The default number of threads per core for the instance type.
     */
    public val defaultThreadsPerCore: kotlin.Int? = builder.defaultThreadsPerCore
    /**
     * The default number of vCPUs for the instance type.
     */
    public val defaultVCpus: kotlin.Int? = builder.defaultVCpus
    /**
     * The valid number of cores that can be configured for the instance type.
     */
    public val validCores: List<Int>? = builder.validCores
    /**
     * The valid number of threads per core that can be configured for the instance type.
     */
    public val validThreadsPerCore: List<Int>? = builder.validThreadsPerCore

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VCpuInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VCpuInfo(")
        append("defaultCores=$defaultCores,")
        append("defaultThreadsPerCore=$defaultThreadsPerCore,")
        append("defaultVCpus=$defaultVCpus,")
        append("validCores=$validCores,")
        append("validThreadsPerCore=$validThreadsPerCore)")
    }

    override fun hashCode(): kotlin.Int {
        var result = defaultCores ?: 0
        result = 31 * result + (defaultThreadsPerCore ?: 0)
        result = 31 * result + (defaultVCpus ?: 0)
        result = 31 * result + (validCores?.hashCode() ?: 0)
        result = 31 * result + (validThreadsPerCore?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VCpuInfo

        if (defaultCores != other.defaultCores) return false
        if (defaultThreadsPerCore != other.defaultThreadsPerCore) return false
        if (defaultVCpus != other.defaultVCpus) return false
        if (validCores != other.validCores) return false
        if (validThreadsPerCore != other.validThreadsPerCore) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VCpuInfo = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The default number of cores for the instance type.
         */
        public var defaultCores: kotlin.Int? = null
        /**
         * The default number of threads per core for the instance type.
         */
        public var defaultThreadsPerCore: kotlin.Int? = null
        /**
         * The default number of vCPUs for the instance type.
         */
        public var defaultVCpus: kotlin.Int? = null
        /**
         * The valid number of cores that can be configured for the instance type.
         */
        public var validCores: List<Int>? = null
        /**
         * The valid number of threads per core that can be configured for the instance type.
         */
        public var validThreadsPerCore: List<Int>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VCpuInfo) : this() {
            this.defaultCores = x.defaultCores
            this.defaultThreadsPerCore = x.defaultThreadsPerCore
            this.defaultVCpus = x.defaultVCpus
            this.validCores = x.validCores
            this.validThreadsPerCore = x.validThreadsPerCore
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VCpuInfo = VCpuInfo(this)
    }
}
