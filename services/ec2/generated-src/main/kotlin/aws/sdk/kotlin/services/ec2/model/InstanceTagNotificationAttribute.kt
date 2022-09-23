// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the registered tag keys for the current Region.
 */
public class InstanceTagNotificationAttribute private constructor(builder: Builder) {
    /**
     * Indicates wheter all tag keys in the current Region are registered to appear in scheduled event notifications. `true` indicates that all tag keys in the current Region are registered.
     */
    public val includeAllTagsOfInstance: kotlin.Boolean? = builder.includeAllTagsOfInstance
    /**
     * The registered tag keys.
     */
    public val instanceTagKeys: List<String>? = builder.instanceTagKeys

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceTagNotificationAttribute = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceTagNotificationAttribute(")
        append("includeAllTagsOfInstance=$includeAllTagsOfInstance,")
        append("instanceTagKeys=$instanceTagKeys)")
    }

    override fun hashCode(): kotlin.Int {
        var result = includeAllTagsOfInstance?.hashCode() ?: 0
        result = 31 * result + (instanceTagKeys?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceTagNotificationAttribute

        if (includeAllTagsOfInstance != other.includeAllTagsOfInstance) return false
        if (instanceTagKeys != other.instanceTagKeys) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceTagNotificationAttribute = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates wheter all tag keys in the current Region are registered to appear in scheduled event notifications. `true` indicates that all tag keys in the current Region are registered.
         */
        public var includeAllTagsOfInstance: kotlin.Boolean? = null
        /**
         * The registered tag keys.
         */
        public var instanceTagKeys: List<String>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceTagNotificationAttribute) : this() {
            this.includeAllTagsOfInstance = x.includeAllTagsOfInstance
            this.instanceTagKeys = x.instanceTagKeys
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceTagNotificationAttribute = InstanceTagNotificationAttribute(this)
    }
}
