// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CloudWatchLogOptionsSpecification
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

internal fun serializeCloudWatchLogOptionsSpecificationDocument(serializer: Serializer, input: CloudWatchLogOptionsSpecification) {
    val LOGENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("LogEnabled"))
    val LOGGROUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LogGroupArn"))
    val LOGOUTPUTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LogOutputFormat"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CloudWatchLogOptionsSpecification"))
        field(LOGENABLED_DESCRIPTOR)
        field(LOGGROUPARN_DESCRIPTOR)
        field(LOGOUTPUTFORMAT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.logEnabled?.let { field(LOGENABLED_DESCRIPTOR, it) }
        input.logGroupArn?.let { field(LOGGROUPARN_DESCRIPTOR, it) }
        input.logOutputFormat?.let { field(LOGOUTPUTFORMAT_DESCRIPTOR, it) }
    }
}
