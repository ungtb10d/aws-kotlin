// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the launch specification for an instance.
 *
 * We are retiring EC2-Classic on August 15, 2022. We recommend that you migrate from EC2-Classic to a VPC. For more information, see [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html) in the *Amazon EC2 User Guide for Linux Instances*.
 */
public class LaunchSpecification private constructor(builder: Builder) {
    /**
     * Deprecated.
     */
    public val addressingType: kotlin.String? = builder.addressingType
    /**
     * One or more block device mapping entries.
     */
    public val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     *
     * Default: `false`
     */
    public val ebsOptimized: kotlin.Boolean? = builder.ebsOptimized
    /**
     * The IAM instance profile.
     */
    public val iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = builder.iamInstanceProfile
    /**
     * The ID of the AMI.
     */
    public val imageId: kotlin.String? = builder.imageId
    /**
     * The instance type. Only one instance type can be specified.
     */
    public val instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = builder.instanceType
    /**
     * The ID of the kernel.
     */
    public val kernelId: kotlin.String? = builder.kernelId
    /**
     * The name of the key pair.
     */
    public val keyName: kotlin.String? = builder.keyName
    /**
     * Describes the monitoring of an instance.
     */
    public val monitoring: aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled? = builder.monitoring
    /**
     * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
     */
    public val networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = builder.networkInterfaces
    /**
     * The placement information for the instance.
     */
    public val placement: aws.sdk.kotlin.services.ec2.model.SpotPlacement? = builder.placement
    /**
     * The ID of the RAM disk.
     */
    public val ramdiskId: kotlin.String? = builder.ramdiskId
    /**
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     */
    public val securityGroups: List<GroupIdentifier>? = builder.securityGroups
    /**
     * The ID of the subnet in which to launch the instance.
     */
    public val subnetId: kotlin.String? = builder.subnetId
    /**
     * The Base64-encoded user data for the instance.
     */
    public val userData: kotlin.String? = builder.userData

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchSpecification(")
        append("addressingType=$addressingType,")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("ebsOptimized=$ebsOptimized,")
        append("iamInstanceProfile=$iamInstanceProfile,")
        append("imageId=$imageId,")
        append("instanceType=$instanceType,")
        append("kernelId=$kernelId,")
        append("keyName=$keyName,")
        append("monitoring=$monitoring,")
        append("networkInterfaces=$networkInterfaces,")
        append("placement=$placement,")
        append("ramdiskId=$ramdiskId,")
        append("securityGroups=$securityGroups,")
        append("subnetId=$subnetId,")
        append("userData=$userData)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addressingType?.hashCode() ?: 0
        result = 31 * result + (blockDeviceMappings?.hashCode() ?: 0)
        result = 31 * result + (ebsOptimized?.hashCode() ?: 0)
        result = 31 * result + (iamInstanceProfile?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (monitoring?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaces?.hashCode() ?: 0)
        result = 31 * result + (placement?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (securityGroups?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        result = 31 * result + (userData?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchSpecification

        if (addressingType != other.addressingType) return false
        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (ebsOptimized != other.ebsOptimized) return false
        if (iamInstanceProfile != other.iamInstanceProfile) return false
        if (imageId != other.imageId) return false
        if (instanceType != other.instanceType) return false
        if (kernelId != other.kernelId) return false
        if (keyName != other.keyName) return false
        if (monitoring != other.monitoring) return false
        if (networkInterfaces != other.networkInterfaces) return false
        if (placement != other.placement) return false
        if (ramdiskId != other.ramdiskId) return false
        if (securityGroups != other.securityGroups) return false
        if (subnetId != other.subnetId) return false
        if (userData != other.userData) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchSpecification = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Deprecated.
         */
        public var addressingType: kotlin.String? = null
        /**
         * One or more block device mapping entries.
         */
        public var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
         *
         * Default: `false`
         */
        public var ebsOptimized: kotlin.Boolean? = null
        /**
         * The IAM instance profile.
         */
        public var iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = null
        /**
         * The ID of the AMI.
         */
        public var imageId: kotlin.String? = null
        /**
         * The instance type. Only one instance type can be specified.
         */
        public var instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = null
        /**
         * The ID of the kernel.
         */
        public var kernelId: kotlin.String? = null
        /**
         * The name of the key pair.
         */
        public var keyName: kotlin.String? = null
        /**
         * Describes the monitoring of an instance.
         */
        public var monitoring: aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled? = null
        /**
         * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
         */
        public var networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = null
        /**
         * The placement information for the instance.
         */
        public var placement: aws.sdk.kotlin.services.ec2.model.SpotPlacement? = null
        /**
         * The ID of the RAM disk.
         */
        public var ramdiskId: kotlin.String? = null
        /**
         * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
         */
        public var securityGroups: List<GroupIdentifier>? = null
        /**
         * The ID of the subnet in which to launch the instance.
         */
        public var subnetId: kotlin.String? = null
        /**
         * The Base64-encoded user data for the instance.
         */
        public var userData: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchSpecification) : this() {
            this.addressingType = x.addressingType
            this.blockDeviceMappings = x.blockDeviceMappings
            this.ebsOptimized = x.ebsOptimized
            this.iamInstanceProfile = x.iamInstanceProfile
            this.imageId = x.imageId
            this.instanceType = x.instanceType
            this.kernelId = x.kernelId
            this.keyName = x.keyName
            this.monitoring = x.monitoring
            this.networkInterfaces = x.networkInterfaces
            this.placement = x.placement
            this.ramdiskId = x.ramdiskId
            this.securityGroups = x.securityGroups
            this.subnetId = x.subnetId
            this.userData = x.userData
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchSpecification = LaunchSpecification(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification] inside the given [block]
         */
        public fun iamInstanceProfile(block: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.Builder.() -> kotlin.Unit) {
            this.iamInstanceProfile = aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled] inside the given [block]
         */
        public fun monitoring(block: aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled.Builder.() -> kotlin.Unit) {
            this.monitoring = aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotPlacement] inside the given [block]
         */
        public fun placement(block: aws.sdk.kotlin.services.ec2.model.SpotPlacement.Builder.() -> kotlin.Unit) {
            this.placement = aws.sdk.kotlin.services.ec2.model.SpotPlacement.invoke(block)
        }
    }
}
