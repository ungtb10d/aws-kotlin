// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.StorageLocation
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

internal fun serializeStorageLocationDocument(serializer: Serializer, input: StorageLocation) {
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Bucket"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Key"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("StorageLocation"))
        field(BUCKET_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.bucket?.let { field(BUCKET_DESCRIPTOR, it) }
        input.key?.let { field(KEY_DESCRIPTOR, it) }
    }
}
