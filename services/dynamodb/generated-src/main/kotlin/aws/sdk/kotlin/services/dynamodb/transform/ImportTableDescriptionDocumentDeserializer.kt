// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ImportStatus
import aws.sdk.kotlin.services.dynamodb.model.ImportTableDescription
import aws.sdk.kotlin.services.dynamodb.model.InputCompressionType
import aws.sdk.kotlin.services.dynamodb.model.InputFormat
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.time.Instant

internal fun deserializeImportTableDescriptionDocument(deserializer: Deserializer): ImportTableDescription {
    val builder = ImportTableDescription.Builder()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ClientToken"))
    val CLOUDWATCHLOGGROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("CloudWatchLogGroupArn"))
    val ENDTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("EndTime"))
    val ERRORCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ErrorCount"))
    val FAILURECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("FailureCode"))
    val FAILUREMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("FailureMessage"))
    val IMPORTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ImportArn"))
    val IMPORTSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ImportStatus"))
    val IMPORTEDITEMCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ImportedItemCount"))
    val INPUTCOMPRESSIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("InputCompressionType"))
    val INPUTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("InputFormat"))
    val INPUTFORMATOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("InputFormatOptions"))
    val PROCESSEDITEMCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ProcessedItemCount"))
    val PROCESSEDSIZEBYTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ProcessedSizeBytes"))
    val S3BUCKETSOURCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("S3BucketSource"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("StartTime"))
    val TABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableArn"))
    val TABLECREATIONPARAMETERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("TableCreationParameters"))
    val TABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CLIENTTOKEN_DESCRIPTOR)
        field(CLOUDWATCHLOGGROUPARN_DESCRIPTOR)
        field(ENDTIME_DESCRIPTOR)
        field(ERRORCOUNT_DESCRIPTOR)
        field(FAILURECODE_DESCRIPTOR)
        field(FAILUREMESSAGE_DESCRIPTOR)
        field(IMPORTARN_DESCRIPTOR)
        field(IMPORTSTATUS_DESCRIPTOR)
        field(IMPORTEDITEMCOUNT_DESCRIPTOR)
        field(INPUTCOMPRESSIONTYPE_DESCRIPTOR)
        field(INPUTFORMAT_DESCRIPTOR)
        field(INPUTFORMATOPTIONS_DESCRIPTOR)
        field(PROCESSEDITEMCOUNT_DESCRIPTOR)
        field(PROCESSEDSIZEBYTES_DESCRIPTOR)
        field(S3BUCKETSOURCE_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(TABLEARN_DESCRIPTOR)
        field(TABLECREATIONPARAMETERS_DESCRIPTOR)
        field(TABLEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLIENTTOKEN_DESCRIPTOR.index -> builder.clientToken = deserializeString()
                CLOUDWATCHLOGGROUPARN_DESCRIPTOR.index -> builder.cloudWatchLogGroupArn = deserializeString()
                ENDTIME_DESCRIPTOR.index -> builder.endTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                ERRORCOUNT_DESCRIPTOR.index -> builder.errorCount = deserializeLong()
                FAILURECODE_DESCRIPTOR.index -> builder.failureCode = deserializeString()
                FAILUREMESSAGE_DESCRIPTOR.index -> builder.failureMessage = deserializeString()
                IMPORTARN_DESCRIPTOR.index -> builder.importArn = deserializeString()
                IMPORTSTATUS_DESCRIPTOR.index -> builder.importStatus = deserializeString().let { ImportStatus.fromValue(it) }
                IMPORTEDITEMCOUNT_DESCRIPTOR.index -> builder.importedItemCount = deserializeLong()
                INPUTCOMPRESSIONTYPE_DESCRIPTOR.index -> builder.inputCompressionType = deserializeString().let { InputCompressionType.fromValue(it) }
                INPUTFORMAT_DESCRIPTOR.index -> builder.inputFormat = deserializeString().let { InputFormat.fromValue(it) }
                INPUTFORMATOPTIONS_DESCRIPTOR.index -> builder.inputFormatOptions = deserializeInputFormatOptionsDocument(deserializer)
                PROCESSEDITEMCOUNT_DESCRIPTOR.index -> builder.processedItemCount = deserializeLong()
                PROCESSEDSIZEBYTES_DESCRIPTOR.index -> builder.processedSizeBytes = deserializeLong()
                S3BUCKETSOURCE_DESCRIPTOR.index -> builder.s3BucketSource = deserializeS3BucketSourceDocument(deserializer)
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                TABLEARN_DESCRIPTOR.index -> builder.tableArn = deserializeString()
                TABLECREATIONPARAMETERS_DESCRIPTOR.index -> builder.tableCreationParameters = deserializeTableCreationParametersDocument(deserializer)
                TABLEID_DESCRIPTOR.index -> builder.tableId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
