/*
 * Qase.io API
 * Qase API Specification.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@qase.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.qase.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SuiteListResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class SuiteListResponseAllOfResult {
    public static final String SERIALIZED_NAME_TOTAL = "total";
    public static final String SERIALIZED_NAME_FILTERED = "filtered";
    public static final String SERIALIZED_NAME_COUNT = "count";
    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;
    @SerializedName(SERIALIZED_NAME_FILTERED)
    private Integer filtered;
    @SerializedName(SERIALIZED_NAME_COUNT)
    private Integer count;
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private List<Suite> entities = null;


    public SuiteListResponseAllOfResult total(Integer total) {

        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTotal() {
        return total;
    }


    public void setTotal(Integer total) {
        this.total = total;
    }


    public SuiteListResponseAllOfResult filtered(Integer filtered) {

        this.filtered = filtered;
        return this;
    }

    /**
     * Get filtered
     *
     * @return filtered
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getFiltered() {
        return filtered;
    }


    public void setFiltered(Integer filtered) {
        this.filtered = filtered;
    }


    public SuiteListResponseAllOfResult count(Integer count) {

        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getCount() {
        return count;
    }


    public void setCount(Integer count) {
        this.count = count;
    }


    public SuiteListResponseAllOfResult entities(List<Suite> entities) {

        this.entities = entities;
        return this;
    }

    public SuiteListResponseAllOfResult addEntitiesItem(Suite entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    /**
     * Get entities
     *
     * @return entities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Suite> getEntities() {
        return entities;
    }


    public void setEntities(List<Suite> entities) {
        this.entities = entities;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SuiteListResponseAllOfResult suiteListResponseAllOfResult = (SuiteListResponseAllOfResult) o;
        return Objects.equals(this.total, suiteListResponseAllOfResult.total) &&
                Objects.equals(this.filtered, suiteListResponseAllOfResult.filtered) &&
                Objects.equals(this.count, suiteListResponseAllOfResult.count) &&
                Objects.equals(this.entities, suiteListResponseAllOfResult.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, filtered, count, entities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuiteListResponseAllOfResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

