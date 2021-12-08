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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * CustomFieldCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T23:17:33.666847+03:00[Europe/Moscow]")
public class CustomFieldCreate {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<CustomFieldCreateValue> value = null;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Integer entity;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_IS_FILTERABLE = "is_filterable";
  @SerializedName(SERIALIZED_NAME_IS_FILTERABLE)
  private Boolean isFilterable;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "is_visible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_PROJECTS_CODES = "projects_codes";
  @SerializedName(SERIALIZED_NAME_PROJECTS_CODES)
  private List<String> projectsCodes = new ArrayList<>();


  public CustomFieldCreate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
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


  public CustomFieldCreate value(List<CustomFieldCreateValue> value) {
    
    this.value = value;
    return this;
  }

  public CustomFieldCreate addValueItem(CustomFieldCreateValue valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFieldCreateValue> getValue() {
    return value;
  }


  public void setValue(List<CustomFieldCreateValue> value) {
    this.value = value;
  }


  public CustomFieldCreate entity(Integer entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Possible values: 0 - case; 1 - run; 2 - defect; 
   * minimum: 0
   * maximum: 2
   * @return entity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Possible values: 0 - case; 1 - run; 2 - defect; ")

  public Integer getEntity() {
    return entity;
  }


  public void setEntity(Integer entity) {
    this.entity = entity;
  }


  public CustomFieldCreate type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Possible values: 0 - number; 1 - string; 2 - text; 3 - selectbox; 4 - checkbox; 5 - radio; 6 - multiselect; 7 - url; 8 - user; 9 - datetime; 
   * minimum: 0
   * maximum: 9
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Possible values: 0 - number; 1 - string; 2 - text; 3 - selectbox; 4 - checkbox; 5 - radio; 6 - multiselect; 7 - url; 8 - user; 9 - datetime; ")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public CustomFieldCreate placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public CustomFieldCreate defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public CustomFieldCreate isFilterable(Boolean isFilterable) {
    
    this.isFilterable = isFilterable;
    return this;
  }

   /**
   * Get isFilterable
   * @return isFilterable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsFilterable() {
    return isFilterable;
  }


  public void setIsFilterable(Boolean isFilterable) {
    this.isFilterable = isFilterable;
  }


  public CustomFieldCreate isVisible(Boolean isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  public CustomFieldCreate isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public CustomFieldCreate projectsCodes(List<String> projectsCodes) {
    
    this.projectsCodes = projectsCodes;
    return this;
  }

  public CustomFieldCreate addProjectsCodesItem(String projectsCodesItem) {
    this.projectsCodes.add(projectsCodesItem);
    return this;
  }

   /**
   * Get projectsCodes
   * @return projectsCodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getProjectsCodes() {
    return projectsCodes;
  }


  public void setProjectsCodes(List<String> projectsCodes) {
    this.projectsCodes = projectsCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCreate customFieldCreate = (CustomFieldCreate) o;
    return Objects.equals(this.title, customFieldCreate.title) &&
        Objects.equals(this.value, customFieldCreate.value) &&
        Objects.equals(this.entity, customFieldCreate.entity) &&
        Objects.equals(this.type, customFieldCreate.type) &&
        Objects.equals(this.placeholder, customFieldCreate.placeholder) &&
        Objects.equals(this.defaultValue, customFieldCreate.defaultValue) &&
        Objects.equals(this.isFilterable, customFieldCreate.isFilterable) &&
        Objects.equals(this.isVisible, customFieldCreate.isVisible) &&
        Objects.equals(this.isRequired, customFieldCreate.isRequired) &&
        Objects.equals(this.projectsCodes, customFieldCreate.projectsCodes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, entity, type, placeholder, defaultValue, isFilterable, isVisible, isRequired, projectsCodes);
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
    sb.append("class CustomFieldCreate {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    isFilterable: ").append(toIndentedString(isFilterable)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    projectsCodes: ").append(toIndentedString(projectsCodes)).append("\n");
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
