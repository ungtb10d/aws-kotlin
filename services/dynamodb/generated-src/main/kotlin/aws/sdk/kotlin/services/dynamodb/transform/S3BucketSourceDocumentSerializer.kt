// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.S3BucketSource
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeS3BucketSourceDocument(serializer: Serializer, input: S3BucketSource) {
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3Bucket"))
    val S3BUCKETOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3BucketOwner"))
    val S3KEYPREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3KeyPrefix"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(S3BUCKET_DESCRIPTOR)
        field(S3BUCKETOWNER_DESCRIPTOR)
        field(S3KEYPREFIX_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.s3BucketOwner?.let { field(S3BUCKETOWNER_DESCRIPTOR, it) }
        input.s3Bucket?.let { field(S3BUCKET_DESCRIPTOR, it) }
        input.s3KeyPrefix?.let { field(S3KEYPREFIX_DESCRIPTOR, it) }
    }
}
