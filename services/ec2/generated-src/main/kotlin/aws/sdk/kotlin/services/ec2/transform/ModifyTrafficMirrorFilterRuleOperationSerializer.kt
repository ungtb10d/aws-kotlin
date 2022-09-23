// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest
import aws.sdk.kotlin.services.ec2.model.TrafficDirection
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorFilterRuleField
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorPortRangeRequest
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorRuleAction
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ModifyTrafficMirrorFilterRuleOperationSerializer: HttpSerialize<ModifyTrafficMirrorFilterRuleRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyTrafficMirrorFilterRuleRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyTrafficMirrorFilterRuleOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyTrafficMirrorFilterRuleOperationBody(context: ExecutionContext, input: ModifyTrafficMirrorFilterRuleRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DESTINATIONCIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DestinationCidrBlock"))
    val DESTINATIONPORTRANGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("DestinationPortRange"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val PROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Protocol"))
    val REMOVEFIELDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("RemoveField"), FormUrlFlattened)
    val RULEACTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("RuleAction"))
    val RULENUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("RuleNumber"))
    val SOURCECIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SourceCidrBlock"))
    val SOURCEPORTRANGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("SourcePortRange"))
    val TRAFFICDIRECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("TrafficDirection"))
    val TRAFFICMIRRORFILTERRULEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TrafficMirrorFilterRuleId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyTrafficMirrorFilterRuleRequest"))
        trait(QueryLiteral("Action", "ModifyTrafficMirrorFilterRule"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(DESTINATIONCIDRBLOCK_DESCRIPTOR)
        field(DESTINATIONPORTRANGE_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(PROTOCOL_DESCRIPTOR)
        field(REMOVEFIELDS_DESCRIPTOR)
        field(RULEACTION_DESCRIPTOR)
        field(RULENUMBER_DESCRIPTOR)
        field(SOURCECIDRBLOCK_DESCRIPTOR)
        field(SOURCEPORTRANGE_DESCRIPTOR)
        field(TRAFFICDIRECTION_DESCRIPTOR)
        field(TRAFFICMIRRORFILTERRULEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.destinationCidrBlock?.let { field(DESTINATIONCIDRBLOCK_DESCRIPTOR, it) }
        input.destinationPortRange?.let { field(DESTINATIONPORTRANGE_DESCRIPTOR, it, ::serializeTrafficMirrorPortRangeRequestDocument) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.protocol?.let { field(PROTOCOL_DESCRIPTOR, it) }
        if (input.removeFields != null) {
            listField(REMOVEFIELDS_DESCRIPTOR) {
                for (el0 in input.removeFields) {
                    serializeString(el0.value)
                }
            }
        }
        input.ruleAction?.let { field(RULEACTION_DESCRIPTOR, it.value) }
        input.ruleNumber?.let { field(RULENUMBER_DESCRIPTOR, it) }
        input.sourceCidrBlock?.let { field(SOURCECIDRBLOCK_DESCRIPTOR, it) }
        input.sourcePortRange?.let { field(SOURCEPORTRANGE_DESCRIPTOR, it, ::serializeTrafficMirrorPortRangeRequestDocument) }
        input.trafficDirection?.let { field(TRAFFICDIRECTION_DESCRIPTOR, it.value) }
        input.trafficMirrorFilterRuleId?.let { field(TRAFFICMIRRORFILTERRULEID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
