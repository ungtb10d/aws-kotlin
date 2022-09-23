// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LoadBalancersConfig
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

internal fun serializeLoadBalancersConfigDocument(serializer: Serializer, input: LoadBalancersConfig) {
    val CLASSICLOADBALANCERSCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ClassicLoadBalancersConfig"))
    val TARGETGROUPSCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("TargetGroupsConfig"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LoadBalancersConfig"))
        field(CLASSICLOADBALANCERSCONFIG_DESCRIPTOR)
        field(TARGETGROUPSCONFIG_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.classicLoadBalancersConfig?.let { field(CLASSICLOADBALANCERSCONFIG_DESCRIPTOR, it, ::serializeClassicLoadBalancersConfigDocument) }
        input.targetGroupsConfig?.let { field(TARGETGROUPSCONFIG_DESCRIPTOR, it, ::serializeTargetGroupsConfigDocument) }
    }
}
