// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a replica to be deleted.
 */
public class DeleteReplicationGroupMemberAction private constructor(builder: Builder) {
    /**
     * The Region where the replica exists.
     */
    public val regionName: kotlin.String? = builder.regionName

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteReplicationGroupMemberAction = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteReplicationGroupMemberAction(")
        append("regionName=$regionName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = regionName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteReplicationGroupMemberAction

        if (regionName != other.regionName) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteReplicationGroupMemberAction = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The Region where the replica exists.
         */
        public var regionName: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteReplicationGroupMemberAction) : this() {
            this.regionName = x.regionName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteReplicationGroupMemberAction = DeleteReplicationGroupMemberAction(this)
    }
}
