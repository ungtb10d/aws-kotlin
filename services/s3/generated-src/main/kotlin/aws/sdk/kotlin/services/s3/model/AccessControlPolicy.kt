// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains the elements that set the ACL permissions for an object per grantee.
 */
public class AccessControlPolicy private constructor(builder: Builder) {
    /**
     * A list of grants.
     */
    public val grants: List<Grant>? = builder.grants
    /**
     * Container for the bucket owner's display name and ID.
     */
    public val owner: aws.sdk.kotlin.services.s3.model.Owner? = builder.owner

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.AccessControlPolicy = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AccessControlPolicy(")
        append("grants=$grants,")
        append("owner=$owner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = grants?.hashCode() ?: 0
        result = 31 * result + (owner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AccessControlPolicy

        if (grants != other.grants) return false
        if (owner != other.owner) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.AccessControlPolicy = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A list of grants.
         */
        public var grants: List<Grant>? = null
        /**
         * Container for the bucket owner's display name and ID.
         */
        public var owner: aws.sdk.kotlin.services.s3.model.Owner? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.AccessControlPolicy) : this() {
            this.grants = x.grants
            this.owner = x.owner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.AccessControlPolicy = AccessControlPolicy(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Owner] inside the given [block]
         */
        public fun owner(block: aws.sdk.kotlin.services.s3.model.Owner.Builder.() -> kotlin.Unit) {
            this.owner = aws.sdk.kotlin.services.s3.model.Owner.invoke(block)
        }
    }
}
