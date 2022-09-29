// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceRequirements
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct

internal fun serializeInstanceRequirementsDocument(serializer: Serializer, input: InstanceRequirements) {
    val ACCELERATORCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("AcceleratorCount"))
    val ACCELERATORMANUFACTURERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AcceleratorManufacturerSet"), FormUrlFlattened)
    val ACCELERATORNAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AcceleratorNameSet"), FormUrlFlattened)
    val ACCELERATORTOTALMEMORYMIB_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("AcceleratorTotalMemoryMiB"))
    val ACCELERATORTYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("AcceleratorTypeSet"), FormUrlFlattened)
    val BAREMETAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("BareMetal"))
    val BASELINEEBSBANDWIDTHMBPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("BaselineEbsBandwidthMbps"))
    val BURSTABLEPERFORMANCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("BurstablePerformance"))
    val CPUMANUFACTURERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("CpuManufacturerSet"), FormUrlFlattened)
    val EXCLUDEDINSTANCETYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ExcludedInstanceTypeSet"), FormUrlFlattened)
    val INSTANCEGENERATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("InstanceGenerationSet"), FormUrlFlattened)
    val LOCALSTORAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Enum, FormUrlSerialName("LocalStorage"))
    val LOCALSTORAGETYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LocalStorageTypeSet"), FormUrlFlattened)
    val MEMORYGIBPERVCPU_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MemoryGiBPerVCpu"))
    val MEMORYMIB_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MemoryMiB"))
    val NETWORKINTERFACECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("NetworkInterfaceCount"))
    val ONDEMANDMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("OnDemandMaxPricePercentageOverLowestPrice"))
    val REQUIREHIBERNATESUPPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("RequireHibernateSupport"))
    val SPOTMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SpotMaxPricePercentageOverLowestPrice"))
    val TOTALLOCALSTORAGEGB_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("TotalLocalStorageGB"))
    val VCPUCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("VCpuCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("InstanceRequirements"))
        field(ACCELERATORCOUNT_DESCRIPTOR)
        field(ACCELERATORMANUFACTURERS_DESCRIPTOR)
        field(ACCELERATORNAMES_DESCRIPTOR)
        field(ACCELERATORTOTALMEMORYMIB_DESCRIPTOR)
        field(ACCELERATORTYPES_DESCRIPTOR)
        field(BAREMETAL_DESCRIPTOR)
        field(BASELINEEBSBANDWIDTHMBPS_DESCRIPTOR)
        field(BURSTABLEPERFORMANCE_DESCRIPTOR)
        field(CPUMANUFACTURERS_DESCRIPTOR)
        field(EXCLUDEDINSTANCETYPES_DESCRIPTOR)
        field(INSTANCEGENERATIONS_DESCRIPTOR)
        field(LOCALSTORAGE_DESCRIPTOR)
        field(LOCALSTORAGETYPES_DESCRIPTOR)
        field(MEMORYGIBPERVCPU_DESCRIPTOR)
        field(MEMORYMIB_DESCRIPTOR)
        field(NETWORKINTERFACECOUNT_DESCRIPTOR)
        field(ONDEMANDMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR)
        field(REQUIREHIBERNATESUPPORT_DESCRIPTOR)
        field(SPOTMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR)
        field(TOTALLOCALSTORAGEGB_DESCRIPTOR)
        field(VCPUCOUNT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.vCpuCount?.let { field(VCPUCOUNT_DESCRIPTOR, it, ::serializeVCpuCountRangeDocument) }
        input.memoryMib?.let { field(MEMORYMIB_DESCRIPTOR, it, ::serializeMemoryMibDocument) }
        if (input.cpuManufacturers != null) {
            listField(CPUMANUFACTURERS_DESCRIPTOR) {
                for (el0 in input.cpuManufacturers) {
                    serializeString(el0.value)
                }
            }
        }
        input.memoryGiBPerVCpu?.let { field(MEMORYGIBPERVCPU_DESCRIPTOR, it, ::serializeMemoryGiBPerVCpuDocument) }
        if (input.excludedInstanceTypes != null) {
            listField(EXCLUDEDINSTANCETYPES_DESCRIPTOR) {
                for (el0 in input.excludedInstanceTypes) {
                    serializeString(el0)
                }
            }
        }
        if (input.instanceGenerations != null) {
            listField(INSTANCEGENERATIONS_DESCRIPTOR) {
                for (el0 in input.instanceGenerations) {
                    serializeString(el0.value)
                }
            }
        }
        input.spotMaxPricePercentageOverLowestPrice?.let { field(SPOTMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR, it) }
        input.onDemandMaxPricePercentageOverLowestPrice?.let { field(ONDEMANDMAXPRICEPERCENTAGEOVERLOWESTPRICE_DESCRIPTOR, it) }
        input.bareMetal?.let { field(BAREMETAL_DESCRIPTOR, it.value) }
        input.burstablePerformance?.let { field(BURSTABLEPERFORMANCE_DESCRIPTOR, it.value) }
        input.requireHibernateSupport?.let { field(REQUIREHIBERNATESUPPORT_DESCRIPTOR, it) }
        input.networkInterfaceCount?.let { field(NETWORKINTERFACECOUNT_DESCRIPTOR, it, ::serializeNetworkInterfaceCountDocument) }
        input.localStorage?.let { field(LOCALSTORAGE_DESCRIPTOR, it.value) }
        if (input.localStorageTypes != null) {
            listField(LOCALSTORAGETYPES_DESCRIPTOR) {
                for (el0 in input.localStorageTypes) {
                    serializeString(el0.value)
                }
            }
        }
        input.totalLocalStorageGb?.let { field(TOTALLOCALSTORAGEGB_DESCRIPTOR, it, ::serializeTotalLocalStorageGbDocument) }
        input.baselineEbsBandwidthMbps?.let { field(BASELINEEBSBANDWIDTHMBPS_DESCRIPTOR, it, ::serializeBaselineEbsBandwidthMbpsDocument) }
        if (input.acceleratorTypes != null) {
            listField(ACCELERATORTYPES_DESCRIPTOR) {
                for (el0 in input.acceleratorTypes) {
                    serializeString(el0.value)
                }
            }
        }
        input.acceleratorCount?.let { field(ACCELERATORCOUNT_DESCRIPTOR, it, ::serializeAcceleratorCountDocument) }
        if (input.acceleratorManufacturers != null) {
            listField(ACCELERATORMANUFACTURERS_DESCRIPTOR) {
                for (el0 in input.acceleratorManufacturers) {
                    serializeString(el0.value)
                }
            }
        }
        if (input.acceleratorNames != null) {
            listField(ACCELERATORNAMES_DESCRIPTOR) {
                for (el0 in input.acceleratorNames) {
                    serializeString(el0.value)
                }
            }
        }
        input.acceleratorTotalMemoryMib?.let { field(ACCELERATORTOTALMEMORYMIB_DESCRIPTOR, it, ::serializeAcceleratorTotalMemoryMibDocument) }
    }
}
