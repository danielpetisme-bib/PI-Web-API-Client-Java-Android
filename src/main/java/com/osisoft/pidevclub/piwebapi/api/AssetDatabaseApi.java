/*
 *
 * Copyright 2017 OSIsoft, LLC
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

public class AssetDatabaseApi {
	private ApiClient apiClient;
	public AssetDatabaseApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Retrieve an Asset Database by path. 
	 *
	 */
	public PIAssetDatabase getByPath(String path, String selectedFields) throws ApiException {
		ApiResponse<PIAssetDatabase> resp = getByPathWithHttpInfo(path, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve an Asset Database by path. (with HTTP information)
	 *
	 */
	public ApiResponse<PIAssetDatabase> getByPathWithHttpInfo(String path, String selectedFields) throws ApiException {
		okhttp3.Call call = getByPathCall(path, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIAssetDatabase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an Asset Database by path. (asynchronously)
	 *
	 */
	public okhttp3.Call getByPathAsync(String path, String selectedFields, final ApiCallback<PIAssetDatabase> callback) throws ApiException {
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
		okhttp3.Call call = getByPathCall(path, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getByPathCall(String path, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'path' is set
		if (path == null)
			throw new ApiException("Missing required parameter 'path'");
		String localVarPath = "/assetdatabases";
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
	 * Retrieve an Asset Database. 
	 *
	 */
	public PIAssetDatabase get(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIAssetDatabase> resp = getWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve an Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIAssetDatabase> getWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIAssetDatabase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAsync(String webId, String selectedFields, final ApiCallback<PIAssetDatabase> callback) throws ApiException {
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
		okhttp3.Call call = getCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}";
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
	 * Update an asset database by replacing items in its definition. 
	 *
	 */
	public void update(String webId, PIAssetDatabase database) throws ApiException {
		updateWithHttpInfo(webId, database);
	}

	/**
	 * Update an asset database by replacing items in its definition. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateWithHttpInfo(String webId, PIAssetDatabase database) throws ApiException {
		okhttp3.Call call = updateCall(webId, database,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update an asset database by replacing items in its definition. (asynchronously)
	 *
	 */
	public okhttp3.Call updateAsync(String webId, PIAssetDatabase database, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = updateCall(webId, database, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateCall(String webId, PIAssetDatabase database, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'database' is set
		if (database == null)
			throw new ApiException("Missing required parameter 'database'");
		String localVarPath = "/assetdatabases/{webId}";
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
		localVarPostBody =  database;
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
	 * Delete an asset database. 
	 *
	 */
	public void delete(String webId) throws ApiException {
		deleteWithHttpInfo(webId);
	}

	/**
	 * Delete an asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteWithHttpInfo(String webId) throws ApiException {
		okhttp3.Call call = deleteCall(webId,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete an asset database. (asynchronously)
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
		String localVarPath = "/assetdatabases/{webId}";
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
	 * Retrieve analyses based on the specified conditions. 
	 *
	 */
	public PIItemsAnalysis findAnalyses(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex) throws ApiException {
		ApiResponse<PIItemsAnalysis> resp = findAnalysesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex);
		return resp.getData();
	}

	/**
	 * Retrieve analyses based on the specified conditions. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAnalysis> findAnalysesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex) throws ApiException {
		okhttp3.Call call = findAnalysesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAnalysis>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analyses based on the specified conditions. (asynchronously)
	 *
	 */
	public okhttp3.Call findAnalysesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, final ApiCallback<PIItemsAnalysis> callback) throws ApiException {
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
		okhttp3.Call call = findAnalysesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findAnalysesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/analyses";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Retrieve analysis categories for a given Asset Database. 
	 *
	 */
	public PIItemsAnalysisCategory getAnalysisCategories(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsAnalysisCategory> resp = getAnalysisCategoriesWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve analysis categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAnalysisCategory> getAnalysisCategoriesWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getAnalysisCategoriesCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAnalysisCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analysis categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAnalysisCategoriesAsync(String webId, String selectedFields, final ApiCallback<PIItemsAnalysisCategory> callback) throws ApiException {
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
		okhttp3.Call call = getAnalysisCategoriesCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAnalysisCategoriesCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/analysiscategories";
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
	 * Create an analysis category at the Asset Database root. 
	 *
	 */
	public void createAnalysisCategory(String webId, PIAnalysisCategory analysisCategory) throws ApiException {
		createAnalysisCategoryWithHttpInfo(webId, analysisCategory);
	}

	/**
	 * Create an analysis category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAnalysisCategoryWithHttpInfo(String webId, PIAnalysisCategory analysisCategory) throws ApiException {
		okhttp3.Call call = createAnalysisCategoryCall(webId, analysisCategory,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an analysis category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAnalysisCategoryAsync(String webId, PIAnalysisCategory analysisCategory, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAnalysisCategoryCall(webId, analysisCategory, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAnalysisCategoryCall(String webId, PIAnalysisCategory analysisCategory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'analysisCategory' is set
		if (analysisCategory == null)
			throw new ApiException("Missing required parameter 'analysisCategory'");
		String localVarPath = "/assetdatabases/{webId}/analysiscategories";
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
		localVarPostBody =  analysisCategory;
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
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. 
	 *
	 */
	public PIItemsAnalysisTemplate getAnalysisTemplates(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder) throws ApiException {
		ApiResponse<PIItemsAnalysisTemplate> resp = getAnalysisTemplatesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder);
		return resp.getData();
	}

	/**
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAnalysisTemplate> getAnalysisTemplatesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder) throws ApiException {
		okhttp3.Call call = getAnalysisTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAnalysisTemplate>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getAnalysisTemplatesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, final ApiCallback<PIItemsAnalysisTemplate> callback) throws ApiException {
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
		okhttp3.Call call = getAnalysisTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAnalysisTemplatesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/analysistemplates";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
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
	 * Create an analysis template at the Asset Database root. 
	 *
	 */
	public void createAnalysisTemplate(String webId, PIAnalysisTemplate template) throws ApiException {
		createAnalysisTemplateWithHttpInfo(webId, template);
	}

	/**
	 * Create an analysis template at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAnalysisTemplateWithHttpInfo(String webId, PIAnalysisTemplate template) throws ApiException {
		okhttp3.Call call = createAnalysisTemplateCall(webId, template,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an analysis template at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAnalysisTemplateAsync(String webId, PIAnalysisTemplate template, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAnalysisTemplateCall(webId, template, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAnalysisTemplateCall(String webId, PIAnalysisTemplate template, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'template' is set
		if (template == null)
			throw new ApiException("Missing required parameter 'template'");
		String localVarPath = "/assetdatabases/{webId}/analysistemplates";
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
		localVarPostBody =  template;
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
	 * Retrieve attribute categories for a given Asset Database. 
	 *
	 */
	public PIItemsAttributeCategory getAttributeCategories(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsAttributeCategory> resp = getAttributeCategoriesWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve attribute categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAttributeCategory> getAttributeCategoriesWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getAttributeCategoriesCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAttributeCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve attribute categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAttributeCategoriesAsync(String webId, String selectedFields, final ApiCallback<PIItemsAttributeCategory> callback) throws ApiException {
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
		okhttp3.Call call = getAttributeCategoriesCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAttributeCategoriesCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/attributecategories";
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
	 * Create an attribute category at the Asset Database root. 
	 *
	 */
	public void createAttributeCategory(String webId, PIAttributeCategory attributeCategory) throws ApiException {
		createAttributeCategoryWithHttpInfo(webId, attributeCategory);
	}

	/**
	 * Create an attribute category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAttributeCategoryWithHttpInfo(String webId, PIAttributeCategory attributeCategory) throws ApiException {
		okhttp3.Call call = createAttributeCategoryCall(webId, attributeCategory,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an attribute category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAttributeCategoryAsync(String webId, PIAttributeCategory attributeCategory, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAttributeCategoryCall(webId, attributeCategory, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAttributeCategoryCall(String webId, PIAttributeCategory attributeCategory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'attributeCategory' is set
		if (attributeCategory == null)
			throw new ApiException("Missing required parameter 'attributeCategory'");
		String localVarPath = "/assetdatabases/{webId}/attributecategories";
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
		localVarPostBody =  attributeCategory;
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
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. 
	 *
	 */
	public PIItemsAttribute findElementAttributes(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex) throws ApiException {
		ApiResponse<PIItemsAttribute> resp = findElementAttributesWithHttpInfo(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex);
		return resp.getData();
	}

	/**
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAttribute> findElementAttributesWithHttpInfo(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex) throws ApiException {
		okhttp3.Call call = findElementAttributesCall(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAttribute>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call findElementAttributesAsync(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, final ApiCallback<PIItemsAttribute> callback) throws ApiException {
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
		okhttp3.Call call = findElementAttributesCall(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findElementAttributesCall(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elementattributes";
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
		if (attributeCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeCategory", attributeCategory));
		if (attributeDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeDescriptionFilter", attributeDescriptionFilter));
		if (attributeNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeNameFilter", attributeNameFilter));
		if (attributeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeType", attributeType));
		if (elementCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementCategory", elementCategory));
		if (elementDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementDescriptionFilter", elementDescriptionFilter));
		if (elementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementNameFilter", elementNameFilter));
		if (elementTemplate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementTemplate", elementTemplate));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Retrieve element categories for a given Asset Database. 
	 *
	 */
	public PIItemsElementCategory getElementCategories(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsElementCategory> resp = getElementCategoriesWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve element categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsElementCategory> getElementCategoriesWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getElementCategoriesCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsElementCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve element categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementCategoriesAsync(String webId, String selectedFields, final ApiCallback<PIItemsElementCategory> callback) throws ApiException {
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
		okhttp3.Call call = getElementCategoriesCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementCategoriesCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elementcategories";
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
	 * Create an element category at the Asset Database root. 
	 *
	 */
	public void createElementCategory(String webId, PIElementCategory elementCategory) throws ApiException {
		createElementCategoryWithHttpInfo(webId, elementCategory);
	}

	/**
	 * Create an element category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementCategoryWithHttpInfo(String webId, PIElementCategory elementCategory) throws ApiException {
		okhttp3.Call call = createElementCategoryCall(webId, elementCategory,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an element category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementCategoryAsync(String webId, PIElementCategory elementCategory, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementCategoryCall(webId, elementCategory, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementCategoryCall(String webId, PIElementCategory elementCategory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'elementCategory' is set
		if (elementCategory == null)
			throw new ApiException("Missing required parameter 'elementCategory'");
		String localVarPath = "/assetdatabases/{webId}/elementcategories";
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
		localVarPostBody =  elementCategory;
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
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. 
	 *
	 */
	public PIItemsElement getElements(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName) throws ApiException {
		ApiResponse<PIItemsElement> resp = getElementsWithHttpInfo(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName);
		return resp.getData();
	}

	/**
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsElement> getElementsWithHttpInfo(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName) throws ApiException {
		okhttp3.Call call = getElementsCall(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName,null,null);
		Type localVarReturnType = new TypeToken<PIItemsElement>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementsAsync(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, final ApiCallback<PIItemsElement> callback) throws ApiException {
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
		okhttp3.Call call = getElementsCall(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementsCall(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elements";
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
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (descriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "descriptionFilter", descriptionFilter));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
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
	 * Create a child element. 
	 *
	 */
	public void createElement(String webId, PIElement element) throws ApiException {
		createElementWithHttpInfo(webId, element);
	}

	/**
	 * Create a child element. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementWithHttpInfo(String webId, PIElement element) throws ApiException {
		okhttp3.Call call = createElementCall(webId, element,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a child element. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementAsync(String webId, PIElement element, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementCall(webId, element, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementCall(String webId, PIElement element, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'element' is set
		if (element == null)
			throw new ApiException("Missing required parameter 'element'");
		String localVarPath = "/assetdatabases/{webId}/elements";
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
		localVarPostBody =  element;
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
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. 
	 *
	 */
	public PIItemsElementTemplate getElementTemplates(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder) throws ApiException {
		ApiResponse<PIItemsElementTemplate> resp = getElementTemplatesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder);
		return resp.getData();
	}

	/**
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsElementTemplate> getElementTemplatesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder) throws ApiException {
		okhttp3.Call call = getElementTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder,null,null);
		Type localVarReturnType = new TypeToken<PIItemsElementTemplate>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementTemplatesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, final ApiCallback<PIItemsElementTemplate> callback) throws ApiException {
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
		okhttp3.Call call = getElementTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementTemplatesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/elementtemplates";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
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
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. 
	 *
	 */
	public void createElementTemplate(String webId, PIElementTemplate template) throws ApiException {
		createElementTemplateWithHttpInfo(webId, template);
	}

	/**
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementTemplateWithHttpInfo(String webId, PIElementTemplate template) throws ApiException {
		okhttp3.Call call = createElementTemplateCall(webId, template,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementTemplateAsync(String webId, PIElementTemplate template, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementTemplateCall(webId, template, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementTemplateCall(String webId, PIElementTemplate template, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'template' is set
		if (template == null)
			throw new ApiException("Missing required parameter 'template'");
		String localVarPath = "/assetdatabases/{webId}/elementtemplates";
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
		localVarPostBody =  template;
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
	 * Retrieve enumeration sets for given asset database. 
	 *
	 */
	public PIItemsEnumerationSet getEnumerationSets(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsEnumerationSet> resp = getEnumerationSetsWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve enumeration sets for given asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsEnumerationSet> getEnumerationSetsWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getEnumerationSetsCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsEnumerationSet>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve enumeration sets for given asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getEnumerationSetsAsync(String webId, String selectedFields, final ApiCallback<PIItemsEnumerationSet> callback) throws ApiException {
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
		okhttp3.Call call = getEnumerationSetsCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEnumerationSetsCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/enumerationsets";
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
	 * Create an enumeration set at the Asset Database. 
	 *
	 */
	public void createEnumerationSet(String webId, PIEnumerationSet enumerationSet) throws ApiException {
		createEnumerationSetWithHttpInfo(webId, enumerationSet);
	}

	/**
	 * Create an enumeration set at the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createEnumerationSetWithHttpInfo(String webId, PIEnumerationSet enumerationSet) throws ApiException {
		okhttp3.Call call = createEnumerationSetCall(webId, enumerationSet,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an enumeration set at the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createEnumerationSetAsync(String webId, PIEnumerationSet enumerationSet, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createEnumerationSetCall(webId, enumerationSet, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createEnumerationSetCall(String webId, PIEnumerationSet enumerationSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'enumerationSet' is set
		if (enumerationSet == null)
			throw new ApiException("Missing required parameter 'enumerationSet'");
		String localVarPath = "/assetdatabases/{webId}/enumerationsets";
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. 
	 *
	 */
	public PIItemsAttribute findEventFrameAttributes(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime) throws ApiException {
		ApiResponse<PIItemsAttribute> resp = findEventFrameAttributesWithHttpInfo(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime);
		return resp.getData();
	}

	/**
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsAttribute> findEventFrameAttributesWithHttpInfo(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime) throws ApiException {
		okhttp3.Call call = findEventFrameAttributesCall(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime,null,null);
		Type localVarReturnType = new TypeToken<PIItemsAttribute>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call findEventFrameAttributesAsync(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, final ApiCallback<PIItemsAttribute> callback) throws ApiException {
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
		okhttp3.Call call = findEventFrameAttributesCall(webId, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findEventFrameAttributesCall(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/eventframeattributes";
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
		if (attributeCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeCategory", attributeCategory));
		if (attributeDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeDescriptionFilter", attributeDescriptionFilter));
		if (attributeNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeNameFilter", attributeNameFilter));
		if (attributeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeType", attributeType));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (eventFrameCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameCategory", eventFrameCategory));
		if (eventFrameDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameDescriptionFilter", eventFrameDescriptionFilter));
		if (eventFrameNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameNameFilter", eventFrameNameFilter));
		if (eventFrameTemplate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameTemplate", eventFrameTemplate));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (referencedElementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementNameFilter", referencedElementNameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (searchMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchMode", searchMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
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
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource with a start time in the past 8 hours. 
	 *
	 */
	public PIItemsEventFrame getEventFrames(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName) throws ApiException {
		ApiResponse<PIItemsEventFrame> resp = getEventFramesWithHttpInfo(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName);
		return resp.getData();
	}

	/**
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource with a start time in the past 8 hours. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsEventFrame> getEventFramesWithHttpInfo(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName) throws ApiException {
		okhttp3.Call call = getEventFramesCall(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName,null,null);
		Type localVarReturnType = new TypeToken<PIItemsEventFrame>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource with a start time in the past 8 hours. (asynchronously)
	 *
	 */
	public okhttp3.Call getEventFramesAsync(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, final ApiCallback<PIItemsEventFrame> callback) throws ApiException {
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
		okhttp3.Call call = getEventFramesCall(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEventFramesCall(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/eventframes";
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
		if (canBeAcknowledged != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "canBeAcknowledged", canBeAcknowledged));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (isAcknowledged != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "isAcknowledged", isAcknowledged));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (referencedElementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementNameFilter", referencedElementNameFilter));
		if (referencedElementTemplateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementTemplateName", referencedElementTemplateName));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (searchMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchMode", searchMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (severity != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "severity", severity));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
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
	 * Create an event frame. 
	 *
	 */
	public void createEventFrame(String webId, PIEventFrame eventFrame) throws ApiException {
		createEventFrameWithHttpInfo(webId, eventFrame);
	}

	/**
	 * Create an event frame. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createEventFrameWithHttpInfo(String webId, PIEventFrame eventFrame) throws ApiException {
		okhttp3.Call call = createEventFrameCall(webId, eventFrame,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an event frame. (asynchronously)
	 *
	 */
	public okhttp3.Call createEventFrameAsync(String webId, PIEventFrame eventFrame, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createEventFrameCall(webId, eventFrame, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createEventFrameCall(String webId, PIEventFrame eventFrame, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'eventFrame' is set
		if (eventFrame == null)
			throw new ApiException("Missing required parameter 'eventFrame'");
		String localVarPath = "/assetdatabases/{webId}/eventframes";
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
		localVarPostBody =  eventFrame;
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
	 * Export the asset database. 
	 *
	 */
	public void export(String webId, String endTime, List<String> exportMode, String startTime) throws ApiException {
		exportWithHttpInfo(webId, endTime, exportMode, startTime);
	}

	/**
	 * Export the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> exportWithHttpInfo(String webId, String endTime, List<String> exportMode, String startTime) throws ApiException {
		okhttp3.Call call = exportCall(webId, endTime, exportMode, startTime,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Export the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call exportAsync(String webId, String endTime, List<String> exportMode, String startTime, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = exportCall(webId, endTime, exportMode, startTime, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call exportCall(String webId, String endTime, List<String> exportMode, String startTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/export";
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
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (exportMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exportMode", exportMode));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
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
	 * Import an asset database. 
	 *
	 */
	public void importData(String webId, List<String> importMode) throws ApiException {
		importDataWithHttpInfo(webId, importMode);
	}

	/**
	 * Import an asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> importDataWithHttpInfo(String webId, List<String> importMode) throws ApiException {
		okhttp3.Call call = importDataCall(webId, importMode,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Import an asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call importDataAsync(String webId, List<String> importMode, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = importDataCall(webId, importMode, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call importDataCall(String webId, List<String> importMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/import";
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
		if (importMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "importMode", importMode));
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
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. 
	 *
	 */
	public PIItemsElement getReferencedElements(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName) throws ApiException {
		ApiResponse<PIItemsElement> resp = getReferencedElementsWithHttpInfo(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName);
		return resp.getData();
	}

	/**
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsElement> getReferencedElementsWithHttpInfo(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName) throws ApiException {
		okhttp3.Call call = getReferencedElementsCall(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName,null,null);
		Type localVarReturnType = new TypeToken<PIItemsElement>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getReferencedElementsAsync(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, final ApiCallback<PIItemsElement> callback) throws ApiException {
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
		okhttp3.Call call = getReferencedElementsCall(webId, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getReferencedElementsCall(String webId, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (descriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "descriptionFilter", descriptionFilter));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
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
	 * Add a reference to an existing element to the specified database. 
	 *
	 */
	public void addReferencedElement(String webId, List<String> referencedElementWebId, String referenceType) throws ApiException {
		addReferencedElementWithHttpInfo(webId, referencedElementWebId, referenceType);
	}

	/**
	 * Add a reference to an existing element to the specified database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> addReferencedElementWithHttpInfo(String webId, List<String> referencedElementWebId, String referenceType) throws ApiException {
		okhttp3.Call call = addReferencedElementCall(webId, referencedElementWebId, referenceType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Add a reference to an existing element to the specified database. (asynchronously)
	 *
	 */
	public okhttp3.Call addReferencedElementAsync(String webId, List<String> referencedElementWebId, String referenceType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = addReferencedElementCall(webId, referencedElementWebId, referenceType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call addReferencedElementCall(String webId, List<String> referencedElementWebId, String referenceType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'referencedElementWebId' is set
		if (referencedElementWebId == null)
			throw new ApiException("Missing required parameter 'referencedElementWebId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (referencedElementWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementWebId", referencedElementWebId));
		if (referenceType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referenceType", referenceType));
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
	 * Remove a reference to an existing element from the specified database. 
	 *
	 */
	public void removeReferencedElement(String webId, List<String> referencedElementWebId) throws ApiException {
		removeReferencedElementWithHttpInfo(webId, referencedElementWebId);
	}

	/**
	 * Remove a reference to an existing element from the specified database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> removeReferencedElementWithHttpInfo(String webId, List<String> referencedElementWebId) throws ApiException {
		okhttp3.Call call = removeReferencedElementCall(webId, referencedElementWebId,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Remove a reference to an existing element from the specified database. (asynchronously)
	 *
	 */
	public okhttp3.Call removeReferencedElementAsync(String webId, List<String> referencedElementWebId, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = removeReferencedElementCall(webId, referencedElementWebId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call removeReferencedElementCall(String webId, List<String> referencedElementWebId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'referencedElementWebId' is set
		if (referencedElementWebId == null)
			throw new ApiException("Missing required parameter 'referencedElementWebId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (referencedElementWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementWebId", referencedElementWebId));
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
	 * Get the security information of the specified security item associated with the asset database for a specified user. 
	 *
	 */
	public PIItemsSecurityRights getSecurity(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields) throws ApiException {
		ApiResponse<PIItemsSecurityRights> resp = getSecurityWithHttpInfo(webId, securityItem, userIdentity, forceRefresh, selectedFields);
		return resp.getData();
	}

	/**
	 * Get the security information of the specified security item associated with the asset database for a specified user. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSecurityRights> getSecurityWithHttpInfo(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields) throws ApiException {
		okhttp3.Call call = getSecurityCall(webId, securityItem, userIdentity, forceRefresh, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSecurityRights>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get the security information of the specified security item associated with the asset database for a specified user. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityAsync(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, final ApiCallback<PIItemsSecurityRights> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityCall(webId, securityItem, userIdentity, forceRefresh, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityCall(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityItem' is set
		if (securityItem == null)
			throw new ApiException("Missing required parameter 'securityItem'");
		// verify the required parameter 'userIdentity' is set
		if (userIdentity == null)
			throw new ApiException("Missing required parameter 'userIdentity'");
		String localVarPath = "/assetdatabases/{webId}/security";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
		if (userIdentity != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIdentity", userIdentity));
		if (forceRefresh != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forceRefresh", forceRefresh));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
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
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. 
	 *
	 */
	public PIItemsSecurityEntry getSecurityEntries(String webId, String nameFilter, String securityItem, String selectedFields) throws ApiException {
		ApiResponse<PIItemsSecurityEntry> resp = getSecurityEntriesWithHttpInfo(webId, nameFilter, securityItem, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSecurityEntry> getSecurityEntriesWithHttpInfo(String webId, String nameFilter, String securityItem, String selectedFields) throws ApiException {
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, securityItem, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntriesAsync(String webId, String nameFilter, String securityItem, String selectedFields, final ApiCallback<PIItemsSecurityEntry> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, securityItem, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntriesCall(String webId, String nameFilter, String securityItem, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
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
	 * Create a security entry owned by the asset database. 
	 *
	 */
	public void createSecurityEntry(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		createSecurityEntryWithHttpInfo(webId, securityEntry, applyToChildren, securityItem);
	}

	/**
	 * Create a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createSecurityEntryWithHttpInfo(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, securityItem,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call createSecurityEntryAsync(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, securityItem, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createSecurityEntryCall(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityEntry' is set
		if (securityEntry == null)
			throw new ApiException("Missing required parameter 'securityEntry'");
		String localVarPath = "/assetdatabases/{webId}/securityentries";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. 
	 *
	 */
	public PISecurityEntry getSecurityEntryByName(String name, String webId, String securityItem, String selectedFields) throws ApiException {
		ApiResponse<PISecurityEntry> resp = getSecurityEntryByNameWithHttpInfo(name, webId, securityItem, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. (with HTTP information)
	 *
	 */
	public ApiResponse<PISecurityEntry> getSecurityEntryByNameWithHttpInfo(String name, String webId, String securityItem, String selectedFields) throws ApiException {
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, securityItem, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PISecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntryByNameAsync(String name, String webId, String securityItem, String selectedFields, final ApiCallback<PISecurityEntry> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, securityItem, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntryByNameCall(String name, String webId, String securityItem, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
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
	 * Update a security entry owned by the asset database. 
	 *
	 */
	public void updateSecurityEntry(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		updateSecurityEntryWithHttpInfo(name, webId, securityEntry, applyToChildren, securityItem);
	}

	/**
	 * Update a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateSecurityEntryWithHttpInfo(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren, securityItem,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call updateSecurityEntryAsync(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren, securityItem, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateSecurityEntryCall(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Delete a security entry owned by the asset database. 
	 *
	 */
	public void deleteSecurityEntry(String name, String webId, Boolean applyToChildren, String securityItem) throws ApiException {
		deleteSecurityEntryWithHttpInfo(name, webId, applyToChildren, securityItem);
	}

	/**
	 * Delete a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteSecurityEntryWithHttpInfo(String name, String webId, Boolean applyToChildren, String securityItem) throws ApiException {
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren, securityItem,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call deleteSecurityEntryAsync(String name, String webId, Boolean applyToChildren, String securityItem, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren, securityItem, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call deleteSecurityEntryCall(String name, String webId, Boolean applyToChildren, String securityItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Retrieve table categories for a given Asset Database. 
	 *
	 */
	public PIItemsTableCategory getTableCategories(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsTableCategory> resp = getTableCategoriesWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve table categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsTableCategory> getTableCategoriesWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getTableCategoriesCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsTableCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve table categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getTableCategoriesAsync(String webId, String selectedFields, final ApiCallback<PIItemsTableCategory> callback) throws ApiException {
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
		okhttp3.Call call = getTableCategoriesCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getTableCategoriesCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/tablecategories";
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
	 * Create a table category on the Asset Database. 
	 *
	 */
	public void createTableCategory(String webId, PITableCategory tableCategory) throws ApiException {
		createTableCategoryWithHttpInfo(webId, tableCategory);
	}

	/**
	 * Create a table category on the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createTableCategoryWithHttpInfo(String webId, PITableCategory tableCategory) throws ApiException {
		okhttp3.Call call = createTableCategoryCall(webId, tableCategory,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a table category on the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createTableCategoryAsync(String webId, PITableCategory tableCategory, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createTableCategoryCall(webId, tableCategory, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createTableCategoryCall(String webId, PITableCategory tableCategory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'tableCategory' is set
		if (tableCategory == null)
			throw new ApiException("Missing required parameter 'tableCategory'");
		String localVarPath = "/assetdatabases/{webId}/tablecategories";
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
		localVarPostBody =  tableCategory;
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
	 * Retrieve tables for given Asset Database. 
	 *
	 */
	public PIItemsTable getTables(String webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsTable> resp = getTablesWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Retrieve tables for given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsTable> getTablesWithHttpInfo(String webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getTablesCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsTable>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve tables for given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getTablesAsync(String webId, String selectedFields, final ApiCallback<PIItemsTable> callback) throws ApiException {
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
		okhttp3.Call call = getTablesCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getTablesCall(String webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/tables";
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
	 * Create a table on the Asset Database. 
	 *
	 */
	public void createTable(String webId, PITable table) throws ApiException {
		createTableWithHttpInfo(webId, table);
	}

	/**
	 * Create a table on the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createTableWithHttpInfo(String webId, PITable table) throws ApiException {
		okhttp3.Call call = createTableCall(webId, table,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a table on the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createTableAsync(String webId, PITable table, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createTableCall(webId, table, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createTableCall(String webId, PITable table, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'table' is set
		if (table == null)
			throw new ApiException("Missing required parameter 'table'");
		String localVarPath = "/assetdatabases/{webId}/tables";
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
		localVarPostBody =  table;
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

}
