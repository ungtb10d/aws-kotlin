// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyInstanceEventWindowRequest private constructor(builder: Builder) {
    /**
     * The cron expression of the event window, for example, `* 0-4,20-23 * * 1,5`.
     *
     * Constraints:
     * + Only hour and day of the week values are supported.
     * + For day of the week values, you can specify either integers `0` through `6`, or alternative single values `SUN` through `SAT`.
     * + The minute, month, and year must be specified by `*`.
     * + The hour value must be one or a multiple range, for example, `0-4` or `0-4,20-23`.
     * + Each hour range must be >= 2 hours, for example, `0-2` or `20-23`.
     * + The event window must be >= 4 hours. The combined total time ranges in the event window must be >= 4 hours.
     *
     * For more information about cron expressions, see [cron](https://en.wikipedia.org/wiki/Cron) on the *Wikipedia website*.
     */
    public val cronExpression: kotlin.String? = builder.cronExpression
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the event window.
     */
    public val instanceEventWindowId: kotlin.String? = builder.instanceEventWindowId
    /**
     * The name of the event window.
     */
    public val name: kotlin.String? = builder.name
    /**
     * The time ranges of the event window.
     */
    public val timeRanges: List<InstanceEventWindowTimeRangeRequest>? = builder.timeRanges

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyInstanceEventWindowRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstanceEventWindowRequest(")
        append("cronExpression=$cronExpression,")
        append("dryRun=$dryRun,")
        append("instanceEventWindowId=$instanceEventWindowId,")
        append("name=$name,")
        append("timeRanges=$timeRanges)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cronExpression?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceEventWindowId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (timeRanges?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyInstanceEventWindowRequest

        if (cronExpression != other.cronExpression) return false
        if (dryRun != other.dryRun) return false
        if (instanceEventWindowId != other.instanceEventWindowId) return false
        if (name != other.name) return false
        if (timeRanges != other.timeRanges) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyInstanceEventWindowRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The cron expression of the event window, for example, `* 0-4,20-23 * * 1,5`.
         *
         * Constraints:
         * + Only hour and day of the week values are supported.
         * + For day of the week values, you can specify either integers `0` through `6`, or alternative single values `SUN` through `SAT`.
         * + The minute, month, and year must be specified by `*`.
         * + The hour value must be one or a multiple range, for example, `0-4` or `0-4,20-23`.
         * + Each hour range must be >= 2 hours, for example, `0-2` or `20-23`.
         * + The event window must be >= 4 hours. The combined total time ranges in the event window must be >= 4 hours.
         *
         * For more information about cron expressions, see [cron](https://en.wikipedia.org/wiki/Cron) on the *Wikipedia website*.
         */
        public var cronExpression: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the event window.
         */
        public var instanceEventWindowId: kotlin.String? = null
        /**
         * The name of the event window.
         */
        public var name: kotlin.String? = null
        /**
         * The time ranges of the event window.
         */
        public var timeRanges: List<InstanceEventWindowTimeRangeRequest>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyInstanceEventWindowRequest) : this() {
            this.cronExpression = x.cronExpression
            this.dryRun = x.dryRun
            this.instanceEventWindowId = x.instanceEventWindowId
            this.name = x.name
            this.timeRanges = x.timeRanges
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyInstanceEventWindowRequest = ModifyInstanceEventWindowRequest(this)
    }
}
