// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues
import aws.sdk.kotlin.services.ec2.model.PaymentOption
import aws.sdk.kotlin.services.ec2.model.Purchase
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

internal fun deserializePurchaseDocument(deserializer: Deserializer): Purchase {
    val builder = Purchase.Builder()
    val CURRENCYCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("currencyCode"))
    val DURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("duration"))
    val HOSTIDSET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("hostIdSet"), XmlCollectionName("item"))
    val HOSTRESERVATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hostReservationId"))
    val HOURLYPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hourlyPrice"))
    val INSTANCEFAMILY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceFamily"))
    val PAYMENTOPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("paymentOption"))
    val UPFRONTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("upfrontPrice"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Purchase"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CURRENCYCODE_DESCRIPTOR)
        field(DURATION_DESCRIPTOR)
        field(HOSTIDSET_DESCRIPTOR)
        field(HOSTRESERVATIONID_DESCRIPTOR)
        field(HOURLYPRICE_DESCRIPTOR)
        field(INSTANCEFAMILY_DESCRIPTOR)
        field(PAYMENTOPTION_DESCRIPTOR)
        field(UPFRONTPRICE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CURRENCYCODE_DESCRIPTOR.index -> builder.currencyCode = deserializeString().let { CurrencyCodeValues.fromValue(it) }
                DURATION_DESCRIPTOR.index -> builder.duration = deserializeInt()
                HOSTIDSET_DESCRIPTOR.index -> builder.hostIdSet =
                    deserializer.deserializeList(HOSTIDSET_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                HOSTRESERVATIONID_DESCRIPTOR.index -> builder.hostReservationId = deserializeString()
                HOURLYPRICE_DESCRIPTOR.index -> builder.hourlyPrice = deserializeString()
                INSTANCEFAMILY_DESCRIPTOR.index -> builder.instanceFamily = deserializeString()
                PAYMENTOPTION_DESCRIPTOR.index -> builder.paymentOption = deserializeString().let { PaymentOption.fromValue(it) }
                UPFRONTPRICE_DESCRIPTOR.index -> builder.upfrontPrice = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}