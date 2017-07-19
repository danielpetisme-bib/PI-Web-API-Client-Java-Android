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

public class StreamSetApi {
	private ApiClient apiClient;
	public StreamSetApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. 
	 *
	 */
	public PIItemsStreamValue getChannel(String webId, String categoryName, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getChannelWithHttpInfo(webId, categoryName, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName);
		return resp.getData();
	}

	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getChannelWithHttpInfo(String webId, String categoryName, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName) throws ApiException {
		okhttp3.Call call = getChannelCall(webId, categoryName, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getChannelAsync(String webId, String categoryName, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getChannelCall(webId, categoryName, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getChannelCall(String webId, String categoryName, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/channel";
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
		if (includeInitialValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeInitialValues", includeInitialValues));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
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
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute 
	 *
	 */
	public PIItemsStreamValue getEnd(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getEndWithHttpInfo(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName);
		return resp.getData();
	}

	/**
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getEndWithHttpInfo(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName) throws ApiException {
		okhttp3.Call call = getEndCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute (asynchronously)
	 *
	 */
	public okhttp3.Call getEndAsync(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getEndCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEndCall(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/end";
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
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
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
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. 
	 *
	 */
	public PIItemsStreamValues getInterpolated(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getInterpolatedWithHttpInfo(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getInterpolatedWithHttpInfo(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedCall(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAsync(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedCall(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedCall(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/interpolated";
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
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (interval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "interval", interval));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. 
	 *
	 */
	public PIItemsStreamValues getInterpolatedAtTimes(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getInterpolatedAtTimesWithHttpInfo(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getInterpolatedAtTimesWithHttpInfo(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAtTimesAsync(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAtTimesCall(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/interpolatedattimes";
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
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). 
	 *
	 */
	public PIItemsStreamValues getPlot(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getPlotWithHttpInfo(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getPlotWithHttpInfo(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getPlotCall(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (asynchronously)
	 *
	 */
	public okhttp3.Call getPlotAsync(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getPlotCall(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getPlotCall(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/plot";
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
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (intervals != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervals", intervals));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns recorded values of the attributes for an element, event frame, or attribute. 
	 *
	 */
	public PIItemsStreamValues getRecorded(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getRecordedWithHttpInfo(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getRecordedWithHttpInfo(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedCall(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAsync(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedCall(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedCall(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/recorded";
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
		if (boundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "boundaryType", boundaryType));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Updates multiple values for the specified streams. 
	 *
	 */
	public PIItemsItemsSubstatus updateValues(String webId, List<PIStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PIItemsItemsSubstatus> resp = updateValuesWithHttpInfo(webId, values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates multiple values for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsItemsSubstatus> updateValuesWithHttpInfo(String webId, List<PIStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValuesCall(webId, values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PIItemsItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates multiple values for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValuesAsync(String webId, List<PIStreamValues> values, String bufferOption, String updateOption, final ApiCallback<PIItemsItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValuesCall(webId, values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValuesCall(String webId, List<PIStreamValues> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/{webId}/recorded";
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
		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
	 * Returns recorded values of the attributes for an element, event frame, or attribute. 
	 *
	 */
	public PIItemsStreamValues getRecordedAtTime(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getRecordedAtTimeWithHttpInfo(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getRecordedAtTimeWithHttpInfo(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimeAsync(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimeCall(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/recordedattime";
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
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. 
	 *
	 */
	public PIItemsStreamValues getRecordedAtTimes(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getRecordedAtTimesWithHttpInfo(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getRecordedAtTimesWithHttpInfo(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimesCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimesAsync(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimesCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimesCall(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/recordedattimes";
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
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns summary values of the attributes for an element, event frame or attribute. 
	 *
	 */
	public PIItemsStreamSummaries getSummaries(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamSummaries> resp = getSummariesWithHttpInfo(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone);
		return resp.getData();
	}

	/**
	 * Returns summary values of the attributes for an element, event frame or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamSummaries> getSummariesWithHttpInfo(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone) throws ApiException {
		okhttp3.Call call = getSummariesCall(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamSummaries>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns summary values of the attributes for an element, event frame or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummariesAsync(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, final ApiCallback<PIItemsStreamSummaries> callback) throws ApiException {
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
		okhttp3.Call call = getSummariesCall(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummariesCall(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/summary";
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
		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (sampleType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleType", sampleType));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (summaryDuration != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryDuration", summaryDuration));
		if (summaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryType", summaryType));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeType", timeType));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. 
	 *
	 */
	public PIItemsStreamValue getValues(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String time, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getValuesWithHttpInfo(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, time, timeZone);
		return resp.getData();
	}

	/**
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getValuesWithHttpInfo(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String time, String timeZone) throws ApiException {
		okhttp3.Call call = getValuesCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, time, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. (asynchronously)
	 *
	 */
	public okhttp3.Call getValuesAsync(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String time, String timeZone, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getValuesCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, time, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValuesCall(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String time, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/value";
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
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Updates a single value for the specified streams. 
	 *
	 */
	public PIItemsSubstatus updateValue(String webId, List<PIStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PIItemsSubstatus> resp = updateValueWithHttpInfo(webId, values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates a single value for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSubstatus> updateValueWithHttpInfo(String webId, List<PIStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValueCall(webId, values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates a single value for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValueAsync(String webId, List<PIStreamValue> values, String bufferOption, String updateOption, final ApiCallback<PIItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValueCall(webId, values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValueCall(String webId, List<PIStreamValue> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/{webId}/value";
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
		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
	 * Opens a channel that will send messages about any value changes for the specified streams. 
	 *
	 */
	public PIItemsStreamValue getChannelAdHoc(List<String> webId, Boolean includeInitialValues) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getChannelAdHocWithHttpInfo(webId, includeInitialValues);
		return resp.getData();
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getChannelAdHocWithHttpInfo(List<String> webId, Boolean includeInitialValues) throws ApiException {
		okhttp3.Call call = getChannelAdHocCall(webId, includeInitialValues,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getChannelAdHocAsync(List<String> webId, Boolean includeInitialValues, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getChannelAdHocCall(webId, includeInitialValues, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getChannelAdHocCall(List<String> webId, Boolean includeInitialValues, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/channel";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (includeInitialValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeInitialValues", includeInitialValues));
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
	 * Returns End Of Stream values for attributes of the specified streams 
	 *
	 */
	public PIItemsStreamValues getEndAdHoc(List<String> webId, String selectedFields) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getEndAdHocWithHttpInfo(webId, selectedFields);
		return resp.getData();
	}

	/**
	 * Returns End Of Stream values for attributes of the specified streams (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getEndAdHocWithHttpInfo(List<String> webId, String selectedFields) throws ApiException {
		okhttp3.Call call = getEndAdHocCall(webId, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns End Of Stream values for attributes of the specified streams (asynchronously)
	 *
	 */
	public okhttp3.Call getEndAdHocAsync(List<String> webId, String selectedFields, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getEndAdHocCall(webId, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEndAdHocCall(List<String> webId, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/end";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
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
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. 
	 *
	 */
	public PIItemsStreamValues getInterpolatedAdHoc(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getInterpolatedAdHocWithHttpInfo(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, timeZone);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getInterpolatedAdHocWithHttpInfo(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedAdHocCall(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAdHocAsync(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAdHocCall(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAdHocCall(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/interpolated";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (interval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "interval", interval));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns interpolated values of the specified streams at the specified times. 
	 *
	 */
	public PIItemsStreamValues getInterpolatedAtTimesAdHoc(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getInterpolatedAtTimesAdHocWithHttpInfo(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of the specified streams at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getInterpolatedAtTimesAdHocWithHttpInfo(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedAtTimesAdHocCall(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of the specified streams at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAtTimesAdHocAsync(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAtTimesAdHocCall(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAtTimesAdHocCall(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/interpolatedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). 
	 *
	 */
	public PIItemsStreamValues getPlotAdHoc(List<String> webId, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getPlotAdHocWithHttpInfo(webId, endTime, intervals, selectedFields, startTime, timeZone);
		return resp.getData();
	}

	/**
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getPlotAdHocWithHttpInfo(List<String> webId, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone) throws ApiException {
		okhttp3.Call call = getPlotAdHocCall(webId, endTime, intervals, selectedFields, startTime, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (asynchronously)
	 *
	 */
	public okhttp3.Call getPlotAdHocAsync(List<String> webId, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getPlotAdHocCall(webId, endTime, intervals, selectedFields, startTime, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getPlotAdHocCall(List<String> webId, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/plot";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (intervals != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervals", intervals));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns recorded values of the specified streams. 
	 *
	 */
	public PIItemsStreamValues getRecordedAdHoc(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getRecordedAdHocWithHttpInfo(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getRecordedAdHocWithHttpInfo(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAdHocCall(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAdHocAsync(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAdHocCall(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAdHocCall(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (boundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "boundaryType", boundaryType));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Updates multiple values for the specified streams. 
	 *
	 */
	public PIItemsItemsSubstatus updateValuesAdHoc(List<PIStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PIItemsItemsSubstatus> resp = updateValuesAdHocWithHttpInfo(values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates multiple values for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsItemsSubstatus> updateValuesAdHocWithHttpInfo(List<PIStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValuesAdHocCall(values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PIItemsItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates multiple values for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValuesAdHocAsync(List<PIStreamValues> values, String bufferOption, String updateOption, final ApiCallback<PIItemsItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValuesAdHocCall(values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValuesAdHocCall(List<PIStreamValues> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
	 * Returns recorded values based on the passed time and retrieval mode. 
	 *
	 */
	public PIItemsStreamValue getRecordedAtTimeAdHoc(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getRecordedAtTimeAdHocWithHttpInfo(time, webId, retrievalMode, selectedFields, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values based on the passed time and retrieval mode. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getRecordedAtTimeAdHocWithHttpInfo(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimeAdHocCall(time, webId, retrievalMode, selectedFields, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values based on the passed time and retrieval mode. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimeAdHocAsync(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimeAdHocCall(time, webId, retrievalMode, selectedFields, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimeAdHocCall(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recordedattime";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns recorded values of the specified streams at the specified times. 
	 *
	 */
	public PIItemsStreamValues getRecordedAtTimesAdHoc(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getRecordedAtTimesAdHocWithHttpInfo(time, webId, retrievalMode, selectedFields, sortOrder, timeZone);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the specified streams at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getRecordedAtTimesAdHocWithHttpInfo(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimesAdHocCall(time, webId, retrievalMode, selectedFields, sortOrder, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the specified streams at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimesAdHocAsync(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimesAdHocCall(time, webId, retrievalMode, selectedFields, sortOrder, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimesAdHocCall(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recordedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns summary values of the specified streams. 
	 *
	 */
	public PIItemsStreamSummaries getSummariesAdHoc(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamSummaries> resp = getSummariesAdHocWithHttpInfo(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone);
		return resp.getData();
	}

	/**
	 * Returns summary values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamSummaries> getSummariesAdHocWithHttpInfo(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone) throws ApiException {
		okhttp3.Call call = getSummariesAdHocCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamSummaries>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns summary values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummariesAdHocAsync(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, final ApiCallback<PIItemsStreamSummaries> callback) throws ApiException {
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
		okhttp3.Call call = getSummariesAdHocCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummariesAdHocCall(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/summary";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (sampleType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleType", sampleType));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (summaryDuration != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryDuration", summaryDuration));
		if (summaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryType", summaryType));
		if (timeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeType", timeType));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Returns values of the specified streams. 
	 *
	 */
	public PIItemsStreamValue getValuesAdHoc(List<String> webId, String selectedFields, String time, String timeZone) throws ApiException {
		ApiResponse<PIItemsStreamValue> resp = getValuesAdHocWithHttpInfo(webId, selectedFields, time, timeZone);
		return resp.getData();
	}

	/**
	 * Returns values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValue> getValuesAdHocWithHttpInfo(List<String> webId, String selectedFields, String time, String timeZone) throws ApiException {
		okhttp3.Call call = getValuesAdHocCall(webId, selectedFields, time, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getValuesAdHocAsync(List<String> webId, String selectedFields, String time, String timeZone, final ApiCallback<PIItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getValuesAdHocCall(webId, selectedFields, time, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValuesAdHocCall(List<String> webId, String selectedFields, String time, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
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
	 * Updates a single value for the specified streams. 
	 *
	 */
	public PIItemsSubstatus updateValueAdHoc(List<PIStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PIItemsSubstatus> resp = updateValueAdHocWithHttpInfo(values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates a single value for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSubstatus> updateValueAdHocWithHttpInfo(List<PIStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValueAdHocCall(values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates a single value for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValueAdHocAsync(List<PIStreamValue> values, String bufferOption, String updateOption, final ApiCallback<PIItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValueAdHocCall(values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValueAdHocCall(List<PIStreamValue> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
