// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AccessScopePathRequest
import aws.sdk.kotlin.services.ec2.model.CreateNetworkInsightsAccessScopeRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.client.idempotencyTokenProvider
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


internal class CreateNetworkInsightsAccessScopeOperationSerializer: HttpSerialize<CreateNetworkInsightsAccessScopeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateNetworkInsightsAccessScopeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateNetworkInsightsAccessScopeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeCreateNetworkInsightsAccessScopeOperationBody(context: ExecutionContext, input: CreateNetworkInsightsAccessScopeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EXCLUDEPATHS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ExcludePath"), FormUrlFlattened)
    val MATCHPATHS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("MatchPath"), FormUrlFlattened)
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateNetworkInsightsAccessScopeRequest"))
        trait(QueryLiteral("Action", "CreateNetworkInsightsAccessScope"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(EXCLUDEPATHS_DESCRIPTOR)
        field(MATCHPATHS_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) } ?: field(CLIENTTOKEN_DESCRIPTOR, context.idempotencyTokenProvider.generateToken())
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.excludePaths != null) {
            listField(EXCLUDEPATHS_DESCRIPTOR) {
                for (el0 in input.excludePaths) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeAccessScopePathRequestDocument))
                }
            }
        }
        if (input.matchPaths != null) {
            listField(MATCHPATHS_DESCRIPTOR) {
                for (el0 in input.matchPaths) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeAccessScopePathRequestDocument))
                }
            }
        }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
