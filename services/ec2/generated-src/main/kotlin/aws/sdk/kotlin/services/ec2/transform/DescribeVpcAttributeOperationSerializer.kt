// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeVpcAttributeRequest
import aws.sdk.kotlin.services.ec2.model.VpcAttributeName
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


internal class DescribeVpcAttributeOperationSerializer: HttpSerialize<DescribeVpcAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeVpcAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeVpcAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeDescribeVpcAttributeOperationBody(context: ExecutionContext, input: DescribeVpcAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ATTRIBUTE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Attribute"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeVpcAttributeRequest"))
        trait(QueryLiteral("Action", "DescribeVpcAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ATTRIBUTE_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.attribute?.let { field(ATTRIBUTE_DESCRIPTOR, it.value) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.vpcId?.let { field(VPCID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
