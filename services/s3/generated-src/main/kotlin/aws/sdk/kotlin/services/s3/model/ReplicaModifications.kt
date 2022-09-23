// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A filter that you can specify for selection for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `Filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
 *
 *  If you don't specify the `Filter` element, Amazon S3 assumes that the replication configuration is the earlier version, V1. In the earlier version, this element is not allowed.
 */
public class ReplicaModifications private constructor(builder: Builder) {
    /**
     * Specifies whether Amazon S3 replicates modifications on replicas.
     */
    public val status: aws.sdk.kotlin.services.s3.model.ReplicaModificationsStatus? = builder.status

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ReplicaModifications = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaModifications(")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = status?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicaModifications

        if (status != other.status) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ReplicaModifications = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Specifies whether Amazon S3 replicates modifications on replicas.
         */
        public var status: aws.sdk.kotlin.services.s3.model.ReplicaModificationsStatus? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ReplicaModifications) : this() {
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ReplicaModifications = ReplicaModifications(this)
    }
}
