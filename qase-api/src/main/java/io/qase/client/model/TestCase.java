/*
 * Qase.io API
 * # Introduction  You can use our API to access [Qase.io](https://qase.io) API endpoints, which allows to retrieve information about entities stored in database and perform actions with them. The API is organized around [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer).  # API Rate limits  Your application can make up to 200 API requests per minute.  Once the limit is exceeded, clients receive an HTTP 429 with a Retry-After: X header to indicate how long their timeout period is before they will be able to send requests again. The timeout period is set to 60 seconds once the limit is exceeded.  # Authentication  To authorize, use this code:  ```shell # With shell, you can just pass the correct header with each request curl \"https://api.qase.io/v1/api_endpoint\"   -H \"Token: api_token\"   -H \"Content-Type: application/json\" ```  Make sure to replace `api_token` with your API key.  Qase.io uses API tokens to authenticate requests. You can view an manage your API keys in [API tokens pages](https://app.qase.io/user/api/token).  Your API keys has the same access rights as your role in the app, so be sure to keep them secure! Do not share your secret API keys in publicly accessible areas such as GitHub, client-side code, and so forth.  Qase API expects for the API key to be included in all API requests to the server in a header that looks like the following:  `Token: api_token`  You must replace `api_token` with your personal API key.  All API requests must be made over [HTTPS](http://en.wikipedia.org/wiki/HTTP_Secure). Calls made over plain HTTP will fail. API requests without authentication will also fail.  # Access rights  Qase.io is using Role-based Access Control system to restrict some features usage in Web interface and the same rules are applied to API methods. In description for each method you will find a rule name, that is required to perform an action through API. If you don't have enough access rights, you will receive an error with `403` status code.  # Errors  Qase API uses the following error codes:  Code | Meaning ---------- | ------- 400 | Bad Request - Your request is invalid. 401 | Unauthorized - Your API key is wrong. 403 | Forbidden - Your role doesn't have enough permissions to perform this action 404 | Not Found - The resource could not be found. 405 | Method Not Allowed - You tried to access a resource with an invalid method. 406 | Not Acceptable - You requested a format that isn't json. 410 | Gone - The resource requested has been removed from our servers. 429 | Too Many Requests - You're performing too many requests! Slow down! 500 | Internal Server Error - We had a problem with our server. Try again later. 503 | Service Unavailable - We're temporarily offline for maintenance. Please try again later. 
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
import org.openapitools.jackson.nullable.JsonNullable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TestCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T23:17:33.666847+03:00[Europe/Moscow]")
public class TestCase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";
  @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
  private String preconditions;

  public static final String SERIALIZED_NAME_POSTCONDITIONS = "postconditions";
  @SerializedName(SERIALIZED_NAME_POSTCONDITIONS)
  private String postconditions;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_LAYER = "layer";
  @SerializedName(SERIALIZED_NAME_LAYER)
  private Integer layer;

  public static final String SERIALIZED_NAME_IS_FLAKY = "is_flaky";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY)
  private Integer isFlaky;

  public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR)
  private Integer behavior;

  public static final String SERIALIZED_NAME_AUTOMATION = "automation";
  @SerializedName(SERIALIZED_NAME_AUTOMATION)
  private Integer automation;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_MILESTONE_ID = "milestone_id";
  @SerializedName(SERIALIZED_NAME_MILESTONE_ID)
  private Long milestoneId;

  public static final String SERIALIZED_NAME_SUITE_ID = "suite_id";
  @SerializedName(SERIALIZED_NAME_SUITE_ID)
  private Long suiteId;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFieldValue> customFields = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<TestStep> steps = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Object params;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private LocalDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private LocalDateTime updated;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagValue> tags = null;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private LocalDateTime deleted;

  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private Long memberId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;


  public TestCase id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public TestCase position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public TestCase title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TestCase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestCase preconditions(String preconditions) {
    
    this.preconditions = preconditions;
    return this;
  }

   /**
   * Get preconditions
   * @return preconditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreconditions() {
    return preconditions;
  }


  public void setPreconditions(String preconditions) {
    this.preconditions = preconditions;
  }


  public TestCase postconditions(String postconditions) {
    
    this.postconditions = postconditions;
    return this;
  }

   /**
   * Get postconditions
   * @return postconditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostconditions() {
    return postconditions;
  }


  public void setPostconditions(String postconditions) {
    this.postconditions = postconditions;
  }


  public TestCase severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public TestCase priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public TestCase type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public TestCase layer(Integer layer) {
    
    this.layer = layer;
    return this;
  }

   /**
   * Get layer
   * @return layer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLayer() {
    return layer;
  }


  public void setLayer(Integer layer) {
    this.layer = layer;
  }


  public TestCase isFlaky(Integer isFlaky) {
    
    this.isFlaky = isFlaky;
    return this;
  }

   /**
   * Get isFlaky
   * @return isFlaky
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIsFlaky() {
    return isFlaky;
  }


  public void setIsFlaky(Integer isFlaky) {
    this.isFlaky = isFlaky;
  }


  public TestCase behavior(Integer behavior) {
    
    this.behavior = behavior;
    return this;
  }

   /**
   * Get behavior
   * @return behavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBehavior() {
    return behavior;
  }


  public void setBehavior(Integer behavior) {
    this.behavior = behavior;
  }


  public TestCase automation(Integer automation) {
    
    this.automation = automation;
    return this;
  }

   /**
   * Get automation
   * @return automation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutomation() {
    return automation;
  }


  public void setAutomation(Integer automation) {
    this.automation = automation;
  }


  public TestCase status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public TestCase milestoneId(Long milestoneId) {
    
    this.milestoneId = milestoneId;
    return this;
  }

   /**
   * Get milestoneId
   * @return milestoneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMilestoneId() {
    return milestoneId;
  }


  public void setMilestoneId(Long milestoneId) {
    this.milestoneId = milestoneId;
  }


  public TestCase suiteId(Long suiteId) {
    
    this.suiteId = suiteId;
    return this;
  }

   /**
   * Get suiteId
   * @return suiteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSuiteId() {
    return suiteId;
  }


  public void setSuiteId(Long suiteId) {
    this.suiteId = suiteId;
  }


  public TestCase customFields(List<CustomFieldValue> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public TestCase addCustomFieldsItem(CustomFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFieldValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<CustomFieldValue> customFields) {
    this.customFields = customFields;
  }


  public TestCase attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestCase addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  public TestCase steps(List<TestStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public TestCase addStepsItem(TestStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TestStep> getSteps() {
    return steps;
  }


  public void setSteps(List<TestStep> steps) {
    this.steps = steps;
  }


  public TestCase params(Object params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getParams() {
    return params;
  }


  public void setParams(Object params) {
    this.params = params;
  }


  public TestCase created(LocalDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDateTime getCreated() {
    return created;
  }


  public void setCreated(LocalDateTime created) {
    this.created = created;
  }


  public TestCase updated(LocalDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }


  public TestCase tags(List<TagValue> tags) {
    
    this.tags = tags;
    return this;
  }

  public TestCase addTagsItem(TagValue tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TagValue> getTags() {
    return tags;
  }


  public void setTags(List<TagValue> tags) {
    this.tags = tags;
  }


  public TestCase deleted(LocalDateTime deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDateTime getDeleted() {
    return deleted;
  }


  public void setDeleted(LocalDateTime deleted) {
    this.deleted = deleted;
  }


  public TestCase memberId(Long memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemberId() {
    return memberId;
  }


  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  public TestCase projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCase testCase = (TestCase) o;
    return Objects.equals(this.id, testCase.id) &&
        Objects.equals(this.position, testCase.position) &&
        Objects.equals(this.title, testCase.title) &&
        Objects.equals(this.description, testCase.description) &&
        Objects.equals(this.preconditions, testCase.preconditions) &&
        Objects.equals(this.postconditions, testCase.postconditions) &&
        Objects.equals(this.severity, testCase.severity) &&
        Objects.equals(this.priority, testCase.priority) &&
        Objects.equals(this.type, testCase.type) &&
        Objects.equals(this.layer, testCase.layer) &&
        Objects.equals(this.isFlaky, testCase.isFlaky) &&
        Objects.equals(this.behavior, testCase.behavior) &&
        Objects.equals(this.automation, testCase.automation) &&
        Objects.equals(this.status, testCase.status) &&
        Objects.equals(this.milestoneId, testCase.milestoneId) &&
        Objects.equals(this.suiteId, testCase.suiteId) &&
        Objects.equals(this.customFields, testCase.customFields) &&
        Objects.equals(this.attachments, testCase.attachments) &&
        Objects.equals(this.steps, testCase.steps) &&
        Objects.equals(this.params, testCase.params) &&
        Objects.equals(this.created, testCase.created) &&
        Objects.equals(this.updated, testCase.updated) &&
        Objects.equals(this.tags, testCase.tags) &&
        Objects.equals(this.deleted, testCase.deleted) &&
        Objects.equals(this.memberId, testCase.memberId) &&
        Objects.equals(this.projectId, testCase.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, position, title, description, preconditions, postconditions, severity, priority, type, layer, isFlaky, behavior, automation, status, milestoneId, suiteId, customFields, attachments, steps, params, created, updated, tags, deleted, memberId, projectId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    isFlaky: ").append(toIndentedString(isFlaky)).append("\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    automation: ").append(toIndentedString(automation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
    sb.append("    suiteId: ").append(toIndentedString(suiteId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
