// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteVpnGatewayResponse private constructor(builder: Builder) {

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpnGatewayResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        return this::class.hashCode()
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteVpnGatewayResponse

        return true
    }

    public class Builder {

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayResponse) : this() {
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteVpnGatewayResponse = DeleteVpnGatewayResponse(this)
    }
}
