// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteNetworkInsightsPathResponse private constructor(builder: Builder) {
    /**
     * The ID of the path.
     */
    public val networkInsightsPathId: kotlin.String? = builder.networkInsightsPathId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsPathResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteNetworkInsightsPathResponse(")
        append("networkInsightsPathId=$networkInsightsPathId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInsightsPathId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteNetworkInsightsPathResponse

        if (networkInsightsPathId != other.networkInsightsPathId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsPathResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the path.
         */
        public var networkInsightsPathId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsPathResponse) : this() {
            this.networkInsightsPathId = x.networkInsightsPathId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsPathResponse = DeleteNetworkInsightsPathResponse(this)
    }
}
