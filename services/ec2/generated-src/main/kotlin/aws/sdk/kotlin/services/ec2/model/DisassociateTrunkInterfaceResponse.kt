// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DisassociateTrunkInterfaceResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to Ensure Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
     */
    public val clientToken: kotlin.String? = builder.clientToken
    /**
     * Returns `true` if the request succeeds; otherwise, it returns an error.
     */
    public val `return`: kotlin.Boolean? = builder.`return`

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateTrunkInterfaceResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateTrunkInterfaceResponse(")
        append("clientToken=$clientToken,")
        append("return=$`return`)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (`return`?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateTrunkInterfaceResponse

        if (clientToken != other.clientToken) return false
        if (`return` != other.`return`) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateTrunkInterfaceResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see [How to Ensure Idempotency](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html).
         */
        public var clientToken: kotlin.String? = null
        /**
         * Returns `true` if the request succeeds; otherwise, it returns an error.
         */
        public var `return`: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateTrunkInterfaceResponse) : this() {
            this.clientToken = x.clientToken
            this.`return` = x.`return`
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateTrunkInterfaceResponse = DisassociateTrunkInterfaceResponse(this)
    }
}
