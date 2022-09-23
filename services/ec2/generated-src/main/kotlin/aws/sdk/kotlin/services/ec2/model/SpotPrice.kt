// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * The maximum price per unit hour that you are willing to pay for a Spot Instance. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.
 *
 * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify this parameter.
 */
public class SpotPrice private constructor(builder: Builder) {
    /**
     * The Availability Zone.
     */
    public val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The instance type.
     */
    public val instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = builder.instanceType
    /**
     * A general description of the AMI.
     */
    public val productDescription: aws.sdk.kotlin.services.ec2.model.RiProductDescription? = builder.productDescription
    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.
     *
     * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify this parameter.
     */
    public val spotPrice: kotlin.String? = builder.spotPrice
    /**
     * The date and time the request was created, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
     */
    public val timestamp: aws.smithy.kotlin.runtime.time.Instant? = builder.timestamp

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotPrice = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotPrice(")
        append("availabilityZone=$availabilityZone,")
        append("instanceType=$instanceType,")
        append("productDescription=$productDescription,")
        append("spotPrice=$spotPrice,")
        append("timestamp=$timestamp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (productDescription?.hashCode() ?: 0)
        result = 31 * result + (spotPrice?.hashCode() ?: 0)
        result = 31 * result + (timestamp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotPrice

        if (availabilityZone != other.availabilityZone) return false
        if (instanceType != other.instanceType) return false
        if (productDescription != other.productDescription) return false
        if (spotPrice != other.spotPrice) return false
        if (timestamp != other.timestamp) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotPrice = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The Availability Zone.
         */
        public var availabilityZone: kotlin.String? = null
        /**
         * The instance type.
         */
        public var instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = null
        /**
         * A general description of the AMI.
         */
        public var productDescription: aws.sdk.kotlin.services.ec2.model.RiProductDescription? = null
        /**
         * The maximum price per unit hour that you are willing to pay for a Spot Instance. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.
         *
         * If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify this parameter.
         */
        public var spotPrice: kotlin.String? = null
        /**
         * The date and time the request was created, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
         */
        public var timestamp: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotPrice) : this() {
            this.availabilityZone = x.availabilityZone
            this.instanceType = x.instanceType
            this.productDescription = x.productDescription
            this.spotPrice = x.spotPrice
            this.timestamp = x.timestamp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotPrice = SpotPrice(this)
    }
}
