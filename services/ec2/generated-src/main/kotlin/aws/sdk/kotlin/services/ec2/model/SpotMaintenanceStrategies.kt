// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
 */
public class SpotMaintenanceStrategies private constructor(builder: Builder) {
    /**
     * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted. For more information, see [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html) in the *Amazon EC2 User Guide for Linux Instances*.
     */
    public val capacityRebalance: aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance? = builder.capacityRebalance

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotMaintenanceStrategies(")
        append("capacityRebalance=$capacityRebalance)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityRebalance?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotMaintenanceStrategies

        if (capacityRebalance != other.capacityRebalance) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted. For more information, see [Capacity rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-capacity-rebalance.html) in the *Amazon EC2 User Guide for Linux Instances*.
         */
        public var capacityRebalance: aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies) : this() {
            this.capacityRebalance = x.capacityRebalance
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotMaintenanceStrategies = SpotMaintenanceStrategies(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance] inside the given [block]
         */
        public fun capacityRebalance(block: aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance.Builder.() -> kotlin.Unit) {
            this.capacityRebalance = aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance.invoke(block)
        }
    }
}
