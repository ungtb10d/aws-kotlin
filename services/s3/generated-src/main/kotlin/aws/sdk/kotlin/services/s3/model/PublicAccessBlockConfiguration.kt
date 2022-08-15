// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status) in the *Amazon S3 User Guide*.
 */
public class PublicAccessBlockConfiguration private constructor(builder: Builder) {
    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to `TRUE` causes the following behavior:
     * + PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
     * + PUT Object calls fail if the request includes a public ACL.
     * + PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     */
    public val blockPublicAcls: kotlin.Boolean = builder.blockPublicAcls
    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     */
    public val blockPublicPolicy: kotlin.Boolean = builder.blockPublicPolicy
    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     */
    public val ignorePublicAcls: kotlin.Boolean = builder.ignorePublicAcls
    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to `TRUE` restricts access to this bucket to only Amazon Web Service principals and authorized users within this account if the bucket has a public policy.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     */
    public val restrictPublicBuckets: kotlin.Boolean = builder.restrictPublicBuckets

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PublicAccessBlockConfiguration(")
        append("blockPublicAcls=$blockPublicAcls,")
        append("blockPublicPolicy=$blockPublicPolicy,")
        append("ignorePublicAcls=$ignorePublicAcls,")
        append("restrictPublicBuckets=$restrictPublicBuckets)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blockPublicAcls.hashCode()
        result = 31 * result + (blockPublicPolicy.hashCode())
        result = 31 * result + (ignorePublicAcls.hashCode())
        result = 31 * result + (restrictPublicBuckets.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PublicAccessBlockConfiguration

        if (blockPublicAcls != other.blockPublicAcls) return false
        if (blockPublicPolicy != other.blockPublicPolicy) return false
        if (ignorePublicAcls != other.ignorePublicAcls) return false
        if (restrictPublicBuckets != other.restrictPublicBuckets) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to `TRUE` causes the following behavior:
         * + PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
         * + PUT Object calls fail if the request includes a public ACL.
         * + PUT Bucket calls fail if the request includes a public ACL.
         *
         * Enabling this setting doesn't affect existing policies or ACLs.
         */
        public var blockPublicAcls: kotlin.Boolean = false
        /**
         * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
         *
         * Enabling this setting doesn't affect existing bucket policies.
         */
        public var blockPublicPolicy: kotlin.Boolean = false
        /**
         * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
         *
         * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
         */
        public var ignorePublicAcls: kotlin.Boolean = false
        /**
         * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to `TRUE` restricts access to this bucket to only Amazon Web Service principals and authorized users within this account if the bucket has a public policy.
         *
         * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
         */
        public var restrictPublicBuckets: kotlin.Boolean = false

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration) : this() {
            this.blockPublicAcls = x.blockPublicAcls
            this.blockPublicPolicy = x.blockPublicPolicy
            this.ignorePublicAcls = x.ignorePublicAcls
            this.restrictPublicBuckets = x.restrictPublicBuckets
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration = PublicAccessBlockConfiguration(this)
    }
}
