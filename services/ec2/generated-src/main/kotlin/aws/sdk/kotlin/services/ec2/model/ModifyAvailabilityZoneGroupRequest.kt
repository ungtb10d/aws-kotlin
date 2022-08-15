// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyAvailabilityZoneGroupRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The name of the Availability Zone group, Local Zone group, or Wavelength Zone group.
     */
    public val groupName: kotlin.String? = builder.groupName
    /**
     * Indicates whether you are opted in to the Local Zone group or Wavelength Zone group. The only valid value is `opted-in`. You must contact [Amazon Web Services Support](https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services) to opt out of a Local Zone or Wavelength Zone group.
     */
    public val optInStatus: aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus? = builder.optInStatus

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneGroupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyAvailabilityZoneGroupRequest(")
        append("dryRun=$dryRun,")
        append("groupName=$groupName,")
        append("optInStatus=$optInStatus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groupName?.hashCode() ?: 0)
        result = 31 * result + (optInStatus?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyAvailabilityZoneGroupRequest

        if (dryRun != other.dryRun) return false
        if (groupName != other.groupName) return false
        if (optInStatus != other.optInStatus) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneGroupRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The name of the Availability Zone group, Local Zone group, or Wavelength Zone group.
         */
        public var groupName: kotlin.String? = null
        /**
         * Indicates whether you are opted in to the Local Zone group or Wavelength Zone group. The only valid value is `opted-in`. You must contact [Amazon Web Services Support](https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services) to opt out of a Local Zone or Wavelength Zone group.
         */
        public var optInStatus: aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneOptInStatus? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneGroupRequest) : this() {
            this.dryRun = x.dryRun
            this.groupName = x.groupName
            this.optInStatus = x.optInStatus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyAvailabilityZoneGroupRequest = ModifyAvailabilityZoneGroupRequest(this)
    }
}
