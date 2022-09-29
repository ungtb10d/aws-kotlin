// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the lifecycle configuration for objects in an Amazon S3 bucket. For more information, see [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the *Amazon S3 User Guide*.
 */
public class BucketLifecycleConfiguration private constructor(builder: Builder) {
    /**
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     */
    public val rules: List<LifecycleRule>? = builder.rules

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.BucketLifecycleConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BucketLifecycleConfiguration(")
        append("rules=$rules)")
    }

    override fun hashCode(): kotlin.Int {
        var result = rules?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BucketLifecycleConfiguration

        if (rules != other.rules) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.BucketLifecycleConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * A lifecycle rule for individual objects in an Amazon S3 bucket.
         */
        public var rules: List<LifecycleRule>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.BucketLifecycleConfiguration) : this() {
            this.rules = x.rules
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.BucketLifecycleConfiguration = BucketLifecycleConfiguration(this)
    }
}
