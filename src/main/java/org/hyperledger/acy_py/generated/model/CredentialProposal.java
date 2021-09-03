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

/**
 * CredentialProposal
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class CredentialProposal {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_CREDENTIAL_PROPOSAL = "credential_proposal";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_PROPOSAL)
    private CredentialPreview credentialProposal;
    public static final String SERIALIZED_NAME_ISSUER_DID = "issuer_did";
    @SerializedName(SERIALIZED_NAME_ISSUER_DID)
    private String issuerDid;
    public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
    @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
    private String schemaId;
    public static final String SERIALIZED_NAME_SCHEMA_ISSUER_DID = "schema_issuer_did";
    @SerializedName(SERIALIZED_NAME_SCHEMA_ISSUER_DID)
    private String schemaIssuerDid;
    public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
    @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
    private String schemaName;
    public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
    @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
    private String schemaVersion;
}
