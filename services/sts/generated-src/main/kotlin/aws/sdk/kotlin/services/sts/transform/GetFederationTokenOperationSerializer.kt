// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.transform

import aws.sdk.kotlin.services.sts.model.GetFederationTokenRequest
import aws.sdk.kotlin.services.sts.model.PolicyDescriptorType
import aws.sdk.kotlin.services.sts.model.Tag
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


internal class GetFederationTokenOperationSerializer: HttpSerialize<GetFederationTokenRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetFederationTokenRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeGetFederationTokenOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeGetFederationTokenOperationBody(context: ExecutionContext, input: GetFederationTokenRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DURATIONSECONDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("DurationSeconds"))
    val NAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Name"))
    val POLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Policy"))
    val POLICYARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PolicyArns"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Tags"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("GetFederationTokenRequest"))
        trait(QueryLiteral("Action", "GetFederationToken"))
        trait(QueryLiteral("Version", "2011-06-15"))
        field(DURATIONSECONDS_DESCRIPTOR)
        field(NAME_DESCRIPTOR)
        field(POLICY_DESCRIPTOR)
        field(POLICYARNS_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.durationSeconds?.let { field(DURATIONSECONDS_DESCRIPTOR, it) }
        input.name?.let { field(NAME_DESCRIPTOR, it) }
        input.policy?.let { field(POLICY_DESCRIPTOR, it) }
        if (input.policyArns != null) {
            listField(POLICYARNS_DESCRIPTOR) {
                for (el0 in input.policyArns) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializePolicyDescriptorTypeDocument))
                }
            }
        }
        if (input.tags != null) {
            listField(TAGS_DESCRIPTOR) {
                for (el0 in input.tags) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
