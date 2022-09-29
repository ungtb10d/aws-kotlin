// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The container element for Object Lock configuration parameters.
 */
public class ObjectLockConfiguration private constructor(builder: Builder) {
    /**
     * Indicates whether this bucket has an Object Lock configuration enabled. Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public val objectLockEnabled: aws.sdk.kotlin.services.s3.model.ObjectLockEnabled? = builder.objectLockEnabled
    /**
     * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply `ObjectLockConfiguration` to a bucket. Bucket settings require both a mode and a period. The period can be either `Days` or `Years` but you must select one. You cannot specify `Days` and `Years` at the same time.
     */
    public val rule: aws.sdk.kotlin.services.s3.model.ObjectLockRule? = builder.rule

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ObjectLockConfiguration(")
        append("objectLockEnabled=$objectLockEnabled,")
        append("rule=$rule)")
    }

    override fun hashCode(): kotlin.Int {
        var result = objectLockEnabled?.hashCode() ?: 0
        result = 31 * result + (rule?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ObjectLockConfiguration

        if (objectLockEnabled != other.objectLockEnabled) return false
        if (rule != other.rule) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates whether this bucket has an Object Lock configuration enabled. Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
         */
        public var objectLockEnabled: aws.sdk.kotlin.services.s3.model.ObjectLockEnabled? = null
        /**
         * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply `ObjectLockConfiguration` to a bucket. Bucket settings require both a mode and a period. The period can be either `Days` or `Years` but you must select one. You cannot specify `Days` and `Years` at the same time.
         */
        public var rule: aws.sdk.kotlin.services.s3.model.ObjectLockRule? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration) : this() {
            this.objectLockEnabled = x.objectLockEnabled
            this.rule = x.rule
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration = ObjectLockConfiguration(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ObjectLockRule] inside the given [block]
         */
        public fun rule(block: aws.sdk.kotlin.services.s3.model.ObjectLockRule.Builder.() -> kotlin.Unit) {
            this.rule = aws.sdk.kotlin.services.s3.model.ObjectLockRule.invoke(block)
        }
    }
}
