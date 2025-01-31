// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.UrlBuilder;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;

/**
 * The pipeline policy that adds the given host to each HttpRequest.
 */
public class HostPolicy implements HttpPipelinePolicy {
    private static final ClientLogger LOGGER = new ClientLogger(HostPolicy.class);

    private final String host;

    /**
     * Create HostPolicy.
     *
     * @param host The host to set on every HttpRequest.
     */
    public HostPolicy(String host) {
        this.host = host;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        LOGGER.log(LogLevel.VERBOSE, () -> "Setting host to " + host);

        final UrlBuilder urlBuilder = UrlBuilder.parse(context.getHttpRequest().getUrl());
        try {
            context.getHttpRequest().setUrl(urlBuilder.setHost(host).toUrl());
            return next.process();
        } catch (MalformedURLException e) {
            return Mono.error(new RuntimeException(String.format("Host URL '%s' is invalid.", host), e));
        }
    }
}
