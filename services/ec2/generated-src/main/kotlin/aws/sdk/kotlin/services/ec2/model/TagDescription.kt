// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a tag.
 */
public class TagDescription private constructor(builder: Builder) {
    /**
     * The tag key.
     */
    public val key: kotlin.String? = builder.key
    /**
     * The ID of the resource.
     */
    public val resourceId: kotlin.String? = builder.resourceId
    /**
     * The resource type.
     */
    public val resourceType: aws.sdk.kotlin.services.ec2.model.ResourceType? = builder.resourceType
    /**
     * The tag value.
     */
    public val value: kotlin.String? = builder.value

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TagDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TagDescription(")
        append("key=$key,")
        append("resourceId=$resourceId,")
        append("resourceType=$resourceType,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (resourceId?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TagDescription

        if (key != other.key) return false
        if (resourceId != other.resourceId) return false
        if (resourceType != other.resourceType) return false
        if (value != other.value) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TagDescription = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The tag key.
         */
        public var key: kotlin.String? = null
        /**
         * The ID of the resource.
         */
        public var resourceId: kotlin.String? = null
        /**
         * The resource type.
         */
        public var resourceType: aws.sdk.kotlin.services.ec2.model.ResourceType? = null
        /**
         * The tag value.
         */
        public var value: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TagDescription) : this() {
            this.key = x.key
            this.resourceId = x.resourceId
            this.resourceType = x.resourceType
            this.value = x.value
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TagDescription = TagDescription(this)
    }
}
