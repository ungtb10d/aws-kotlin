// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.BucketAlreadyExists
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.deserializeStruct


internal class BucketAlreadyExistsDeserializer: HttpDeserialize<BucketAlreadyExists> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): BucketAlreadyExists {
        val builder = BucketAlreadyExists.Builder()

        return builder.build()
    }
}