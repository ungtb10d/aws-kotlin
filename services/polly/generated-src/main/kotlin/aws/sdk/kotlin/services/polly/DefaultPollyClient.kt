// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly

import aws.sdk.kotlin.runtime.client.AwsClientOption
import aws.sdk.kotlin.runtime.http.ApiMetadata
import aws.sdk.kotlin.runtime.http.AwsUserAgentMetadata
import aws.sdk.kotlin.runtime.http.middleware.AwsRetryMiddleware
import aws.sdk.kotlin.runtime.http.middleware.RecursionDetection
import aws.sdk.kotlin.runtime.http.middleware.ResolveAwsEndpoint
import aws.sdk.kotlin.runtime.http.middleware.UserAgent
import aws.sdk.kotlin.runtime.http.retries.AwsDefaultRetryPolicy
import aws.sdk.kotlin.services.polly.model.*
import aws.sdk.kotlin.services.polly.transform.*
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigningAttributes
import aws.smithy.kotlin.runtime.auth.awssigning.middleware.AwsSigningMiddleware
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.client.SdkClientOption
import aws.smithy.kotlin.runtime.http.SdkHttpClient
import aws.smithy.kotlin.runtime.http.engine.DefaultHttpEngine
import aws.smithy.kotlin.runtime.http.operation.SdkHttpOperation
import aws.smithy.kotlin.runtime.http.operation.context
import aws.smithy.kotlin.runtime.http.operation.execute
import aws.smithy.kotlin.runtime.http.operation.roundTrip
import aws.smithy.kotlin.runtime.http.sdkHttpClient
import aws.smithy.kotlin.runtime.io.Closeable
import aws.smithy.kotlin.runtime.util.putIfAbsent


public const val ServiceId: String = "Polly"
public const val ServiceApiVersion: String = "2016-06-10"
public const val SdkVersion: String = "0.17.7-SNAPSHOT"

internal class DefaultPollyClient(override val config: PollyClient.Config) : PollyClient {
    private val client: SdkHttpClient
    init {
        val httpClientEngine = config.httpClientEngine ?: DefaultHttpEngine()
        client = sdkHttpClient(httpClientEngine, manageEngine = config.httpClientEngine == null)
    }
    private val awsUserAgentMetadata = AwsUserAgentMetadata.fromEnvironment(ApiMetadata(ServiceId, SdkVersion))

