// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateTrafficMirrorTargetResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
     */
    public val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the Traffic Mirror target.
     */
    public val trafficMirrorTarget: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget? = builder.trafficMirrorTarget

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTrafficMirrorTargetResponse(")
        append("clientToken=$clientToken,")
        append("trafficMirrorTarget=$trafficMirrorTarget)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (trafficMirrorTarget?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTrafficMirrorTargetResponse

        if (clientToken != other.clientToken) return false
        if (trafficMirrorTarget != other.trafficMirrorTarget) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to ensure idempotency](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html).
         */
        public var clientToken: kotlin.String? = null
        /**
         * Information about the Traffic Mirror target.
         */
        public var trafficMirrorTarget: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetResponse) : this() {
            this.clientToken = x.clientToken
            this.trafficMirrorTarget = x.trafficMirrorTarget
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetResponse = CreateTrafficMirrorTargetResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget] inside the given [block]
         */
        public fun trafficMirrorTarget(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget.Builder.() -> kotlin.Unit) {
            this.trafficMirrorTarget = aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget.invoke(block)
        }
    }
}
