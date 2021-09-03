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
import java.util.Map;

/**
 * VCRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class VCRecord {
    public static final String SERIALIZED_NAME_CONTEXTS = "contexts";
    @SerializedName(SERIALIZED_NAME_CONTEXTS)
    private List<String> contexts = null;
    public static final String SERIALIZED_NAME_CRED_TAGS = "cred_tags";
    @SerializedName(SERIALIZED_NAME_CRED_TAGS)
    private Map<String, String> credTags = null;
    public static final String SERIALIZED_NAME_CRED_VALUE = "cred_value";
    @SerializedName(SERIALIZED_NAME_CRED_VALUE)
    private Object credValue;
    public static final String SERIALIZED_NAME_EXPANDED_TYPES = "expanded_types";
    @SerializedName(SERIALIZED_NAME_EXPANDED_TYPES)
    private List<String> expandedTypes = null;
    public static final String SERIALIZED_NAME_GIVEN_ID = "given_id";
    @SerializedName(SERIALIZED_NAME_GIVEN_ID)
    private String givenId;
    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private String issuerId;
    public static final String SERIALIZED_NAME_PROOF_TYPES = "proof_types";
    @SerializedName(SERIALIZED_NAME_PROOF_TYPES)
    private List<String> proofTypes = null;
    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private String recordId;
    public static final String SERIALIZED_NAME_SCHEMA_IDS = "schema_ids";
    @SerializedName(SERIALIZED_NAME_SCHEMA_IDS)
    private List<String> schemaIds = null;
    public static final String SERIALIZED_NAME_SUBJECT_IDS = "subject_ids";
    @SerializedName(SERIALIZED_NAME_SUBJECT_IDS)
    private List<String> subjectIds = null;
}
