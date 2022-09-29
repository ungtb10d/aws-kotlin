// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DeleteTrafficMirrorFilterRuleResponse private constructor(builder: Builder) {
    /**
     * The ID of the deleted Traffic Mirror rule.
     */
    public val trafficMirrorFilterRuleId: kotlin.String? = builder.trafficMirrorFilterRuleId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTrafficMirrorFilterRuleResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTrafficMirrorFilterRuleResponse(")
        append("trafficMirrorFilterRuleId=$trafficMirrorFilterRuleId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = trafficMirrorFilterRuleId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTrafficMirrorFilterRuleResponse

        if (trafficMirrorFilterRuleId != other.trafficMirrorFilterRuleId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTrafficMirrorFilterRuleResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the deleted Traffic Mirror rule.
         */
        public var trafficMirrorFilterRuleId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTrafficMirrorFilterRuleResponse) : this() {
            this.trafficMirrorFilterRuleId = x.trafficMirrorFilterRuleId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTrafficMirrorFilterRuleResponse = DeleteTrafficMirrorFilterRuleResponse(this)
    }
}
