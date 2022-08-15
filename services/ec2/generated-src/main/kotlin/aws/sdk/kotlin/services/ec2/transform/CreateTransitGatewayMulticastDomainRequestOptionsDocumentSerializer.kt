// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayMulticastDomainRequestOptions
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

internal fun serializeCreateTransitGatewayMulticastDomainRequestOptionsDocument(serializer: Serializer, input: CreateTransitGatewayMulticastDomainRequestOptions) {
    val AUTOACCEPTSHAREDASSOCIATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AutoAcceptSharedAssociations"))
    val IGMPV2SUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Igmpv2Support"))
    val STATICSOURCESSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("StaticSourcesSupport"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateTransitGatewayMulticastDomainRequestOptions"))
        field(AUTOACCEPTSHAREDASSOCIATIONS_DESCRIPTOR)
        field(IGMPV2SUPPORT_DESCRIPTOR)
        field(STATICSOURCESSUPPORT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.igmpv2Support?.let { field(IGMPV2SUPPORT_DESCRIPTOR, it.value) }
        input.staticSourcesSupport?.let { field(STATICSOURCESSUPPORT_DESCRIPTOR, it.value) }
        input.autoAcceptSharedAssociations?.let { field(AUTOACCEPTSHAREDASSOCIATIONS_DESCRIPTOR, it.value) }
    }
}
