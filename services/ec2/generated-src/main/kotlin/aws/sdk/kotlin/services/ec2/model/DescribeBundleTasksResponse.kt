// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeBundleTasksResponse private constructor(builder: Builder) {
    /**
     * Information about the bundle tasks.
     */
    public val bundleTasks: List<BundleTask>? = builder.bundleTasks

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeBundleTasksResponse(")
        append("bundleTasks=$bundleTasks)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bundleTasks?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeBundleTasksResponse

        if (bundleTasks != other.bundleTasks) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the bundle tasks.
         */
        public var bundleTasks: List<BundleTask>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksResponse) : this() {
            this.bundleTasks = x.bundleTasks
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeBundleTasksResponse = DescribeBundleTasksResponse(this)
    }
}
