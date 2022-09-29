// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class RestoreManagedPrefixListVersionResponse private constructor(builder: Builder) {
    /**
     * Information about the prefix list.
     */
    public val prefixList: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList? = builder.prefixList

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RestoreManagedPrefixListVersionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreManagedPrefixListVersionResponse(")
        append("prefixList=$prefixList)")
    }

    override fun hashCode(): kotlin.Int {
        var result = prefixList?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RestoreManagedPrefixListVersionResponse

        if (prefixList != other.prefixList) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RestoreManagedPrefixListVersionResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the prefix list.
         */
        public var prefixList: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RestoreManagedPrefixListVersionResponse) : this() {
            this.prefixList = x.prefixList
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RestoreManagedPrefixListVersionResponse = RestoreManagedPrefixListVersionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ManagedPrefixList] inside the given [block]
         */
        public fun prefixList(block: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList.Builder.() -> kotlin.Unit) {
            this.prefixList = aws.sdk.kotlin.services.ec2.model.ManagedPrefixList.invoke(block)
        }
    }
}
