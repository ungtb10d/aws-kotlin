// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the provisioned throughput settings for a specified table or index. The
 * settings can be modified using the UpdateTable operation.
 * For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
 * Account, and Table Quotas in the Amazon DynamoDB Developer
 * Guide.
 */
class ProvisionedThroughput private constructor(builder: Builder) {
    /**
     * The maximum number of strongly consistent reads consumed per second before DynamoDB
     * returns a ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
     * Developer Guide.
     * If read/write capacity mode is PAY_PER_REQUEST the value is set to
     * 0.
     */
    val readCapacityUnits: kotlin.Long? = builder.readCapacityUnits
    /**
     * The maximum number of writes consumed per second before DynamoDB returns a
     * ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
     * Developer Guide.
     * If read/write capacity mode is PAY_PER_REQUEST the value is set to
     * 0.
     */
    val writeCapacityUnits: kotlin.Long? = builder.writeCapacityUnits

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ProvisionedThroughput(")
        append("readCapacityUnits=$readCapacityUnits,")
        append("writeCapacityUnits=$writeCapacityUnits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = readCapacityUnits?.hashCode() ?: 0
        result = 31 * result + (writeCapacityUnits?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ProvisionedThroughput

        if (readCapacityUnits != other.readCapacityUnits) return false
        if (writeCapacityUnits != other.writeCapacityUnits) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput = Builder(this).apply(block).build()

    class Builder {
        /**
         * The maximum number of strongly consistent reads consumed per second before DynamoDB
         * returns a ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
         * Developer Guide.
         * If read/write capacity mode is PAY_PER_REQUEST the value is set to
         * 0.
         */
        var readCapacityUnits: kotlin.Long? = null
        /**
         * The maximum number of writes consumed per second before DynamoDB returns a
         * ThrottlingException. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements in the Amazon DynamoDB
         * Developer Guide.
         * If read/write capacity mode is PAY_PER_REQUEST the value is set to
         * 0.
         */
        var writeCapacityUnits: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput) : this() {
            this.readCapacityUnits = x.readCapacityUnits
            this.writeCapacityUnits = x.writeCapacityUnits
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput = ProvisionedThroughput(this)
    }
}