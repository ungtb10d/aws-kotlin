// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The credit option for CPU usage of a T instance.
 */
public class CreditSpecificationRequest private constructor(builder: Builder) {
    /**
     * The credit option for CPU usage of a T instance.
     *
     * Valid values: `standard` | `unlimited`
     */
    public val cpuCredits: kotlin.String? = builder.cpuCredits

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreditSpecificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreditSpecificationRequest(")
        append("cpuCredits=$cpuCredits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreditSpecificationRequest

        if (cpuCredits != other.cpuCredits) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreditSpecificationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The credit option for CPU usage of a T instance.
         *
         * Valid values: `standard` | `unlimited`
         */
        public var cpuCredits: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreditSpecificationRequest) : this() {
            this.cpuCredits = x.cpuCredits
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreditSpecificationRequest = CreditSpecificationRequest(this)
    }
}
