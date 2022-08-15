// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The container element for specifying the default Object Lock retention settings for new objects placed in the specified bucket.
 *
 * + The `DefaultRetention` settings require both a mode and a period.
 * + The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You cannot specify `Days` and `Years` at the same time.
 */
public class DefaultRetention private constructor(builder: Builder) {
    /**
     * The number of days that you want to specify for the default retention period. Must be used with `Mode`.
     */
    public val days: kotlin.Int = builder.days
    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must be used with either `Days` or `Years`.
     */
    public val mode: aws.sdk.kotlin.services.s3.model.ObjectLockRetentionMode? = builder.mode
    /**
     * The number of years that you want to specify for the default retention period. Must be used with `Mode`.
     */
    public val years: kotlin.Int = builder.years

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.DefaultRetention = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DefaultRetention(")
        append("days=$days,")
        append("mode=$mode,")
        append("years=$years)")
    }

    override fun hashCode(): kotlin.Int {
        var result = days
        result = 31 * result + (mode?.hashCode() ?: 0)
        result = 31 * result + (years)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DefaultRetention

        if (days != other.days) return false
        if (mode != other.mode) return false
        if (years != other.years) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.DefaultRetention = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The number of days that you want to specify for the default retention period. Must be used with `Mode`.
         */
        public var days: kotlin.Int = 0
        /**
         * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must be used with either `Days` or `Years`.
         */
        public var mode: aws.sdk.kotlin.services.s3.model.ObjectLockRetentionMode? = null
        /**
         * The number of years that you want to specify for the default retention period. Must be used with `Mode`.
         */
        public var years: kotlin.Int = 0

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.DefaultRetention) : this() {
            this.days = x.days
            this.mode = x.mode
            this.years = x.years
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.DefaultRetention = DefaultRetention(this)
    }
}
