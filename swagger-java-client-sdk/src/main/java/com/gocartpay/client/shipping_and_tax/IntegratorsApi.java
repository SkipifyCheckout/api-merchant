/*
 * GoCart Partner Callback API
 * API callbacks that need to be implemented by GoCart partners to enable a complete integration with the GoCart checkout workflows. <p/> For instance, a callback method that calculates the shipping options and taxes for an order based on the passed in shipping address.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@gocartpay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.gocartpay.client.shipping_and_tax;

import com.gocartpay.client.ApiCallback;
import com.gocartpay.client.ApiClient;
import com.gocartpay.client.ApiException;
import com.gocartpay.client.ApiResponse;
import com.gocartpay.client.Configuration;
import com.gocartpay.client.Pair;
import com.gocartpay.client.ProgressRequestBody;
import com.gocartpay.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ShippingAndTaxRequest;
import io.swagger.client.model.ShippingAndTaxResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegratorsApi {
    private ApiClient apiClient;

    public IntegratorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IntegratorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for calculateShippingAndTax
     * @param body Shipping and tax request payload. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calculateShippingAndTaxCall(ShippingAndTaxRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/shipping-and-taxes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calculateShippingAndTaxValidateBeforeCall(ShippingAndTaxRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling calculateShippingAndTax(Async)");
        }
        
        com.squareup.okhttp.Call call = calculateShippingAndTaxCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calculates shipping and tax for an order.
     * Calculates the shipping and tax charges for an order.
     * @param body Shipping and tax request payload. (required)
     * @return ShippingAndTaxResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShippingAndTaxResponse calculateShippingAndTax(ShippingAndTaxRequest body) throws ApiException {
        ApiResponse<ShippingAndTaxResponse> resp = calculateShippingAndTaxWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Calculates shipping and tax for an order.
     * Calculates the shipping and tax charges for an order.
     * @param body Shipping and tax request payload. (required)
     * @return ApiResponse&lt;ShippingAndTaxResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShippingAndTaxResponse> calculateShippingAndTaxWithHttpInfo(ShippingAndTaxRequest body) throws ApiException {
        com.squareup.okhttp.Call call = calculateShippingAndTaxValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ShippingAndTaxResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculates shipping and tax for an order. (asynchronously)
     * Calculates the shipping and tax charges for an order.
     * @param body Shipping and tax request payload. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calculateShippingAndTaxAsync(ShippingAndTaxRequest body, final ApiCallback<ShippingAndTaxResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calculateShippingAndTaxValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ShippingAndTaxResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
