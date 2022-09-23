// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



public class GetBucketVersioningResponse private constructor(builder: Builder) {
    /**
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
     */
    public val mfaDelete: aws.sdk.kotlin.services.s3.model.MfaDeleteStatus? = builder.mfaDelete
    /**
     * The versioning state of the bucket.
     */
    public val status: aws.sdk.kotlin.services.s3.model.BucketVersioningStatus? = builder.status

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketVersioningResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketVersioningResponse(")
        append("mfaDelete=$mfaDelete,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = mfaDelete?.hashCode() ?: 0
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketVersioningResponse

        if (mfaDelete != other.mfaDelete) return false
        if (status != other.status) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketVersioningResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
         */
        public var mfaDelete: aws.sdk.kotlin.services.s3.model.MfaDeleteStatus? = null
        /**
         * The versioning state of the bucket.
         */
        public var status: aws.sdk.kotlin.services.s3.model.BucketVersioningStatus? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketVersioningResponse) : this() {
            this.mfaDelete = x.mfaDelete
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketVersioningResponse = GetBucketVersioningResponse(this)
    }
}
