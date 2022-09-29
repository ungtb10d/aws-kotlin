// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughputDescription
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

internal fun deserializeProvisionedThroughputDescriptionDocument(deserializer: Deserializer): ProvisionedThroughputDescription {
    val builder = ProvisionedThroughputDescription.Builder()
    val LASTDECREASEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("LastDecreaseDateTime"))
    val LASTINCREASEDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("LastIncreaseDateTime"))
    val NUMBEROFDECREASESTODAY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("NumberOfDecreasesToday"))
    val READCAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ReadCapacityUnits"))
    val WRITECAPACITYUNITS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("WriteCapacityUnits"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(LASTDECREASEDATETIME_DESCRIPTOR)
        field(LASTINCREASEDATETIME_DESCRIPTOR)
        field(NUMBEROFDECREASESTODAY_DESCRIPTOR)
        field(READCAPACITYUNITS_DESCRIPTOR)
        field(WRITECAPACITYUNITS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LASTDECREASEDATETIME_DESCRIPTOR.index -> builder.lastDecreaseDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                LASTINCREASEDATETIME_DESCRIPTOR.index -> builder.lastIncreaseDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                NUMBEROFDECREASESTODAY_DESCRIPTOR.index -> builder.numberOfDecreasesToday = deserializeLong()
                READCAPACITYUNITS_DESCRIPTOR.index -> builder.readCapacityUnits = deserializeLong()
                WRITECAPACITYUNITS_DESCRIPTOR.index -> builder.writeCapacityUnits = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
