/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.1
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
 * IndyProofProofAggregatedProof
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyProofProofAggregatedProof {
    public static final String SERIALIZED_NAME_C_HASH = "c_hash";
    @SerializedName(SERIALIZED_NAME_C_HASH)
    private String cHash;
    public static final String SERIALIZED_NAME_C_LIST = "c_list";
    @SerializedName(SERIALIZED_NAME_C_LIST)
    private List<List<Integer>> cList = null;
}
