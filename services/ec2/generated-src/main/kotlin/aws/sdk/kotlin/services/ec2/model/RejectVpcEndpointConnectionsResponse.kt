// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class RejectVpcEndpointConnectionsResponse private constructor(builder: Builder) {
    /**
     * Information about the endpoints that were not rejected, if applicable.
     */
    public val unsuccessful: List<UnsuccessfulItem>? = builder.unsuccessful

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RejectVpcEndpointConnectionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RejectVpcEndpointConnectionsResponse(")
        append("unsuccessful=$unsuccessful)")
    }

    override fun hashCode(): kotlin.Int {
        var result = unsuccessful?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RejectVpcEndpointConnectionsResponse

        if (unsuccessful != other.unsuccessful) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RejectVpcEndpointConnectionsResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the endpoints that were not rejected, if applicable.
         */
        public var unsuccessful: List<UnsuccessfulItem>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RejectVpcEndpointConnectionsResponse) : this() {
            this.unsuccessful = x.unsuccessful
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RejectVpcEndpointConnectionsResponse = RejectVpcEndpointConnectionsResponse(this)
    }
}
