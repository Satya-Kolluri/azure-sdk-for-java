// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation.util;

import com.azure.core.util.logging.ClientLogger;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Utility class for validating parameters.
 */
public final class ValidationUtil {
    private static final Pattern TENANT_IDENTIFIER_CHAR_PATTERN = Pattern.compile("^(?:[A-Z]|[0-9]|[a-z]|-|.)+$");

    public static void validate(String className, Map<String, Object> parameters, ClientLogger logger) {
        List<String> missing = new ArrayList<>();
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            if (entry.getValue() == null) {
                missing.add(entry.getKey());
            }
        }
        if (missing.size() > 0) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("Must provide non-null values for "
                + String.join(", ", missing) + " properties in " + className));
        }
    }

    public static void validateAuthHost(String authHost, ClientLogger logger) {
        try {
            new URI(authHost);
        } catch (URISyntaxException e) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Must provide a valid URI for authority host.", e));
        }
        if (!authHost.startsWith("https")) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Authority host must use https scheme."));
        }
    }

    public static void validateTenantIdCharacterRange(String id, ClientLogger logger) {
        if (id != null) {
            if (!TENANT_IDENTIFIER_CHAR_PATTERN.matcher(id).matches()) {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException(
                        "Invalid tenant id provided. You can locate your tenant id by following the instructions"
                            + " listed here: https://docs.microsoft.com/partner-center/find-ids-and-domain-names"));
            }
        }
    }

    public static void validateInteractiveBrowserRedirectUrlSetup(Integer port, String redirectUrl,
        ClientLogger logger) {
        if (port != null && redirectUrl != null) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Port and Redirect URL cannot be configured at the same time. "
                                                 + "Port is deprecated now. Use the redirectUrl setter to specify"
                                                 + " the redirect URL on the builder."));
        }
    }
}
