// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateVolumePermission
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

internal fun serializeCreateVolumePermissionDocument(serializer: Serializer, input: CreateVolumePermission) {
    val GROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("Group"))
    val USERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("UserId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateVolumePermission"))
        field(GROUP_DESCRIPTOR)
        field(USERID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.group?.let { field(GROUP_DESCRIPTOR, it.value) }
        input.userId?.let { field(USERID_DESCRIPTOR, it) }
    }
}
