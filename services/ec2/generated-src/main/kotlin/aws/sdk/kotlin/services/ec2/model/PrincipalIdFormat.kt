// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * PrincipalIdFormat description
 */
class PrincipalIdFormat private constructor(builder: Builder) {
    /**
     * PrincipalIdFormatARN description
     */
    val arn: kotlin.String? = builder.arn
    /**
     * PrincipalIdFormatStatuses description
     */
    val statuses: List<IdFormat>? = builder.statuses

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PrincipalIdFormat = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PrincipalIdFormat(")
        append("arn=$arn,")
        append("statuses=$statuses)")
    }

    override fun hashCode(): kotlin.Int {
        var result = arn?.hashCode() ?: 0
        result = 31 * result + (statuses?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PrincipalIdFormat

        if (arn != other.arn) return false
        if (statuses != other.statuses) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PrincipalIdFormat = Builder(this).apply(block).build()

    class Builder {
        /**
         * PrincipalIdFormatARN description
         */
        var arn: kotlin.String? = null
        /**
         * PrincipalIdFormatStatuses description
         */
        var statuses: List<IdFormat>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PrincipalIdFormat) : this() {
            this.arn = x.arn
            this.statuses = x.statuses
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PrincipalIdFormat = PrincipalIdFormat(this)
    }
}