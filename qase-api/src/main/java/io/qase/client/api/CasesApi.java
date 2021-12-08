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


package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.api.inner.FilterHelper;
import io.qase.client.*;
import io.qase.client.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasesApi {
    private ApiClient localVarApiClient;

    public CasesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CasesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createCase
     * @param code Code of project, where to search entities. (required)
     * @param testCaseCreate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCaseCall(String code, TestCaseCreate testCaseCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = testCaseCreate;

        // create path and map variables
        String localVarPath = "/case/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCaseValidateBeforeCall(String code, TestCaseCreate testCaseCreate, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling createCase(Async)");
        }
        
        // verify the required parameter 'testCaseCreate' is set
        if (testCaseCreate == null) {
            throw new QaseException("Missing the required parameter 'testCaseCreate' when calling createCase(Async)");
        }
        

        okhttp3.Call localVarCall = createCaseCall(code, testCaseCreate, _callback);
        return localVarCall;

    }

    /**
     * Create a new test case.
     * This method allows to create a new test case in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param testCaseCreate  (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse createCase(String code, TestCaseCreate testCaseCreate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createCaseWithHttpInfo(code, testCaseCreate);
        return localVarResp.getData();
    }

    /**
     * Create a new test case.
     * This method allows to create a new test case in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param testCaseCreate  (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> createCaseWithHttpInfo(String code, TestCaseCreate testCaseCreate) throws QaseException {
        okhttp3.Call localVarCall = createCaseValidateBeforeCall(code, testCaseCreate, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new test case. (asynchronously)
     * This method allows to create a new test case in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param testCaseCreate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCaseAsync(String code, TestCaseCreate testCaseCreate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createCaseValidateBeforeCall(code, testCaseCreate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCase
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCaseCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/case/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCaseValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deleteCase(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deleteCase(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCaseCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Delete test case.
     * This method completely deletes a test case from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse deleteCase(String code, Integer id) throws QaseException {
        ApiResponse<IdResponse> localVarResp = deleteCaseWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Delete test case.
     * This method completely deletes a test case from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> deleteCaseWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = deleteCaseValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete test case. (asynchronously)
     * This method completely deletes a test case from repository. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCaseAsync(String code, Integer id, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteCaseValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCase
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCaseCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/case/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCaseValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getCase(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getCase(Async)");
        }
        

        okhttp3.Call localVarCall = getCaseCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Get a specific test case.
     * This method allows to retrieve a specific test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return TestCaseResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public TestCaseResponse getCase(String code, Integer id) throws QaseException {
        ApiResponse<TestCaseResponse> localVarResp = getCaseWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Get a specific test case.
     * This method allows to retrieve a specific test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @return ApiResponse&lt;TestCaseResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TestCaseResponse> getCaseWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = getCaseValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<TestCaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific test case. (asynchronously)
     * This method allows to retrieve a specific test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCaseAsync(String code, Integer id, final ApiCallback<TestCaseResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getCaseValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<TestCaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCases
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCasesCall(String code, Integer limit, Integer offset, Filters filters, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/case/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (filters != null) {
            localVarQueryParams.addAll(FilterHelper.getFilterPairs(filters));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCasesValidateBeforeCall(String code, Integer limit, Integer offset, Filters filters, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getCases(Async)");
        }
        

        okhttp3.Call localVarCall = getCasesCall(code, limit, offset, filters, _callback);
        return localVarCall;

    }

    /**
     * Get all test cases.
     * This method allows to retrieve all test cases stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @return TestCaseListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public TestCaseListResponse getCases(String code, Integer limit, Integer offset, Filters filters) throws QaseException {
        ApiResponse<TestCaseListResponse> localVarResp = getCasesWithHttpInfo(code, limit, offset, filters);
        return localVarResp.getData();
    }

    /**
     * Get all test cases.
     * This method allows to retrieve all test cases stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @return ApiResponse&lt;TestCaseListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TestCaseListResponse> getCasesWithHttpInfo(String code, Integer limit, Integer offset, Filters filters) throws QaseException {
        okhttp3.Call localVarCall = getCasesValidateBeforeCall(code, limit, offset, filters, null);
        Type localVarReturnType = new TypeToken<TestCaseListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all test cases. (asynchronously)
     * This method allows to retrieve all test cases stored in selected project. 
     * @param code Code of project, where to search entities. (required)
     * @param limit A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @param filters  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of all projects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCasesAsync(String code, Integer limit, Integer offset, Filters filters, final ApiCallback<TestCaseListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getCasesValidateBeforeCall(code, limit, offset, filters, _callback);
        Type localVarReturnType = new TypeToken<TestCaseListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCase
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param testCaseUpdate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCaseCall(String code, Integer id, TestCaseUpdate testCaseUpdate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = testCaseUpdate;

        // create path and map variables
        String localVarPath = "/case/{code}/{id}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "TokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateCaseValidateBeforeCall(String code, Integer id, TestCaseUpdate testCaseUpdate, final ApiCallback _callback) throws QaseException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling updateCase(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updateCase(Async)");
        }
        
        // verify the required parameter 'testCaseUpdate' is set
        if (testCaseUpdate == null) {
            throw new QaseException("Missing the required parameter 'testCaseUpdate' when calling updateCase(Async)");
        }
        

        okhttp3.Call localVarCall = updateCaseCall(code, id, testCaseUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update test case.
     * This method updates a test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param testCaseUpdate  (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public IdResponse updateCase(String code, Integer id, TestCaseUpdate testCaseUpdate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = updateCaseWithHttpInfo(code, id, testCaseUpdate);
        return localVarResp.getData();
    }

    /**
     * Update test case.
     * This method updates a test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param testCaseUpdate  (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdResponse> updateCaseWithHttpInfo(String code, Integer id, TestCaseUpdate testCaseUpdate) throws QaseException {
        okhttp3.Call localVarCall = updateCaseValidateBeforeCall(code, id, testCaseUpdate, null);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update test case. (asynchronously)
     * This method updates a test case. 
     * @param code Code of project, where to search entities. (required)
     * @param id Identifier. (required)
     * @param testCaseUpdate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Test Case. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCaseAsync(String code, Integer id, TestCaseUpdate testCaseUpdate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = updateCaseValidateBeforeCall(code, id, testCaseUpdate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}