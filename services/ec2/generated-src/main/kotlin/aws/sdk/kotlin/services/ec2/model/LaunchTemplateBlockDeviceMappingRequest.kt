// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a block device mapping.
 */
public class LaunchTemplateBlockDeviceMappingRequest private constructor(builder: Builder) {
    /**
     * The device name (for example, /dev/sdh or xvdh).
     */
    public val deviceName: kotlin.String? = builder.deviceName
    /**
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     */
    public val ebs: aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest? = builder.ebs
    /**
     * To omit the device from the block device mapping, specify an empty string.
     */
    public val noDevice: kotlin.String? = builder.noDevice
    /**
     * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume.
     */
    public val virtualName: kotlin.String? = builder.virtualName

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateBlockDeviceMappingRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateBlockDeviceMappingRequest(")
        append("deviceName=$deviceName,")
        append("ebs=$ebs,")
        append("noDevice=$noDevice,")
        append("virtualName=$virtualName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deviceName?.hashCode() ?: 0
        result = 31 * result + (ebs?.hashCode() ?: 0)
        result = 31 * result + (noDevice?.hashCode() ?: 0)
        result = 31 * result + (virtualName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateBlockDeviceMappingRequest

        if (deviceName != other.deviceName) return false
        if (ebs != other.ebs) return false
        if (noDevice != other.noDevice) return false
        if (virtualName != other.virtualName) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateBlockDeviceMappingRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The device name (for example, /dev/sdh or xvdh).
         */
        public var deviceName: kotlin.String? = null
        /**
         * Parameters used to automatically set up EBS volumes when the instance is launched.
         */
        public var ebs: aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest? = null
        /**
         * To omit the device from the block device mapping, specify an empty string.
         */
        public var noDevice: kotlin.String? = null
        /**
         * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume.
         */
        public var virtualName: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateBlockDeviceMappingRequest) : this() {
            this.deviceName = x.deviceName
            this.ebs = x.ebs
            this.noDevice = x.noDevice
            this.virtualName = x.virtualName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateBlockDeviceMappingRequest = LaunchTemplateBlockDeviceMappingRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest] inside the given [block]
         */
        public fun ebs(block: aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest.Builder.() -> kotlin.Unit) {
            this.ebs = aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest.invoke(block)
        }
    }
}
