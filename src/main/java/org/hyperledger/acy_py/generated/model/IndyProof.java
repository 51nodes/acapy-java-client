/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * IndyProof
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyProof {
    public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
    @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
    private List<IndyProofIdentifier> identifiers = null;
    public static final String SERIALIZED_NAME_PROOF = "proof";
    @SerializedName(SERIALIZED_NAME_PROOF)
    private IndyProofProof proof;
    public static final String SERIALIZED_NAME_REQUESTED_PROOF = "requested_proof";
    @SerializedName(SERIALIZED_NAME_REQUESTED_PROOF)
    private IndyProofRequestedProof requestedProof;
}
