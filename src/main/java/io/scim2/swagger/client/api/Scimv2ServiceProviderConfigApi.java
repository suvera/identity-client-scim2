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

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.scim2.swagger.client.Configuration;
import io.scim2.swagger.client.ScimApiClient;
import io.scim2.swagger.client.ScimApiException;
import io.scim2.swagger.client.ScimApiResponse;

import java.lang.reflect.Type;

public class Scimv2ServiceProviderConfigApi extends Scimv2BaseApi {

    public Scimv2ServiceProviderConfigApi() {
        this(Configuration.getDefaultScimApiClient());
    }

    public Scimv2ServiceProviderConfigApi(ScimApiClient scimApiClient) {
        super(scimApiClient);
        scimApiClient.setServicePath("/ServiceProviderConfig");
    }

    private Call getServiceProviderConfigValidateBeforeCall() throws ScimApiException {
        Call call = getResourceTypeCall();
        return call;
    }

    /**
     * Return the ServiceProviderConfig schema.
     * Returns HTTP 200 if the schema is found.
     *
     * @return String
     * @throws ScimApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getServiceProviderConfig() throws ScimApiException {
        ScimApiResponse<String> resp = getServiceProviderConfigWithHttpInfo();
        return resp.getData();
    }

    /**
     * Return the ServiceProviderConfig schema.
     * Returns HTTP 200 if the schema is found.
     *
     * @return ScimApiResponse&lt;String&gt;
     * @throws ScimApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScimApiResponse<String> getServiceProviderConfigWithHttpInfo() throws ScimApiException {
        Call call = getServiceProviderConfigValidateBeforeCall();
        Type localVarReturnType = new TypeToken<String>() {}.getType();
        return scimApiClient.execute(call, localVarReturnType);
    }
}
