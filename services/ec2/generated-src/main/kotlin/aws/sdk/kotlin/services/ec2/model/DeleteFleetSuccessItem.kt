// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an EC2 Fleet that was successfully deleted.
 */
public class DeleteFleetSuccessItem private constructor(builder: Builder) {
    /**
     * The current state of the EC2 Fleet.
     */
    public val currentFleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = builder.currentFleetState
    /**
     * The ID of the EC2 Fleet.
     */
    public val fleetId: kotlin.String? = builder.fleetId
    /**
     * The previous state of the EC2 Fleet.
     */
    public val previousFleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = builder.previousFleetState

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteFleetSuccessItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteFleetSuccessItem(")
        append("currentFleetState=$currentFleetState,")
        append("fleetId=$fleetId,")
        append("previousFleetState=$previousFleetState)")
    }

    override fun hashCode(): kotlin.Int {
        var result = currentFleetState?.hashCode() ?: 0
        result = 31 * result + (fleetId?.hashCode() ?: 0)
        result = 31 * result + (previousFleetState?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteFleetSuccessItem

        if (currentFleetState != other.currentFleetState) return false
        if (fleetId != other.fleetId) return false
        if (previousFleetState != other.previousFleetState) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteFleetSuccessItem = Builder(this).apply(block).build()

    public class Builder {
        /**
         * The current state of the EC2 Fleet.
         */
        public var currentFleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = null
        /**
         * The ID of the EC2 Fleet.
         */
        public var fleetId: kotlin.String? = null
        /**
         * The previous state of the EC2 Fleet.
         */
        public var previousFleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteFleetSuccessItem) : this() {
            this.currentFleetState = x.currentFleetState
            this.fleetId = x.fleetId
            this.previousFleetState = x.previousFleetState
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteFleetSuccessItem = DeleteFleetSuccessItem(this)
    }
}
