// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.search.documents.indexes.implementation.models.DocumentKeysOrIds;
import com.azure.search.documents.indexes.implementation.models.ListIndexersResult;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.implementation.models.SearchIndexer;
import com.azure.search.documents.indexes.models.SearchIndexerStatus;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Indexers. */
public final class IndexersImpl {
    /** The proxy service used to perform REST calls. */
    private final IndexersService service;

    /** The service client containing this operation class. */
    private final SearchServiceClientImpl client;

    /**
     * Initializes an instance of IndexersImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IndexersImpl(SearchServiceClientImpl client) {
        this.service = RestProxy.create(IndexersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchServiceClientIndexers to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClientI")
    public interface IndexersService {
        @Post("/indexers('{indexerName}')/search.reset")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> reset(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/indexers('{indexerName}')/search.resetdocs")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> resetDocs(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @QueryParam("overwrite") Boolean overwrite,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") DocumentKeysOrIds keysOrIds,
                Context context);

        @Post("/indexers('{indexerName}')/search.run")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> run(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/indexers('{indexerName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexer>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Prefer") String prefer,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("ignoreResetRequirements") Boolean skipIndexerResetRequirementForCache,
                @QueryParam("disableCacheReprocessingChangeDetection") Boolean disableCacheReprocessingChangeDetection,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndexer indexer,
                Context context);

        @Delete("/indexers('{indexerName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/indexers('{indexerName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexer>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/indexers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<ListIndexersResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("$select") String select,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/indexers")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexer>> create(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SearchIndexer indexer,
                Context context);

        @Get("/indexers('{indexerName}')/search.status")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchIndexerStatus>> getStatus(
                @HostParam("endpoint") String endpoint,
                @PathParam("indexerName") String indexerName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Resets the change tracking state associated with an indexer.
     *
     * @param indexerName The name of the indexer to reset.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetWithResponseAsync(
            String indexerName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.reset(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Resets specific documents in the datasource to be selectively re-ingested by the indexer.
     *
     * @param indexerName The name of the indexer to reset documents for.
     * @param overwrite If false, keys or ids will be appended to existing ones. If true, only the keys or ids in this
     *     payload will be queued to be re-ingested.
     * @param keysOrIds The keysOrIds parameter.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetDocsWithResponseAsync(
            String indexerName,
            Boolean overwrite,
            DocumentKeysOrIds keysOrIds,
            RequestOptions requestOptions,
            Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.resetDocs(
                this.client.getEndpoint(),
                indexerName,
                overwrite,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                keysOrIds,
                context);
    }

    /**
     * Runs an indexer on-demand.
     *
     * @param indexerName The name of the indexer to run.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> runWithResponseAsync(
            String indexerName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.run(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Creates a new indexer or updates an indexer if it already exists.
     *
     * @param indexerName The name of the indexer to create or update.
     * @param indexer The definition of the indexer to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param skipIndexerResetRequirementForCache Ignores cache reset requirements.
     * @param disableCacheReprocessingChangeDetection Disables cache reprocessing change detection.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an indexer along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexer>> createOrUpdateWithResponseAsync(
            String indexerName,
            SearchIndexer indexer,
            String ifMatch,
            String ifNoneMatch,
            Boolean skipIndexerResetRequirementForCache,
            Boolean disableCacheReprocessingChangeDetection,
            RequestOptions requestOptions,
            Context context) {
        final String prefer = "return=representation";
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.createOrUpdate(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                prefer,
                this.client.getApiVersion(),
                skipIndexerResetRequirementForCache,
                disableCacheReprocessingChangeDetection,
                accept,
                indexer,
                context);
    }

    /**
     * Deletes an indexer.
     *
     * @param indexerName The name of the indexer to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String indexerName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.delete(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Retrieves an indexer definition.
     *
     * @param indexerName The name of the indexer to retrieve.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an indexer along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexer>> getWithResponseAsync(
            String indexerName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.get(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Lists all indexers available for a search service.
     *
     * @param select Selects which top-level properties of the indexers to retrieve. Specified as a comma-separated list
     *     of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a List Indexers request along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ListIndexersResult>> listWithResponseAsync(
            String select, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.list(
                this.client.getEndpoint(), select, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates a new indexer.
     *
     * @param indexer The definition of the indexer to create.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an indexer along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexer>> createWithResponseAsync(
            SearchIndexer indexer, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.create(
                this.client.getEndpoint(), xMsClientRequestId, this.client.getApiVersion(), accept, indexer, context);
    }

    /**
     * Returns the current status and execution history of an indexer.
     *
     * @param indexerName The name of the indexer for which to retrieve status.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the current status and execution history of an indexer along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchIndexerStatus>> getStatusWithResponseAsync(
            String indexerName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.getStatus(
                this.client.getEndpoint(),
                indexerName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }
}
