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
 * SharedStepCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class SharedStepCreate {
    public static final String SERIALIZED_NAME_TITLE = "title";
    public static final String SERIALIZED_NAME_ACTION = "action";
    public static final String SERIALIZED_NAME_EXPECTED_RESULT = "expected_result";
    public static final String SERIALIZED_NAME_DATA = "data";
    public static final String SERIALIZED_NAME_STEPS = "steps";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;
    @SerializedName(SERIALIZED_NAME_EXPECTED_RESULT)
    private String expectedResult;
    @SerializedName(SERIALIZED_NAME_DATA)
    private String data;
    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<SharedStepCreateSteps> steps = null;


    public SharedStepCreate title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public SharedStepCreate action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Deprecated, use the &#x60;steps&#x60; property instead.
     *
     * @return action
     * @deprecated
     **/
    @Deprecated
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated, use the `steps` property instead.")

    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
    }


    public SharedStepCreate expectedResult(String expectedResult) {

        this.expectedResult = expectedResult;
        return this;
    }

    /**
     * Deprecated, use the &#x60;steps&#x60; property instead.
     *
     * @return expectedResult
     * @deprecated
     **/
    @Deprecated
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated, use the `steps` property instead.")

    public String getExpectedResult() {
        return expectedResult;
    }


    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }


    public SharedStepCreate data(String data) {

        this.data = data;
        return this;
    }

    /**
     * Deprecated, use the &#x60;steps&#x60; property instead.
     *
     * @return data
     * @deprecated
     **/
    @Deprecated
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Deprecated, use the `steps` property instead.")

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    public SharedStepCreate steps(List<SharedStepCreateSteps> steps) {

        this.steps = steps;
        return this;
    }

    public SharedStepCreate addStepsItem(SharedStepCreateSteps stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     *
     * @return steps
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<SharedStepCreateSteps> getSteps() {
        return steps;
    }


    public void setSteps(List<SharedStepCreateSteps> steps) {
        this.steps = steps;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharedStepCreate sharedStepCreate = (SharedStepCreate) o;
        return Objects.equals(this.title, sharedStepCreate.title) &&
                Objects.equals(this.action, sharedStepCreate.action) &&
                Objects.equals(this.expectedResult, sharedStepCreate.expectedResult) &&
                Objects.equals(this.data, sharedStepCreate.data) &&
                Objects.equals(this.steps, sharedStepCreate.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, action, expectedResult, data, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharedStepCreate {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

