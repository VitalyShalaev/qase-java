package io.qase.api;

import io.qase.api.exceptions.QaseException;
import io.qase.api.inner.FilterHelper;
import io.qase.api.inner.RouteFilter;
import kong.unirest.HttpMethod;
import kong.unirest.JsonNode;
import kong.unirest.UnirestInstance;
import kong.unirest.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Collections.emptyMap;

final class QaseApiClient {
    private final UnirestInstance unirestInstance;
    private final String baseUrl;

    public QaseApiClient(UnirestInstance unirestInstance, String baseUrl) {
        this.unirestInstance = unirestInstance;
        this.baseUrl = baseUrl;
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Map<String, Object> routeParams,
            Filter filter,
            int limit,
            int offset) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("limit", limit);
        queryParams.put("offset", offset);
        return get(responseClass, path, routeParams, queryParams, filter);
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Filter filter,
            int limit,
            int offset) {
        return this.get(responseClass, path, emptyMap(), filter, limit, offset);
    }

    public <Response> Response get(
            Class<Response> responseClass,
            String path,
            int limit,
            int offset) {
        return this.get(responseClass, path, emptyMap(), null, limit, offset);
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Map<String, Object> routeParams,
            Filter filter) {
        return this.get(responseClass, path, routeParams, emptyMap(), filter);
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Map<String, Object> routeParams) {
        return this.get(responseClass, path, routeParams, emptyMap(), null);
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Map<String, Object> routeParams,
            Map<String, Object> queryParams) {
        return this.get(responseClass, path, routeParams, queryParams, null);
    }

    public <Response, Filter extends RouteFilter> Response get(
            Class<Response> responseClass,
            String path,
            Map<String, Object> routeParams,
            Map<String, Object> queryParams,
            Filter filter) {
        String filterPath = FilterHelper.getFilterRouteParam(filter);
        return unirestInstance.get(baseUrl + path + filterPath)
                .queryString(queryParams)
                .routeParam(routeParams)
                .asObject(responseClass).getBody();
    }

    public <Response, Request> Response post(Class<Response> responseClass, String path, Request request) {
        return this.post(responseClass, path, emptyMap(), request);
    }

    public <Response> Response post(Class<Response> responseClass, String path, File file) {
        return unirestInstance.post(baseUrl + path)
                .field(file.getName(), file)
                .asObject(responseClass).getBody();
    }

    public <Response, Request> Response post(Class<Response> responseClass, String path, Map<String, Object> routeParams, Request request) {
        return asObject(HttpMethod.POST, responseClass, path, routeParams, request);
    }

    public <Response, Request> Response patch(Class<Response> responseClass, String path, Map<String, Object> routeParams, Request request) {
        return asObject(HttpMethod.PATCH, responseClass, path, routeParams, request);
    }

    public JSONObject delete(String path, Map<String, Object> routeParams) {
        return this.asJson(HttpMethod.DELETE, path, routeParams);
    }

    public JSONObject patch(String path, Map<String, Object> routeParams) {
        return this.asJson(HttpMethod.PATCH, path, routeParams);
    }

    private <Response, Request> Response asObject(HttpMethod method,
                                                  Class<Response> responseClass,
                                                  String path,
                                                  Map<String, Object> routeParams,
                                                  Request request) {
        return unirestInstance.request(method.name(), baseUrl + path)
                .routeParam(routeParams)
                .body(request).asObject(responseClass).getBody();
    }

    private JSONObject asJson(HttpMethod method, String path, Map<String, Object> routeParams) {
        JsonNode body = unirestInstance.request(method.name(), baseUrl + path)
                .routeParam(routeParams)
                .asJson().getBody();
        return Optional.ofNullable(body).orElseThrow(() -> new QaseException("Something went wrong")).getObject();
    }
}