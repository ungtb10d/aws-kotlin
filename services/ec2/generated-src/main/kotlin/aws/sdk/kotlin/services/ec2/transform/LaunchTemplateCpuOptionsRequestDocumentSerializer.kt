// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateCpuOptionsRequest
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

internal fun serializeLaunchTemplateCpuOptionsRequestDocument(serializer: Serializer, input: LaunchTemplateCpuOptionsRequest) {
    val CORECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("CoreCount"))
    val THREADSPERCORE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("ThreadsPerCore"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateCpuOptionsRequest"))
        field(CORECOUNT_DESCRIPTOR)
        field(THREADSPERCORE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.coreCount?.let { field(CORECOUNT_DESCRIPTOR, it) }
        input.threadsPerCore?.let { field(THREADSPERCORE_DESCRIPTOR, it) }
    }
}
