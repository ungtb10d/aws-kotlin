// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyVpnConnectionResponse private constructor(builder: Builder) {
    /**
     * Describes a VPN connection.
     */
    public val vpnConnection: aws.sdk.kotlin.services.ec2.model.VpnConnection? = builder.vpnConnection

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpnConnectionResponse(")
        append("vpnConnection=$vpnConnection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = vpnConnection?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpnConnectionResponse

        if (vpnConnection != other.vpnConnection) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Describes a VPN connection.
         */
        public var vpnConnection: aws.sdk.kotlin.services.ec2.model.VpnConnection? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionResponse) : this() {
            this.vpnConnection = x.vpnConnection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionResponse = ModifyVpnConnectionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpnConnection] inside the given [block]
         */
        public fun vpnConnection(block: aws.sdk.kotlin.services.ec2.model.VpnConnection.Builder.() -> kotlin.Unit) {
            this.vpnConnection = aws.sdk.kotlin.services.ec2.model.VpnConnection.invoke(block)
        }
    }
}
