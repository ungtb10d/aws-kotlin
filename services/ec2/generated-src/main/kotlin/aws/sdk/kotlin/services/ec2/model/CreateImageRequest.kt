// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateImageRequest private constructor(builder: Builder) {
    /**
     * The block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or snapshots. To create an AMI with encrypted snapshots, use the CopyImage action.
     */
    public val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * A description for the new image.
     */
    public val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the instance.
     */
    public val instanceId: kotlin.String? = builder.instanceId
    /**
     * A name for the new image.
     *
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets (&#91;&#93;), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */
    public val name: kotlin.String? = builder.name
    /**
     * By default, when Amazon EC2 creates the new AMI, it reboots the instance so that it can take snapshots of the attached volumes while data is at rest, in order to ensure a consistent state. You can set the `NoReboot` parameter to `true` in the API request, or use the `--no-reboot` option in the CLI to prevent Amazon EC2 from shutting down and rebooting the instance.
     *
     * If you choose to bypass the shutdown and reboot process by setting the `NoReboot` parameter to `true` in the API request, or by using the `--no-reboot` option in the CLI, we can't guarantee the file system integrity of the created image.
     *
     * Default: `false` (follow standard reboot process)
     */
    public val noReboot: kotlin.Boolean? = builder.noReboot
    /**
     * The tags to apply to the AMI and snapshots on creation. You can tag the AMI, the snapshots, or both.
     * + To tag the AMI, the value for `ResourceType` must be `image`.
     * + To tag the snapshots that are created of the root volume and of other Amazon EBS volumes that are attached to the instance, the value for `ResourceType` must be `snapshot`. The same tag is applied to all of the snapshots that are created.
     *
     * If you specify other values for `ResourceType`, the request fails.
     *
     * To tag an AMI or snapshot after it has been created, see [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html).
     */
    public val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateImageRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateImageRequest(")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId,")
        append("name=$name,")
        append("noReboot=$noReboot,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blockDeviceMappings?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (noReboot?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateImageRequest

        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false
        if (name != other.name) return false
        if (noReboot != other.noReboot) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateImageRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or snapshots. To create an AMI with encrypted snapshots, use the CopyImage action.
         */
        public var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * A description for the new image.
         */
        public var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the instance.
         */
        public var instanceId: kotlin.String? = null
        /**
         * A name for the new image.
         *
         * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets (&#91;&#93;), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
         */
        public var name: kotlin.String? = null
        /**
         * By default, when Amazon EC2 creates the new AMI, it reboots the instance so that it can take snapshots of the attached volumes while data is at rest, in order to ensure a consistent state. You can set the `NoReboot` parameter to `true` in the API request, or use the `--no-reboot` option in the CLI to prevent Amazon EC2 from shutting down and rebooting the instance.
         *
         * If you choose to bypass the shutdown and reboot process by setting the `NoReboot` parameter to `true` in the API request, or by using the `--no-reboot` option in the CLI, we can't guarantee the file system integrity of the created image.
         *
         * Default: `false` (follow standard reboot process)
         */
        public var noReboot: kotlin.Boolean? = null
        /**
         * The tags to apply to the AMI and snapshots on creation. You can tag the AMI, the snapshots, or both.
         * + To tag the AMI, the value for `ResourceType` must be `image`.
         * + To tag the snapshots that are created of the root volume and of other Amazon EBS volumes that are attached to the instance, the value for `ResourceType` must be `snapshot`. The same tag is applied to all of the snapshots that are created.
         *
         * If you specify other values for `ResourceType`, the request fails.
         *
         * To tag an AMI or snapshot after it has been created, see [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html).
         */
        public var tagSpecifications: List<TagSpecification>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateImageRequest) : this() {
            this.blockDeviceMappings = x.blockDeviceMappings
            this.description = x.description
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
            this.name = x.name
            this.noReboot = x.noReboot
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateImageRequest = CreateImageRequest(this)
    }
}
