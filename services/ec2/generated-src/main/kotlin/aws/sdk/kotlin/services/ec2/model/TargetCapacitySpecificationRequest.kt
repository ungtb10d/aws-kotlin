// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The number of units to request. You can choose to set the target capacity as the number of instances. Or you can set the target capacity to a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
 *
 * You can use the On-Demand Instance `MaxTotalPrice` parameter, the Spot Instance `MaxTotalPrice` parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, EC2 Fleet will launch instances until it reaches the maximum amount that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity. The `MaxTotalPrice` parameters are located in [OnDemandOptionsRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_OnDemandOptionsRequest) and [SpotOptionsRequest](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotOptionsRequest).
 */
public class TargetCapacitySpecificationRequest private constructor(builder: Builder) {
    /**
     * The default `TotalTargetCapacity`, which is either `Spot` or `On-Demand`.
     */
    public val defaultTargetCapacityType: aws.sdk.kotlin.services.ec2.model.DefaultTargetCapacityType? = builder.defaultTargetCapacityType
    /**
     * The number of On-Demand units to request.
     */
    public val onDemandTargetCapacity: kotlin.Int? = builder.onDemandTargetCapacity
    /**
     * The number of Spot units to request.
     */
    public val spotTargetCapacity: kotlin.Int? = builder.spotTargetCapacity
    /**
     * The unit for the target capacity.
     *
     * Default: `units` (translates to number of instances)
     */
    public val targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = builder.targetCapacityUnitType
    /**
     * The number of units to request, filled using `DefaultTargetCapacityType`.
     */
    public val totalTargetCapacity: kotlin.Int? = builder.totalTargetCapacity

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TargetCapacitySpecificationRequest(")
        append("defaultTargetCapacityType=$defaultTargetCapacityType,")
        append("onDemandTargetCapacity=$onDemandTargetCapacity,")
        append("spotTargetCapacity=$spotTargetCapacity,")
        append("targetCapacityUnitType=$targetCapacityUnitType,")
        append("totalTargetCapacity=$totalTargetCapacity)")
    }

    override fun hashCode(): kotlin.Int {
        var result = defaultTargetCapacityType?.hashCode() ?: 0
        result = 31 * result + (onDemandTargetCapacity ?: 0)
        result = 31 * result + (spotTargetCapacity ?: 0)
        result = 31 * result + (targetCapacityUnitType?.hashCode() ?: 0)
        result = 31 * result + (totalTargetCapacity ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TargetCapacitySpecificationRequest

        if (defaultTargetCapacityType != other.defaultTargetCapacityType) return false
        if (onDemandTargetCapacity != other.onDemandTargetCapacity) return false
        if (spotTargetCapacity != other.spotTargetCapacity) return false
        if (targetCapacityUnitType != other.targetCapacityUnitType) return false
        if (totalTargetCapacity != other.totalTargetCapacity) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The default `TotalTargetCapacity`, which is either `Spot` or `On-Demand`.
         */
        public var defaultTargetCapacityType: aws.sdk.kotlin.services.ec2.model.DefaultTargetCapacityType? = null
        /**
         * The number of On-Demand units to request.
         */
        public var onDemandTargetCapacity: kotlin.Int? = null
        /**
         * The number of Spot units to request.
         */
        public var spotTargetCapacity: kotlin.Int? = null
        /**
         * The unit for the target capacity.
         *
         * Default: `units` (translates to number of instances)
         */
        public var targetCapacityUnitType: aws.sdk.kotlin.services.ec2.model.TargetCapacityUnitType? = null
        /**
         * The number of units to request, filled using `DefaultTargetCapacityType`.
         */
        public var totalTargetCapacity: kotlin.Int? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest) : this() {
            this.defaultTargetCapacityType = x.defaultTargetCapacityType
            this.onDemandTargetCapacity = x.onDemandTargetCapacity
            this.spotTargetCapacity = x.spotTargetCapacity
            this.targetCapacityUnitType = x.targetCapacityUnitType
            this.totalTargetCapacity = x.totalTargetCapacity
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest = TargetCapacitySpecificationRequest(this)
    }
}
