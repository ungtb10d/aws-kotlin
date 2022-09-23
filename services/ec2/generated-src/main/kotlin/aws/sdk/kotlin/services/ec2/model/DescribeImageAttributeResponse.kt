// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an image attribute.
 */
public class DescribeImageAttributeResponse private constructor(builder: Builder) {
    /**
     * The block device mapping entries.
     */
    public val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * The boot mode.
     */
    public val bootMode: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.bootMode
    /**
     * A description for the AMI.
     */
    public val description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.description
    /**
     * The ID of the AMI.
     */
    public val imageId: kotlin.String? = builder.imageId
    /**
     * The kernel ID.
     */
    public val kernelId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.kernelId
    /**
     * The date and time, in [ISO 8601 date-time format](http://www.iso.org/iso/iso8601), when the AMI was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before that usage is reported.
     *
     * `lastLaunchedTime` data is available starting April 2017.
     */
    public val lastLaunchedTime: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.lastLaunchedTime
    /**
     * The launch permissions.
     */
    public val launchPermissions: List<LaunchPermission>? = builder.launchPermissions
    /**
     * The product codes.
     */
    public val productCodes: List<ProductCode>? = builder.productCodes
    /**
     * The RAM disk ID.
     */
    public val ramdiskId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.ramdiskId
    /**
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */
    public val sriovNetSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.sriovNetSupport
    /**
     * If the image is configured for NitroTPM support, the value is `v2.0`.
     */
    public val tpmSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.tpmSupport
    /**
     * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the [GetInstanceUefiData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData) command. You can inspect and modify the UEFI data by using the [python-uefivars tool](https://github.com/awslabs/python-uefivars) on GitHub. For more information, see [UEFI Secure Boot](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    public val uefiData: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.uefiData

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeImageAttributeResponse(")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("bootMode=$bootMode,")
        append("description=$description,")
        append("imageId=$imageId,")
        append("kernelId=$kernelId,")
        append("lastLaunchedTime=$lastLaunchedTime,")
        append("launchPermissions=$launchPermissions,")
        append("productCodes=$productCodes,")
        append("ramdiskId=$ramdiskId,")
        append("sriovNetSupport=$sriovNetSupport,")
        append("tpmSupport=$tpmSupport,")
        append("uefiData=$uefiData)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blockDeviceMappings?.hashCode() ?: 0
        result = 31 * result + (bootMode?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (lastLaunchedTime?.hashCode() ?: 0)
        result = 31 * result + (launchPermissions?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (sriovNetSupport?.hashCode() ?: 0)
        result = 31 * result + (tpmSupport?.hashCode() ?: 0)
        result = 31 * result + (uefiData?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeImageAttributeResponse

        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (bootMode != other.bootMode) return false
        if (description != other.description) return false
        if (imageId != other.imageId) return false
        if (kernelId != other.kernelId) return false
        if (lastLaunchedTime != other.lastLaunchedTime) return false
        if (launchPermissions != other.launchPermissions) return false
        if (productCodes != other.productCodes) return false
        if (ramdiskId != other.ramdiskId) return false
        if (sriovNetSupport != other.sriovNetSupport) return false
        if (tpmSupport != other.tpmSupport) return false
        if (uefiData != other.uefiData) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The block device mapping entries.
         */
        public var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * The boot mode.
         */
        public var bootMode: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * A description for the AMI.
         */
        public var description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * The ID of the AMI.
         */
        public var imageId: kotlin.String? = null
        /**
         * The kernel ID.
         */
        public var kernelId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * The date and time, in [ISO 8601 date-time format](http://www.iso.org/iso/iso8601), when the AMI was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before that usage is reported.
         *
         * `lastLaunchedTime` data is available starting April 2017.
         */
        public var lastLaunchedTime: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * The launch permissions.
         */
        public var launchPermissions: List<LaunchPermission>? = null
        /**
         * The product codes.
         */
        public var productCodes: List<ProductCode>? = null
        /**
         * The RAM disk ID.
         */
        public var ramdiskId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
         */
        public var sriovNetSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * If the image is configured for NitroTPM support, the value is `v2.0`.
         */
        public var tpmSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the [GetInstanceUefiData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData) command. You can inspect and modify the UEFI data by using the [python-uefivars tool](https://github.com/awslabs/python-uefivars) on GitHub. For more information, see [UEFI Secure Boot](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        public var uefiData: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse) : this() {
            this.blockDeviceMappings = x.blockDeviceMappings
            this.bootMode = x.bootMode
            this.description = x.description
            this.imageId = x.imageId
            this.kernelId = x.kernelId
            this.lastLaunchedTime = x.lastLaunchedTime
            this.launchPermissions = x.launchPermissions
            this.productCodes = x.productCodes
            this.ramdiskId = x.ramdiskId
            this.sriovNetSupport = x.sriovNetSupport
            this.tpmSupport = x.tpmSupport
            this.uefiData = x.uefiData
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = DescribeImageAttributeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun bootMode(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.bootMode = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun description(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.description = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun kernelId(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.kernelId = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun lastLaunchedTime(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.lastLaunchedTime = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun ramdiskId(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.ramdiskId = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun sriovNetSupport(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.sriovNetSupport = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun tpmSupport(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.tpmSupport = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        public fun uefiData(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.uefiData = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }
    }
}
