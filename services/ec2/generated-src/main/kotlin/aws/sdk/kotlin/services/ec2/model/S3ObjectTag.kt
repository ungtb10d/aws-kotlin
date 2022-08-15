// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The tags to apply to the AMI object that will be stored in the Amazon S3 bucket. For more information, see [Categorizing your storage using tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html) in the *Amazon Simple Storage Service User Guide*.
 */
public class S3ObjectTag private constructor(builder: Builder) {
    /**
     * The key of the tag.
     *
     * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with `aws`:.
     */
    public val key: kotlin.String? = builder.key
    /**
     * The value of the tag.
     *
     * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
     */
    public val value: kotlin.String? = builder.value

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.S3ObjectTag = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("S3ObjectTag(")
        append("key=$key,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as S3ObjectTag

        if (key != other.key) return false
        if (value != other.value) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.S3ObjectTag = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The key of the tag.
         *
         * Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with `aws`:.
         */
        public var key: kotlin.String? = null
        /**
         * The value of the tag.
         *
         * Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
         */
        public var value: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.S3ObjectTag) : this() {
            this.key = x.key
            this.value = x.value
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.S3ObjectTag = S3ObjectTag(this)
    }
}
