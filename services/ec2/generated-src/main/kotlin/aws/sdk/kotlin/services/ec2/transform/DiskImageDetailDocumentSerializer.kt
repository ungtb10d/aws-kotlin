// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DiskImageDetail
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeDiskImageDetailDocument(serializer: Serializer, input: DiskImageDetail) {
    val BYTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, FormUrlSerialName("Bytes"))
    val FORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("Format"))
    val IMPORTMANIFESTURL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ImportManifestUrl"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DiskImageDetail"))
        field(BYTES_DESCRIPTOR)
        field(FORMAT_DESCRIPTOR)
        field(IMPORTMANIFESTURL_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.bytes?.let { field(BYTES_DESCRIPTOR, it) }
        input.format?.let { field(FORMAT_DESCRIPTOR, it.value) }
        input.importManifestUrl?.let { field(IMPORTMANIFESTURL_DESCRIPTOR, it) }
    }
}
