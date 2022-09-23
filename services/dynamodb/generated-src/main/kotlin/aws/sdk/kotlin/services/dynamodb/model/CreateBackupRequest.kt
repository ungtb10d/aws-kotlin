// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



public class CreateBackupRequest private constructor(builder: Builder) {
    /**
     * Specified name for the backup.
     */
    public val backupName: kotlin.String? = builder.backupName
    /**
     * The name of the table.
     */
    public val tableName: kotlin.String? = builder.tableName

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.CreateBackupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateBackupRequest(")
        append("backupName=$backupName,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupName?.hashCode() ?: 0
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateBackupRequest

        if (backupName != other.backupName) return false
        if (tableName != other.tableName) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.CreateBackupRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Specified name for the backup.
         */
        public var backupName: kotlin.String? = null
        /**
         * The name of the table.
         */
        public var tableName: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.CreateBackupRequest) : this() {
            this.backupName = x.backupName
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.CreateBackupRequest = CreateBackupRequest(this)
    }
}
