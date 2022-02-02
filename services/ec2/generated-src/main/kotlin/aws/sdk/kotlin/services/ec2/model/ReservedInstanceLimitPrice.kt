// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the limit price of a Reserved Instance offering.
 */
class ReservedInstanceLimitPrice private constructor(builder: Builder) {
    /**
     * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount * price).
     */
    val amount: kotlin.Double? = builder.amount
    /**
     * The currency in which the limitPrice amount is specified.
     * At this time, the only supported currency is USD.
     */
    val currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = builder.currencyCode

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReservedInstanceLimitPrice = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReservedInstanceLimitPrice(")
        append("amount=$amount,")
        append("currencyCode=$currencyCode)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amount?.hashCode() ?: 0
        result = 31 * result + (currencyCode?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReservedInstanceLimitPrice

        if (amount != other.amount) return false
        if (currencyCode != other.currencyCode) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReservedInstanceLimitPrice = Builder(this).apply(block).build()

    class Builder {
        /**
         * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount * price).
         */
        var amount: kotlin.Double? = null
        /**
         * The currency in which the limitPrice amount is specified.
         * At this time, the only supported currency is USD.
         */
        var currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReservedInstanceLimitPrice) : this() {
            this.amount = x.amount
            this.currencyCode = x.currencyCode
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReservedInstanceLimitPrice = ReservedInstanceLimitPrice(this)
    }
}