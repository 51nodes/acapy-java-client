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
 * V10DiscoveryRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V10DiscoveryRecord {
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private String connectionId;
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_DISCLOSE = "disclose";
    @SerializedName(SERIALIZED_NAME_DISCLOSE)
    private Disclose disclose;
    public static final String SERIALIZED_NAME_DISCOVERY_EXCHANGE_ID = "discovery_exchange_id";
    @SerializedName(SERIALIZED_NAME_DISCOVERY_EXCHANGE_ID)
    private String discoveryExchangeId;
    public static final String SERIALIZED_NAME_QUERY_MSG = "query_msg";
    @SerializedName(SERIALIZED_NAME_QUERY_MSG)
    private Query queryMsg;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
    @SerializedName(SERIALIZED_NAME_THREAD_ID)
    private String threadId;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
