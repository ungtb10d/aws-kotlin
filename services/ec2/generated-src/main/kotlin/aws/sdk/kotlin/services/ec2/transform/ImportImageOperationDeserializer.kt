// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.ImportImageLicenseConfigurationResponse
import aws.sdk.kotlin.services.ec2.model.ImportImageResponse
import aws.sdk.kotlin.services.ec2.model.SnapshotDetail
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class ImportImageOperationDeserializer: HttpDeserialize<ImportImageResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ImportImageResponse {
        if (!response.status.isSuccess()) {
            throwImportImageError(context, response)
        }
        val builder = ImportImageResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeImportImageOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun throwImportImageError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw Ec2Exception("Failed to parse response as 'ec2Query' error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        else -> Ec2Exception(errorDetails.message)
    }

    setAseErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}

private fun deserializeImportImageOperationBody(builder: ImportImageResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ARCHITECTURE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("architecture"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val HYPERVISOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hypervisor"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val IMPORTTASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("importTaskId"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kmsKeyId"))
    val LICENSESPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("licenseSpecifications"), XmlCollectionName("item"))
    val LICENSETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("licenseType"))
    val PLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("platform"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val SNAPSHOTDETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("snapshotDetailSet"), XmlCollectionName("item"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val USAGEOPERATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("usageOperation"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("ImportImageResult"))
        field(ARCHITECTURE_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(HYPERVISOR_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(IMPORTTASKID_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(LICENSESPECIFICATIONS_DESCRIPTOR)
        field(LICENSETYPE_DESCRIPTOR)
        field(PLATFORM_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(SNAPSHOTDETAILS_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(USAGEOPERATION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ARCHITECTURE_DESCRIPTOR.index -> builder.architecture = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                HYPERVISOR_DESCRIPTOR.index -> builder.hypervisor = deserializeString()
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                IMPORTTASKID_DESCRIPTOR.index -> builder.importTaskId = deserializeString()
                KMSKEYID_DESCRIPTOR.index -> builder.kmsKeyId = deserializeString()
                LICENSESPECIFICATIONS_DESCRIPTOR.index -> builder.licenseSpecifications =
                    deserializer.deserializeList(LICENSESPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<ImportImageLicenseConfigurationResponse>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeImportImageLicenseConfigurationResponseDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                LICENSETYPE_DESCRIPTOR.index -> builder.licenseType = deserializeString()
                PLATFORM_DESCRIPTOR.index -> builder.platform = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                SNAPSHOTDETAILS_DESCRIPTOR.index -> builder.snapshotDetails =
                    deserializer.deserializeList(SNAPSHOTDETAILS_DESCRIPTOR) {
                        val col0 = mutableListOf<SnapshotDetail>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeSnapshotDetailDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString()
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                USAGEOPERATION_DESCRIPTOR.index -> builder.usageOperation = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
