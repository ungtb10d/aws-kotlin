// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.OwnershipControls
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer

internal fun deserializeOwnershipControlsPayload(payload: ByteArray): OwnershipControls {
    val deserializer = XmlDeserializer(payload)
    return deserializeOwnershipControlsDocument(deserializer)
}
