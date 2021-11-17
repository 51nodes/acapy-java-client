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

import java.util.UUID;

/**
 * V10PresentationProposalRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V10PresentationProposalRequest {
    public static final String SERIALIZED_NAME_AUTO_PRESENT = "auto_present";
    @SerializedName(SERIALIZED_NAME_AUTO_PRESENT)
    private Boolean autoPresent;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private UUID connectionId;
    public static final String SERIALIZED_NAME_PRESENTATION_PROPOSAL = "presentation_proposal";
    @SerializedName(SERIALIZED_NAME_PRESENTATION_PROPOSAL)
    private IndyPresPreview presentationProposal;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
}
