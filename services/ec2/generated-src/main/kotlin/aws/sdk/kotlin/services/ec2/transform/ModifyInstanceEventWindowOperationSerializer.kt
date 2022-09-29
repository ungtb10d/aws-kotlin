// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceEventWindowTimeRangeRequest
import aws.sdk.kotlin.services.ec2.model.ModifyInstanceEventWindowRequest
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


internal class ModifyInstanceEventWindowOperationSerializer: HttpSerialize<ModifyInstanceEventWindowRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyInstanceEventWindowRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyInstanceEventWindowOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyInstanceEventWindowOperationBody(context: ExecutionContext, input: ModifyInstanceEventWindowRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CRONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CronExpression"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val INSTANCEEVENTWINDOWID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceEventWindowId"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val TIMERANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TimeRange"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyInstanceEventWindowRequest"))
        trait(QueryLiteral("Action", "ModifyInstanceEventWindow"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CRONEXPRESSION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(INSTANCEEVENTWINDOWID_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(TIMERANGES_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.cronExpression?.let { field(CRONEXPRESSION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.instanceEventWindowId?.let { field(INSTANCEEVENTWINDOWID_DESCRIPTOR, it) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
        if (input.timeRanges != null) {
            listField(TIMERANGES_DESCRIPTOR) {
                for (el0 in input.timeRanges) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeInstanceEventWindowTimeRangeRequestDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
