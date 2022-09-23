// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class DeleteBackupRequest private constructor(builder: Builder) {
    /**
     * The ARN associated with the backup.
     */
    public val backupArn: kotlin.String? = builder.backupArn

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteBackupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBackupRequest(")
        append("backupArn=$backupArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupArn?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteBackupRequest

        if (backupArn != other.backupArn) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteBackupRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The ARN associated with the backup.
         */
        public var backupArn: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteBackupRequest) : this() {
            this.backupArn = x.backupArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteBackupRequest = DeleteBackupRequest(this)
    }
}
