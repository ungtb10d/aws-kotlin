// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceIamInstanceProfileAssociationRequest private constructor(builder: Builder) {
    /**
     * The ID of the existing IAM instance profile association.
     */
    val associationId: kotlin.String? = builder.associationId
    /**
     * The IAM instance profile.
     */
    val iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = builder.iamInstanceProfile

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceIamInstanceProfileAssociationRequest(")
        append("associationId=$associationId,")
        append("iamInstanceProfile=$iamInstanceProfile)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (iamInstanceProfile?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplaceIamInstanceProfileAssociationRequest

        if (associationId != other.associationId) return false
        if (iamInstanceProfile != other.iamInstanceProfile) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the existing IAM instance profile association.
         */
        var associationId: kotlin.String? = null
        /**
         * The IAM instance profile.
         */
        var iamInstanceProfile: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest) : this() {
            this.associationId = x.associationId
            this.iamInstanceProfile = x.iamInstanceProfile
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest = ReplaceIamInstanceProfileAssociationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification] inside the given [block]
         */
        fun iamInstanceProfile(block: aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.Builder.() -> kotlin.Unit) {
            this.iamInstanceProfile = aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification.invoke(block)
        }
    }
}