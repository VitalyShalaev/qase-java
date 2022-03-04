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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PlanDetailedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class PlanDetailedAllOf {
    public static final String SERIALIZED_NAME_AVERAGE_TIME = "average_time";
    public static final String SERIALIZED_NAME_CASES = "cases";
    @SerializedName(SERIALIZED_NAME_AVERAGE_TIME)
    private BigDecimal averageTime;
    @SerializedName(SERIALIZED_NAME_CASES)
    private List<PlanDetailedAllOfCases> cases = null;


    public PlanDetailedAllOf averageTime(BigDecimal averageTime) {

        this.averageTime = averageTime;
        return this;
    }

    /**
     * Get averageTime
     *
     * @return averageTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public BigDecimal getAverageTime() {
        return averageTime;
    }


    public void setAverageTime(BigDecimal averageTime) {
        this.averageTime = averageTime;
    }


    public PlanDetailedAllOf cases(List<PlanDetailedAllOfCases> cases) {

        this.cases = cases;
        return this;
    }

    public PlanDetailedAllOf addCasesItem(PlanDetailedAllOfCases casesItem) {
        if (this.cases == null) {
            this.cases = new ArrayList<>();
        }
        this.cases.add(casesItem);
        return this;
    }

    /**
     * Get cases
     *
     * @return cases
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<PlanDetailedAllOfCases> getCases() {
        return cases;
    }


    public void setCases(List<PlanDetailedAllOfCases> cases) {
        this.cases = cases;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanDetailedAllOf planDetailedAllOf = (PlanDetailedAllOf) o;
        return Objects.equals(this.averageTime, planDetailedAllOf.averageTime) &&
                Objects.equals(this.cases, planDetailedAllOf.cases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageTime, cases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanDetailedAllOf {\n");
        sb.append("    averageTime: ").append(toIndentedString(averageTime)).append("\n");
        sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
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

