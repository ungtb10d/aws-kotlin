// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class StopInstancesResponse private constructor(builder: Builder) {
    /**
     * Information about the stopped instances.
     */
    public val stoppingInstances: List<InstanceStateChange>? = builder.stoppingInstances

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.StopInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("StopInstancesResponse(")
        append("stoppingInstances=$stoppingInstances)")
    }

    override fun hashCode(): kotlin.Int {
        var result = stoppingInstances?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as StopInstancesResponse

        if (stoppingInstances != other.stoppingInstances) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.StopInstancesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the stopped instances.
         */
        public var stoppingInstances: List<InstanceStateChange>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.StopInstancesResponse) : this() {
            this.stoppingInstances = x.stoppingInstances
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.StopInstancesResponse = StopInstancesResponse(this)
    }
}
