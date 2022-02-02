// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Inference accelerators for the instance type.
 */
class InferenceDeviceInfo private constructor(builder: Builder) {
    /**
     * The number of Inference accelerators for the instance type.
     */
    val count: kotlin.Int? = builder.count
    /**
     * The manufacturer of the Inference accelerator.
     */
    val manufacturer: kotlin.String? = builder.manufacturer
    /**
     * The name of the Inference accelerator.
     */
    val name: kotlin.String? = builder.name

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InferenceDeviceInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InferenceDeviceInfo(")
        append("count=$count,")
        append("manufacturer=$manufacturer,")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = count ?: 0
        result = 31 * result + (manufacturer?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InferenceDeviceInfo

        if (count != other.count) return false
        if (manufacturer != other.manufacturer) return false
        if (name != other.name) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InferenceDeviceInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of Inference accelerators for the instance type.
         */
        var count: kotlin.Int? = null
        /**
         * The manufacturer of the Inference accelerator.
         */
        var manufacturer: kotlin.String? = null
        /**
         * The name of the Inference accelerator.
         */
        var name: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InferenceDeviceInfo) : this() {
            this.count = x.count
            this.manufacturer = x.manufacturer
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InferenceDeviceInfo = InferenceDeviceInfo(this)
    }
}