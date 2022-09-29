// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssociateEnclaveCertificateIamRoleRequest
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


internal class AssociateEnclaveCertificateIamRoleOperationSerializer: HttpSerialize<AssociateEnclaveCertificateIamRoleRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AssociateEnclaveCertificateIamRoleRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAssociateEnclaveCertificateIamRoleOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeAssociateEnclaveCertificateIamRoleOperationBody(context: ExecutionContext, input: AssociateEnclaveCertificateIamRoleRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CERTIFICATEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CertificateArn"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val ROLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RoleArn"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AssociateEnclaveCertificateIamRoleRequest"))
        trait(QueryLiteral("Action", "AssociateEnclaveCertificateIamRole"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CERTIFICATEARN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(ROLEARN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.certificateArn?.let { field(CERTIFICATEARN_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.roleArn?.let { field(ROLEARN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
