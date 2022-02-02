// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateLaunchTemplateVersionRequest
import aws.sdk.kotlin.services.ec2.model.RequestLaunchTemplateData
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


internal class CreateLaunchTemplateVersionOperationSerializer: HttpSerialize<CreateLaunchTemplateVersionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateLaunchTemplateVersionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateLaunchTemplateVersionOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateLaunchTemplateVersionOperationBody(context: ExecutionContext, input: CreateLaunchTemplateVersionRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val LAUNCHTEMPLATEDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("LaunchTemplateData"))
    val LAUNCHTEMPLATEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LaunchTemplateId"))
    val LAUNCHTEMPLATENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LaunchTemplateName"))
    val SOURCEVERSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SourceVersion"))
    val VERSIONDESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VersionDescription"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateLaunchTemplateVersionRequest"))
        trait(QueryLiteral("Action", "CreateLaunchTemplateVersion"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(LAUNCHTEMPLATEDATA_DESCRIPTOR)
        field(LAUNCHTEMPLATEID_DESCRIPTOR)
        field(LAUNCHTEMPLATENAME_DESCRIPTOR)
        field(SOURCEVERSION_DESCRIPTOR)
        field(VERSIONDESCRIPTION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.launchTemplateData?.let { field(LAUNCHTEMPLATEDATA_DESCRIPTOR, it, ::serializeRequestLaunchTemplateDataDocument) }
        input.launchTemplateId?.let { field(LAUNCHTEMPLATEID_DESCRIPTOR, it) }
        input.launchTemplateName?.let { field(LAUNCHTEMPLATENAME_DESCRIPTOR, it) }
        input.sourceVersion?.let { field(SOURCEVERSION_DESCRIPTOR, it) }
        input.versionDescription?.let { field(VERSIONDESCRIPTION_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}