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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.*;

/**
 * ResultCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class ResultCreate {
    public static final String SERIALIZED_NAME_CASE_ID = "case_id";
    public static final String SERIALIZED_NAME_CASE = "case";
    public static final String SERIALIZED_NAME_STATUS = "status";
    public static final String SERIALIZED_NAME_TIME = "time";
    public static final String SERIALIZED_NAME_TIME_MS = "time_ms";
    public static final String SERIALIZED_NAME_DEFECT = "defect";
    public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
    public static final String SERIALIZED_NAME_STACKTRACE = "stacktrace";
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    public static final String SERIALIZED_NAME_PARAM = "param";
    public static final String SERIALIZED_NAME_STEPS = "steps";
    @SerializedName(SERIALIZED_NAME_CASE_ID)
    private Long caseId;
    @SerializedName(SERIALIZED_NAME_CASE)
    private ResultCreateCase _case;
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;
    @SerializedName(SERIALIZED_NAME_TIME)
    private Long time;
    @SerializedName(SERIALIZED_NAME_TIME_MS)
    private Long timeMs;
    @SerializedName(SERIALIZED_NAME_DEFECT)
    private Boolean defect;
    @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
    private List<String> attachments = null;
    @SerializedName(SERIALIZED_NAME_STACKTRACE)
    private String stacktrace;
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    @SerializedName(SERIALIZED_NAME_PARAM)
    private Map<String, String> param = null;
    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<ResultCreateSteps> steps = null;

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    public ResultCreate caseId(Long caseId) {

        this.caseId = caseId;
        return this;
    }

    /**
     * Get caseId
     *
     * @return caseId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public ResultCreate _case(ResultCreateCase _case) {

        this._case = _case;
        return this;
    }

    /**
     * Get _case
     *
     * @return _case
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public ResultCreateCase getCase() {
        return _case;
    }

    public void setCase(ResultCreateCase _case) {
        this._case = _case;
    }

    public ResultCreate status(StatusEnum status) {

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

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ResultCreate time(Long time) {

        this.time = time;
        return this;
    }

    /**
     * Get time
     * minimum: 0
     * maximum: 31536000
     *
     * @return time
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ResultCreate timeMs(Long timeMs) {

        this.timeMs = timeMs;
        return this;
    }

    /**
     * Get timeMs
     * minimum: 0
     * maximum: 31536000000
     *
     * @return timeMs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getTimeMs() {
        return timeMs;
    }

    public void setTimeMs(Long timeMs) {
        this.timeMs = timeMs;
    }

    public ResultCreate defect(Boolean defect) {

        this.defect = defect;
        return this;
    }

    /**
     * Get defect
     *
     * @return defect
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getDefect() {
        return defect;
    }

    public void setDefect(Boolean defect) {
        this.defect = defect;
    }

    public ResultCreate attachments(List<String> attachments) {

        this.attachments = attachments;
        return this;
    }

    public ResultCreate addAttachmentsItem(String attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Get attachments
     *
     * @return attachments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public ResultCreate stacktrace(String stacktrace) {

        this.stacktrace = stacktrace;
        return this;
    }

    /**
     * Get stacktrace
     *
     * @return stacktrace
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    public ResultCreate comment(String comment) {

        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ResultCreate param(Map<String, String> param) {

        this.param = param;
        return this;
    }

    public ResultCreate putParamItem(String key, String paramItem) {
        if (this.param == null) {
            this.param = new HashMap<>();
        }
        this.param.put(key, paramItem);
        return this;
    }

    /**
     * A map of parameters (name &#x3D;&gt; value)
     *
     * @return param
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A map of parameters (name => value)")

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public ResultCreate steps(List<ResultCreateSteps> steps) {

        this.steps = steps;
        return this;
    }

    public ResultCreate addStepsItem(ResultCreateSteps stepsItem) {
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

    public List<ResultCreateSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<ResultCreateSteps> steps) {
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
        ResultCreate resultCreate = (ResultCreate) o;
        return Objects.equals(this.caseId, resultCreate.caseId) &&
                Objects.equals(this._case, resultCreate._case) &&
                Objects.equals(this.status, resultCreate.status) &&
                Objects.equals(this.time, resultCreate.time) &&
                Objects.equals(this.timeMs, resultCreate.timeMs) &&
                Objects.equals(this.defect, resultCreate.defect) &&
                Objects.equals(this.attachments, resultCreate.attachments) &&
                Objects.equals(this.stacktrace, resultCreate.stacktrace) &&
                Objects.equals(this.comment, resultCreate.comment) &&
                Objects.equals(this.param, resultCreate.param) &&
                Objects.equals(this.steps, resultCreate.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, _case, status, time, timeMs, defect, attachments, stacktrace, comment, param, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultCreate {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
        sb.append("    defect: ").append(toIndentedString(defect)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    stacktrace: ").append(toIndentedString(stacktrace)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        IN_PROGRESS("in_progress"),

        PASSED("passed"),

        FAILED("failed"),

        BLOCKED("blocked"),

        SKIPPED("skipped"),

        INVALID("invalid");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

}

