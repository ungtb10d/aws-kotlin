// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class DescribeTableReplicaAutoScalingResponse private constructor(builder: Builder) {
    /**
     * Represents the auto scaling properties of the table.
     */
    val tableAutoScalingDescription: aws.sdk.kotlin.services.dynamodb.model.TableAutoScalingDescription? = builder.tableAutoScalingDescription

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DescribeTableReplicaAutoScalingResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTableReplicaAutoScalingResponse(")
        append("tableAutoScalingDescription=$tableAutoScalingDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tableAutoScalingDescription?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTableReplicaAutoScalingResponse

        if (tableAutoScalingDescription != other.tableAutoScalingDescription) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DescribeTableReplicaAutoScalingResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Represents the auto scaling properties of the table.
         */
        var tableAutoScalingDescription: aws.sdk.kotlin.services.dynamodb.model.TableAutoScalingDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DescribeTableReplicaAutoScalingResponse) : this() {
            this.tableAutoScalingDescription = x.tableAutoScalingDescription
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DescribeTableReplicaAutoScalingResponse = DescribeTableReplicaAutoScalingResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.TableAutoScalingDescription] inside the given [block]
         */
        fun tableAutoScalingDescription(block: aws.sdk.kotlin.services.dynamodb.model.TableAutoScalingDescription.Builder.() -> kotlin.Unit) {
            this.tableAutoScalingDescription = aws.sdk.kotlin.services.dynamodb.model.TableAutoScalingDescription.invoke(block)
        }
    }
}