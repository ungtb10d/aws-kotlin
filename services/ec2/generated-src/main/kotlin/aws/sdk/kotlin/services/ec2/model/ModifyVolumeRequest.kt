// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyVolumeRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The target IOPS rate of the volume. This parameter is valid only for `gp3`, `io1`, and `io2` volumes.
     *
     * The following are the supported values for each volume type:
     * + `gp3`: 3,000-16,000 IOPS
     * + `io1`: 100-64,000 IOPS
     * + `io2`: 100-64,000 IOPS
     *
     * Default: The existing value is retained if you keep the same volume type. If you change the volume type to `io1`, `io2`, or `gp3`, the default is 3,000.
     */
    public val iops: kotlin.Int? = builder.iops
    /**
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up to 16 [ Nitro-based instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances) in the same Availability Zone. This parameter is supported with `io1` and `io2` volumes only. For more information, see [ Amazon EBS Multi-Attach](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html) in the *Amazon Elastic Compute Cloud User Guide*.
     */
    public val multiAttachEnabled: kotlin.Boolean? = builder.multiAttachEnabled
    /**
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size of the volume.
     *
     * The following are the supported volumes sizes for each volume type:
     * + `gp2` and `gp3`: 1-16,384
     * + `io1` and `io2`: 4-16,384
     * + `st1` and `sc1`: 125-16,384
     * + `standard`: 1-1,024
     *
     * Default: The existing size is retained.
     */
    public val size: kotlin.Int? = builder.size
    /**
     * The target throughput of the volume, in MiB/s. This parameter is valid only for `gp3` volumes. The maximum value is 1,000.
     *
     * Default: The existing value is retained if the source and target volume type is `gp3`. Otherwise, the default value is 125.
     *
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    public val throughput: kotlin.Int? = builder.throughput
    /**
     * The ID of the volume.
     */
    public val volumeId: kotlin.String? = builder.volumeId
    /**
     * The target EBS volume type of the volume. For more information, see [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon Elastic Compute Cloud User Guide*.
     *
     * Default: The existing type is retained.
     */
    public val volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = builder.volumeType

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVolumeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVolumeRequest(")
        append("dryRun=$dryRun,")
        append("iops=$iops,")
        append("multiAttachEnabled=$multiAttachEnabled,")
        append("size=$size,")
        append("throughput=$throughput,")
        append("volumeId=$volumeId,")
        append("volumeType=$volumeType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (iops ?: 0)
        result = 31 * result + (multiAttachEnabled?.hashCode() ?: 0)
        result = 31 * result + (size ?: 0)
        result = 31 * result + (throughput ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        result = 31 * result + (volumeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVolumeRequest

        if (dryRun != other.dryRun) return false
        if (iops != other.iops) return false
        if (multiAttachEnabled != other.multiAttachEnabled) return false
        if (size != other.size) return false
        if (throughput != other.throughput) return false
        if (volumeId != other.volumeId) return false
        if (volumeType != other.volumeType) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVolumeRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The target IOPS rate of the volume. This parameter is valid only for `gp3`, `io1`, and `io2` volumes.
         *
         * The following are the supported values for each volume type:
         * + `gp3`: 3,000-16,000 IOPS
         * + `io1`: 100-64,000 IOPS
         * + `io2`: 100-64,000 IOPS
         *
         * Default: The existing value is retained if you keep the same volume type. If you change the volume type to `io1`, `io2`, or `gp3`, the default is 3,000.
         */
        public var iops: kotlin.Int? = null
        /**
         * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up to 16 [ Nitro-based instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances) in the same Availability Zone. This parameter is supported with `io1` and `io2` volumes only. For more information, see [ Amazon EBS Multi-Attach](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html) in the *Amazon Elastic Compute Cloud User Guide*.
         */
        public var multiAttachEnabled: kotlin.Boolean? = null
        /**
         * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size of the volume.
         *
         * The following are the supported volumes sizes for each volume type:
         * + `gp2` and `gp3`: 1-16,384
         * + `io1` and `io2`: 4-16,384
         * + `st1` and `sc1`: 125-16,384
         * + `standard`: 1-1,024
         *
         * Default: The existing size is retained.
         */
        public var size: kotlin.Int? = null
        /**
         * The target throughput of the volume, in MiB/s. This parameter is valid only for `gp3` volumes. The maximum value is 1,000.
         *
         * Default: The existing value is retained if the source and target volume type is `gp3`. Otherwise, the default value is 125.
         *
         * Valid Range: Minimum value of 125. Maximum value of 1000.
         */
        public var throughput: kotlin.Int? = null
        /**
         * The ID of the volume.
         */
        public var volumeId: kotlin.String? = null
        /**
         * The target EBS volume type of the volume. For more information, see [Amazon EBS volume types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon Elastic Compute Cloud User Guide*.
         *
         * Default: The existing type is retained.
         */
        public var volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVolumeRequest) : this() {
            this.dryRun = x.dryRun
            this.iops = x.iops
            this.multiAttachEnabled = x.multiAttachEnabled
            this.size = x.size
            this.throughput = x.throughput
            this.volumeId = x.volumeId
            this.volumeType = x.volumeType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVolumeRequest = ModifyVolumeRequest(this)
    }
}
