// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Site properties. */
@Fluent
public final class SitePropertiesFormat {
    /*
     * The provisioning state of the site resource. **TODO**: Confirm if this
     * is needed
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * An array of ids of the network functions deployed on the site,
     * maintained by the user.
     */
    @JsonProperty(value = "networkFunctions")
    private List<SubResource> networkFunctions;

    /**
     * Get the provisioningState property: The provisioning state of the site resource. **TODO**: Confirm if this is
     * needed.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkFunctions property: An array of ids of the network functions deployed on the site, maintained by
     * the user.
     *
     * @return the networkFunctions value.
     */
    public List<SubResource> networkFunctions() {
        return this.networkFunctions;
    }

    /**
     * Set the networkFunctions property: An array of ids of the network functions deployed on the site, maintained by
     * the user.
     *
     * @param networkFunctions the networkFunctions value to set.
     * @return the SitePropertiesFormat object itself.
     */
    public SitePropertiesFormat withNetworkFunctions(List<SubResource> networkFunctions) {
        this.networkFunctions = networkFunctions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
