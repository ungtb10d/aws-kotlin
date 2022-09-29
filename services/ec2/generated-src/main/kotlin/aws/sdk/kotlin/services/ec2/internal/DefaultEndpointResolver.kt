// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.internal

import aws.sdk.kotlin.runtime.ClientException
import aws.sdk.kotlin.runtime.endpoint.AwsEndpoint
import aws.sdk.kotlin.runtime.endpoint.AwsEndpointResolver
import aws.sdk.kotlin.runtime.endpoint.CredentialScope
import aws.sdk.kotlin.runtime.endpoint.internal.EndpointDefinition
import aws.sdk.kotlin.runtime.endpoint.internal.Partition
import aws.sdk.kotlin.runtime.endpoint.internal.resolveEndpoint

internal class DefaultEndpointResolver : AwsEndpointResolver {
    override suspend fun resolve(service: String, region: String): AwsEndpoint {
        return resolveEndpoint(servicePartitions, region) ?: throw ClientException("unable to resolve endpoint for region: $region")
    }
}

private val servicePartitions = listOf(
    Partition(
        id = "aws",
        regionRegex = Regex("^(us|eu|ap|sa|ca|me|af)\\-\\w+\\-\\d+$"),
        partitionEndpoint = "",
        isRegionalized = true,
        defaults = EndpointDefinition(
            hostname = "ec2.{region}.amazonaws.com",
            protocols = listOf("http", "https", ),
            signatureVersions = listOf("v4", ),
        ),
        endpoints = mapOf(
            "af-south-1" to EndpointDefinition(),
            "ap-east-1" to EndpointDefinition(),
            "ap-northeast-1" to EndpointDefinition(),
            "ap-northeast-2" to EndpointDefinition(),
            "ap-northeast-3" to EndpointDefinition(),
            "ap-south-1" to EndpointDefinition(),
            "ap-southeast-1" to EndpointDefinition(),
            "ap-southeast-2" to EndpointDefinition(),
            "ca-central-1" to EndpointDefinition(),
            "eu-central-1" to EndpointDefinition(),
            "eu-north-1" to EndpointDefinition(),
            "eu-south-1" to EndpointDefinition(),
            "eu-west-1" to EndpointDefinition(),
            "eu-west-2" to EndpointDefinition(),
            "eu-west-3" to EndpointDefinition(),
            "fips-ca-central-1" to EndpointDefinition(
                hostname = "ec2-fips.ca-central-1.amazonaws.com",
                credentialScope = CredentialScope(region = "ca-central-1",),
            ),
            "fips-us-east-1" to EndpointDefinition(
                hostname = "ec2-fips.us-east-1.amazonaws.com",
                credentialScope = CredentialScope(region = "us-east-1",),
            ),
            "fips-us-east-2" to EndpointDefinition(
                hostname = "ec2-fips.us-east-2.amazonaws.com",
                credentialScope = CredentialScope(region = "us-east-2",),
            ),
            "fips-us-west-1" to EndpointDefinition(
                hostname = "ec2-fips.us-west-1.amazonaws.com",
                credentialScope = CredentialScope(region = "us-west-1",),
            ),
            "fips-us-west-2" to EndpointDefinition(
                hostname = "ec2-fips.us-west-2.amazonaws.com",
                credentialScope = CredentialScope(region = "us-west-2",),
            ),
            "me-south-1" to EndpointDefinition(),
            "sa-east-1" to EndpointDefinition(),
            "us-east-1" to EndpointDefinition(),
            "us-east-2" to EndpointDefinition(),
            "us-west-1" to EndpointDefinition(),
            "us-west-2" to EndpointDefinition(),
        )
    ),
    Partition(
        id = "aws-cn",
        regionRegex = Regex("^cn\\-\\w+\\-\\d+$"),
        partitionEndpoint = "",
        isRegionalized = true,
        defaults = EndpointDefinition(
            hostname = "ec2.{region}.amazonaws.com.cn",
            protocols = listOf("http", "https", ),
            signatureVersions = listOf("v4", ),
        ),
        endpoints = mapOf(
            "cn-north-1" to EndpointDefinition(),
            "cn-northwest-1" to EndpointDefinition(),
        )
    ),
    Partition(
        id = "aws-iso",
        regionRegex = Regex("^us\\-iso\\-\\w+\\-\\d+$"),
        partitionEndpoint = "",
        isRegionalized = true,
        defaults = EndpointDefinition(
            hostname = "ec2.{region}.c2s.ic.gov",
            protocols = listOf("https", ),
            signatureVersions = listOf("v4", ),
        ),
        endpoints = mapOf(
            "us-iso-east-1" to EndpointDefinition(),
        )
    ),
    Partition(
        id = "aws-iso-b",
        regionRegex = Regex("^us\\-isob\\-\\w+\\-\\d+$"),
        partitionEndpoint = "",
        isRegionalized = true,
        defaults = EndpointDefinition(
            hostname = "ec2.{region}.sc2s.sgov.gov",
            protocols = listOf("http", "https", ),
            signatureVersions = listOf("v4", ),
        ),
        endpoints = mapOf(
            "us-isob-east-1" to EndpointDefinition(),
        )
    ),
    Partition(
        id = "aws-us-gov",
        regionRegex = Regex("^us\\-gov\\-\\w+\\-\\d+$"),
        partitionEndpoint = "",
        isRegionalized = true,
        defaults = EndpointDefinition(
            hostname = "ec2.{region}.amazonaws.com",
            protocols = listOf("https", ),
            signatureVersions = listOf("v4", ),
        ),
        endpoints = mapOf(
            "us-gov-east-1" to EndpointDefinition(
                hostname = "ec2.us-gov-east-1.amazonaws.com",
                credentialScope = CredentialScope(region = "us-gov-east-1",),
            ),
            "us-gov-west-1" to EndpointDefinition(
                hostname = "ec2.us-gov-west-1.amazonaws.com",
                credentialScope = CredentialScope(region = "us-gov-west-1",),
            ),
        )
    ),
)
