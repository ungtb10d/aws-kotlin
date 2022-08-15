// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



public class CreateVpcPeeringConnectionResponse private constructor(builder: Builder) {
    /**
     * Information about the VPC peering connection.
     */
    public val vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection? = builder.vpcPeeringConnection

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcPeeringConnectionResponse(")
        append("vpcPeeringConnection=$vpcPeeringConnection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = vpcPeeringConnection?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcPeeringConnectionResponse

        if (vpcPeeringConnection != other.vpcPeeringConnection) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * Information about the VPC peering connection.
         */
        public var vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionResponse) : this() {
            this.vpcPeeringConnection = x.vpcPeeringConnection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcPeeringConnectionResponse = CreateVpcPeeringConnectionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection] inside the given [block]
         */
        public fun vpcPeeringConnection(block: aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection.Builder.() -> kotlin.Unit) {
            this.vpcPeeringConnection = aws.sdk.kotlin.services.ec2.model.VpcPeeringConnection.invoke(block)
        }
    }
}
