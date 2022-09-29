// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplateLicenseConfigurationRequest
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

internal fun serializeLaunchTemplateLicenseConfigurationRequestDocument(serializer: Serializer, input: LaunchTemplateLicenseConfigurationRequest) {
    val LICENSECONFIGURATIONARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LicenseConfigurationArn"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchTemplateLicenseConfigurationRequest"))
        field(LICENSECONFIGURATIONARN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.licenseConfigurationArn?.let { field(LICENSECONFIGURATIONARN_DESCRIPTOR, it) }
    }
}
