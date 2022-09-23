// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The tags to apply to a resource when the resource is being created.
 *
 * The `Valid Values` lists all the resource types that can be tagged. However, the action you're using might not support tagging all of these resource types. If you try to tag a resource type that is unsupported for the action you're using, you'll get an error.
 */
public class TagSpecification private constructor(builder: Builder) {
    /**
     * The type of resource to tag on creation.
     */
    public val resourceType: aws.sdk.kotlin.services.ec2.model.ResourceType? = builder.resourceType
    /**
     * The tags to apply to the resource.
     */
    public val tags: List<Tag>? = builder.tags

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TagSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TagSpecification(")
        append("resourceType=$resourceType,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceType?.hashCode() ?: 0
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TagSpecification

        if (resourceType != other.resourceType) return false
        if (tags != other.tags) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TagSpecification = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The type of resource to tag on creation.
         */
        public var resourceType: aws.sdk.kotlin.services.ec2.model.ResourceType? = null
        /**
         * The tags to apply to the resource.
         */
        public var tags: List<Tag>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TagSpecification) : this() {
            this.resourceType = x.resourceType
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TagSpecification = TagSpecification(this)
    }
}
