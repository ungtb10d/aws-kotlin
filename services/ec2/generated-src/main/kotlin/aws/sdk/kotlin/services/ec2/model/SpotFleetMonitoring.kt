// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes whether monitoring is enabled.
 */
public class SpotFleetMonitoring private constructor(builder: Builder) {
    /**
     * Enables monitoring for the instance.
     *
     * Default: `false`
     */
    public val enabled: kotlin.Boolean? = builder.enabled

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotFleetMonitoring = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotFleetMonitoring(")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotFleetMonitoring

        if (enabled != other.enabled) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotFleetMonitoring = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Enables monitoring for the instance.
         *
         * Default: `false`
         */
        public var enabled: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotFleetMonitoring) : this() {
            this.enabled = x.enabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotFleetMonitoring = SpotFleetMonitoring(this)
    }
}
