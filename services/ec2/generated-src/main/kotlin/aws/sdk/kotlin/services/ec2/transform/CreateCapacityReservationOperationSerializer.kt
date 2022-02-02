// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CapacityReservationInstancePlatform
import aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy
import aws.sdk.kotlin.services.ec2.model.CreateCapacityReservationRequest
import aws.sdk.kotlin.services.ec2.model.EndDateType
import aws.sdk.kotlin.services.ec2.model.InstanceMatchCriteria
import aws.sdk.kotlin.services.ec2.model.TagSpecification
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
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class CreateCapacityReservationOperationSerializer: HttpSerialize<CreateCapacityReservationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateCapacityReservationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateCapacityReservationOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateCapacityReservationOperationBody(context: ExecutionContext, input: CreateCapacityReservationRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AvailabilityZone"))
    val AVAILABILITYZONEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AvailabilityZoneId"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EBSOPTIMIZED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EbsOptimized"))
    val ENDDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("EndDate"))
    val ENDDATETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("EndDateType"))
    val EPHEMERALSTORAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("EphemeralStorage"))
    val INSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("InstanceCount"))
    val INSTANCEMATCHCRITERIA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceMatchCriteria"))
    val INSTANCEPLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstancePlatform"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceType"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OutpostArn"))
    val PLACEMENTGROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PlacementGroupArn"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecifications"), FormUrlFlattened)
    val TENANCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Tenancy"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateCapacityReservationRequest"))
        trait(QueryLiteral("Action", "CreateCapacityReservation"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(AVAILABILITYZONEID_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(EBSOPTIMIZED_DESCRIPTOR)
        field(ENDDATE_DESCRIPTOR)
        field(ENDDATETYPE_DESCRIPTOR)
        field(EPHEMERALSTORAGE_DESCRIPTOR)
        field(INSTANCECOUNT_DESCRIPTOR)
        field(INSTANCEMATCHCRITERIA_DESCRIPTOR)
        field(INSTANCEPLATFORM_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(PLACEMENTGROUPARN_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(TENANCY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.availabilityZone?.let { field(AVAILABILITYZONE_DESCRIPTOR, it) }
        input.availabilityZoneId?.let { field(AVAILABILITYZONEID_DESCRIPTOR, it) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.ebsOptimized?.let { field(EBSOPTIMIZED_DESCRIPTOR, it) }
        input.endDate?.let { field(ENDDATE_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.endDateType?.let { field(ENDDATETYPE_DESCRIPTOR, it.value) }
        input.ephemeralStorage?.let { field(EPHEMERALSTORAGE_DESCRIPTOR, it) }
        input.instanceCount?.let { field(INSTANCECOUNT_DESCRIPTOR, it) }
        input.instanceMatchCriteria?.let { field(INSTANCEMATCHCRITERIA_DESCRIPTOR, it.value) }
        input.instancePlatform?.let { field(INSTANCEPLATFORM_DESCRIPTOR, it.value) }
        input.instanceType?.let { field(INSTANCETYPE_DESCRIPTOR, it) }
        input.outpostArn?.let { field(OUTPOSTARN_DESCRIPTOR, it) }
        input.placementGroupArn?.let { field(PLACEMENTGROUPARN_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
        input.tenancy?.let { field(TENANCY_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}