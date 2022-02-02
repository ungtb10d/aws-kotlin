// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a finding for a Network Access Scope.
 */
class AccessScopeAnalysisFinding private constructor(builder: Builder) {
    /**
     * The finding components.
     */
    val findingComponents: List<PathComponent>? = builder.findingComponents
    /**
     * The ID of the finding.
     */
    val findingId: kotlin.String? = builder.findingId
    /**
     * The ID of the Network Access Scope analysis.
     */
    val networkInsightsAccessScopeAnalysisId: kotlin.String? = builder.networkInsightsAccessScopeAnalysisId
    /**
     * The ID of the Network Access Scope.
     */
    val networkInsightsAccessScopeId: kotlin.String? = builder.networkInsightsAccessScopeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AccessScopeAnalysisFinding = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AccessScopeAnalysisFinding(")
        append("findingComponents=$findingComponents,")
        append("findingId=$findingId,")
        append("networkInsightsAccessScopeAnalysisId=$networkInsightsAccessScopeAnalysisId,")
        append("networkInsightsAccessScopeId=$networkInsightsAccessScopeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = findingComponents?.hashCode() ?: 0
        result = 31 * result + (findingId?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsAccessScopeAnalysisId?.hashCode() ?: 0)
        result = 31 * result + (networkInsightsAccessScopeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AccessScopeAnalysisFinding

        if (findingComponents != other.findingComponents) return false
        if (findingId != other.findingId) return false
        if (networkInsightsAccessScopeAnalysisId != other.networkInsightsAccessScopeAnalysisId) return false
        if (networkInsightsAccessScopeId != other.networkInsightsAccessScopeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AccessScopeAnalysisFinding = Builder(this).apply(block).build()

    class Builder {
        /**
         * The finding components.
         */
        var findingComponents: List<PathComponent>? = null
        /**
         * The ID of the finding.
         */
        var findingId: kotlin.String? = null
        /**
         * The ID of the Network Access Scope analysis.
         */
        var networkInsightsAccessScopeAnalysisId: kotlin.String? = null
        /**
         * The ID of the Network Access Scope.
         */
        var networkInsightsAccessScopeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AccessScopeAnalysisFinding) : this() {
            this.findingComponents = x.findingComponents
            this.findingId = x.findingId
            this.networkInsightsAccessScopeAnalysisId = x.networkInsightsAccessScopeAnalysisId
            this.networkInsightsAccessScopeId = x.networkInsightsAccessScopeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AccessScopeAnalysisFinding = AccessScopeAnalysisFinding(this)
    }
}