// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.AnalyticsExportDestination
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName

internal fun deserializeAnalyticsExportDestinationDocument(deserializer: Deserializer): AnalyticsExportDestination {
    val builder = AnalyticsExportDestination.Builder()
    val S3BUCKETDESTINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("S3BucketDestination"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AnalyticsExportDestination"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(S3BUCKETDESTINATION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                S3BUCKETDESTINATION_DESCRIPTOR.index -> builder.s3BucketDestination = deserializeAnalyticsS3BucketDestinationDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}