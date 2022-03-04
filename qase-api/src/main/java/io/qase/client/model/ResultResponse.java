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

import java.util.Objects;

/**
 * ResultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class ResultResponse {
    public static final String SERIALIZED_NAME_STATUS = "status";
    public static final String SERIALIZED_NAME_RESULT = "result";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Boolean status;
    @SerializedName(SERIALIZED_NAME_RESULT)
    private Result result;


    public ResultResponse status(Boolean status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getStatus() {
        return status;
    }


    public void setStatus(Boolean status) {
        this.status = status;
    }


    public ResultResponse result(Result result) {

        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Result getResult() {
        return result;
    }


    public void setResult(Result result) {
        this.result = result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultResponse resultResponse = (ResultResponse) o;
        return Objects.equals(this.status, resultResponse.status) &&
                Objects.equals(this.result, resultResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

