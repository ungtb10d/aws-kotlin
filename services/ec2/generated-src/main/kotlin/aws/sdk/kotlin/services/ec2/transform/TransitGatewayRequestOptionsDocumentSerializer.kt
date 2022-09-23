// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TransitGatewayRequestOptions
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

internal fun serializeTransitGatewayRequestOptionsDocument(serializer: Serializer, input: TransitGatewayRequestOptions) {
    val AMAZONSIDEASN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, FormUrlSerialName("AmazonSideAsn"))
    val AUTOACCEPTSHAREDATTACHMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("AutoAcceptSharedAttachments"))
    val DEFAULTROUTETABLEASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("DefaultRouteTableAssociation"))
    val DEFAULTROUTETABLEPROPAGATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("DefaultRouteTablePropagation"))
    val DNSSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("DnsSupport"))
    val MULTICASTSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("MulticastSupport"))
    val TRANSITGATEWAYCIDRBLOCKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TransitGatewayCidrBlocks"), FormUrlFlattened)
    val VPNECMPSUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("VpnEcmpSupport"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("TransitGatewayRequestOptions"))
        field(AMAZONSIDEASN_DESCRIPTOR)
        field(AUTOACCEPTSHAREDATTACHMENTS_DESCRIPTOR)
        field(DEFAULTROUTETABLEASSOCIATION_DESCRIPTOR)
        field(DEFAULTROUTETABLEPROPAGATION_DESCRIPTOR)
        field(DNSSUPPORT_DESCRIPTOR)
        field(MULTICASTSUPPORT_DESCRIPTOR)
        field(TRANSITGATEWAYCIDRBLOCKS_DESCRIPTOR)
        field(VPNECMPSUPPORT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.amazonSideAsn?.let { field(AMAZONSIDEASN_DESCRIPTOR, it) }
        input.autoAcceptSharedAttachments?.let { field(AUTOACCEPTSHAREDATTACHMENTS_DESCRIPTOR, it.value) }
        input.defaultRouteTableAssociation?.let { field(DEFAULTROUTETABLEASSOCIATION_DESCRIPTOR, it.value) }
        input.defaultRouteTablePropagation?.let { field(DEFAULTROUTETABLEPROPAGATION_DESCRIPTOR, it.value) }
        input.vpnEcmpSupport?.let { field(VPNECMPSUPPORT_DESCRIPTOR, it.value) }
        input.dnsSupport?.let { field(DNSSUPPORT_DESCRIPTOR, it.value) }
        input.multicastSupport?.let { field(MULTICASTSUPPORT_DESCRIPTOR, it.value) }
        if (input.transitGatewayCidrBlocks != null) {
            listField(TRANSITGATEWAYCIDRBLOCKS_DESCRIPTOR) {
                for (el0 in input.transitGatewayCidrBlocks) {
                    serializeString(el0)
                }
            }
        }
    }
}
