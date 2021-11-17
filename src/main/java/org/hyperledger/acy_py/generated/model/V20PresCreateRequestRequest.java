/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * V20PresCreateRequestRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20PresCreateRequestRequest {
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_PRESENTATION_REQUEST = "presentation_request";
    @SerializedName(SERIALIZED_NAME_PRESENTATION_REQUEST)
    private V20PresRequestByFormat presentationRequest;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
}
