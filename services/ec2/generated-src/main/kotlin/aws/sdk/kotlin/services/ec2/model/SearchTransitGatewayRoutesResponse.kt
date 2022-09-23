// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class SearchTransitGatewayRoutesResponse private constructor(builder: Builder) {
    /**
     * Indicates whether there are additional routes available.
     */
    public val additionalRoutesAvailable: kotlin.Boolean? = builder.additionalRoutesAvailable
    /**
     * Information about the routes.
     */
    public val routes: List<TransitGatewayRoute>? = builder.routes

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayRoutesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SearchTransitGatewayRoutesResponse(")
        append("additionalRoutesAvailable=$additionalRoutesAvailable,")
        append("routes=$routes)")
    }

    override fun hashCode(): kotlin.Int {
        var result = additionalRoutesAvailable?.hashCode() ?: 0
        result = 31 * result + (routes?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SearchTransitGatewayRoutesResponse

        if (additionalRoutesAvailable != other.additionalRoutesAvailable) return false
        if (routes != other.routes) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayRoutesResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates whether there are additional routes available.
         */
        public var additionalRoutesAvailable: kotlin.Boolean? = null
        /**
         * Information about the routes.
         */
        public var routes: List<TransitGatewayRoute>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayRoutesResponse) : this() {
            this.additionalRoutesAvailable = x.additionalRoutesAvailable
            this.routes = x.routes
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayRoutesResponse = SearchTransitGatewayRoutesResponse(this)
    }
}
