// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DisassociateIamInstanceProfileRequest private constructor(builder: Builder) {
    /**
     * The ID of the IAM instance profile association.
     */
    public val associationId: kotlin.String? = builder.associationId

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateIamInstanceProfileRequest(")
        append("associationId=$associationId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateIamInstanceProfileRequest

        if (associationId != other.associationId) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ID of the IAM instance profile association.
         */
        public var associationId: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileRequest) : this() {
            this.associationId = x.associationId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileRequest = DisassociateIamInstanceProfileRequest(this)
    }
}
