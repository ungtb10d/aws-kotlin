// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a security group.
 */
public class GroupIdentifier private constructor(builder: Builder) {
    /**
     * The ID of the security group.
     */
    public val groupId: kotlin.String? = builder.groupId
    /**
     * The name of the security group.
     */
    public val groupName: kotlin.String? = builder.groupName

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GroupIdentifier = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GroupIdentifier(")
        append("groupId=$groupId,")
        append("groupName=$groupName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groupId?.hashCode() ?: 0
        result = 31 * result + (groupName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GroupIdentifier

        if (groupId != other.groupId) return false
        if (groupName != other.groupName) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GroupIdentifier = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the security group.
         */
        public var groupId: kotlin.String? = null
        /**
         * The name of the security group.
         */
        public var groupName: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GroupIdentifier) : this() {
            this.groupId = x.groupId
            this.groupName = x.groupName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GroupIdentifier = GroupIdentifier(this)
    }
}
