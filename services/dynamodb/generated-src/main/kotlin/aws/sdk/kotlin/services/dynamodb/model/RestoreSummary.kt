// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Contains details for the restore.
 */
class RestoreSummary private constructor(builder: Builder) {
    /**
     * Point in time or source backup time.
     */
    val restoreDateTime: aws.smithy.kotlin.runtime.time.Instant? = builder.restoreDateTime
    /**
     * Indicates if a restore is in progress or not.
     */
    val restoreInProgress: kotlin.Boolean? = builder.restoreInProgress
    /**
     * The Amazon Resource Name (ARN) of the backup from which the table was restored.
     */
    val sourceBackupArn: kotlin.String? = builder.sourceBackupArn
    /**
     * The ARN of the source table of the backup that is being restored.
     */
    val sourceTableArn: kotlin.String? = builder.sourceTableArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.RestoreSummary = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreSummary(")
        append("restoreDateTime=$restoreDateTime,")
        append("restoreInProgress=$restoreInProgress,")
        append("sourceBackupArn=$sourceBackupArn,")
        append("sourceTableArn=$sourceTableArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = restoreDateTime?.hashCode() ?: 0
        result = 31 * result + (restoreInProgress?.hashCode() ?: 0)
        result = 31 * result + (sourceBackupArn?.hashCode() ?: 0)
        result = 31 * result + (sourceTableArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RestoreSummary

        if (restoreDateTime != other.restoreDateTime) return false
        if (restoreInProgress != other.restoreInProgress) return false
        if (sourceBackupArn != other.sourceBackupArn) return false
        if (sourceTableArn != other.sourceTableArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.RestoreSummary = Builder(this).apply(block).build()

    class Builder {
        /**
         * Point in time or source backup time.
         */
        var restoreDateTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates if a restore is in progress or not.
         */
        var restoreInProgress: kotlin.Boolean? = null
        /**
         * The Amazon Resource Name (ARN) of the backup from which the table was restored.
         */
        var sourceBackupArn: kotlin.String? = null
        /**
         * The ARN of the source table of the backup that is being restored.
         */
        var sourceTableArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.RestoreSummary) : this() {
            this.restoreDateTime = x.restoreDateTime
            this.restoreInProgress = x.restoreInProgress
            this.sourceBackupArn = x.sourceBackupArn
            this.sourceTableArn = x.sourceTableArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.RestoreSummary = RestoreSummary(this)
    }
}