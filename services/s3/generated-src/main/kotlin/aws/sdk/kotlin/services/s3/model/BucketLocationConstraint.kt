// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import kotlin.collections.List

public sealed class BucketLocationConstraint {

    public abstract val value: kotlin.String

    public object Eu : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "EU"
        override fun toString(): kotlin.String = value
    }

    public object AfSouth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "af-south-1"
        override fun toString(): kotlin.String = value
    }

    public object ApEast1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-east-1"
        override fun toString(): kotlin.String = value
    }

    public object ApNortheast1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-northeast-1"
        override fun toString(): kotlin.String = value
    }

    public object ApNortheast2 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-northeast-2"
        override fun toString(): kotlin.String = value
    }

    public object ApNortheast3 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-northeast-3"
        override fun toString(): kotlin.String = value
    }

    public object ApSouth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-south-1"
        override fun toString(): kotlin.String = value
    }

    public object ApSoutheast1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-southeast-1"
        override fun toString(): kotlin.String = value
    }

    public object ApSoutheast2 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ap-southeast-2"
        override fun toString(): kotlin.String = value
    }

    public object CaCentral1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "ca-central-1"
        override fun toString(): kotlin.String = value
    }

    public object CnNorth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "cn-north-1"
        override fun toString(): kotlin.String = value
    }

    public object CnNorthwest1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "cn-northwest-1"
        override fun toString(): kotlin.String = value
    }

    public object EuCentral1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-central-1"
        override fun toString(): kotlin.String = value
    }

    public object EuNorth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-north-1"
        override fun toString(): kotlin.String = value
    }

    public object EuSouth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-south-1"
        override fun toString(): kotlin.String = value
    }

    public object EuWest1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-west-1"
        override fun toString(): kotlin.String = value
    }

    public object EuWest2 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-west-2"
        override fun toString(): kotlin.String = value
    }

    public object EuWest3 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "eu-west-3"
        override fun toString(): kotlin.String = value
    }

    public object MeSouth1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "me-south-1"
        override fun toString(): kotlin.String = value
    }

    public object SaEast1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "sa-east-1"
        override fun toString(): kotlin.String = value
    }

    public object UsEast2 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "us-east-2"
        override fun toString(): kotlin.String = value
    }

    public object UsGovEast1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "us-gov-east-1"
        override fun toString(): kotlin.String = value
    }

    public object UsGovWest1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "us-gov-west-1"
        override fun toString(): kotlin.String = value
    }

    public object UsWest1 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "us-west-1"
        override fun toString(): kotlin.String = value
    }

    public object UsWest2 : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override val value: kotlin.String = "us-west-2"
        override fun toString(): kotlin.String = value
    }

    public data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.BucketLocationConstraint() {
        override fun toString(): kotlin.String = value
    }

    public companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        public fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.BucketLocationConstraint = when(str) {
            "EU" -> Eu
            "af-south-1" -> AfSouth1
            "ap-east-1" -> ApEast1
            "ap-northeast-1" -> ApNortheast1
            "ap-northeast-2" -> ApNortheast2
            "ap-northeast-3" -> ApNortheast3
            "ap-south-1" -> ApSouth1
            "ap-southeast-1" -> ApSoutheast1
            "ap-southeast-2" -> ApSoutheast2
            "ca-central-1" -> CaCentral1
            "cn-north-1" -> CnNorth1
            "cn-northwest-1" -> CnNorthwest1
            "eu-central-1" -> EuCentral1
            "eu-north-1" -> EuNorth1
            "eu-south-1" -> EuSouth1
            "eu-west-1" -> EuWest1
            "eu-west-2" -> EuWest2
            "eu-west-3" -> EuWest3
            "me-south-1" -> MeSouth1
            "sa-east-1" -> SaEast1
            "us-east-2" -> UsEast2
            "us-gov-east-1" -> UsGovEast1
            "us-gov-west-1" -> UsGovWest1
            "us-west-1" -> UsWest1
            "us-west-2" -> UsWest2
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        public fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.BucketLocationConstraint> = listOf(
            Eu,
            AfSouth1,
            ApEast1,
            ApNortheast1,
            ApNortheast2,
            ApNortheast3,
            ApSouth1,
            ApSoutheast1,
            ApSoutheast2,
            CaCentral1,
            CnNorth1,
            CnNorthwest1,
            EuCentral1,
            EuNorth1,
            EuSouth1,
            EuWest1,
            EuWest2,
            EuWest3,
            MeSouth1,
            SaEast1,
            UsEast2,
            UsGovEast1,
            UsGovWest1,
            UsWest1,
            UsWest2
        )
    }
}
