/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * VerifyResponse
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class VerifyResponse {
    public static final String SERIALIZED_NAME_ERROR = "error";
    @SerializedName(SERIALIZED_NAME_ERROR)
    private String error;
    public static final String SERIALIZED_NAME_VALID = "valid";
    @SerializedName(SERIALIZED_NAME_VALID)
    private Boolean valid;
}
