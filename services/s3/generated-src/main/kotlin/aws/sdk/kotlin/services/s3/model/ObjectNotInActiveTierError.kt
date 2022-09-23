// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The source object of the COPY action is not in the active tier and is only stored in Amazon S3 Glacier.
 */
public class ObjectNotInActiveTierError private constructor(builder: Builder) : S3Exception() {

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ObjectNotInActiveTierError = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ObjectNotInActiveTierError(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        return this::class.hashCode()
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ObjectNotInActiveTierError

        return true
    }

    public class Builder {

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ObjectNotInActiveTierError) : this() {
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ObjectNotInActiveTierError = ObjectNotInActiveTierError(this)
    }
}
