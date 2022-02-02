// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateNetworkInsightsAccessScopeResponse private constructor(builder: Builder) {
    /**
     * The Network Access Scope.
     */
    val networkInsightsAccessScope: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScope? = builder.networkInsightsAccessScope
    /**
     * The Network Access Scope content.
     */
    val networkInsightsAccessScopeContent: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScopeContent? = builder.networkInsightsAccessScopeContent

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateNetworkInsightsAccessScopeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateNetworkInsightsAccessScopeResponse(")
        append("networkInsightsAccessScope=$networkInsightsAccessScope,")
        append("networkInsightsAccessScopeContent=$networkInsightsAccessScopeContent)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInsightsAccessScope?.hashCode() ?: 0
        result = 31 * result + (networkInsightsAccessScopeContent?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateNetworkInsightsAccessScopeResponse

        if (networkInsightsAccessScope != other.networkInsightsAccessScope) return false
        if (networkInsightsAccessScopeContent != other.networkInsightsAccessScopeContent) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateNetworkInsightsAccessScopeResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Network Access Scope.
         */
        var networkInsightsAccessScope: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScope? = null
        /**
         * The Network Access Scope content.
         */
        var networkInsightsAccessScopeContent: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScopeContent? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateNetworkInsightsAccessScopeResponse) : this() {
            this.networkInsightsAccessScope = x.networkInsightsAccessScope
            this.networkInsightsAccessScopeContent = x.networkInsightsAccessScopeContent
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateNetworkInsightsAccessScopeResponse = CreateNetworkInsightsAccessScopeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScope] inside the given [block]
         */
        fun networkInsightsAccessScope(block: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScope.Builder.() -> kotlin.Unit) {
            this.networkInsightsAccessScope = aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScope.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScopeContent] inside the given [block]
         */
        fun networkInsightsAccessScopeContent(block: aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScopeContent.Builder.() -> kotlin.Unit) {
            this.networkInsightsAccessScopeContent = aws.sdk.kotlin.services.ec2.model.NetworkInsightsAccessScopeContent.invoke(block)
        }
    }
}