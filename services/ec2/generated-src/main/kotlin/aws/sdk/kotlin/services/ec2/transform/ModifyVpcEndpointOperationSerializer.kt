// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DnsOptionsSpecification
import aws.sdk.kotlin.services.ec2.model.IpAddressType
import aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointRequest
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


internal class ModifyVpcEndpointOperationSerializer: HttpSerialize<ModifyVpcEndpointRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyVpcEndpointRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyVpcEndpointOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        if (builder.body !is HttpBody.Empty) {
            builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        }
        return builder
    }
}

private fun serializeModifyVpcEndpointOperationBody(context: ExecutionContext, input: ModifyVpcEndpointRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ADDROUTETABLEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AddRouteTableId"), FormUrlFlattened)
    val ADDSECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AddSecurityGroupId"), FormUrlFlattened)
    val ADDSUBNETIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AddSubnetId"), FormUrlFlattened)
    val DNSOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("DnsOptions"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val IPADDRESSTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpAddressType"))
    val POLICYDOCUMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PolicyDocument"))
    val PRIVATEDNSENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("PrivateDnsEnabled"))
    val REMOVEROUTETABLEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("RemoveRouteTableId"), FormUrlFlattened)
    val REMOVESECURITYGROUPIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("RemoveSecurityGroupId"), FormUrlFlattened)
    val REMOVESUBNETIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("RemoveSubnetId"), FormUrlFlattened)
    val RESETPOLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("ResetPolicy"))
    val VPCENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcEndpointId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyVpcEndpointRequest"))
        trait(QueryLiteral("Action", "ModifyVpcEndpoint"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ADDROUTETABLEIDS_DESCRIPTOR)
        field(ADDSECURITYGROUPIDS_DESCRIPTOR)
        field(ADDSUBNETIDS_DESCRIPTOR)
        field(DNSOPTIONS_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(IPADDRESSTYPE_DESCRIPTOR)
        field(POLICYDOCUMENT_DESCRIPTOR)
        field(PRIVATEDNSENABLED_DESCRIPTOR)
        field(REMOVEROUTETABLEIDS_DESCRIPTOR)
        field(REMOVESECURITYGROUPIDS_DESCRIPTOR)
        field(REMOVESUBNETIDS_DESCRIPTOR)
        field(RESETPOLICY_DESCRIPTOR)
        field(VPCENDPOINTID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.addRouteTableIds != null) {
            listField(ADDROUTETABLEIDS_DESCRIPTOR) {
                for (el0 in input.addRouteTableIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.addSecurityGroupIds != null) {
            listField(ADDSECURITYGROUPIDS_DESCRIPTOR) {
                for (el0 in input.addSecurityGroupIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.addSubnetIds != null) {
            listField(ADDSUBNETIDS_DESCRIPTOR) {
                for (el0 in input.addSubnetIds) {
                    serializeString(el0)
                }
            }
        }
        input.dnsOptions?.let { field(DNSOPTIONS_DESCRIPTOR, it, ::serializeDnsOptionsSpecificationDocument) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.ipAddressType?.let { field(IPADDRESSTYPE_DESCRIPTOR, it.value) }
        input.policyDocument?.let { field(POLICYDOCUMENT_DESCRIPTOR, it) }
        input.privateDnsEnabled?.let { field(PRIVATEDNSENABLED_DESCRIPTOR, it) }
        if (input.removeRouteTableIds != null) {
            listField(REMOVEROUTETABLEIDS_DESCRIPTOR) {
                for (el0 in input.removeRouteTableIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.removeSecurityGroupIds != null) {
            listField(REMOVESECURITYGROUPIDS_DESCRIPTOR) {
                for (el0 in input.removeSecurityGroupIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.removeSubnetIds != null) {
            listField(REMOVESUBNETIDS_DESCRIPTOR) {
                for (el0 in input.removeSubnetIds) {
                    serializeString(el0)
                }
            }
        }
        input.resetPolicy?.let { field(RESETPOLICY_DESCRIPTOR, it) }
        input.vpcEndpointId?.let { field(VPCENDPOINTID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
