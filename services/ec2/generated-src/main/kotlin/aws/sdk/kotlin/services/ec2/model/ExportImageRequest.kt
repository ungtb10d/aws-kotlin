// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class ExportImageRequest private constructor(builder: Builder) {
    /**
     * Token to enable idempotency for export image requests.
     */
    public val clientToken: kotlin.String? = builder.clientToken
    /**
     * A description of the image being exported. The maximum length is 255 characters.
     */
    public val description: kotlin.String? = builder.description
    /**
     * The disk image format.
     */
    public val diskImageFormat: aws.sdk.kotlin.services.ec2.model.DiskImageFormat? = builder.diskImageFormat
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
     */
    public val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the image.
     */
    public val imageId: kotlin.String? = builder.imageId
    /**
     * The name of the role that grants VM Import/Export permission to export images to your Amazon S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
     */
    public val roleName: kotlin.String? = builder.roleName
    /**
     * The Amazon S3 bucket for the destination image. The destination bucket must exist.
     */
    public val s3ExportLocation: aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest? = builder.s3ExportLocation
    /**
     * The tags to apply to the export image task during creation.
     */
    public val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportImageRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportImageRequest(")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("diskImageFormat=$diskImageFormat,")
        append("dryRun=$dryRun,")
        append("imageId=$imageId,")
        append("roleName=$roleName,")
        append("s3ExportLocation=$s3ExportLocation,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (diskImageFormat?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (roleName?.hashCode() ?: 0)
        result = 31 * result + (s3ExportLocation?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportImageRequest

        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (diskImageFormat != other.diskImageFormat) return false
        if (dryRun != other.dryRun) return false
        if (imageId != other.imageId) return false
        if (roleName != other.roleName) return false
        if (s3ExportLocation != other.s3ExportLocation) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportImageRequest = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Token to enable idempotency for export image requests.
         */
        public var clientToken: kotlin.String? = null
        /**
         * A description of the image being exported. The maximum length is 255 characters.
         */
        public var description: kotlin.String? = null
        /**
         * The disk image format.
         */
        public var diskImageFormat: aws.sdk.kotlin.services.ec2.model.DiskImageFormat? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is `DryRunOperation`. Otherwise, it is `UnauthorizedOperation`.
         */
        public var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the image.
         */
        public var imageId: kotlin.String? = null
        /**
         * The name of the role that grants VM Import/Export permission to export images to your Amazon S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
         */
        public var roleName: kotlin.String? = null
        /**
         * The Amazon S3 bucket for the destination image. The destination bucket must exist.
         */
        public var s3ExportLocation: aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest? = null
        /**
         * The tags to apply to the export image task during creation.
         */
        public var tagSpecifications: List<TagSpecification>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportImageRequest) : this() {
            this.clientToken = x.clientToken
            this.description = x.description
            this.diskImageFormat = x.diskImageFormat
            this.dryRun = x.dryRun
            this.imageId = x.imageId
            this.roleName = x.roleName
            this.s3ExportLocation = x.s3ExportLocation
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportImageRequest = ExportImageRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest] inside the given [block]
         */
        public fun s3ExportLocation(block: aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest.Builder.() -> kotlin.Unit) {
            this.s3ExportLocation = aws.sdk.kotlin.services.ec2.model.ExportTaskS3LocationRequest.invoke(block)
        }
    }
}
