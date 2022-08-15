// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the DynamoDB Streams configuration for a table in DynamoDB.
 */
public class StreamSpecification private constructor(builder: Builder) {
    /**
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     */
    public val streamEnabled: kotlin.Boolean? = builder.streamEnabled
    /**
     * When an item in the table is modified, `StreamViewType` determines what information is written to the stream for this table. Valid values for `StreamViewType` are:
     * + `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
     * + `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the stream.
     * + `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the stream.
     * + `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to the stream.
     */
    public val streamViewType: aws.sdk.kotlin.services.dynamodb.model.StreamViewType? = builder.streamViewType

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.StreamSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("StreamSpecification(")
        append("streamEnabled=$streamEnabled,")
        append("streamViewType=$streamViewType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = streamEnabled?.hashCode() ?: 0
        result = 31 * result + (streamViewType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as StreamSpecification

        if (streamEnabled != other.streamEnabled) return false
        if (streamViewType != other.streamViewType) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.StreamSpecification = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
         */
        public var streamEnabled: kotlin.Boolean? = null
        /**
         * When an item in the table is modified, `StreamViewType` determines what information is written to the stream for this table. Valid values for `StreamViewType` are:
         * + `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
         * + `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the stream.
         * + `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the stream.
         * + `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to the stream.
         */
        public var streamViewType: aws.sdk.kotlin.services.dynamodb.model.StreamViewType? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.StreamSpecification) : this() {
            this.streamEnabled = x.streamEnabled
            this.streamViewType = x.streamViewType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.StreamSpecification = StreamSpecification(this)
    }
}
