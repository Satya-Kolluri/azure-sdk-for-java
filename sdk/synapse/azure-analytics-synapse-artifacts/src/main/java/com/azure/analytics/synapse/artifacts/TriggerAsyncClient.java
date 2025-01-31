// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.TriggersImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.TriggerResource;
import com.azure.analytics.synapse.artifacts.models.TriggerSubscriptionOperationStatus;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class TriggerAsyncClient {
    @Generated private final TriggersImpl serviceClient;

    /**
     * Initializes an instance of Triggers client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    TriggerAsyncClient(TriggersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists triggers.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger resources as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TriggerResource> getTriggersByWorkspace() {
        return this.serviceClient.getTriggersByWorkspaceAsync();
    }

    /**
     * Creates or updates a trigger.
     *
     * @param triggerName The trigger name.
     * @param trigger Trigger resource definition.
     * @param ifMatch ETag of the trigger entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TriggerResource>> createOrUpdateTriggerWithResponse(
            String triggerName, TriggerResource trigger, String ifMatch) {
        return this.serviceClient.createOrUpdateTriggerWithResponseAsync(triggerName, trigger, ifMatch);
    }

    /**
     * Creates or updates a trigger.
     *
     * @param triggerName The trigger name.
     * @param trigger Trigger resource definition.
     * @param ifMatch ETag of the trigger entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger resource type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerResource> createOrUpdateTrigger(String triggerName, TriggerResource trigger, String ifMatch) {
        return this.serviceClient.createOrUpdateTriggerAsync(triggerName, trigger, ifMatch);
    }

    /**
     * Creates or updates a trigger.
     *
     * @param triggerName The trigger name.
     * @param trigger Trigger resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return trigger resource type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerResource> createOrUpdateTrigger(String triggerName, TriggerResource trigger) {
        return this.serviceClient.createOrUpdateTriggerAsync(triggerName, trigger);
    }

    /**
     * Gets a trigger.
     *
     * @param triggerName The trigger name.
     * @param ifNoneMatch ETag of the trigger entity. Should only be specified for get. If the ETag matches the existing
     *     entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TriggerResource>> getTriggerWithResponse(String triggerName, String ifNoneMatch) {
        return this.serviceClient.getTriggerWithResponseAsync(triggerName, ifNoneMatch);
    }

    /**
     * Gets a trigger.
     *
     * @param triggerName The trigger name.
     * @param ifNoneMatch ETag of the trigger entity. Should only be specified for get. If the ETag matches the existing
     *     entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerResource> getTrigger(String triggerName, String ifNoneMatch) {
        return this.serviceClient.getTriggerAsync(triggerName, ifNoneMatch);
    }

    /**
     * Gets a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerResource> getTrigger(String triggerName) {
        return this.serviceClient.getTriggerAsync(triggerName);
    }

    /**
     * Deletes a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteTriggerWithResponse(String triggerName) {
        return this.serviceClient.deleteTriggerWithResponseAsync(triggerName);
    }

    /**
     * Deletes a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteTrigger(String triggerName) {
        return this.serviceClient.deleteTriggerAsync(triggerName);
    }

    /**
     * Subscribe event trigger to events.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TriggerSubscriptionOperationStatus>> subscribeTriggerToEventsWithResponse(String triggerName) {
        return this.serviceClient.subscribeTriggerToEventsWithResponseAsync(triggerName);
    }

    /**
     * Subscribe event trigger to events.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerSubscriptionOperationStatus> subscribeTriggerToEvents(String triggerName) {
        return this.serviceClient.subscribeTriggerToEventsAsync(triggerName);
    }

    /**
     * Get a trigger's event subscription status.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger's event subscription status along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TriggerSubscriptionOperationStatus>> getEventSubscriptionStatusWithResponse(
            String triggerName) {
        return this.serviceClient.getEventSubscriptionStatusWithResponseAsync(triggerName);
    }

    /**
     * Get a trigger's event subscription status.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a trigger's event subscription status on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerSubscriptionOperationStatus> getEventSubscriptionStatus(String triggerName) {
        return this.serviceClient.getEventSubscriptionStatusAsync(triggerName);
    }

    /**
     * Unsubscribe event trigger from events.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TriggerSubscriptionOperationStatus>> unsubscribeTriggerFromEventsWithResponse(
            String triggerName) {
        return this.serviceClient.unsubscribeTriggerFromEventsWithResponseAsync(triggerName);
    }

    /**
     * Unsubscribe event trigger from events.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the response of a trigger subscription operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TriggerSubscriptionOperationStatus> unsubscribeTriggerFromEvents(String triggerName) {
        return this.serviceClient.unsubscribeTriggerFromEventsAsync(triggerName);
    }

    /**
     * Starts a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startTriggerWithResponse(String triggerName) {
        return this.serviceClient.startTriggerWithResponseAsync(triggerName);
    }

    /**
     * Starts a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> startTrigger(String triggerName) {
        return this.serviceClient.startTriggerAsync(triggerName);
    }

    /**
     * Stops a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopTriggerWithResponse(String triggerName) {
        return this.serviceClient.stopTriggerWithResponseAsync(triggerName);
    }

    /**
     * Stops a trigger.
     *
     * @param triggerName The trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stopTrigger(String triggerName) {
        return this.serviceClient.stopTriggerAsync(triggerName);
    }
}
