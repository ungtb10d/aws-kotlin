// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a replica to be created.
 */
public class CreateReplicationGroupMemberAction private constructor(builder: Builder) {
    /**
     * Replica-specific global secondary index settings.
     */
    public val globalSecondaryIndexes: List<ReplicaGlobalSecondaryIndex>? = builder.globalSecondaryIndexes
    /**
     * The KMS key that should be used for KMS encryption in the new replica. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS key `alias/aws/dynamodb`.
     */
    public val kmsMasterKeyId: kotlin.String? = builder.kmsMasterKeyId
    /**
     * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
     */
    public val provisionedThroughputOverride: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride? = builder.provisionedThroughputOverride
    /**
     * The Region where the new replica will be created.
     */
    public val regionName: kotlin.String? = builder.regionName
    /**
     * Replica-specific table class. If not specified, uses the source table's table class.
     */
    public val tableClassOverride: aws.sdk.kotlin.services.dynamodb.model.TableClass? = builder.tableClassOverride

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.CreateReplicationGroupMemberAction = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateReplicationGroupMemberAction(")
        append("globalSecondaryIndexes=$globalSecondaryIndexes,")
        append("kmsMasterKeyId=$kmsMasterKeyId,")
        append("provisionedThroughputOverride=$provisionedThroughputOverride,")
        append("regionName=$regionName,")
        append("tableClassOverride=$tableClassOverride)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalSecondaryIndexes?.hashCode() ?: 0
        result = 31 * result + (kmsMasterKeyId?.hashCode() ?: 0)
        result = 31 * result + (provisionedThroughputOverride?.hashCode() ?: 0)
        result = 31 * result + (regionName?.hashCode() ?: 0)
        result = 31 * result + (tableClassOverride?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateReplicationGroupMemberAction

        if (globalSecondaryIndexes != other.globalSecondaryIndexes) return false
        if (kmsMasterKeyId != other.kmsMasterKeyId) return false
        if (provisionedThroughputOverride != other.provisionedThroughputOverride) return false
        if (regionName != other.regionName) return false
        if (tableClassOverride != other.tableClassOverride) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.CreateReplicationGroupMemberAction = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Replica-specific global secondary index settings.
         */
        public var globalSecondaryIndexes: List<ReplicaGlobalSecondaryIndex>? = null
        /**
         * The KMS key that should be used for KMS encryption in the new replica. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS key `alias/aws/dynamodb`.
         */
        public var kmsMasterKeyId: kotlin.String? = null
        /**
         * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
         */
        public var provisionedThroughputOverride: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride? = null
        /**
         * The Region where the new replica will be created.
         */
        public var regionName: kotlin.String? = null
        /**
         * Replica-specific table class. If not specified, uses the source table's table class.
         */
        public var tableClassOverride: aws.sdk.kotlin.services.dynamodb.model.TableClass? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.CreateReplicationGroupMemberAction) : this() {
            this.globalSecondaryIndexes = x.globalSecondaryIndexes
            this.kmsMasterKeyId = x.kmsMasterKeyId
            this.provisionedThroughputOverride = x.provisionedThroughputOverride
            this.regionName = x.regionName
            this.tableClassOverride = x.tableClassOverride
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.CreateReplicationGroupMemberAction = CreateReplicationGroupMemberAction(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride] inside the given [block]
         */
        public fun provisionedThroughputOverride(block: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride.Builder.() -> kotlin.Unit) {
            this.provisionedThroughputOverride = aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputOverride.invoke(block)
        }
    }
}
