// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeInstancesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * + `affinity` - The affinity setting for an instance running on a Dedicated Host (`default` | `host`).
     * + `architecture` - The instance architecture (`i386` | `x86_64` | `arm64`).
     * + `availability-zone` - The Availability Zone of the instance.
     * + `block-device-mapping.attach-time` - The attach time for an EBS volume mapped to the instance, for example, `2010-09-15T17:15:20.000Z`.
     * + `block-device-mapping.delete-on-termination` - A Boolean that indicates whether the EBS volume is deleted on instance termination.
     * + `block-device-mapping.device-name` - The device name specified in the block device mapping (for example, `/dev/sdh` or `xvdh`).
     * + `block-device-mapping.status` - The status for the EBS volume (`attaching` | `attached` | `detaching` | `detached`).
     * + `block-device-mapping.volume-id` - The volume ID of the EBS volume.
     * + `capacity-reservation-id` - The ID of the Capacity Reservation into which the instance was launched.
     * + `client-token` - The idempotency token you provided when you launched the instance.
     * + `dns-name` - The public DNS name of the instance.
     * + `group-id` - The ID of the security group for the instance. EC2-Classic only.
     * + `group-name` - The name of the security group for the instance. EC2-Classic only.
     * + `hibernation-options.configured` - A Boolean that indicates whether the instance is enabled for hibernation. A value of `true` means that the instance is enabled for hibernation.
     * + `host-id` - The ID of the Dedicated Host on which the instance is running, if applicable.
     * + `hypervisor` - The hypervisor type of the instance (`ovm` | `xen`). The value `xen` is used for both Xen and Nitro hypervisors.
     * + `iam-instance-profile.arn` - The instance profile associated with the instance. Specified as an ARN.
     * + `image-id` - The ID of the image used to launch the instance.
     * + `instance-id` - The ID of the instance.
     * + `instance-lifecycle` - Indicates whether this is a Spot Instance or a Scheduled Instance (`spot` | `scheduled`).
     * + `instance-state-code` - The state of the instance, as a 16-bit unsigned integer. The high byte is used for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * + `instance-state-name` - The state of the instance (`pending` | `running` | `shutting-down` | `terminated` | `stopping` | `stopped`).
     * + `instance-type` - The type of instance (for example, `t2.micro`).
     * + `instance.group-id` - The ID of the security group for the instance.
     * + `instance.group-name` - The name of the security group for the instance.
     * + `ip-address` - The public IPv4 address of the instance.
     * + `kernel-id` - The kernel ID.
     * + `key-name` - The name of the key pair used when the instance was launched.
     * + `launch-index` - When launching multiple instances, this is the index for the instance in the launch group (for example, 0, 1, 2, and so on).
     * + `launch-time` - The time when the instance was launched, in the ISO 8601 format in the UTC time zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, `2021-09-29T11:04:43.305Z`. You can use a wildcard (`*`), for example, `2021-09-29T*`, which matches an entire day.
     * + `metadata-options.http-tokens` - The metadata request authorization state (`optional` | `required`)
     * + `metadata-options.http-put-response-hop-limit` - The http metadata request put response hop limit (integer, possible values `1` to `64`)
     * + `metadata-options.http-endpoint` - Enable or disable metadata access on http endpoint (`enabled` | `disabled`)
     * + `monitoring-state` - Indicates whether detailed monitoring is enabled (`disabled` | `enabled`).
     * + `network-interface.addresses.private-ip-address` - The private IPv4 address associated with the network interface.
     * + `network-interface.addresses.primary` - Specifies whether the IPv4 address of the network interface is the primary private IPv4 address.
     * + `network-interface.addresses.association.public-ip` - The ID of the association of an Elastic IP address (IPv4) with a network interface.
     * + `network-interface.addresses.association.ip-owner-id` - The owner ID of the private IPv4 address associated with the network interface.
     * + `network-interface.association.public-ip` - The address of the Elastic IP address (IPv4) bound to the network interface.
     * + `network-interface.association.ip-owner-id` - The owner of the Elastic IP address (IPv4) associated with the network interface.
     * + `network-interface.association.allocation-id` - The allocation ID returned when you allocated the Elastic IP address (IPv4) for your network interface.
     * + `network-interface.association.association-id` - The association ID returned when the network interface was associated with an IPv4 address.
     * + `network-interface.attachment.attachment-id` - The ID of the interface attachment.
     * + `network-interface.attachment.instance-id` - The ID of the instance to which the network interface is attached.
     * + `network-interface.attachment.instance-owner-id` - The owner ID of the instance to which the network interface is attached.
     * + `network-interface.attachment.device-index` - The device index to which the network interface is attached.
     * + `network-interface.attachment.status` - The status of the attachment (`attaching` | `attached` | `detaching` | `detached`).
     * + `network-interface.attachment.attach-time` - The time that the network interface was attached to an instance.
     * + `network-interface.attachment.delete-on-termination` - Specifies whether the attachment is deleted when an instance is terminated.
     * + `network-interface.availability-zone` - The Availability Zone for the network interface.
     * + `network-interface.description` - The description of the network interface.
     * + `network-interface.group-id` - The ID of a security group associated with the network interface.
     * + `network-interface.group-name` - The name of a security group associated with the network interface.
     * + `network-interface.ipv6-addresses.ipv6-address` - The IPv6 address associated with the network interface.
     * + `network-interface.mac-address` - The MAC address of the network interface.
     * + `network-interface.network-interface-id` - The ID of the network interface.
     * + `network-interface.owner-id` - The ID of the owner of the network interface.
     * + `network-interface.private-dns-name` - The private DNS name of the network interface.
     * + `network-interface.requester-id` - The requester ID for the network interface.
     * + `network-interface.requester-managed` - Indicates whether the network interface is being managed by Amazon Web Services.
     * + `network-interface.status` - The status of the network interface (`available`) | `in-use`).
     * + `network-interface.source-dest-check` - Whether the network interface performs source/destination checking. A value of `true` means that checking is enabled, and `false` means that checking is disabled. The value must be `false` for the network interface to perform network address translation (NAT) in your VPC.
     * + `network-interface.subnet-id` - The ID of the subnet for the network interface.
     * + `network-interface.vpc-id` - The ID of the VPC for the network interface.
     * + `outpost-arn` - The Amazon Resource Name (ARN) of the Outpost.
     * + `owner-id` - The Amazon Web Services account ID of the instance owner.
     * + `placement-group-name` - The name of the placement group for the instance.
     * + `placement-partition-number` - The partition in which the instance is located.
     * + `platform` - The platform. To list only Windows instances, use `windows`.
     * + `private-dns-name` - The private IPv4 DNS name of the instance.
     * + `private-ip-address` - The private IPv4 address of the instance.
     * + `product-code` - The product code associated with the AMI used to launch the instance.
     * + `product-code.type` - The type of product code (`devpay` | `marketplace`).
     * + `ramdisk-id` - The RAM disk ID.
     * + `reason` - The reason for the current state of the instance (for example, shows "User Initiated &#91;date&#93;" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * + `requester-id` - The ID of the entity that launched the instance on your behalf (for example, Amazon Web Services Management Console, Auto Scaling, and so on).
     * + `reservation-id` - The ID of the instance's reservation. A reservation ID is created any time you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be associated with more than one instance if you launch multiple instances using the same launch request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same launch request, you also get one reservation ID.
     * + `root-device-name` - The device name of the root device volume (for example, `/dev/sda1`).
     * + `root-device-type` - The type of the root device volume (`ebs` | `instance-store`).
     * + `source-dest-check` - Indicates whether the instance performs source/destination checking. A value of `true` means that checking is enabled, and `false` means that checking is disabled. The value must be `false` for the instance to perform network address translation (NAT) in your VPC.
     * + `spot-instance-request-id` - The ID of the Spot Instance request.
     * + `state-reason-code` - The reason code for the state change.
     * + `state-reason-message` - A message that describes the state change.
     * + `subnet-id` - The ID of the subnet for the instance.
     * + `tag:<key>` - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
     * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.
     * + `tenancy` - The tenancy of an instance (`dedicated` | `default` | `host`).
     * + `virtualization-type` - The virtualization type of the instance (`paravirtual` | `hvm`).
     * + `vpc-id` - The ID of the VPC that the instance is running in.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The instance IDs.
     *
     * Default: Describes all your instances.
     */
    public val instanceIds: List<String>? = builder.instanceIds
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned `NextToken` value. This value can be between 5 and 1000. You cannot specify this parameter and the instance IDs parameter in the same call.
     */
    public val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token to request the next page of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeInstancesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeInstancesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("instanceIds=$instanceIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeInstancesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (instanceIds != other.instanceIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeInstancesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * + `affinity` - The affinity setting for an instance running on a Dedicated Host (`default` | `host`).
         * + `architecture` - The instance architecture (`i386` | `x86_64` | `arm64`).
         * + `availability-zone` - The Availability Zone of the instance.
         * + `block-device-mapping.attach-time` - The attach time for an EBS volume mapped to the instance, for example, `2010-09-15T17:15:20.000Z`.
         * + `block-device-mapping.delete-on-termination` - A Boolean that indicates whether the EBS volume is deleted on instance termination.
         * + `block-device-mapping.device-name` - The device name specified in the block device mapping (for example, `/dev/sdh` or `xvdh`).
         * + `block-device-mapping.status` - The status for the EBS volume (`attaching` | `attached` | `detaching` | `detached`).
         * + `block-device-mapping.volume-id` - The volume ID of the EBS volume.
         * + `capacity-reservation-id` - The ID of the Capacity Reservation into which the instance was launched.
         * + `client-token` - The idempotency token you provided when you launched the instance.
         * + `dns-name` - The public DNS name of the instance.
         * + `group-id` - The ID of the security group for the instance. EC2-Classic only.
         * + `group-name` - The name of the security group for the instance. EC2-Classic only.
         * + `hibernation-options.configured` - A Boolean that indicates whether the instance is enabled for hibernation. A value of `true` means that the instance is enabled for hibernation.
         * + `host-id` - The ID of the Dedicated Host on which the instance is running, if applicable.
         * + `hypervisor` - The hypervisor type of the instance (`ovm` | `xen`). The value `xen` is used for both Xen and Nitro hypervisors.
         * + `iam-instance-profile.arn` - The instance profile associated with the instance. Specified as an ARN.
         * + `image-id` - The ID of the image used to launch the instance.
         * + `instance-id` - The ID of the instance.
         * + `instance-lifecycle` - Indicates whether this is a Spot Instance or a Scheduled Instance (`spot` | `scheduled`).
         * + `instance-state-code` - The state of the instance, as a 16-bit unsigned integer. The high byte is used for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
         * + `instance-state-name` - The state of the instance (`pending` | `running` | `shutting-down` | `terminated` | `stopping` | `stopped`).
         * + `instance-type` - The type of instance (for example, `t2.micro`).
         * + `instance.group-id` - The ID of the security group for the instance.
         * + `instance.group-name` - The name of the security group for the instance.
         * + `ip-address` - The public IPv4 address of the instance.
         * + `kernel-id` - The kernel ID.
         * + `key-name` - The name of the key pair used when the instance was launched.
         * + `launch-index` - When launching multiple instances, this is the index for the instance in the launch group (for example, 0, 1, 2, and so on).
         * + `launch-time` - The time when the instance was launched, in the ISO 8601 format in the UTC time zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, `2021-09-29T11:04:43.305Z`. You can use a wildcard (`*`), for example, `2021-09-29T*`, which matches an entire day.
         * + `metadata-options.http-tokens` - The metadata request authorization state (`optional` | `required`)
         * + `metadata-options.http-put-response-hop-limit` - The http metadata request put response hop limit (integer, possible values `1` to `64`)
         * + `metadata-options.http-endpoint` - Enable or disable metadata access on http endpoint (`enabled` | `disabled`)
         * + `monitoring-state` - Indicates whether detailed monitoring is enabled (`disabled` | `enabled`).
         * + `network-interface.addresses.private-ip-address` - The private IPv4 address associated with the network interface.
         * + `network-interface.addresses.primary` - Specifies whether the IPv4 address of the network interface is the primary private IPv4 address.
         * + `network-interface.addresses.association.public-ip` - The ID of the association of an Elastic IP address (IPv4) with a network interface.
         * + `network-interface.addresses.association.ip-owner-id` - The owner ID of the private IPv4 address associated with the network interface.
         * + `network-interface.association.public-ip` - The address of the Elastic IP address (IPv4) bound to the network interface.
         * + `network-interface.association.ip-owner-id` - The owner of the Elastic IP address (IPv4) associated with the network interface.
         * + `network-interface.association.allocation-id` - The allocation ID returned when you allocated the Elastic IP address (IPv4) for your network interface.
         * + `network-interface.association.association-id` - The association ID returned when the network interface was associated with an IPv4 address.
         * + `network-interface.attachment.attachment-id` - The ID of the interface attachment.
         * + `network-interface.attachment.instance-id` - The ID of the instance to which the network interface is attached.
         * + `network-interface.attachment.instance-owner-id` - The owner ID of the instance to which the network interface is attached.
         * + `network-interface.attachment.device-index` - The device index to which the network interface is attached.
         * + `network-interface.attachment.status` - The status of the attachment (`attaching` | `attached` | `detaching` | `detached`).
         * + `network-interface.attachment.attach-time` - The time that the network interface was attached to an instance.
         * + `network-interface.attachment.delete-on-termination` - Specifies whether the attachment is deleted when an instance is terminated.
         * + `network-interface.availability-zone` - The Availability Zone for the network interface.
         * + `network-interface.description` - The description of the network interface.
         * + `network-interface.group-id` - The ID of a security group associated with the network interface.
         * + `network-interface.group-name` - The name of a security group associated with the network interface.
         * + `network-interface.ipv6-addresses.ipv6-address` - The IPv6 address associated with the network interface.
         * + `network-interface.mac-address` - The MAC address of the network interface.
         * + `network-interface.network-interface-id` - The ID of the network interface.
         * + `network-interface.owner-id` - The ID of the owner of the network interface.
         * + `network-interface.private-dns-name` - The private DNS name of the network interface.
         * + `network-interface.requester-id` - The requester ID for the network interface.
         * + `network-interface.requester-managed` - Indicates whether the network interface is being managed by Amazon Web Services.
         * + `network-interface.status` - The status of the network interface (`available`) | `in-use`).
         * + `network-interface.source-dest-check` - Whether the network interface performs source/destination checking. A value of `true` means that checking is enabled, and `false` means that checking is disabled. The value must be `false` for the network interface to perform network address translation (NAT) in your VPC.
         * + `network-interface.subnet-id` - The ID of the subnet for the network interface.
         * + `network-interface.vpc-id` - The ID of the VPC for the network interface.
         * + `outpost-arn` - The Amazon Resource Name (ARN) of the Outpost.
         * + `owner-id` - The Amazon Web Services account ID of the instance owner.
         * + `placement-group-name` - The name of the placement group for the instance.
         * + `placement-partition-number` - The partition in which the instance is located.
         * + `platform` - The platform. To list only Windows instances, use `windows`.
         * + `private-dns-name` - The private IPv4 DNS name of the instance.
         * + `private-ip-address` - The private IPv4 address of the instance.
         * + `product-code` - The product code associated with the AMI used to launch the instance.
         * + `product-code.type` - The type of product code (`devpay` | `marketplace`).
         * + `ramdisk-id` - The RAM disk ID.
         * + `reason` - The reason for the current state of the instance (for example, shows "User Initiated &#91;date&#93;" when you stop or terminate the instance). Similar to the state-reason-code filter.
         * + `requester-id` - The ID of the entity that launched the instance on your behalf (for example, Amazon Web Services Management Console, Auto Scaling, and so on).
         * + `reservation-id` - The ID of the instance's reservation. A reservation ID is created any time you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be associated with more than one instance if you launch multiple instances using the same launch request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same launch request, you also get one reservation ID.
         * + `root-device-name` - The device name of the root device volume (for example, `/dev/sda1`).
         * + `root-device-type` - The type of the root device volume (`ebs` | `instance-store`).
         * + `source-dest-check` - Indicates whether the instance performs source/destination checking. A value of `true` means that checking is enabled, and `false` means that checking is disabled. The value must be `false` for the instance to perform network address translation (NAT) in your VPC.
         * + `spot-instance-request-id` - The ID of the Spot Instance request.
         * + `state-reason-code` - The reason code for the state change.
         * + `state-reason-message` - A message that describes the state change.
         * + `subnet-id` - The ID of the subnet for the instance.
         * + `tag:<key>` - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key `Owner` and the value `TeamA`, specify `tag:Owner` for the filter name and `TeamA` for the filter value.
         * + `tag-key` - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.
         * + `tenancy` - The tenancy of an instance (`dedicated` | `default` | `host`).
         * + `virtualization-type` - The virtualization type of the instance (`paravirtual` | `hvm`).
         * + `vpc-id` - The ID of the VPC that the instance is running in.
         */
        public var filters: List<Filter>? = null
        /**
         * The instance IDs.
         *
         * Default: Describes all your instances.
         */
        public var instanceIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned `NextToken` value. This value can be between 5 and 1000. You cannot specify this parameter and the instance IDs parameter in the same call.
         */
        public var maxResults: kotlin.Int? = null
        /**
         * The token to request the next page of results.
         */
        public var nextToken: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeInstancesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.instanceIds = x.instanceIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeInstancesRequest = DescribeInstancesRequest(this)
    }
}
