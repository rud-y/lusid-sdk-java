/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1392
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import com.finbourne.lusid.model.ResourceListOfPortfolioGroup;
import com.finbourne.lusid.model.ResourceListOfPortfolioSearchResult;
import com.finbourne.lusid.model.ResourceListOfPropertyDefinition;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for portfolioGroupsSearch
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portfolioGroupsSearchCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/search/portfoliogroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.1392");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call portfolioGroupsSearchValidateBeforeCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling portfolioGroupsSearch(Async)");
        }
        

        okhttp3.Call localVarCall = portfolioGroupsSearchCall(request, filter, _callback);
        return localVarCall;

    }

    /**
     * [DEPRECATED] Portfolio groups search
     * Search across all portfolio groups across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfPortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPortfolioGroup portfolioGroupsSearch(Object request, String filter) throws ApiException {
        ApiResponse<ResourceListOfPortfolioGroup> localVarResp = portfolioGroupsSearchWithHttpInfo(request, filter);
        return localVarResp.getData();
    }

    /**
     * [DEPRECATED] Portfolio groups search
     * Search across all portfolio groups across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfPortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPortfolioGroup> portfolioGroupsSearchWithHttpInfo(Object request, String filter) throws ApiException {
        okhttp3.Call localVarCall = portfolioGroupsSearchValidateBeforeCall(request, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [DEPRECATED] Portfolio groups search (asynchronously)
     * Search across all portfolio groups across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portfolioGroupsSearchAsync(Object request, String filter, final ApiCallback<ResourceListOfPortfolioGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = portfolioGroupsSearchValidateBeforeCall(request, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for portfoliosSearch
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolios found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portfoliosSearchCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/search/portfolios";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.1392");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call portfoliosSearchValidateBeforeCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling portfoliosSearch(Async)");
        }
        

        okhttp3.Call localVarCall = portfoliosSearchCall(request, filter, _callback);
        return localVarCall;

    }

    /**
     * [DEPRECATED] Portfolios search
     * Search across all portfolios across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfPortfolioSearchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolios found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPortfolioSearchResult portfoliosSearch(Object request, String filter) throws ApiException {
        ApiResponse<ResourceListOfPortfolioSearchResult> localVarResp = portfoliosSearchWithHttpInfo(request, filter);
        return localVarResp.getData();
    }

    /**
     * [DEPRECATED] Portfolios search
     * Search across all portfolios across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfPortfolioSearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolios found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPortfolioSearchResult> portfoliosSearchWithHttpInfo(Object request, String filter) throws ApiException {
        okhttp3.Call localVarCall = portfoliosSearchValidateBeforeCall(request, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioSearchResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [DEPRECATED] Portfolios search (asynchronously)
     * Search across all portfolios across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolios found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call portfoliosSearchAsync(Object request, String filter, final ApiCallback<ResourceListOfPortfolioSearchResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = portfoliosSearchValidateBeforeCall(request, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioSearchResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for propertiesSearch
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The property definitions found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call propertiesSearchCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/search/propertydefinitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.1392");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call propertiesSearchValidateBeforeCall(Object request, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling propertiesSearch(Async)");
        }
        

        okhttp3.Call localVarCall = propertiesSearchCall(request, filter, _callback);
        return localVarCall;

    }

    /**
     * [DEPRECATED] Search property definitions
     * Search across all user defined property definitions across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfPropertyDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The property definitions found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPropertyDefinition propertiesSearch(Object request, String filter) throws ApiException {
        ApiResponse<ResourceListOfPropertyDefinition> localVarResp = propertiesSearchWithHttpInfo(request, filter);
        return localVarResp.getData();
    }

    /**
     * [DEPRECATED] Search property definitions
     * Search across all user defined property definitions across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfPropertyDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The property definitions found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPropertyDefinition> propertiesSearchWithHttpInfo(Object request, String filter) throws ApiException {
        okhttp3.Call localVarCall = propertiesSearchValidateBeforeCall(request, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [DEPRECATED] Search property definitions (asynchronously)
     * Search across all user defined property definitions across all scopes.
     * @param request The search query to use. Read more about search queries in LUSID here https://support.lusid.com/constructing-a-search-request. (required)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The property definitions found by the search </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call propertiesSearchAsync(Object request, String filter, final ApiCallback<ResourceListOfPropertyDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = propertiesSearchValidateBeforeCall(request, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
