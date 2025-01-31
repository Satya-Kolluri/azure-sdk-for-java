// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Support contact information and instructions. */
@Fluent
public final class SupportInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SupportInfo.class);

    /*
     * Support web address.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Support contact email address.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * Support contact phone number.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /*
     * Support instructions.
     */
    @JsonProperty(value = "instructions")
    private String instructions;

    /**
     * Get the url property: Support web address.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Support web address.
     *
     * @param url the url value to set.
     * @return the SupportInfo object itself.
     */
    public SupportInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the email property: Support contact email address.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Support contact email address.
     *
     * @param email the email value to set.
     * @return the SupportInfo object itself.
     */
    public SupportInfo withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the phone property: Support contact phone number.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: Support contact phone number.
     *
     * @param phone the phone value to set.
     * @return the SupportInfo object itself.
     */
    public SupportInfo withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the instructions property: Support instructions.
     *
     * @return the instructions value.
     */
    public String instructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: Support instructions.
     *
     * @param instructions the instructions value to set.
     * @return the SupportInfo object itself.
     */
    public SupportInfo withInstructions(String instructions) {
        this.instructions = instructions;
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
