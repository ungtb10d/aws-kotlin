// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DeregisterInstanceTagAttributeRequest
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeDeregisterInstanceTagAttributeRequestDocument(serializer: Serializer, input: DeregisterInstanceTagAttributeRequest) {
    val INCLUDEALLTAGSOFINSTANCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("IncludeAllTagsOfInstance"))
    val INSTANCETAGKEYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("InstanceTagKey"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DeregisterInstanceTagAttributeRequest"))
        field(INCLUDEALLTAGSOFINSTANCE_DESCRIPTOR)
        field(INSTANCETAGKEYS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.includeAllTagsOfInstance?.let { field(INCLUDEALLTAGSOFINSTANCE_DESCRIPTOR, it) }
        if (input.instanceTagKeys != null) {
            listField(INSTANCETAGKEYS_DESCRIPTOR) {
                for (el0 in input.instanceTagKeys) {
                    serializeString(el0)
                }
            }
        }
    }
}
