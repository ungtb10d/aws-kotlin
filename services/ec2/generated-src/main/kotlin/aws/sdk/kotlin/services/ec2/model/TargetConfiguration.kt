// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about the Convertible Reserved Instance offering.
 */
public class TargetConfiguration private constructor(builder: Builder) {
    /**
     * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
     */
    public val instanceCount: kotlin.Int? = builder.instanceCount
    /**
     * The ID of the Convertible Reserved Instance offering.
     */
    public val offeringId: kotlin.String? = builder.offeringId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TargetConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TargetConfiguration(")
        append("instanceCount=$instanceCount,")
        append("offeringId=$offeringId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceCount ?: 0
        result = 31 * result + (offeringId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TargetConfiguration

        if (instanceCount != other.instanceCount) return false
        if (offeringId != other.offeringId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TargetConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
         */
        public var instanceCount: kotlin.Int? = null
        /**
         * The ID of the Convertible Reserved Instance offering.
         */
        public var offeringId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TargetConfiguration) : this() {
            this.instanceCount = x.instanceCount
            this.offeringId = x.offeringId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TargetConfiguration = TargetConfiguration(this)
    }
}
