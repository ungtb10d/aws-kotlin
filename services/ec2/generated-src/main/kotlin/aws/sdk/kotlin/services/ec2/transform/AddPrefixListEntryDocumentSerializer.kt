// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AddPrefixListEntry
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

internal fun serializeAddPrefixListEntryDocument(serializer: Serializer, input: AddPrefixListEntry) {
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Cidr"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AddPrefixListEntry"))
        field(CIDR_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.cidr?.let { field(CIDR_DESCRIPTOR, it) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
    }
}
