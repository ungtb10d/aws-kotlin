// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class GetSerialConsoleAccessStatusResponse private constructor(builder: Builder) {
    /**
     * If `true`, access to the EC2 serial console of all instances is enabled for your account. If `false`, access to the EC2 serial console of all instances is disabled for your account.
     */
    public val serialConsoleAccessEnabled: kotlin.Boolean? = builder.serialConsoleAccessEnabled

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetSerialConsoleAccessStatusResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetSerialConsoleAccessStatusResponse(")
        append("serialConsoleAccessEnabled=$serialConsoleAccessEnabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = serialConsoleAccessEnabled?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetSerialConsoleAccessStatusResponse

        if (serialConsoleAccessEnabled != other.serialConsoleAccessEnabled) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetSerialConsoleAccessStatusResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * If `true`, access to the EC2 serial console of all instances is enabled for your account. If `false`, access to the EC2 serial console of all instances is disabled for your account.
         */
        public var serialConsoleAccessEnabled: kotlin.Boolean? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetSerialConsoleAccessStatusResponse) : this() {
            this.serialConsoleAccessEnabled = x.serialConsoleAccessEnabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetSerialConsoleAccessStatusResponse = GetSerialConsoleAccessStatusResponse(this)
    }
}
