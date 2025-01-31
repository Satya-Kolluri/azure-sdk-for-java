// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupCreateParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Create Group operation. */
@Fluent
public final class GroupCreateParameters {
    /*
     * Properties supplied to Create Group operation.
     */
    @JsonProperty(value = "properties")
    private GroupCreateParametersProperties innerProperties;

    /**
     * Get the innerProperties property: Properties supplied to Create Group operation.
     *
     * @return the innerProperties value.
     */
    private GroupCreateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Group name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Group name.
     *
     * @param displayName the displayName value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupCreateParametersProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: Group description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Group description.
     *
     * @param description the description value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupCreateParametersProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the type property: Group type.
     *
     * @return the type value.
     */
    public GroupType type() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Group type.
     *
     * @param type the type value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withType(GroupType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupCreateParametersProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the externalId property: Identifier of the external groups, this property contains the id of the group from
     * the external identity provider, e.g. for Azure Active Directory
     * `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @return the externalId value.
     */
    public String externalId() {
        return this.innerProperties() == null ? null : this.innerProperties().externalId();
    }

    /**
     * Set the externalId property: Identifier of the external groups, this property contains the id of the group from
     * the external identity provider, e.g. for Azure Active Directory
     * `aad://&lt;tenant&gt;.onmicrosoft.com/groups/&lt;group object id&gt;`; otherwise the value is null.
     *
     * @param externalId the externalId value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withExternalId(String externalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupCreateParametersProperties();
        }
        this.innerProperties().withExternalId(externalId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
