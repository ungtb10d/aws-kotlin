// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the burstable performance instance whose credit option for CPU usage was successfully modified.
 */
public class SuccessfulInstanceCreditSpecificationItem private constructor(builder: Builder) {
    /**
     * The ID of the instance.
     */
    public val instanceId: kotlin.String? = builder.instanceId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SuccessfulInstanceCreditSpecificationItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SuccessfulInstanceCreditSpecificationItem(")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SuccessfulInstanceCreditSpecificationItem

        if (instanceId != other.instanceId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SuccessfulInstanceCreditSpecificationItem = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the instance.
         */
        public var instanceId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SuccessfulInstanceCreditSpecificationItem) : this() {
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SuccessfulInstanceCreditSpecificationItem = SuccessfulInstanceCreditSpecificationItem(this)
    }
}
