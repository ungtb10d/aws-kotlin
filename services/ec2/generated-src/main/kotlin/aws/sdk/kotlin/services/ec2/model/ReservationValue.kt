// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The cost associated with the Reserved Instance.
 */
public class ReservationValue private constructor(builder: Builder) {
    /**
     * The hourly rate of the reservation.
     */
    public val hourlyPrice: kotlin.String? = builder.hourlyPrice
    /**
     * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
     */
    public val remainingTotalValue: kotlin.String? = builder.remainingTotalValue
    /**
     * The remaining upfront cost of the reservation.
     */
    public val remainingUpfrontValue: kotlin.String? = builder.remainingUpfrontValue

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReservationValue = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReservationValue(")
        append("hourlyPrice=$hourlyPrice,")
        append("remainingTotalValue=$remainingTotalValue,")
        append("remainingUpfrontValue=$remainingUpfrontValue)")
    }

    override fun hashCode(): kotlin.Int {
        var result = hourlyPrice?.hashCode() ?: 0
        result = 31 * result + (remainingTotalValue?.hashCode() ?: 0)
        result = 31 * result + (remainingUpfrontValue?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReservationValue

        if (hourlyPrice != other.hourlyPrice) return false
        if (remainingTotalValue != other.remainingTotalValue) return false
        if (remainingUpfrontValue != other.remainingUpfrontValue) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReservationValue = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The hourly rate of the reservation.
         */
        public var hourlyPrice: kotlin.String? = null
        /**
         * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
         */
        public var remainingTotalValue: kotlin.String? = null
        /**
         * The remaining upfront cost of the reservation.
         */
        public var remainingUpfrontValue: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReservationValue) : this() {
            this.hourlyPrice = x.hourlyPrice
            this.remainingTotalValue = x.remainingTotalValue
            this.remainingUpfrontValue = x.remainingUpfrontValue
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReservationValue = ReservationValue(this)
    }
}
