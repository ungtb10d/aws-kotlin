// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ModifyVpcEndpointServicePayerResponsibilityRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer responsibility to the service owner, you cannot set it back to the endpoint owner.
     */
    public val payerResponsibility: aws.sdk.kotlin.services.ec2.model.PayerResponsibility? = builder.payerResponsibility
    /**
     * The ID of the service.
     */
    public val serviceId: kotlin.String? = builder.serviceId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePayerResponsibilityRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpcEndpointServicePayerResponsibilityRequest(")
        append("dryRun=$dryRun,")
        append("payerResponsibility=$payerResponsibility,")
        append("serviceId=$serviceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (payerResponsibility?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpcEndpointServicePayerResponsibilityRequest

        if (dryRun != other.dryRun) return false
        if (payerResponsibility != other.payerResponsibility) return false
        if (serviceId != other.serviceId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePayerResponsibilityRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer responsibility to the service owner, you cannot set it back to the endpoint owner.
         */
        public var payerResponsibility: aws.sdk.kotlin.services.ec2.model.PayerResponsibility? = null
        /**
         * The ID of the service.
         */
        public var serviceId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePayerResponsibilityRequest) : this() {
            this.dryRun = x.dryRun
            this.payerResponsibility = x.payerResponsibility
            this.serviceId = x.serviceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointServicePayerResponsibilityRequest = ModifyVpcEndpointServicePayerResponsibilityRequest(this)
    }
}
