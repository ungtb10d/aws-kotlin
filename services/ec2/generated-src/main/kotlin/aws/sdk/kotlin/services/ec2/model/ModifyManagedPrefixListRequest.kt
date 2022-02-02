// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyManagedPrefixListRequest private constructor(builder: Builder) {
    /**
     * One or more entries to add to the prefix list.
     */
    val addEntries: List<AddPrefixListEntry>? = builder.addEntries
    /**
     * The current version of the prefix list.
     */
    val currentVersion: kotlin.Long? = builder.currentVersion
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The maximum number of entries for the prefix list. You cannot modify the entries
     * of a prefix list and modify the size of a prefix list at the same time.
     * If any of the resources that reference the prefix list cannot support the new
     * maximum size, the modify operation fails. Check the state message for the IDs of
     * the first ten resources that do not support the new maximum size.
     */
    val maxEntries: kotlin.Int? = builder.maxEntries
    /**
     * The ID of the prefix list.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * A name for the prefix list.
     */
    val prefixListName: kotlin.String? = builder.prefixListName
    /**
     * One or more entries to remove from the prefix list.
     */
    val removeEntries: List<RemovePrefixListEntry>? = builder.removeEntries

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyManagedPrefixListRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyManagedPrefixListRequest(")
        append("addEntries=$addEntries,")
        append("currentVersion=$currentVersion,")
        append("dryRun=$dryRun,")
        append("maxEntries=$maxEntries,")
        append("prefixListId=$prefixListId,")
        append("prefixListName=$prefixListName,")
        append("removeEntries=$removeEntries)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addEntries?.hashCode() ?: 0
        result = 31 * result + (currentVersion?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (maxEntries ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (prefixListName?.hashCode() ?: 0)
        result = 31 * result + (removeEntries?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyManagedPrefixListRequest

        if (addEntries != other.addEntries) return false
        if (currentVersion != other.currentVersion) return false
        if (dryRun != other.dryRun) return false
        if (maxEntries != other.maxEntries) return false
        if (prefixListId != other.prefixListId) return false
        if (prefixListName != other.prefixListName) return false
        if (removeEntries != other.removeEntries) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyManagedPrefixListRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * One or more entries to add to the prefix list.
         */
        var addEntries: List<AddPrefixListEntry>? = null
        /**
         * The current version of the prefix list.
         */
        var currentVersion: kotlin.Long? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The maximum number of entries for the prefix list. You cannot modify the entries
         * of a prefix list and modify the size of a prefix list at the same time.
         * If any of the resources that reference the prefix list cannot support the new
         * maximum size, the modify operation fails. Check the state message for the IDs of
         * the first ten resources that do not support the new maximum size.
         */
        var maxEntries: kotlin.Int? = null
        /**
         * The ID of the prefix list.
         */
        var prefixListId: kotlin.String? = null
        /**
         * A name for the prefix list.
         */
        var prefixListName: kotlin.String? = null
        /**
         * One or more entries to remove from the prefix list.
         */
        var removeEntries: List<RemovePrefixListEntry>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyManagedPrefixListRequest) : this() {
            this.addEntries = x.addEntries
            this.currentVersion = x.currentVersion
            this.dryRun = x.dryRun
            this.maxEntries = x.maxEntries
            this.prefixListId = x.prefixListId
            this.prefixListName = x.prefixListName
            this.removeEntries = x.removeEntries
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyManagedPrefixListRequest = ModifyManagedPrefixListRequest(this)
    }
}