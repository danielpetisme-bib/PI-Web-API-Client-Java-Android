/*
 *
 * Copyright 2018 OSIsoft, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   <http://www.apache.org/licenses/LICENSE-2.0>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.osisoft.pidevclub.piwebapi.api;
import com.osisoft.pidevclub.piwebapi.ApiCallback;
import com.osisoft.pidevclub.piwebapi.ApiClient;
import com.osisoft.pidevclub.piwebapi.ApiException;
import com.osisoft.pidevclub.piwebapi.ApiResponse;
import com.osisoft.pidevclub.piwebapi.Configuration;
import com.osisoft.pidevclub.piwebapi.Pair;
import com.osisoft.pidevclub.piwebapi.ProgressRequestBody;
import com.osisoft.pidevclub.piwebapi.ProgressResponseBody;
import com.osisoft.pidevclub.piwebapi.models.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumerationSetApi {
	private ApiClient apiClient;
	public EnumerationSetApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Retrieve an enumeration set by path. 
	 *
	 */
	public PIEnumerationSet getByPath(String path, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIEnumerationSet> resp = getByPathWithHttpInfo(path, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve an enumeration set by path. (with HTTP information)
	 *
	 */
	public ApiResponse<PIEnumerationSet> getByPathWithHttpInfo(String path, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getByPathCall(path, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIEnumerationSet>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an enumeration set by path. (asynchronously)
	 *
	 */
	public okhttp3.Call getByPathAsync(String path, String selectedFields, String webIdType, final ApiCallback<PIEnumerationSet> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getByPathCall(path, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getByPathCall(String path, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'path' is set
		if (path == null)
			throw new ApiException("Missing required parameter 'path'");
		String localVarPath = "/enumerationsets";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (path != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "path", path));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve an enumeration set. 
	 *
	 */
	public PIEnumerationSet get(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIEnumerationSet> resp = getWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve an enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<PIEnumerationSet> getWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIEnumerationSet>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call getAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PIEnumerationSet> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Update an enumeration set by replacing items in its definition. 
	 *
	 */
	public void update(String webId, PIEnumerationSet enumerationSet) throws ApiException {
		updateWithHttpInfo(webId, enumerationSet);
	}

	/**
	 * Update an enumeration set by replacing items in its definition. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateWithHttpInfo(String webId, PIEnumerationSet enumerationSet) throws ApiException {
		okhttp3.Call call = updateCall(webId, enumerationSet,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update an enumeration set by replacing items in its definition. (asynchronously)
	 *
	 */
	public okhttp3.Call updateAsync(String webId, PIEnumerationSet enumerationSet, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = updateCall(webId, enumerationSet, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateCall(String webId, PIEnumerationSet enumerationSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'enumerationSet' is set
		if (enumerationSet == null)
			throw new ApiException("Missing required parameter 'enumerationSet'");
		String localVarPath = "/enumerationsets/{webId}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  enumerationSet;
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Delete an enumeration set. 
	 *
	 */
	public void delete(String webId) throws ApiException {
		deleteWithHttpInfo(webId);
	}

	/**
	 * Delete an enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteWithHttpInfo(String webId) throws ApiException {
		okhttp3.Call call = deleteCall(webId,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete an enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call deleteAsync(String webId, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = deleteCall(webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call deleteCall(String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve an enumeration set's values. 
	 *
	 */
	public PIItemsEnumerationValue getValues(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIItemsEnumerationValue> resp = getValuesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve an enumeration set's values. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsEnumerationValue> getValuesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getValuesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsEnumerationValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an enumeration set's values. (asynchronously)
	 *
	 */
	public okhttp3.Call getValuesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PIItemsEnumerationValue> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getValuesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValuesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}/enumerationvalues";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Create an enumeration value for a enumeration set. 
	 *
	 */
	public void createValue(String webId, PIEnumerationValue enumerationValue, String webIdType) throws ApiException {
		createValueWithHttpInfo(webId, enumerationValue, webIdType);
	}

	/**
	 * Create an enumeration value for a enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createValueWithHttpInfo(String webId, PIEnumerationValue enumerationValue, String webIdType) throws ApiException {
		okhttp3.Call call = createValueCall(webId, enumerationValue, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an enumeration value for a enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call createValueAsync(String webId, PIEnumerationValue enumerationValue, String webIdType, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = createValueCall(webId, enumerationValue, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createValueCall(String webId, PIEnumerationValue enumerationValue, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'enumerationValue' is set
		if (enumerationValue == null)
			throw new ApiException("Missing required parameter 'enumerationValue'");
		String localVarPath = "/enumerationsets/{webId}/enumerationvalues";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  enumerationValue;
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Get the security information of the specified security item associated with the enumeration set for a specified user. 
	 *
	 */
	public PIItemsSecurityRights getSecurity(String webId, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIItemsSecurityRights> resp = getSecurityWithHttpInfo(webId, userIdentity, forceRefresh, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Get the security information of the specified security item associated with the enumeration set for a specified user. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSecurityRights> getSecurityWithHttpInfo(String webId, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityCall(webId, userIdentity, forceRefresh, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSecurityRights>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get the security information of the specified security item associated with the enumeration set for a specified user. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityAsync(String webId, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType, final ApiCallback<PIItemsSecurityRights> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getSecurityCall(webId, userIdentity, forceRefresh, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityCall(String webId, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'userIdentity' is set
		if (userIdentity == null)
			throw new ApiException("Missing required parameter 'userIdentity'");
		String localVarPath = "/enumerationsets/{webId}/security";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (userIdentity != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIdentity", userIdentity));
		if (forceRefresh != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forceRefresh", forceRefresh));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve the security entries associated with the enumeration set based on the specified criteria. By default, all security entries for this enumeration set are returned. 
	 *
	 */
	public PIItemsSecurityEntry getSecurityEntries(String webId, String nameFilter, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIItemsSecurityEntry> resp = getSecurityEntriesWithHttpInfo(webId, nameFilter, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve the security entries associated with the enumeration set based on the specified criteria. By default, all security entries for this enumeration set are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSecurityEntry> getSecurityEntriesWithHttpInfo(String webId, String nameFilter, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entries associated with the enumeration set based on the specified criteria. By default, all security entries for this enumeration set are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntriesAsync(String webId, String nameFilter, String selectedFields, String webIdType, final ApiCallback<PIItemsSecurityEntry> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntriesCall(String webId, String nameFilter, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}/securityentries";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Create a security entry owned by the enumeration set. 
	 *
	 */
	public void createSecurityEntry(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String webIdType) throws ApiException {
		createSecurityEntryWithHttpInfo(webId, securityEntry, applyToChildren, webIdType);
	}

	/**
	 * Create a security entry owned by the enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createSecurityEntryWithHttpInfo(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String webIdType) throws ApiException {
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a security entry owned by the enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call createSecurityEntryAsync(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String webIdType, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createSecurityEntryCall(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityEntry' is set
		if (securityEntry == null)
			throw new ApiException("Missing required parameter 'securityEntry'");
		String localVarPath = "/enumerationsets/{webId}/securityentries";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  securityEntry;
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve the security entry associated with the enumeration set with the specified name. 
	 *
	 */
	public PISecurityEntry getSecurityEntryByName(String name, String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PISecurityEntry> resp = getSecurityEntryByNameWithHttpInfo(name, webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve the security entry associated with the enumeration set with the specified name. (with HTTP information)
	 *
	 */
	public ApiResponse<PISecurityEntry> getSecurityEntryByNameWithHttpInfo(String name, String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PISecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entry associated with the enumeration set with the specified name. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntryByNameAsync(String name, String webId, String selectedFields, String webIdType, final ApiCallback<PISecurityEntry> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntryByNameCall(String name, String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Update a security entry owned by the enumeration set. 
	 *
	 */
	public void updateSecurityEntry(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren) throws ApiException {
		updateSecurityEntryWithHttpInfo(name, webId, securityEntry, applyToChildren);
	}

	/**
	 * Update a security entry owned by the enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateSecurityEntryWithHttpInfo(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren) throws ApiException {
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update a security entry owned by the enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call updateSecurityEntryAsync(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateSecurityEntryCall(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityEntry' is set
		if (securityEntry == null)
			throw new ApiException("Missing required parameter 'securityEntry'");
		String localVarPath = "/enumerationsets/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  securityEntry;
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Delete a security entry owned by the enumeration set. 
	 *
	 */
	public void deleteSecurityEntry(String name, String webId, Boolean applyToChildren) throws ApiException {
		deleteSecurityEntryWithHttpInfo(name, webId, applyToChildren);
	}

	/**
	 * Delete a security entry owned by the enumeration set. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteSecurityEntryWithHttpInfo(String name, String webId, Boolean applyToChildren) throws ApiException {
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete a security entry owned by the enumeration set. (asynchronously)
	 *
	 */
	public okhttp3.Call deleteSecurityEntryAsync(String name, String webId, Boolean applyToChildren, final ApiCallback<Void> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call deleteSecurityEntryCall(String name, String webId, Boolean applyToChildren, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/enumerationsets/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

}
