// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

public class DescribeFleetHistoryResponse private constructor(builder: Builder) {
    /**
     * The ID of the EC Fleet.
     */
    public val fleetId: kotlin.String? = builder.fleetId
    /**
     * Information about the events in the history of the EC2 Fleet.
     */
    public val historyRecords: List<HistoryRecordEntry>? = builder.historyRecords
    /**
     * The last date and time for the events, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). All records up to this time were retrieved.
     *
     * If `nextToken` indicates that there are more results, this value is not present.
     */
    public val lastEvaluatedTime: aws.smithy.kotlin.runtime.time.Instant? = builder.lastEvaluatedTime
    /**
     * The token for the next set of results.
     */
    public val nextToken: kotlin.String? = builder.nextToken
    /**
     * The start date and time for the events, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
     */
    public val startTime: aws.smithy.kotlin.runtime.time.Instant? = builder.startTime

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFleetHistoryResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFleetHistoryResponse(")
        append("fleetId=$fleetId,")
        append("historyRecords=$historyRecords,")
        append("lastEvaluatedTime=$lastEvaluatedTime,")
        append("nextToken=$nextToken,")
        append("startTime=$startTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = fleetId?.hashCode() ?: 0
        result = 31 * result + (historyRecords?.hashCode() ?: 0)
        result = 31 * result + (lastEvaluatedTime?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (startTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFleetHistoryResponse

        if (fleetId != other.fleetId) return false
        if (historyRecords != other.historyRecords) return false
        if (lastEvaluatedTime != other.lastEvaluatedTime) return false
        if (nextToken != other.nextToken) return false
        if (startTime != other.startTime) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFleetHistoryResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the EC Fleet.
         */
        public var fleetId: kotlin.String? = null
        /**
         * Information about the events in the history of the EC2 Fleet.
         */
        public var historyRecords: List<HistoryRecordEntry>? = null
        /**
         * The last date and time for the events, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z). All records up to this time were retrieved.
         *
         * If `nextToken` indicates that there are more results, this value is not present.
         */
        public var lastEvaluatedTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The token for the next set of results.
         */
        public var nextToken: kotlin.String? = null
        /**
         * The start date and time for the events, in UTC format (for example, *YYYY*-*MM*-*DD*T*HH*:*MM*:*SS*Z).
         */
        public var startTime: aws.smithy.kotlin.runtime.time.Instant? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFleetHistoryResponse) : this() {
            this.fleetId = x.fleetId
            this.historyRecords = x.historyRecords
            this.lastEvaluatedTime = x.lastEvaluatedTime
            this.nextToken = x.nextToken
            this.startTime = x.startTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFleetHistoryResponse = DescribeFleetHistoryResponse(this)
    }
}
