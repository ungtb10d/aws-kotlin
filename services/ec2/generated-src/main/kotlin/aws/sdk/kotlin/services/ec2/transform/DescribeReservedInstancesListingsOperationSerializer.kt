// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesListingsRequest
import aws.sdk.kotlin.services.ec2.model.Filter
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


internal class DescribeReservedInstancesListingsOperationSerializer: HttpSerialize<DescribeReservedInstancesListingsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeReservedInstancesListingsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeReservedInstancesListingsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeReservedInstancesListingsOperationBody(context: ExecutionContext, input: DescribeReservedInstancesListingsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val RESERVEDINSTANCESID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ReservedInstancesId"))
    val RESERVEDINSTANCESLISTINGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ReservedInstancesListingId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeReservedInstancesListingsRequest"))
        trait(QueryLiteral("Action", "DescribeReservedInstancesListings"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(FILTERS_DESCRIPTOR)
        field(RESERVEDINSTANCESID_DESCRIPTOR)
        field(RESERVEDINSTANCESLISTINGID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.filters != null) {
            listField(FILTERS_DESCRIPTOR) {
                for (el0 in input.filters) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterDocument))
                }
            }
        }
        input.reservedInstancesId?.let { field(RESERVEDINSTANCESID_DESCRIPTOR, it) }
        input.reservedInstancesListingId?.let { field(RESERVEDINSTANCESLISTINGID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}