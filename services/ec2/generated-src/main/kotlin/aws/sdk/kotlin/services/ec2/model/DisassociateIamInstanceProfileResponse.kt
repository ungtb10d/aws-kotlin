// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class DisassociateIamInstanceProfileResponse private constructor(builder: Builder) {
    /**
     * Information about the IAM instance profile association.
     */
    public val iamInstanceProfileAssociation: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation? = builder.iamInstanceProfileAssociation

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateIamInstanceProfileResponse(")
        append("iamInstanceProfileAssociation=$iamInstanceProfileAssociation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = iamInstanceProfileAssociation?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisassociateIamInstanceProfileResponse

        if (iamInstanceProfileAssociation != other.iamInstanceProfileAssociation) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the IAM instance profile association.
         */
        public var iamInstanceProfileAssociation: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileResponse) : this() {
            this.iamInstanceProfileAssociation = x.iamInstanceProfileAssociation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisassociateIamInstanceProfileResponse = DisassociateIamInstanceProfileResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation] inside the given [block]
         */
        public fun iamInstanceProfileAssociation(block: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation.Builder.() -> kotlin.Unit) {
            this.iamInstanceProfileAssociation = aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation.invoke(block)
        }
    }
}
