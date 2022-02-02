// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output for DescribeReservedInstances.
 */
class DescribeReservedInstancesResponse private constructor(builder: Builder) {
    /**
     * A list of Reserved Instances.
     */
    val reservedInstances: List<ReservedInstances>? = builder.reservedInstances

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesResponse(")
        append("reservedInstances=$reservedInstances)")
    }

    override fun hashCode(): kotlin.Int {
        var result = reservedInstances?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeReservedInstancesResponse

        if (reservedInstances != other.reservedInstances) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * A list of Reserved Instances.
         */
        var reservedInstances: List<ReservedInstances>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesResponse) : this() {
            this.reservedInstances = x.reservedInstances
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesResponse = DescribeReservedInstancesResponse(this)
    }
}