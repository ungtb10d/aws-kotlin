// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The instance details to specify which volumes should be snapshotted.
 */
public class InstanceSpecification private constructor(builder: Builder) {
    /**
     * Excludes the root volume from being snapshotted.
     */
    public val excludeBootVolume: kotlin.Boolean? = builder.excludeBootVolume
    /**
     * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of the root volume, the request fails. To exclude the root volume, use **ExcludeBootVolume**.
     *
     * You can specify up to 40 volume IDs per request.
     */
    public val excludeDataVolumeIds: List<String>? = builder.excludeDataVolumeIds
    /**
     * The instance to specify which volumes should be snapshotted.
     */
    public val instanceId: kotlin.String? = builder.instanceId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceSpecification(")
        append("excludeBootVolume=$excludeBootVolume,")
        append("excludeDataVolumeIds=$excludeDataVolumeIds,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = excludeBootVolume?.hashCode() ?: 0
        result = 31 * result + (excludeDataVolumeIds?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceSpecification

        if (excludeBootVolume != other.excludeBootVolume) return false
        if (excludeDataVolumeIds != other.excludeDataVolumeIds) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceSpecification = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Excludes the root volume from being snapshotted.
         */
        public var excludeBootVolume: kotlin.Boolean? = null
        /**
         * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of the root volume, the request fails. To exclude the root volume, use **ExcludeBootVolume**.
         *
         * You can specify up to 40 volume IDs per request.
         */
        public var excludeDataVolumeIds: List<String>? = null
        /**
         * The instance to specify which volumes should be snapshotted.
         */
        public var instanceId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceSpecification) : this() {
            this.excludeBootVolume = x.excludeBootVolume
            this.excludeDataVolumeIds = x.excludeDataVolumeIds
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceSpecification = InstanceSpecification(this)
    }
}
