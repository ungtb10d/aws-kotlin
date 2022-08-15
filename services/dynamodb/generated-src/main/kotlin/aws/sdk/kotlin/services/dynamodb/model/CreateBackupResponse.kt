// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class CreateBackupResponse private constructor(builder: Builder) {
    /**
     * Contains the details of the backup created for the table.
     */
    public val backupDetails: aws.sdk.kotlin.services.dynamodb.model.BackupDetails? = builder.backupDetails

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.CreateBackupResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateBackupResponse(")
        append("backupDetails=$backupDetails)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupDetails?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateBackupResponse

        if (backupDetails != other.backupDetails) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.CreateBackupResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Contains the details of the backup created for the table.
         */
        public var backupDetails: aws.sdk.kotlin.services.dynamodb.model.BackupDetails? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.CreateBackupResponse) : this() {
            this.backupDetails = x.backupDetails
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.CreateBackupResponse = CreateBackupResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.BackupDetails] inside the given [block]
         */
        public fun backupDetails(block: aws.sdk.kotlin.services.dynamodb.model.BackupDetails.Builder.() -> kotlin.Unit) {
            this.backupDetails = aws.sdk.kotlin.services.dynamodb.model.BackupDetails.invoke(block)
        }
    }
}
