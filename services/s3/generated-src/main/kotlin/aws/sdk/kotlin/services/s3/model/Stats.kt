// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for the stats details.
 */
public class Stats private constructor(builder: Builder) {
    /**
     * The total number of uncompressed object bytes processed.
     */
    public val bytesProcessed: kotlin.Long = builder.bytesProcessed
    /**
     * The total number of bytes of records payload data returned.
     */
    public val bytesReturned: kotlin.Long = builder.bytesReturned
    /**
     * The total number of object bytes scanned.
     */
    public val bytesScanned: kotlin.Long = builder.bytesScanned

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Stats = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Stats(")
        append("bytesProcessed=$bytesProcessed,")
        append("bytesReturned=$bytesReturned,")
        append("bytesScanned=$bytesScanned)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bytesProcessed.hashCode()
        result = 31 * result + (bytesReturned.hashCode())
        result = 31 * result + (bytesScanned.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Stats

        if (bytesProcessed != other.bytesProcessed) return false
        if (bytesReturned != other.bytesReturned) return false
        if (bytesScanned != other.bytesScanned) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Stats = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The total number of uncompressed object bytes processed.
         */
        public var bytesProcessed: kotlin.Long = 0L
        /**
         * The total number of bytes of records payload data returned.
         */
        public var bytesReturned: kotlin.Long = 0L
        /**
         * The total number of object bytes scanned.
         */
        public var bytesScanned: kotlin.Long = 0L

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Stats) : this() {
            this.bytesProcessed = x.bytesProcessed
            this.bytesReturned = x.bytesReturned
            this.bytesScanned = x.bytesScanned
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Stats = Stats(this)
    }
}
