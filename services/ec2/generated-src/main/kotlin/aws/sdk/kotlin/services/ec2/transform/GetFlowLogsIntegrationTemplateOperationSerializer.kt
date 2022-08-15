// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GetFlowLogsIntegrationTemplateRequest
import aws.sdk.kotlin.services.ec2.model.IntegrateServices
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class GetFlowLogsIntegrationTemplateOperationSerializer: HttpSerialize<GetFlowLogsIntegrationTemplateRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetFlowLogsIntegrationTemplateRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeGetFlowLogsIntegrationTemplateOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeGetFlowLogsIntegrationTemplateOperationBody(context: ExecutionContext, input: GetFlowLogsIntegrationTemplateRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CONFIGDELIVERYS3DESTINATIONARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ConfigDeliveryS3DestinationArn"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FLOWLOGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("FlowLogId"))
    val INTEGRATESERVICES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("IntegrateService"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("GetFlowLogsIntegrationTemplateRequest"))
        trait(QueryLiteral("Action", "GetFlowLogsIntegrationTemplate"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CONFIGDELIVERYS3DESTINATIONARN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(FLOWLOGID_DESCRIPTOR)
        field(INTEGRATESERVICES_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.configDeliveryS3DestinationArn?.let { field(CONFIGDELIVERYS3DESTINATIONARN_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.flowLogId?.let { field(FLOWLOGID_DESCRIPTOR, it) }
        input.integrateServices?.let { field(INTEGRATESERVICES_DESCRIPTOR, it, ::serializeIntegrateServicesDocument) }
    }
    return serializer.toByteArray()
}
