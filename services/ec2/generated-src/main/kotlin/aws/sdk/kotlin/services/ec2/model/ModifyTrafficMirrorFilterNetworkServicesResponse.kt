// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTrafficMirrorFilterNetworkServicesResponse private constructor(builder: Builder) {
    /**
     * The Traffic Mirror filter that the network service is associated with.
     */
    val trafficMirrorFilter: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter? = builder.trafficMirrorFilter

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTrafficMirrorFilterNetworkServicesResponse(")
        append("trafficMirrorFilter=$trafficMirrorFilter)")
    }

    override fun hashCode(): kotlin.Int {
        var result = trafficMirrorFilter?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTrafficMirrorFilterNetworkServicesResponse

        if (trafficMirrorFilter != other.trafficMirrorFilter) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Traffic Mirror filter that the network service is associated with.
         */
        var trafficMirrorFilter: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResponse) : this() {
            this.trafficMirrorFilter = x.trafficMirrorFilter
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResponse = ModifyTrafficMirrorFilterNetworkServicesResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter] inside the given [block]
         */
        fun trafficMirrorFilter(block: aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter.Builder.() -> kotlin.Unit) {
            this.trafficMirrorFilter = aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilter.invoke(block)
        }
    }
}