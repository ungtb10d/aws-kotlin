// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IAM instance profile.
 */
public class LaunchTemplateIamInstanceProfileSpecification private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     */
    public val arn: kotlin.String? = builder.arn
    /**
     * The name of the instance profile.
     */
    public val name: kotlin.String? = builder.name

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateIamInstanceProfileSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateIamInstanceProfileSpecification(")
        append("arn=$arn,")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = arn?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateIamInstanceProfileSpecification

        if (arn != other.arn) return false
        if (name != other.name) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateIamInstanceProfileSpecification = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The Amazon Resource Name (ARN) of the instance profile.
         */
        public var arn: kotlin.String? = null
        /**
         * The name of the instance profile.
         */
        public var name: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateIamInstanceProfileSpecification) : this() {
            this.arn = x.arn
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateIamInstanceProfileSpecification = LaunchTemplateIamInstanceProfileSpecification(this)
    }
}
