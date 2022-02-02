// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the state of an association between a route table and a subnet or gateway.
 */
class RouteTableAssociationState private constructor(builder: Builder) {
    /**
     * The state of the association.
     */
    val state: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationStateCode? = builder.state
    /**
     * The status message, if applicable.
     */
    val statusMessage: kotlin.String? = builder.statusMessage

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RouteTableAssociationState(")
        append("state=$state,")
        append("statusMessage=$statusMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = state?.hashCode() ?: 0
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RouteTableAssociationState

        if (state != other.state) return false
        if (statusMessage != other.statusMessage) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState = Builder(this).apply(block).build()

    class Builder {
        /**
         * The state of the association.
         */
        var state: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationStateCode? = null
        /**
         * The status message, if applicable.
         */
        var statusMessage: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState) : this() {
            this.state = x.state
            this.statusMessage = x.statusMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState = RouteTableAssociationState(this)
    }
}