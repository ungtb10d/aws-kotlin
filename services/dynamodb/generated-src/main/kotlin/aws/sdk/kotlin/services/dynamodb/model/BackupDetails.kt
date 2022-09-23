// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains the details of the backup created for the table.
 */
public class BackupDetails private constructor(builder: Builder) {
    /**
     * ARN associated with the backup.
     */
    public val backupArn: kotlin.String? = builder.backupArn
    /**
     * Time at which the backup was created. This is the request time of the backup.
     */
    public val backupCreationDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.backupCreationDateTime
    /**
     * Time at which the automatic on-demand backup created by DynamoDB will expire. This `SYSTEM` on-demand backup expires automatically 35 days after its creation.
     */
    public val backupExpiryDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.backupExpiryDateTime
    /**
     * Name of the requested backup.
     */
    public val backupName: kotlin.String? = builder.backupName
    /**
     * Size of the backup in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
     */
    public val backupSizeBytes: kotlin.Long? = builder.backupSizeBytes
    /**
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     */
    public val backupStatus: aws.sdk.kotlin.services.dynamodb.model.BackupStatus? = builder.backupStatus
    /**
     * BackupType:
     * + `USER` - You create and manage these using the on-demand backup feature.
     * + `SYSTEM` - If you delete a table with point-in-time recovery enabled, a `SYSTEM` backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.
     * + `AWS_BACKUP` - On-demand backup created by you from Backup service.
     */
    public val backupType: aws.sdk.kotlin.services.dynamodb.model.BackupType? = builder.backupType

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.BackupDetails = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BackupDetails(")
        append("backupArn=$backupArn,")
        append("backupCreationDateTime=$backupCreationDateTime,")
        append("backupExpiryDateTime=$backupExpiryDateTime,")
        append("backupName=$backupName,")
        append("backupSizeBytes=$backupSizeBytes,")
        append("backupStatus=$backupStatus,")
        append("backupType=$backupType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupArn?.hashCode() ?: 0
        result = 31 * result + (backupCreationDateTime?.hashCode() ?: 0)
        result = 31 * result + (backupExpiryDateTime?.hashCode() ?: 0)
        result = 31 * result + (backupName?.hashCode() ?: 0)
        result = 31 * result + (backupSizeBytes?.hashCode() ?: 0)
        result = 31 * result + (backupStatus?.hashCode() ?: 0)
        result = 31 * result + (backupType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BackupDetails

        if (backupArn != other.backupArn) return false
        if (backupCreationDateTime != other.backupCreationDateTime) return false
        if (backupExpiryDateTime != other.backupExpiryDateTime) return false
        if (backupName != other.backupName) return false
        if (backupSizeBytes != other.backupSizeBytes) return false
        if (backupStatus != other.backupStatus) return false
        if (backupType != other.backupType) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.BackupDetails = Builder(this).apply(block).build()

    public class Builder {
        /**
         * ARN associated with the backup.
         */
        public var backupArn: kotlin.String? = null
        /**
         * Time at which the backup was created. This is the request time of the backup.
         */
        public var backupCreationDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Time at which the automatic on-demand backup created by DynamoDB will expire. This `SYSTEM` on-demand backup expires automatically 35 days after its creation.
         */
        public var backupExpiryDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Name of the requested backup.
         */
        public var backupName: kotlin.String? = null
        /**
         * Size of the backup in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
         */
        public var backupSizeBytes: kotlin.Long? = null
        /**
         * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
         */
        public var backupStatus: aws.sdk.kotlin.services.dynamodb.model.BackupStatus? = null
        /**
         * BackupType:
         * + `USER` - You create and manage these using the on-demand backup feature.
         * + `SYSTEM` - If you delete a table with point-in-time recovery enabled, a `SYSTEM` backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.
         * + `AWS_BACKUP` - On-demand backup created by you from Backup service.
         */
        public var backupType: aws.sdk.kotlin.services.dynamodb.model.BackupType? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.BackupDetails) : this() {
            this.backupArn = x.backupArn
            this.backupCreationDateTime = x.backupCreationDateTime
            this.backupExpiryDateTime = x.backupExpiryDateTime
            this.backupName = x.backupName
            this.backupSizeBytes = x.backupSizeBytes
            this.backupStatus = x.backupStatus
            this.backupType = x.backupType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.BackupDetails = BackupDetails(this)
    }
}
