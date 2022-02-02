// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteVpcEndpointConnectionNotificationsResponse private constructor(builder: Builder) {
    /**
     * Information about the notifications that could not be deleted
     * successfully.
     */
    val unsuccessful: List<UnsuccessfulItem>? = builder.unsuccessful

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpcEndpointConnectionNotificationsResponse(")
        append("unsuccessful=$unsuccessful)")
    }

    override fun hashCode(): kotlin.Int {
        var result = unsuccessful?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteVpcEndpointConnectionNotificationsResponse

        if (unsuccessful != other.unsuccessful) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the notifications that could not be deleted
         * successfully.
         */
        var unsuccessful: List<UnsuccessfulItem>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResponse) : this() {
            this.unsuccessful = x.unsuccessful
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResponse = DeleteVpcEndpointConnectionNotificationsResponse(this)
    }
}