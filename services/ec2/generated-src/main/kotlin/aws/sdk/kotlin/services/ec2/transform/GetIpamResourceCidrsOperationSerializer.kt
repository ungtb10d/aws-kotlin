// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Filter
import aws.sdk.kotlin.services.ec2.model.GetIpamResourceCidrsRequest
import aws.sdk.kotlin.services.ec2.model.IpamResourceType
import aws.sdk.kotlin.services.ec2.model.RequestIpamResourceTag
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


internal class GetIpamResourceCidrsOperationSerializer: HttpSerialize<GetIpamResourceCidrsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetIpamResourceCidrsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeGetIpamResourceCidrsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeGetIpamResourceCidrsOperationBody(context: ExecutionContext, input: GetIpamResourceCidrsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val IPAMPOOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpamPoolId"))
    val IPAMSCOPEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpamScopeId"))
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MaxResults"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NextToken"))
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ResourceId"))
    val RESOURCEOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ResourceOwner"))
    val RESOURCETAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ResourceTag"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ResourceType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("GetIpamResourceCidrsRequest"))
        trait(QueryLiteral("Action", "GetIpamResourceCidrs"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(IPAMPOOLID_DESCRIPTOR)
        field(IPAMSCOPEID_DESCRIPTOR)
        field(MAXRESULTS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCEOWNER_DESCRIPTOR)
        field(RESOURCETAG_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.filters != null) {
            listField(FILTERS_DESCRIPTOR) {
                for (el0 in input.filters) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterDocument))
                }
            }
        }
        input.ipamPoolId?.let { field(IPAMPOOLID_DESCRIPTOR, it) }
        input.ipamScopeId?.let { field(IPAMSCOPEID_DESCRIPTOR, it) }
        input.maxResults?.let { field(MAXRESULTS_DESCRIPTOR, it) }
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
        input.resourceId?.let { field(RESOURCEID_DESCRIPTOR, it) }
        input.resourceOwner?.let { field(RESOURCEOWNER_DESCRIPTOR, it) }
        input.resourceTag?.let { field(RESOURCETAG_DESCRIPTOR, it, ::serializeRequestIpamResourceTagDocument) }
        input.resourceType?.let { field(RESOURCETYPE_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
