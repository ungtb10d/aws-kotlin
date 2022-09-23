// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The maintenance options for the instance.
 */
public class InstanceMaintenanceOptions private constructor(builder: Builder) {
    /**
     * Provides information on the current automatic recovery behavior of your instance.
     */
    public val autoRecovery: aws.sdk.kotlin.services.ec2.model.InstanceAutoRecoveryState? = builder.autoRecovery

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceMaintenanceOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceMaintenanceOptions(")
        append("autoRecovery=$autoRecovery)")
    }

    override fun hashCode(): kotlin.Int {
        var result = autoRecovery?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceMaintenanceOptions

        if (autoRecovery != other.autoRecovery) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceMaintenanceOptions = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Provides information on the current automatic recovery behavior of your instance.
         */
        public var autoRecovery: aws.sdk.kotlin.services.ec2.model.InstanceAutoRecoveryState? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceMaintenanceOptions) : this() {
            this.autoRecovery = x.autoRecovery
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceMaintenanceOptions = InstanceMaintenanceOptions(this)
    }
}
