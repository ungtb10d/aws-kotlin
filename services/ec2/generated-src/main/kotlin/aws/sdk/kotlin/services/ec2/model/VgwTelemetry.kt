// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes telemetry for a VPN tunnel.
 */
public class VgwTelemetry private constructor(builder: Builder) {
    /**
     * The number of accepted routes.
     */
    public val acceptedRouteCount: kotlin.Int? = builder.acceptedRouteCount
    /**
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     */
    public val certificateArn: kotlin.String? = builder.certificateArn
    /**
     * The date and time of the last change in status.
     */
    public val lastStatusChange: aws.smithy.kotlin.runtime.time.Instant? = builder.lastStatusChange
    /**
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     */
    public val outsideIpAddress: kotlin.String? = builder.outsideIpAddress
    /**
     * The status of the VPN tunnel.
     */
    public val status: aws.sdk.kotlin.services.ec2.model.TelemetryStatus? = builder.status
    /**
     * If an error occurs, a description of the error.
     */
    public val statusMessage: kotlin.String? = builder.statusMessage

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VgwTelemetry = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VgwTelemetry(")
        append("acceptedRouteCount=$acceptedRouteCount,")
        append("certificateArn=$certificateArn,")
        append("lastStatusChange=$lastStatusChange,")
        append("outsideIpAddress=$outsideIpAddress,")
        append("status=$status,")
        append("statusMessage=$statusMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceptedRouteCount ?: 0
        result = 31 * result + (certificateArn?.hashCode() ?: 0)
        result = 31 * result + (lastStatusChange?.hashCode() ?: 0)
        result = 31 * result + (outsideIpAddress?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VgwTelemetry

        if (acceptedRouteCount != other.acceptedRouteCount) return false
        if (certificateArn != other.certificateArn) return false
        if (lastStatusChange != other.lastStatusChange) return false
        if (outsideIpAddress != other.outsideIpAddress) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VgwTelemetry = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The number of accepted routes.
         */
        public var acceptedRouteCount: kotlin.Int? = null
        /**
         * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
         */
        public var certificateArn: kotlin.String? = null
        /**
         * The date and time of the last change in status.
         */
        public var lastStatusChange: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The Internet-routable IP address of the virtual private gateway's outside interface.
         */
        public var outsideIpAddress: kotlin.String? = null
        /**
         * The status of the VPN tunnel.
         */
        public var status: aws.sdk.kotlin.services.ec2.model.TelemetryStatus? = null
        /**
         * If an error occurs, a description of the error.
         */
        public var statusMessage: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VgwTelemetry) : this() {
            this.acceptedRouteCount = x.acceptedRouteCount
            this.certificateArn = x.certificateArn
            this.lastStatusChange = x.lastStatusChange
            this.outsideIpAddress = x.outsideIpAddress
            this.status = x.status
            this.statusMessage = x.statusMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VgwTelemetry = VgwTelemetry(this)
    }
}
