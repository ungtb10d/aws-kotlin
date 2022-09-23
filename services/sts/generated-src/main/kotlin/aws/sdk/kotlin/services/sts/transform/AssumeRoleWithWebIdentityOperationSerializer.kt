// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.services.sts.model.AssumeRoleWithWebIdentityRequest
import aws.sdk.kotlin.services.sts.model.PolicyDescriptorType
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


internal class AssumeRoleWithWebIdentityOperationSerializer: HttpSerialize<AssumeRoleWithWebIdentityRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AssumeRoleWithWebIdentityRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAssumeRoleWithWebIdentityOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeAssumeRoleWithWebIdentityOperationBody(context: ExecutionContext, input: AssumeRoleWithWebIdentityRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DURATIONSECONDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("DurationSeconds"))
    val POLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Policy"))
    val POLICYARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PolicyArns"))
    val PROVIDERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ProviderId"))
    val ROLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RoleArn"))
    val ROLESESSIONNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RoleSessionName"))
    val WEBIDENTITYTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("WebIdentityToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AssumeRoleWithWebIdentityRequest"))
        trait(QueryLiteral("Action", "AssumeRoleWithWebIdentity"))
        trait(QueryLiteral("Version", "2011-06-15"))
        field(DURATIONSECONDS_DESCRIPTOR)
        field(POLICY_DESCRIPTOR)
        field(POLICYARNS_DESCRIPTOR)
        field(PROVIDERID_DESCRIPTOR)
        field(ROLEARN_DESCRIPTOR)
        field(ROLESESSIONNAME_DESCRIPTOR)
        field(WEBIDENTITYTOKEN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.durationSeconds?.let { field(DURATIONSECONDS_DESCRIPTOR, it) }
        input.policy?.let { field(POLICY_DESCRIPTOR, it) }
        if (input.policyArns != null) {
            listField(POLICYARNS_DESCRIPTOR) {
                for (el0 in input.policyArns) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializePolicyDescriptorTypeDocument))
                }
            }
        }
        input.providerId?.let { field(PROVIDERID_DESCRIPTOR, it) }
        input.roleArn?.let { field(ROLEARN_DESCRIPTOR, it) }
        input.roleSessionName?.let { field(ROLESESSIONNAME_DESCRIPTOR, it) }
        input.webIdentityToken?.let { field(WEBIDENTITYTOKEN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
