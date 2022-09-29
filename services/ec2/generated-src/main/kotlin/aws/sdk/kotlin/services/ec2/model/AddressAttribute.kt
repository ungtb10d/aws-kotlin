// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The attributes associated with an Elastic IP address.
 */
public class AddressAttribute private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; The allocation ID.
     */
    public val allocationId: kotlin.String? = builder.allocationId
    /**
     * The pointer (PTR) record for the IP address.
     */
    public val ptrRecord: kotlin.String? = builder.ptrRecord
    /**
     * The updated PTR record for the IP address.
     */
    public val ptrRecordUpdate: aws.sdk.kotlin.services.ec2.model.PtrUpdateStatus? = builder.ptrRecordUpdate
    /**
     * The public IP address.
     */
    public val publicIp: kotlin.String? = builder.publicIp

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AddressAttribute = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AddressAttribute(")
        append("allocationId=$allocationId,")
        append("ptrRecord=$ptrRecord,")
        append("ptrRecordUpdate=$ptrRecordUpdate,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (ptrRecord?.hashCode() ?: 0)
        result = 31 * result + (ptrRecordUpdate?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AddressAttribute

        if (allocationId != other.allocationId) return false
        if (ptrRecord != other.ptrRecord) return false
        if (ptrRecordUpdate != other.ptrRecordUpdate) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AddressAttribute = Builder(this).apply(block).build()

    public class Builder {
        /**
         * &#91;EC2-VPC&#93; The allocation ID.
         */
        public var allocationId: kotlin.String? = null
        /**
         * The pointer (PTR) record for the IP address.
         */
        public var ptrRecord: kotlin.String? = null
        /**
         * The updated PTR record for the IP address.
         */
        public var ptrRecordUpdate: aws.sdk.kotlin.services.ec2.model.PtrUpdateStatus? = null
        /**
         * The public IP address.
         */
        public var publicIp: kotlin.String? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AddressAttribute) : this() {
            this.allocationId = x.allocationId
            this.ptrRecord = x.ptrRecord
            this.ptrRecordUpdate = x.ptrRecordUpdate
            this.publicIp = x.publicIp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AddressAttribute = AddressAttribute(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PtrUpdateStatus] inside the given [block]
         */
        public fun ptrRecordUpdate(block: aws.sdk.kotlin.services.ec2.model.PtrUpdateStatus.Builder.() -> kotlin.Unit) {
            this.ptrRecordUpdate = aws.sdk.kotlin.services.ec2.model.PtrUpdateStatus.invoke(block)
        }
    }
}
