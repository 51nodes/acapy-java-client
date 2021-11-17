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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * IndyPresPredSpec
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyPresPredSpec {
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    /**
     * Predicate type (&#39;&lt;&#39;, &#39;&lt;&#x3D;&#39;, &#39;&gt;&#x3D;&#39;, or &#39;&gt;&#39;)
     */
    @JsonAdapter(PredicateEnum.Adapter.class)
    public enum PredicateEnum {
        LESS_THAN("<"),

        LESS_THAN_OR_EQUAL_TO("<="),

        GREATER_THAN_OR_EQUAL_TO(">="),

        GREATER_THAN(">");

        private String value;

        PredicateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PredicateEnum fromValue(String value) {
            for (PredicateEnum b : PredicateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PredicateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PredicateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PredicateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PredicateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_PREDICATE = "predicate";
    @SerializedName(SERIALIZED_NAME_PREDICATE)
    private PredicateEnum predicate;
    public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
    @SerializedName(SERIALIZED_NAME_THRESHOLD)
    private Integer threshold;
}
