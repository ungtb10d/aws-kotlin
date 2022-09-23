// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the monitoring of an instance.
 */
public class RunInstancesMonitoringEnabled private constructor(builder: Builder) {
    /**
     * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
     */
    public val enabled: kotlin.Boolean? = builder.enabled

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RunInstancesMonitoringEnabled(")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RunInstancesMonitoringEnabled

        if (enabled != other.enabled) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
         */
        public var enabled: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled) : this() {
            this.enabled = x.enabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled = RunInstancesMonitoringEnabled(this)
    }
}
