// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class EnableEbsEncryptionByDefaultRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableEbsEncryptionByDefaultRequest(")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableEbsEncryptionByDefaultRequest

        if (dryRun != other.dryRun) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultRequest) : this() {
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultRequest = EnableEbsEncryptionByDefaultRequest(this)
    }
}
