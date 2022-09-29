// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the credit option for CPU usage of a burstable performance instance.
 */
public class InstanceCreditSpecificationRequest private constructor(builder: Builder) {
    /**
     * The credit option for CPU usage of the instance.
     *
     * Valid values: `standard` | `unlimited`
     *
     * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
     */
    public val cpuCredits: kotlin.String? = builder.cpuCredits
    /**
     * The ID of the instance.
     */
    public val instanceId: kotlin.String? = builder.instanceId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceCreditSpecificationRequest(")
        append("cpuCredits=$cpuCredits,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceCreditSpecificationRequest

        if (cpuCredits != other.cpuCredits) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecificationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The credit option for CPU usage of the instance.
         *
         * Valid values: `standard` | `unlimited`
         *
         * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
         */
        public var cpuCredits: kotlin.String? = null
        /**
         * The ID of the instance.
         */
        public var instanceId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecificationRequest) : this() {
            this.cpuCredits = x.cpuCredits
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecificationRequest = InstanceCreditSpecificationRequest(this)
    }
}
