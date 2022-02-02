// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.UserBucket
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeUserBucketDocument(serializer: Serializer, input: UserBucket) {
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("S3Bucket"))
    val S3KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("S3Key"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("UserBucket"))
        field(S3BUCKET_DESCRIPTOR)
        field(S3KEY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.s3Bucket?.let { field(S3BUCKET_DESCRIPTOR, it) }
        input.s3Key?.let { field(S3KEY_DESCRIPTOR, it) }
    }
}