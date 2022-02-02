// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class UpdateGlobalTableSettingsRequest private constructor(builder: Builder) {
    /**
     * The billing mode of the global table. If GlobalTableBillingMode is not
     * specified, the global table defaults to PROVISIONED capacity billing
     * mode.
     * PROVISIONED - We recommend using PROVISIONED for
     * predictable workloads. PROVISIONED sets the billing mode to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual">Provisioned Mode.
     * PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST
     * for unpredictable workloads. PAY_PER_REQUEST sets the billing mode
     * to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand">On-Demand Mode.
     */
    val globalTableBillingMode: aws.sdk.kotlin.services.dynamodb.model.BillingMode? = builder.globalTableBillingMode
    /**
     * Represents the settings of a global secondary index for a global table that will be
     * modified.
     */
    val globalTableGlobalSecondaryIndexSettingsUpdate: List<GlobalTableGlobalSecondaryIndexSettingsUpdate>? = builder.globalTableGlobalSecondaryIndexSettingsUpdate
    /**
     * The name of the global table
     */
    val globalTableName: kotlin.String? = builder.globalTableName
    /**
     * Auto scaling settings for managing provisioned write capacity for the global
     * table.
     */
    val globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = builder.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
    /**
     * The maximum number of writes consumed per second before DynamoDB returns a
     * ThrottlingException.
     */
    val globalTableProvisionedWriteCapacityUnits: kotlin.Long? = builder.globalTableProvisionedWriteCapacityUnits
    /**
     * Represents the settings for a global table in a Region that will be modified.
     */
    val replicaSettingsUpdate: List<ReplicaSettingsUpdate>? = builder.replicaSettingsUpdate

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableSettingsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateGlobalTableSettingsRequest(")
        append("globalTableBillingMode=$globalTableBillingMode,")
        append("globalTableGlobalSecondaryIndexSettingsUpdate=$globalTableGlobalSecondaryIndexSettingsUpdate,")
        append("globalTableName=$globalTableName,")
        append("globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate=$globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate,")
        append("globalTableProvisionedWriteCapacityUnits=$globalTableProvisionedWriteCapacityUnits,")
        append("replicaSettingsUpdate=$replicaSettingsUpdate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalTableBillingMode?.hashCode() ?: 0
        result = 31 * result + (globalTableGlobalSecondaryIndexSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (globalTableName?.hashCode() ?: 0)
        result = 31 * result + (globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate?.hashCode() ?: 0)
        result = 31 * result + (globalTableProvisionedWriteCapacityUnits?.hashCode() ?: 0)
        result = 31 * result + (replicaSettingsUpdate?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateGlobalTableSettingsRequest

        if (globalTableBillingMode != other.globalTableBillingMode) return false
        if (globalTableGlobalSecondaryIndexSettingsUpdate != other.globalTableGlobalSecondaryIndexSettingsUpdate) return false
        if (globalTableName != other.globalTableName) return false
        if (globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate != other.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) return false
        if (globalTableProvisionedWriteCapacityUnits != other.globalTableProvisionedWriteCapacityUnits) return false
        if (replicaSettingsUpdate != other.replicaSettingsUpdate) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableSettingsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The billing mode of the global table. If GlobalTableBillingMode is not
         * specified, the global table defaults to PROVISIONED capacity billing
         * mode.
         * PROVISIONED - We recommend using PROVISIONED for
         * predictable workloads. PROVISIONED sets the billing mode to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual">Provisioned Mode.
         * PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST
         * for unpredictable workloads. PAY_PER_REQUEST sets the billing mode
         * to <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand">On-Demand Mode.
         */
        var globalTableBillingMode: aws.sdk.kotlin.services.dynamodb.model.BillingMode? = null
        /**
         * Represents the settings of a global secondary index for a global table that will be
         * modified.
         */
        var globalTableGlobalSecondaryIndexSettingsUpdate: List<GlobalTableGlobalSecondaryIndexSettingsUpdate>? = null
        /**
         * The name of the global table
         */
        var globalTableName: kotlin.String? = null
        /**
         * Auto scaling settings for managing provisioned write capacity for the global
         * table.
         */
        var globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate? = null
        /**
         * The maximum number of writes consumed per second before DynamoDB returns a
         * ThrottlingException.
         */
        var globalTableProvisionedWriteCapacityUnits: kotlin.Long? = null
        /**
         * Represents the settings for a global table in a Region that will be modified.
         */
        var replicaSettingsUpdate: List<ReplicaSettingsUpdate>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableSettingsRequest) : this() {
            this.globalTableBillingMode = x.globalTableBillingMode
            this.globalTableGlobalSecondaryIndexSettingsUpdate = x.globalTableGlobalSecondaryIndexSettingsUpdate
            this.globalTableName = x.globalTableName
            this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = x.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
            this.globalTableProvisionedWriteCapacityUnits = x.globalTableProvisionedWriteCapacityUnits
            this.replicaSettingsUpdate = x.replicaSettingsUpdate
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalTableSettingsRequest = UpdateGlobalTableSettingsRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate] inside the given [block]
         */
        fun globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.Builder.() -> kotlin.Unit) {
            this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsUpdate.invoke(block)
        }
    }
}