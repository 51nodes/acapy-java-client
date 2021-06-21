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

/**
 * KeylistQuery
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class KeylistQuery {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_FILTER = "filter";
    @SerializedName(SERIALIZED_NAME_FILTER)
    private Object filter;
    public static final String SERIALIZED_NAME_PAGINATE = "paginate";
    @SerializedName(SERIALIZED_NAME_PAGINATE)
    private KeylistQueryPaginate paginate;
}
