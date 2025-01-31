// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class for NoEncryption scheme. */
@Fluent
public final class NoEncryption {
    /*
     * Representing supported protocols
     */
    @JsonProperty(value = "enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * Get the enabledProtocols property: Representing supported protocols.
     *
     * @return the enabledProtocols value.
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set the enabledProtocols property: Representing supported protocols.
     *
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the NoEncryption object itself.
     */
    public NoEncryption withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (enabledProtocols() != null) {
            enabledProtocols().validate();
        }
    }
}
