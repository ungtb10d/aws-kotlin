// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DescribeAvailabilityZonesRequest private constructor(builder: Builder) {
    /**
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
     *
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
     */
    public val allAvailabilityZones: kotlin.Boolean? = builder.allAvailabilityZones
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * + `group-name` - For Availability Zones, use the Region name. For Local Zones, use the name of the group associated with the Local Zone (for example, `us-west-2-lax-1`) For Wavelength Zones, use the name of the group associated with the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
     * + `message` - The Zone message.
     * + `opt-in-status` - The opt-in status (`opted-in`, and `not-opted-in` | `opt-in-not-required`).
     * + `parent-zoneID` - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.
     * + `parent-zoneName` - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.
     * + `region-name` - The name of the Region for the Zone (for example, `us-east-1`).
     * + `state` - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (`available`).
     * + `zone-id` - The ID of the Availability Zone (for example, `use1-az1`), the Local Zone (for example, `usw2-lax1-az1`), or the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
     * + `zone-type` - The type of zone, for example, `local-zone`.
     * + `zone-name` - The name of the Availability Zone (for example, `us-east-1a`), the Local Zone (for example, `us-west-2-lax-1a`), or the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
     * + `zone-type` - The type of zone, for example, `local-zone`.
     */
    public val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     */
    public val zoneIds: List<String>? = builder.zoneIds
    /**
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     */
    public val zoneNames: List<String>? = builder.zoneNames

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeAvailabilityZonesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAvailabilityZonesRequest(")
        append("allAvailabilityZones=$allAvailabilityZones,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("zoneIds=$zoneIds,")
        append("zoneNames=$zoneNames)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allAvailabilityZones?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (zoneIds?.hashCode() ?: 0)
        result = 31 * result + (zoneNames?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeAvailabilityZonesRequest

        if (allAvailabilityZones != other.allAvailabilityZones) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (zoneIds != other.zoneIds) return false
        if (zoneNames != other.zoneNames) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeAvailabilityZonesRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status.
         *
         * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
         */
        public var allAvailabilityZones: kotlin.Boolean? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * + `group-name` - For Availability Zones, use the Region name. For Local Zones, use the name of the group associated with the Local Zone (for example, `us-west-2-lax-1`) For Wavelength Zones, use the name of the group associated with the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
         * + `message` - The Zone message.
         * + `opt-in-status` - The opt-in status (`opted-in`, and `not-opted-in` | `opt-in-not-required`).
         * + `parent-zoneID` - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.
         * + `parent-zoneName` - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.
         * + `region-name` - The name of the Region for the Zone (for example, `us-east-1`).
         * + `state` - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (`available`).
         * + `zone-id` - The ID of the Availability Zone (for example, `use1-az1`), the Local Zone (for example, `usw2-lax1-az1`), or the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
         * + `zone-type` - The type of zone, for example, `local-zone`.
         * + `zone-name` - The name of the Availability Zone (for example, `us-east-1a`), the Local Zone (for example, `us-west-2-lax-1a`), or the Wavelength Zone (for example, `us-east-1-wl1-bos-wlz-1`).
         * + `zone-type` - The type of zone, for example, `local-zone`.
         */
        public var filters: List<Filter>? = null
        /**
         * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        public var zoneIds: List<String>? = null
        /**
         * The names of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        public var zoneNames: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeAvailabilityZonesRequest) : this() {
            this.allAvailabilityZones = x.allAvailabilityZones
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.zoneIds = x.zoneIds
            this.zoneNames = x.zoneNames
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeAvailabilityZonesRequest = DescribeAvailabilityZonesRequest(this)
    }
}
