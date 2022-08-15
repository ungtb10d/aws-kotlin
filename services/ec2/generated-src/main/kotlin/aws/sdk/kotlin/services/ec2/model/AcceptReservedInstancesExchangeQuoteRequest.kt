// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for accepting the quote.
 */
public class AcceptReservedInstancesExchangeQuoteRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of the Convertible Reserved Instances to exchange for another Convertible Reserved Instance of the same or higher value.
     */
    public val reservedInstanceIds: List<String>? = builder.reservedInstanceIds
    /**
     * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
     */
    public val targetConfigurations: List<TargetConfigurationRequest>? = builder.targetConfigurations

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AcceptReservedInstancesExchangeQuoteRequest(")
        append("dryRun=$dryRun,")
        append("reservedInstanceIds=$reservedInstanceIds,")
        append("targetConfigurations=$targetConfigurations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (reservedInstanceIds?.hashCode() ?: 0)
        result = 31 * result + (targetConfigurations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AcceptReservedInstancesExchangeQuoteRequest

        if (dryRun != other.dryRun) return false
        if (reservedInstanceIds != other.reservedInstanceIds) return false
        if (targetConfigurations != other.targetConfigurations) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of the Convertible Reserved Instances to exchange for another Convertible Reserved Instance of the same or higher value.
         */
        public var reservedInstanceIds: List<String>? = null
        /**
         * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
         */
        public var targetConfigurations: List<TargetConfigurationRequest>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest) : this() {
            this.dryRun = x.dryRun
            this.reservedInstanceIds = x.reservedInstanceIds
            this.targetConfigurations = x.targetConfigurations
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest = AcceptReservedInstancesExchangeQuoteRequest(this)
    }
}
