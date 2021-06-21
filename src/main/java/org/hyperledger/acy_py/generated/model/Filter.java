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
 * Filter
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Filter {
    public static final String SERIALIZED_NAME_CONST = "const";
    @SerializedName(SERIALIZED_NAME_CONST)
    private Object _const;
    public static final String SERIALIZED_NAME_ENUM = "enum";
    @SerializedName(SERIALIZED_NAME_ENUM)
    private List<Object> _enum = null;
    public static final String SERIALIZED_NAME_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
    @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MAXIMUM)
    private Object exclusiveMaximum;
    public static final String SERIALIZED_NAME_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
    @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MINIMUM)
    private Object exclusiveMinimum;
    public static final String SERIALIZED_NAME_FORMAT = "format";
    @SerializedName(SERIALIZED_NAME_FORMAT)
    private String format;
    public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
    @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
    private Integer maxLength;
    public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
    @SerializedName(SERIALIZED_NAME_MAXIMUM)
    private Object maximum;
    public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
    @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
    private Integer minLength;
    public static final String SERIALIZED_NAME_MINIMUM = "minimum";
    @SerializedName(SERIALIZED_NAME_MINIMUM)
    private Object minimum;
    public static final String SERIALIZED_NAME_NOT = "not";
    @SerializedName(SERIALIZED_NAME_NOT)
    private Boolean not;
    public static final String SERIALIZED_NAME_PATTERN = "pattern";
    @SerializedName(SERIALIZED_NAME_PATTERN)
    private String pattern;
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
}