    /**
     * Deletes the specified pronunciation lexicon stored in an Amazon Web Services Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the `GetLexicon` or `ListLexicon` APIs.
     *
     * For more information, see [Managing Lexicons](https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html).
     */
    override suspend fun deleteLexicon(input: DeleteLexiconRequest): DeleteLexiconResponse {
        val op = SdkHttpOperation.build<DeleteLexiconRequest, DeleteLexiconResponse> {
            serializer = DeleteLexiconOperationSerializer()
            deserializer = DeleteLexiconOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "DeleteLexicon"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.
     *
     * When synthesizing speech ( `SynthesizeSpeech` ), you provide the voice ID for the voice you want from the list of voices returned by `DescribeVoices`.
     *
     * For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the `DescribeVoices` operation you can provide the user with a list of available voices to select from.
     *
     *  You can optionally specify a language code to filter the available voices. For example, if you specify `en-US`, the operation returns a list of all available US English voices.
     *
     * This operation requires permissions to perform the `polly:DescribeVoices` action.
     */
    override suspend fun describeVoices(input: DescribeVoicesRequest): DescribeVoicesResponse {
        val op = SdkHttpOperation.build<DescribeVoicesRequest, DescribeVoicesResponse> {
            serializer = DescribeVoicesOperationSerializer()
            deserializer = DescribeVoicesOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "DescribeVoices"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Returns the content of the specified pronunciation lexicon stored in an Amazon Web Services Region. For more information, see [Managing Lexicons](https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html).
     */
    override suspend fun getLexicon(input: GetLexiconRequest): GetLexiconResponse {
        val op = SdkHttpOperation.build<GetLexiconRequest, GetLexiconResponse> {
            serializer = GetLexiconOperationSerializer()
            deserializer = GetLexiconOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "GetLexicon"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
     */
    override suspend fun getSpeechSynthesisTask(input: GetSpeechSynthesisTaskRequest): GetSpeechSynthesisTaskResponse {
        val op = SdkHttpOperation.build<GetSpeechSynthesisTaskRequest, GetSpeechSynthesisTaskResponse> {
            serializer = GetSpeechSynthesisTaskOperationSerializer()
            deserializer = GetSpeechSynthesisTaskOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "GetSpeechSynthesisTask"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Returns a list of pronunciation lexicons stored in an Amazon Web Services Region. For more information, see [Managing Lexicons](https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html).
     */
    override suspend fun listLexicons(input: ListLexiconsRequest): ListLexiconsResponse {
        val op = SdkHttpOperation.build<ListLexiconsRequest, ListLexiconsResponse> {
            serializer = ListLexiconsOperationSerializer()
            deserializer = ListLexiconsOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "ListLexicons"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
     */
    override suspend fun listSpeechSynthesisTasks(input: ListSpeechSynthesisTasksRequest): ListSpeechSynthesisTasksResponse {
        val op = SdkHttpOperation.build<ListSpeechSynthesisTasksRequest, ListSpeechSynthesisTasksResponse> {
            serializer = ListSpeechSynthesisTasksOperationSerializer()
            deserializer = ListSpeechSynthesisTasksOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "ListSpeechSynthesisTasks"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Stores a pronunciation lexicon in an Amazon Web Services Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation.
     *
     * For more information, see [Managing Lexicons](https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html).
     */
    override suspend fun putLexicon(input: PutLexiconRequest): PutLexiconResponse {
        val op = SdkHttpOperation.build<PutLexiconRequest, PutLexiconResponse> {
            serializer = PutLexiconOperationSerializer()
            deserializer = PutLexiconOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "PutLexicon"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Allows the creation of an asynchronous synthesis task, by starting a new `SpeechSynthesisTask`. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (`OutputS3KeyPrefix` and `SnsTopicArn`). Once the synthesis task is created, this operation will return a `SpeechSynthesisTask` object, which will include an identifier of this task as well as the current status. The `SpeechSynthesisTask` object is available for 72 hours after starting the asynchronous synthesis task.
     */
    override suspend fun startSpeechSynthesisTask(input: StartSpeechSynthesisTaskRequest): StartSpeechSynthesisTaskResponse {
        val op = SdkHttpOperation.build<StartSpeechSynthesisTaskRequest, StartSpeechSynthesisTaskResponse> {
            serializer = StartSpeechSynthesisTaskOperationSerializer()
            deserializer = StartSpeechSynthesisTaskOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "StartSpeechSynthesisTask"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.roundTrip(client, input)
    }

    /**
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see [How it Works](https://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html).
     */
    override suspend fun <T> synthesizeSpeech(input: SynthesizeSpeechRequest, block: suspend (SynthesizeSpeechResponse) -> T): T {
        val op = SdkHttpOperation.build<SynthesizeSpeechRequest, SynthesizeSpeechResponse> {
            serializer = SynthesizeSpeechOperationSerializer()
            deserializer = SynthesizeSpeechOperationDeserializer()
            context {
                expectedHttpStatus = 200
                service = serviceName
                operationName = "SynthesizeSpeech"
            }
        }
        mergeServiceDefaults(op.context)
        op.install(ResolveAwsEndpoint(ServiceId, config.endpointResolver))
        op.install(AwsRetryMiddleware(config.retryStrategy, AwsDefaultRetryPolicy))
        op.install(UserAgent(awsUserAgentMetadata))
        op.install(RecursionDetection())
        op.install(
            AwsSigningMiddleware {
                this.signer = config.signer
                this.credentialsProvider = config.credentialsProvider
                this.service = "polly"
            }
        )
        return op.execute(client, input, block)
    }

    override fun close() {
        client.close()
        (config.credentialsProvider as? Closeable)?.close()
    }

    /**
     * merge the defaults configured for the service into the execution context before firing off a request
     */
    private suspend fun mergeServiceDefaults(ctx: ExecutionContext) {
        ctx.putIfAbsent(AwsClientOption.Region, config.region)
        ctx.putIfAbsent(SdkClientOption.ServiceName, serviceName)
        ctx.putIfAbsent(SdkClientOption.LogMode, config.sdkLogMode)
        ctx.putIfAbsent(AwsSigningAttributes.SigningService, "polly")
        ctx.putIfAbsent(AwsSigningAttributes.Signer, config.signer)
        ctx.putIfAbsent(AwsSigningAttributes.SigningRegion, config.region)
        ctx.putIfAbsent(AwsSigningAttributes.CredentialsProvider, config.credentialsProvider)
    }
}
