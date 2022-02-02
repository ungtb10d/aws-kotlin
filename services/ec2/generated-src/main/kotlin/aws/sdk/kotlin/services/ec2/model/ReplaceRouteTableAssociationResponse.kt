// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceRouteTableAssociationResponse private constructor(builder: Builder) {
    /**
     * The state of the association.
     */
    val associationState: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState? = builder.associationState
    /**
     * The ID of the new association.
     */
    val newAssociationId: kotlin.String? = builder.newAssociationId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReplaceRouteTableAssociationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceRouteTableAssociationResponse(")
        append("associationState=$associationState,")
        append("newAssociationId=$newAssociationId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationState?.hashCode() ?: 0
        result = 31 * result + (newAssociationId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplaceRouteTableAssociationResponse

        if (associationState != other.associationState) return false
        if (newAssociationId != other.newAssociationId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReplaceRouteTableAssociationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The state of the association.
         */
        var associationState: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState? = null
        /**
         * The ID of the new association.
         */
        var newAssociationId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReplaceRouteTableAssociationResponse) : this() {
            this.associationState = x.associationState
            this.newAssociationId = x.newAssociationId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReplaceRouteTableAssociationResponse = ReplaceRouteTableAssociationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState] inside the given [block]
         */
        fun associationState(block: aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState.Builder.() -> kotlin.Unit) {
            this.associationState = aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState.invoke(block)
        }
    }
}