// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a key pair.
 */
public class CreateKeyPairResponse private constructor(builder: Builder) {
    /**
     * + For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     * + For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with OpenSSH 6.8.
     */
    public val keyFingerprint: kotlin.String? = builder.keyFingerprint
    /**
     * An unencrypted PEM encoded RSA or ED25519 private key.
     */
    public val keyMaterial: kotlin.String? = builder.keyMaterial
    /**
     * The name of the key pair.
     */
    public val keyName: kotlin.String? = builder.keyName
    /**
     * The ID of the key pair.
     */
    public val keyPairId: kotlin.String? = builder.keyPairId
    /**
     * Any tags applied to the key pair.
     */
    public val tags: List<Tag>? = builder.tags

    public companion object {
        public operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateKeyPairResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateKeyPairResponse(")
        append("keyFingerprint=$keyFingerprint,")
        append("keyMaterial=*** Sensitive Data Redacted ***,")
        append("keyName=$keyName,")
        append("keyPairId=$keyPairId,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = keyFingerprint?.hashCode() ?: 0
        result = 31 * result + (keyMaterial?.hashCode() ?: 0)
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (keyPairId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateKeyPairResponse

        if (keyFingerprint != other.keyFingerprint) return false
        if (keyMaterial != other.keyMaterial) return false
        if (keyName != other.keyName) return false
        if (keyPairId != other.keyPairId) return false
        if (tags != other.tags) return false

        return true
    }

    public inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateKeyPairResponse = Builder(this).apply(block).build()

    public class Builder {
        /**
         * + For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
         * + For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with OpenSSH 6.8.
         */
        public var keyFingerprint: kotlin.String? = null
        /**
         * An unencrypted PEM encoded RSA or ED25519 private key.
         */
        public var keyMaterial: kotlin.String? = null
        /**
         * The name of the key pair.
         */
        public var keyName: kotlin.String? = null
        /**
         * The ID of the key pair.
         */
        public var keyPairId: kotlin.String? = null
        /**
         * Any tags applied to the key pair.
         */
        public var tags: List<Tag>? = null

        @PublishedApi
        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateKeyPairResponse) : this() {
            this.keyFingerprint = x.keyFingerprint
            this.keyMaterial = x.keyMaterial
            this.keyName = x.keyName
            this.keyPairId = x.keyPairId
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateKeyPairResponse = CreateKeyPairResponse(this)
    }
}
