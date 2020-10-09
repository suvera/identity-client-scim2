/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.scim2.swagger.client.api;

import com.squareup.okhttp.Call;
import io.scim2.swagger.client.ScimApiClient;
import io.scim2.swagger.client.ScimApiException;
import io.scim2.swagger.client.Configuration;
import io.scim2.swagger.client.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scimv2BaseApi {

    protected ScimApiClient scimApiClient;

    public Scimv2BaseApi() {
        this(Configuration.getDefaultScimApiClient());
    }

    public Scimv2BaseApi(ScimApiClient scimApiClient) {
        this.scimApiClient = scimApiClient;
    }

    public ScimApiClient getScimApiClient() {
        return scimApiClient;
    }

    public void setScimApiClient(ScimApiClient scimApiClient) {
        this.scimApiClient = scimApiClient;
    }

    /**
     * Build call for create
     *
     * @param attributes         SCIM defined attributes parameter. (optional)
     * @param excludedAttributes SCIM defined excludedAttribute parameter. (optional)
     * @param body               (optional)
     * @return Call to execute
     * @throws ScimApiException If fail to serialize the request body object
     */
    public Call createResourceCall(List<String> attributes, List<String> excludedAttributes, String body)
            throws ScimApiException {

        Object localVarPostBody = body;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (attributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "attributes", attributes));
        if (excludedAttributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        localVarHeaderParams.put("Content-Type", "application/scim+json");

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }

    /**
     * Build call for delete
     *
     * @return Call to execute
     * @throws ScimApiException If fail to serialize the request body object
     */
    public Call deleteResourceCall() throws ScimApiException {

        Object localVarPostBody = null;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {};
        final String localVarContentType = scimApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }

    /**
     * Build call
     *
     * @param attributes         SCIM defined attributes parameter. (optional)
     * @param excludedAttributes SCIM defined excludedAttribute parameter. (optional)
     * @return Call to execute
     * @throws ScimApiException If fail to serialize the request body object
     */
    public Call getResourceCall(List<String> attributes, List<String> excludedAttributes) throws ScimApiException {

        Object localVarPostBody = null;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (attributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "attributes", attributes));
        if (excludedAttributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {};
        final String localVarContentType = scimApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }

    /**
     * Build call
     *
     * @param body (optional)
     * @return Call to execute
     * @throws ScimApiException If fail to serialize the request body object
     */
    public Call getResourcesByPostCall(String body) throws ScimApiException {

        Object localVarPostBody = body;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/scim+json"};
        final String localVarContentType = scimApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }

    /**
     * Build call for update.
     *
     * @param attributes         SCIM defined attributes parameter. (optional)
     * @param excludedAttributes SCIM defined excludedAttribute parameter. (optional)
     * @param body               (optional)
     * @return Call to execute.
     * @throws ScimApiException If fail to serialize the request body object.
     */
    public Call updateResourceCall(List<String> attributes, List<String> excludedAttributes, String body)
            throws ScimApiException {

        Object localVarPostBody = body;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (attributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "attributes", attributes));
        if (excludedAttributes != null)
            localVarQueryParams.addAll(scimApiClient.parameterToPairs("csv", "excludedAttributes", excludedAttributes));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/scim+json"};
        final String localVarContentType = scimApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }

    /**
     * Build call.
     *
     * @return Call to execute.
     * @throws ScimApiException If fail to serialize the request body object.
     */
    public Call getResourceTypeCall() throws ScimApiException {

        Object localVarPostBody = null;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {"application/json", "application/scim+json"};
        final String localVarAccept = scimApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {};
        final String localVarContentType = scimApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return scimApiClient.buildCall("GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames);
    }
}
