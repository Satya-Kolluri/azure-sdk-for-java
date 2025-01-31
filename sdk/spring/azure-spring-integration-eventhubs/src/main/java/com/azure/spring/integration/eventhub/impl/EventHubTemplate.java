// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhub.impl;

import com.azure.spring.cloud.context.core.util.Tuple;
import com.azure.spring.integration.eventhub.api.EventHubClientFactory;
import com.azure.spring.integration.eventhub.api.EventHubOperation;
import com.azure.spring.integration.eventhub.converter.EventHubMessageConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.messaging.Message;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

/**
 * Default implementation of {@link EventHubOperation}.
 *
 * @author Warren Zhu
 * @author Xiaolu Dai
 */
public class EventHubTemplate extends AbstractEventHubTemplate implements EventHubOperation {
    private static final Logger LOG = LoggerFactory.getLogger(EventHubTemplate.class);

    // Use this concurrent map as set since no concurrent set which has putIfAbsent
    private final ConcurrentMap<Tuple<String, String>, Boolean> subscribedNameAndGroup = new ConcurrentHashMap<>();

    public EventHubTemplate(EventHubClientFactory clientFactory) {
        super(clientFactory);
        LOG.info("Started EventHubTemplate with properties: {}", buildPropertiesMap());
    }

    @Override
    public boolean subscribe(String destination, String consumerGroup, Consumer<Message<?>> consumer,
                             Class<?> messagePayloadType) {
        return subscribe(destination, consumerGroup, consumer, null, messagePayloadType);
    }

    @Override
    public boolean subscribe(String destination, String consumerGroup, Consumer<Message<?>> consumer,
                             @Nullable Consumer<Throwable> errorHandler, Class<?> messagePayloadType) {
        if (subscribedNameAndGroup.putIfAbsent(Tuple.of(destination, consumerGroup), true) == null) {
            this.createEventProcessorClient(destination, consumerGroup, createEventProcessor(consumer, errorHandler,
                messagePayloadType));

            this.startEventProcessorClient(destination, consumerGroup);
            LOG.info("Consumer subscribed to destination '{}' with consumer group '{}'", destination, consumerGroup);
            return true;
        }

        return false;
    }

    @Override
    public boolean unsubscribe(String destination, String consumerGroup) {
        if (subscribedNameAndGroup.remove(Tuple.of(destination, consumerGroup), true)) {
            stopEventProcessorClient(destination, consumerGroup);
            LOG.info("Consumer unsubscribed from destination '{}' with consumer group '{}'", destination,
                consumerGroup);
            return true;
        }

        return false;
    }

    public EventHubProcessor createEventProcessor(Consumer<Message<?>> consumer, Class<?> messagePayloadType) {
        return createEventProcessor(consumer, null, messagePayloadType);
    }

    public EventHubProcessor createEventProcessor(Consumer<Message<?>> consumer, Consumer<Throwable> errorHandler,
                                                  Class<?> messagePayloadType) {
        return new EventHubProcessor(consumer, errorHandler, messagePayloadType, getCheckpointConfig(),
            getMessageConverter());
    }

    @Override
    public EventHubMessageConverter getMessageConverter() {
        return messageConverter;
    }

    @Override
    public void setMessageConverter(EventHubMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }
}
