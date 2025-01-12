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


package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.client.*;
import io.qase.client.model.AttachmentListResponse;
import io.qase.client.model.AttachmentResponse;
import io.qase.client.model.AttachmentUploadsResponse;
import io.qase.client.model.HashResponse;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttachmentsApi {
    private ApiClient localVarApiClient;

    public AttachmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttachmentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteAttachment
     *
     * @param hash      Hash. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteAttachmentCall(String hash, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/attachment/{hash}"
                .replaceAll("\\{" + "hash" + "\\}", localVarApiClient.escapeString(hash));

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

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAttachmentValidateBeforeCall(String hash, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new QaseException("Missing the required parameter 'hash' when calling deleteAttachment(Async)");
        }


        okhttp3.Call localVarCall = deleteAttachmentCall(hash, _callback);
        return localVarCall;

    }

    /**
     * Remove attachment by Hash.
     * This method allows to remove attachment by Hash.
     *
     * @param hash Hash. (required)
     * @return HashResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public HashResponse deleteAttachment(String hash) throws QaseException {
        ApiResponse<HashResponse> localVarResp = deleteAttachmentWithHttpInfo(hash);
        return localVarResp.getData();
    }

    /**
     * Remove attachment by Hash.
     * This method allows to remove attachment by Hash.
     *
     * @param hash Hash. (required)
     * @return ApiResponse&lt;HashResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<HashResponse> deleteAttachmentWithHttpInfo(String hash) throws QaseException {
        okhttp3.Call localVarCall = deleteAttachmentValidateBeforeCall(hash, null);
        Type localVarReturnType = new TypeToken<HashResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove attachment by Hash. (asynchronously)
     * This method allows to remove attachment by Hash.
     *
     * @param hash      Hash. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteAttachmentAsync(String hash, final ApiCallback<HashResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteAttachmentValidateBeforeCall(hash, _callback);
        Type localVarReturnType = new TypeToken<HashResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getAttachment
     *
     * @param hash      Hash. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAttachmentCall(String hash, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/attachment/{hash}"
                .replaceAll("\\{" + "hash" + "\\}", localVarApiClient.escapeString(hash));

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

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttachmentValidateBeforeCall(String hash, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new QaseException("Missing the required parameter 'hash' when calling getAttachment(Async)");
        }


        okhttp3.Call localVarCall = getAttachmentCall(hash, _callback);
        return localVarCall;

    }

    /**
     * Get attachment by Hash.
     * This method allows to retrieve attachment by Hash.
     *
     * @param hash Hash. (required)
     * @return AttachmentResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public AttachmentResponse getAttachment(String hash) throws QaseException {
        ApiResponse<AttachmentResponse> localVarResp = getAttachmentWithHttpInfo(hash);
        return localVarResp.getData();
    }

    /**
     * Get attachment by Hash.
     * This method allows to retrieve attachment by Hash.
     *
     * @param hash Hash. (required)
     * @return ApiResponse&lt;AttachmentResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AttachmentResponse> getAttachmentWithHttpInfo(String hash) throws QaseException {
        okhttp3.Call localVarCall = getAttachmentValidateBeforeCall(hash, null);
        Type localVarReturnType = new TypeToken<AttachmentResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get attachment by Hash. (asynchronously)
     * This method allows to retrieve attachment by Hash.
     *
     * @param hash      Hash. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAttachmentAsync(String hash, final ApiCallback<AttachmentResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getAttachmentValidateBeforeCall(hash, _callback);
        Type localVarReturnType = new TypeToken<AttachmentResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getAttachments
     *
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAttachmentsCall(Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/attachment";

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

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttachmentsValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {


        okhttp3.Call localVarCall = getAttachmentsCall(limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Get all attachments.
     * This method allows to retrieve attachments.
     *
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return AttachmentListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public AttachmentListResponse getAttachments(Integer limit, Integer offset) throws QaseException {
        ApiResponse<AttachmentListResponse> localVarResp = getAttachmentsWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * Get all attachments.
     * This method allows to retrieve attachments.
     *
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return ApiResponse&lt;AttachmentListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AttachmentListResponse> getAttachmentsWithHttpInfo(Integer limit, Integer offset) throws QaseException {
        okhttp3.Call localVarCall = getAttachmentsValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<AttachmentListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all attachments. (asynchronously)
     * This method allows to retrieve attachments.
     *
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getAttachmentsAsync(Integer limit, Integer offset, final ApiCallback<AttachmentListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getAttachmentsValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<AttachmentListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for uploadAttachment
     *
     * @param code      Code of project, where to search entities. (required)
     * @param file      (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call uploadAttachmentCall(String code, List<File> file, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/attachment/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadAttachmentValidateBeforeCall(String code, List<File> file, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling uploadAttachment(Async)");
        }


        okhttp3.Call localVarCall = uploadAttachmentCall(code, file, _callback);
        return localVarCall;

    }

    /**
     * Upload attachment.
     * This method allows to upload attachment to Qase. Max upload size: * Up to 32 Mb per file * Up to 128 Mb per single request * Up to 20 files per single request  If there is no free space left in your team account, you will receive an error with code 507 - Insufficient Storage.
     *
     * @param code Code of project, where to search entities. (required)
     * @param file (optional)
     * @return AttachmentUploadsResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public AttachmentUploadsResponse uploadAttachment(String code, List<File> file) throws QaseException {
        ApiResponse<AttachmentUploadsResponse> localVarResp = uploadAttachmentWithHttpInfo(code, file);
        return localVarResp.getData();
    }

    /**
     * Upload attachment.
     * This method allows to upload attachment to Qase. Max upload size: * Up to 32 Mb per file * Up to 128 Mb per single request * Up to 20 files per single request  If there is no free space left in your team account, you will receive an error with code 507 - Insufficient Storage.
     *
     * @param code Code of project, where to search entities. (required)
     * @param file (optional)
     * @return ApiResponse&lt;AttachmentUploadsResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AttachmentUploadsResponse> uploadAttachmentWithHttpInfo(String code, List<File> file) throws QaseException {
        okhttp3.Call localVarCall = uploadAttachmentValidateBeforeCall(code, file, null);
        Type localVarReturnType = new TypeToken<AttachmentUploadsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload attachment. (asynchronously)
     * This method allows to upload attachment to Qase. Max upload size: * Up to 32 Mb per file * Up to 128 Mb per single request * Up to 20 files per single request  If there is no free space left in your team account, you will receive an error with code 507 - Insufficient Storage.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param file      (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> An attachments. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call uploadAttachmentAsync(String code, List<File> file, final ApiCallback<AttachmentUploadsResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = uploadAttachmentValidateBeforeCall(code, file, _callback);
        Type localVarReturnType = new TypeToken<AttachmentUploadsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
