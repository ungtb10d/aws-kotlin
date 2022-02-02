// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * List of customer gateway devices that have a sample configuration file available for
 * use. You can also see the list of device types with sample configuration files available
 * under <a href="https://docs.aws.amazon.com/vpn/latest/s2svpn/your-cgw.html">Your customer
 * gateway device in the Amazon Web Services Site-to-Site VPN User Guide.
 */
class VpnConnectionDeviceType private constructor(builder: Builder) {
    /**
     * Customer gateway device platform.
     */
    val platform: kotlin.String? = builder.platform
    /**
     * Customer gateway device software version.
     */
    val software: kotlin.String? = builder.software
    /**
     * Customer gateway device vendor.
     */
    val vendor: kotlin.String? = builder.vendor
    /**
     * Customer gateway device identifier.
     */
    val vpnConnectionDeviceTypeId: kotlin.String? = builder.vpnConnectionDeviceTypeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VpnConnectionDeviceType = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VpnConnectionDeviceType(")
        append("platform=$platform,")
        append("software=$software,")
        append("vendor=$vendor,")
        append("vpnConnectionDeviceTypeId=$vpnConnectionDeviceTypeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = platform?.hashCode() ?: 0
        result = 31 * result + (software?.hashCode() ?: 0)
        result = 31 * result + (vendor?.hashCode() ?: 0)
        result = 31 * result + (vpnConnectionDeviceTypeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VpnConnectionDeviceType

        if (platform != other.platform) return false
        if (software != other.software) return false
        if (vendor != other.vendor) return false
        if (vpnConnectionDeviceTypeId != other.vpnConnectionDeviceTypeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VpnConnectionDeviceType = Builder(this).apply(block).build()

    class Builder {
        /**
         * Customer gateway device platform.
         */
        var platform: kotlin.String? = null
        /**
         * Customer gateway device software version.
         */
        var software: kotlin.String? = null
        /**
         * Customer gateway device vendor.
         */
        var vendor: kotlin.String? = null
        /**
         * Customer gateway device identifier.
         */
        var vpnConnectionDeviceTypeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VpnConnectionDeviceType) : this() {
            this.platform = x.platform
            this.software = x.software
            this.vendor = x.vendor
            this.vpnConnectionDeviceTypeId = x.vpnConnectionDeviceTypeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VpnConnectionDeviceType = VpnConnectionDeviceType(this)
    }
}