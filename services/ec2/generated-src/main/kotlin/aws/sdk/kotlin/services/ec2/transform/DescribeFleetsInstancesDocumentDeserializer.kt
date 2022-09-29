// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeFleetsInstances
import aws.sdk.kotlin.services.ec2.model.InstanceLifecycle
import aws.sdk.kotlin.services.ec2.model.InstanceType
import aws.sdk.kotlin.services.ec2.model.PlatformValues
import aws.smithy.kotlin.runtime.serde.Deserializer
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

internal fun deserializeDescribeFleetsInstancesDocument(deserializer: Deserializer): DescribeFleetsInstances {
    val builder = DescribeFleetsInstances.Builder()
    val INSTANCEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("instanceIds"), XmlCollectionName("item"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("instanceType"))
    val LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("launchTemplateAndOverrides"))
    val LIFECYCLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("lifecycle"))
    val PLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, XmlSerialName("platform"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DescribeFleetsInstances"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(INSTANCEIDS_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR)
        field(LIFECYCLE_DESCRIPTOR)
        field(PLATFORM_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INSTANCEIDS_DESCRIPTOR.index -> builder.instanceIds =
                    deserializer.deserializeList(INSTANCEIDS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString().let { InstanceType.fromValue(it) }
                LAUNCHTEMPLATEANDOVERRIDES_DESCRIPTOR.index -> builder.launchTemplateAndOverrides = deserializeLaunchTemplateAndOverridesResponseDocument(deserializer)
                LIFECYCLE_DESCRIPTOR.index -> builder.lifecycle = deserializeString().let { InstanceLifecycle.fromValue(it) }
                PLATFORM_DESCRIPTOR.index -> builder.platform = deserializeString().let { PlatformValues.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
