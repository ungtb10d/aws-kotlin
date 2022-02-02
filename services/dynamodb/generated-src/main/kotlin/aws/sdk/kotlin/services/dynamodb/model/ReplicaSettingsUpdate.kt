// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the settings for a global table in a Region that will be modified.
 */
class ReplicaSettingsUpdate private constructor(builder: Builder) {
    /**
     * The Region of the replica to be added.
     */
    val regionName: kotlin.String? = builder.regionName
    /**
     * Represents the settings of a global secondary index for a global table that will be
     * modified.
     */
    val replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>? = builder.replicaGlobalSecondaryIndexSettingsUpdate
    /**
     * Auto scaling settings for managing a global table replica's read capacity
     * units.
     */
    val replicaProvisionedReadCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
    /**
     * The maximum number of strongly consistent reads consumed per second before DynamoDB
     * returns a ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
     * Developer Guide.
     */
    val replicaProvisionedReadCapacityUnits: kotlin.Long? = builder.replicaProvisionedReadCapacityUnits
    /**
     * Replica-specific table class. If not specified, uses the source table's
     * table class.
     */
    val replicaTableClass: aws.sdk.kotlin.services.dynamodb.model.TableClass? = builder.replicaTableClass

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsUpdate = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaSettingsUpdate(")
        append("regionName=$regionName,")
        append("replicaGlobalSecondaryIndexSettingsUpdate=$replicaGlobalSecondaryIndexSettingsUpdate,")
        append("replicaProvisionedReadCapacityAutoScalingSettingsUpdate=$replicaProvisionedReadCapacityAutoScalingSettingsUpdate,")
        append("replicaProvisionedReadCapacityUnits=$replicaProvisionedReadCapacityUnits,")
        append("replicaTableClass=$replicaTableClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = regionName?.hashCode() ?: 0
        result = 31 * result + (replicaGlobalSecondaryIndexSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedReadCapacityAutoScalingSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedReadCapacityUnits?.hashCode() ?: 0)
        result = 31 * result + (replicaTableClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicaSettingsUpdate

        if (regionName != other.regionName) return false
        if (replicaGlobalSecondaryIndexSettingsUpdate != other.replicaGlobalSecondaryIndexSettingsUpdate) return false
        if (replicaProvisionedReadCapacityAutoScalingSettingsUpdate != other.replicaProvisionedReadCapacityAutoScalingSettingsUpdate) return false
        if (replicaProvisionedReadCapacityUnits != other.replicaProvisionedReadCapacityUnits) return false
        if (replicaTableClass != other.replicaTableClass) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsUpdate = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Region of the replica to be added.
         */
        var regionName: kotlin.String? = null
        /**
         * Represents the settings of a global secondary index for a global table that will be
         * modified.
         */
        var replicaGlobalSecondaryIndexSettingsUpdate: List<ReplicaGlobalSecondaryIndexSettingsUpdate>? = null
        /**
         * Auto scaling settings for managing a global table replica's read capacity
         * units.
         */
        var replicaProvisionedReadCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = null
        /**
         * The maximum number of strongly consistent reads consumed per second before DynamoDB
         * returns a ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
         * Developer Guide.
         */
        var replicaProvisionedReadCapacityUnits: kotlin.Long? = null
        /**
         * Replica-specific table class. If not specified, uses the source table's
         * table class.
         */
        var replicaTableClass: aws.sdk.kotlin.services.dynamodb.model.TableClass? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsUpdate) : this() {
            this.regionName = x.regionName
            this.replicaGlobalSecondaryIndexSettingsUpdate = x.replicaGlobalSecondaryIndexSettingsUpdate
            this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = x.replicaProvisionedReadCapacityAutoScalingSettingsUpdate
            this.replicaProvisionedReadCapacityUnits = x.replicaProvisionedReadCapacityUnits
            this.replicaTableClass = x.replicaTableClass
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsUpdate = ReplicaSettingsUpdate(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate] inside the given [block]
         */
        fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.Builder.() -> kotlin.Unit) {
            this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.invoke(block)
        }
    }
}