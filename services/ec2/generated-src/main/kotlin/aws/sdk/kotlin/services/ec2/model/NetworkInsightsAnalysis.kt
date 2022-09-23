// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a network insights analysis.
 */
public class NetworkInsightsAnalysis private constructor(builder: Builder) {
    /**
     * Potential intermediate components.
     */
    public val alternatePathHints: List<AlternatePathHint>? = builder.alternatePathHints
    /**
     * The explanations. For more information, see [Reachability Analyzer explanation codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html).
     */
    public val explanations: List<Explanation>? = builder.explanations
    /**
     * The Amazon Resource Names (ARN) of the Amazon Web Services resources that the path must traverse.
     */
    public val filterInArns: List<String>? = builder.filterInArns
    /**
     * The components in the path from source to destination.
     */
    public val forwardPathComponents: List<PathComponent>? = builder.forwardPathComponents
    /**
     * The Amazon Resource Name (ARN) of the network insights analysis.
     */
    public val networkInsightsAnalysisArn: kotlin.String? = builder.networkInsightsAnalysisArn
    /**
     * The ID of the network insights analysis.
     */
    public val networkInsightsAnalysisId: kotlin.String? = builder.networkInsightsAnalysisId
    /**
     * The ID of the path.
     */
    public val networkInsightsPathId: kotlin.String? = builder.networkInsightsPathId
    /**
     * Indicates whether the destination is reachable from the source.
     */
    public val networkPathFound: kotlin.Boolean? = builder.networkPathFound
    /**
     * The components in the path from destination to source.
     */
    public val returnPathComponents: List<PathComponent>? = builder.returnPathComponents
    /**
     * The time the analysis started.
     */
    public val startDate: aws.smithy.kotlin.runtime.time.Instant? = builder.startDate
    /**
     * The status of the network insights analysis.
     */
    public val status: aws.sdk.kotlin.services.ec2.model.AnalysisStatus? = builder.status
    /**
     * The status message, if the status is `failed`.
     */
    public val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * The tags.
     */
    public val tags: List<Tag>? = builder.tags
    /**
     * The warning message.
     */
    public val warningMessage: kotlin.String? = builder.warningMessage

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.NetworkInsightsAnalysis = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NetworkInsightsAnalysis(")
        append("alternatePathHints=$alternatePathHints,")
        append("explanations=$explanations,")
        append("filterInArns=$filterInArns,")
        append("forwardPathComponents=$forwardPathComponents,")
        append("networkInsightsAnalysisArn=$networkInsightsAnalysisArn,")
        append("networkInsightsAnalysisId=$networkInsightsAnalysisId,")
        append("networkInsightsPathId=$networkInsightsPathId,")
        append("networkPathFound=$networkPathFound,")
        append("returnPathComponents=$returnPathComponents,")
        append("startDate=$startDate,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("tags=$tags,")
        append("warningMessage=$warningMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = alternatePathHints?.hashCode() ?: 0
        result = 31 * result + (explanations?.hashCode() ?: 0)
        result = 31 * result + (filterInArns?.hashCode() ?: 0)
        result = 31 * result + (forwardPathComponents?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsAnalysisArn?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsAnalysisId?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsPathId?.hashCode() ?: 0)
        result = 31 * result + (networkPathFound?.hashCode() ?: 0)
        result = 31 * result + (returnPathComponents?.hashCode() ?: 0)
        result = 31 * result + (startDate?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (warningMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NetworkInsightsAnalysis

        if (alternatePathHints != other.alternatePathHints) return false
        if (explanations != other.explanations) return false
        if (filterInArns != other.filterInArns) return false
        if (forwardPathComponents != other.forwardPathComponents) return false
        if (networkInsightsAnalysisArn != other.networkInsightsAnalysisArn) return false
        if (networkInsightsAnalysisId != other.networkInsightsAnalysisId) return false
        if (networkInsightsPathId != other.networkInsightsPathId) return false
        if (networkPathFound != other.networkPathFound) return false
        if (returnPathComponents != other.returnPathComponents) return false
        if (startDate != other.startDate) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (tags != other.tags) return false
        if (warningMessage != other.warningMessage) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.NetworkInsightsAnalysis = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Potential intermediate components.
         */
        public var alternatePathHints: List<AlternatePathHint>? = null
        /**
         * The explanations. For more information, see [Reachability Analyzer explanation codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html).
         */
        public var explanations: List<Explanation>? = null
        /**
         * The Amazon Resource Names (ARN) of the Amazon Web Services resources that the path must traverse.
         */
        public var filterInArns: List<String>? = null
        /**
         * The components in the path from source to destination.
         */
        public var forwardPathComponents: List<PathComponent>? = null
        /**
         * The Amazon Resource Name (ARN) of the network insights analysis.
         */
        public var networkInsightsAnalysisArn: kotlin.String? = null
        /**
         * The ID of the network insights analysis.
         */
        public var networkInsightsAnalysisId: kotlin.String? = null
        /**
         * The ID of the path.
         */
        public var networkInsightsPathId: kotlin.String? = null
        /**
         * Indicates whether the destination is reachable from the source.
         */
        public var networkPathFound: kotlin.Boolean? = null
        /**
         * The components in the path from destination to source.
         */
        public var returnPathComponents: List<PathComponent>? = null
        /**
         * The time the analysis started.
         */
        public var startDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The status of the network insights analysis.
         */
        public var status: aws.sdk.kotlin.services.ec2.model.AnalysisStatus? = null
        /**
         * The status message, if the status is `failed`.
         */
        public var statusMessage: kotlin.String? = null
        /**
         * The tags.
         */
        public var tags: List<Tag>? = null
        /**
         * The warning message.
         */
        public var warningMessage: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAnalysis) : this() {
            this.alternatePathHints = x.alternatePathHints
            this.explanations = x.explanations
            this.filterInArns = x.filterInArns
            this.forwardPathComponents = x.forwardPathComponents
            this.networkInsightsAnalysisArn = x.networkInsightsAnalysisArn
            this.networkInsightsAnalysisId = x.networkInsightsAnalysisId
            this.networkInsightsPathId = x.networkInsightsPathId
            this.networkPathFound = x.networkPathFound
            this.returnPathComponents = x.returnPathComponents
            this.startDate = x.startDate
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.tags = x.tags
            this.warningMessage = x.warningMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.NetworkInsightsAnalysis = NetworkInsightsAnalysis(this)
    }
}
