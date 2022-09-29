// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of ModifyReservedInstances.
 */
public class ModifyReservedInstancesResponse private constructor(builder: Builder) {
    /**
     * The ID for the modification.
     */
    public val reservedInstancesModificationId: kotlin.String? = builder.reservedInstancesModificationId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyReservedInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyReservedInstancesResponse(")
        append("reservedInstancesModificationId=$reservedInstancesModificationId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = reservedInstancesModificationId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyReservedInstancesResponse

        if (reservedInstancesModificationId != other.reservedInstancesModificationId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyReservedInstancesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID for the modification.
         */
        public var reservedInstancesModificationId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyReservedInstancesResponse) : this() {
            this.reservedInstancesModificationId = x.reservedInstancesModificationId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyReservedInstancesResponse = ModifyReservedInstancesResponse(this)
    }
}
