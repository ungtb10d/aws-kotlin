// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.EndEvent
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.deserializeStruct

internal fun deserializeEndEventDocument(deserializer: Deserializer): EndEvent {
    val builder = EndEvent.Builder()
    deserializer.deserializeStruct(SdkObjectDescriptor.build {}) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}