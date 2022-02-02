// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for Payer.
 */
class RequestPaymentConfiguration private constructor(builder: Builder) {
    /**
     * Specifies who pays for the download and request fees.
     */
    val payer: aws.sdk.kotlin.services.s3.model.Payer? = builder.payer

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.RequestPaymentConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RequestPaymentConfiguration(")
        append("payer=$payer)")
    }

    override fun hashCode(): kotlin.Int {
        var result = payer?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RequestPaymentConfiguration

        if (payer != other.payer) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.RequestPaymentConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies who pays for the download and request fees.
         */
        var payer: aws.sdk.kotlin.services.s3.model.Payer? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.RequestPaymentConfiguration) : this() {
            this.payer = x.payer
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.RequestPaymentConfiguration = RequestPaymentConfiguration(this)
    }
}