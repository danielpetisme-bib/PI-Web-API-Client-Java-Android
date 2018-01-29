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

public class StreamApi {
	private ApiClient apiClient;
	public StreamApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Opens a channel that will send messages about any value changes for the specified stream. 
	 *
	 */
	public PIItemsStreamValues getChannel(String webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType) throws ApiException {
		ApiResponse<PIItemsStreamValues> resp = getChannelWithHttpInfo(webId, heartbeatRate, includeInitialValues, webIdType);
		return resp.getData();
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified stream. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsStreamValues> getChannelWithHttpInfo(String webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType) throws ApiException {
		okhttp3.Call call = getChannelCall(webId, heartbeatRate, includeInitialValues, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified stream. (asynchronously)
	 *
	 */
	public okhttp3.Call getChannelAsync(String webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType, final ApiCallback<PIItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getChannelCall(webId, heartbeatRate, includeInitialValues, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getChannelCall(String webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/channel";
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
		if (heartbeatRate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "heartbeatRate", heartbeatRate));
		if (includeInitialValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeInitialValues", includeInitialValues));
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
	 * Returns the end-of-stream value of the stream. 
	 *
	 */
	public PITimedValue getEnd(String webId, String desiredUnits, String selectedFields) throws ApiException {
		ApiResponse<PITimedValue> resp = getEndWithHttpInfo(webId, desiredUnits, selectedFields);
		return resp.getData();
	}

	/**
	 * Returns the end-of-stream value of the stream. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValue> getEndWithHttpInfo(String webId, String desiredUnits, String selectedFields) throws ApiException {
		okhttp3.Call call = getEndCall(webId, desiredUnits, selectedFields,null,null);
		Type localVarReturnType = new TypeToken<PITimedValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the end-of-stream value of the stream. (asynchronously)
	 *
	 */
	public okhttp3.Call getEndAsync(String webId, String desiredUnits, String selectedFields, final ApiCallback<PITimedValue> callback) throws ApiException {
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
		okhttp3.Call call = getEndCall(webId, desiredUnits, selectedFields, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEndCall(String webId, String desiredUnits, String selectedFields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/end";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. 
	 *
	 */
	public PITimedValues getInterpolated(String webId, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone) throws ApiException {
		ApiResponse<PITimedValues> resp = getInterpolatedWithHttpInfo(webId, desiredUnits, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, syncTime, syncTimeBoundaryType, timeZone);
		return resp.getData();
	}

	/**
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getInterpolatedWithHttpInfo(String webId, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedCall(webId, desiredUnits, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, syncTime, syncTimeBoundaryType, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAsync(String webId, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedCall(webId, desiredUnits, endTime, filterExpression, includeFilteredValues, interval, selectedFields, startTime, syncTime, syncTimeBoundaryType, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedCall(String webId, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/interpolated";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
		if (syncTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTime", syncTime));
		if (syncTimeBoundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTimeBoundaryType", syncTimeBoundaryType));
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
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. 
	 *
	 */
	public PITimedValues getInterpolatedAtTimes(String webId, String desiredUnits, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, List<String> time, String timeZone) throws ApiException {
		ApiResponse<PITimedValues> resp = getInterpolatedAtTimesWithHttpInfo(webId, desiredUnits, filterExpression, includeFilteredValues, selectedFields, sortOrder, time, timeZone);
		return resp.getData();
	}

	/**
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getInterpolatedAtTimesWithHttpInfo(String webId, String desiredUnits, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, List<String> time, String timeZone) throws ApiException {
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, desiredUnits, filterExpression, includeFilteredValues, selectedFields, sortOrder, time, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves interpolated values over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAtTimesAsync(String webId, String desiredUnits, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, List<String> time, String timeZone, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, desiredUnits, filterExpression, includeFilteredValues, selectedFields, sortOrder, time, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAtTimesCall(String webId, String desiredUnits, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, List<String> time, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/interpolatedattimes";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
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
	 * Retrieves values over the specified time range suitable for plotting over the number of intervals (typically represents pixels). 
	 *
	 */
	public PITimedValues getPlot(String webId, String desiredUnits, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone) throws ApiException {
		ApiResponse<PITimedValues> resp = getPlotWithHttpInfo(webId, desiredUnits, endTime, intervals, selectedFields, startTime, timeZone);
		return resp.getData();
	}

	/**
	 * Retrieves values over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getPlotWithHttpInfo(String webId, String desiredUnits, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone) throws ApiException {
		okhttp3.Call call = getPlotCall(webId, desiredUnits, endTime, intervals, selectedFields, startTime, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves values over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (asynchronously)
	 *
	 */
	public okhttp3.Call getPlotAsync(String webId, String desiredUnits, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getPlotCall(webId, desiredUnits, endTime, intervals, selectedFields, startTime, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getPlotCall(String webId, String desiredUnits, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/plot";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
	 * Returns a list of compressed values for the requested time range from the source provider. 
	 *
	 */
	public PITimedValues getRecorded(String webId, String boundaryType, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone) throws ApiException {
		ApiResponse<PITimedValues> resp = getRecordedWithHttpInfo(webId, boundaryType, desiredUnits, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone);
		return resp.getData();
	}

	/**
	 * Returns a list of compressed values for the requested time range from the source provider. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getRecordedWithHttpInfo(String webId, String boundaryType, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedCall(webId, boundaryType, desiredUnits, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns a list of compressed values for the requested time range from the source provider. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAsync(String webId, String boundaryType, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedCall(webId, boundaryType, desiredUnits, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedCall(String webId, String boundaryType, String desiredUnits, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/recorded";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
	 * Updates multiple values for the specified stream. 
	 *
	 */
	public PIItemsSubstatus updateValues(String webId, List<PITimedValue> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PIItemsSubstatus> resp = updateValuesWithHttpInfo(webId, values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates multiple values for the specified stream. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSubstatus> updateValuesWithHttpInfo(String webId, List<PITimedValue> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValuesCall(webId, values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates multiple values for the specified stream. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValuesAsync(String webId, List<PITimedValue> values, String bufferOption, String updateOption, final ApiCallback<PIItemsSubstatus> callback) throws ApiException {
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

	private okhttp3.Call updateValuesCall(String webId, List<PITimedValue> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streams/{webId}/recorded";
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
	 * Returns a single recorded value based on the passed time and retrieval mode from the stream. 
	 *
	 */
	public PITimedValue getRecordedAtTime(String webId, String time, String desiredUnits, String retrievalMode, String selectedFields, String timeZone) throws ApiException {
		ApiResponse<PITimedValue> resp = getRecordedAtTimeWithHttpInfo(webId, time, desiredUnits, retrievalMode, selectedFields, timeZone);
		return resp.getData();
	}

	/**
	 * Returns a single recorded value based on the passed time and retrieval mode from the stream. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValue> getRecordedAtTimeWithHttpInfo(String webId, String time, String desiredUnits, String retrievalMode, String selectedFields, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, desiredUnits, retrievalMode, selectedFields, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns a single recorded value based on the passed time and retrieval mode from the stream. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimeAsync(String webId, String time, String desiredUnits, String retrievalMode, String selectedFields, String timeZone, final ApiCallback<PITimedValue> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, desiredUnits, retrievalMode, selectedFields, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimeCall(String webId, String time, String desiredUnits, String retrievalMode, String selectedFields, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streams/{webId}/recordedattime";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
	 * Retrieves recorded values at the specified times. 
	 *
	 */
	public PITimedValues getRecordedAtTimes(String webId, String desiredUnits, String retrievalMode, String selectedFields, String sortOrder, List<String> time, String timeZone) throws ApiException {
		ApiResponse<PITimedValues> resp = getRecordedAtTimesWithHttpInfo(webId, desiredUnits, retrievalMode, selectedFields, sortOrder, time, timeZone);
		return resp.getData();
	}

	/**
	 * Retrieves recorded values at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getRecordedAtTimesWithHttpInfo(String webId, String desiredUnits, String retrievalMode, String selectedFields, String sortOrder, List<String> time, String timeZone) throws ApiException {
		okhttp3.Call call = getRecordedAtTimesCall(webId, desiredUnits, retrievalMode, selectedFields, sortOrder, time, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves recorded values at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimesAsync(String webId, String desiredUnits, String retrievalMode, String selectedFields, String sortOrder, List<String> time, String timeZone, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimesCall(webId, desiredUnits, retrievalMode, selectedFields, sortOrder, time, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimesCall(String webId, String desiredUnits, String retrievalMode, String selectedFields, String sortOrder, List<String> time, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/recordedattimes";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
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
	 * Returns a summary over the specified time range for the stream. 
	 *
	 */
	public PIItemsSummaryValue getSummary(String webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone) throws ApiException {
		ApiResponse<PIItemsSummaryValue> resp = getSummaryWithHttpInfo(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone);
		return resp.getData();
	}

	/**
	 * Returns a summary over the specified time range for the stream. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSummaryValue> getSummaryWithHttpInfo(String webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone) throws ApiException {
		okhttp3.Call call = getSummaryCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSummaryValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns a summary over the specified time range for the stream. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummaryAsync(String webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, final ApiCallback<PIItemsSummaryValue> callback) throws ApiException {
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
		okhttp3.Call call = getSummaryCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummaryCall(String webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/summary";
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
	 * Returns the value of the stream at the specified time. By default, this is usually the current value. 
	 *
	 */
	public PITimedValue getValue(String webId, String desiredUnits, String selectedFields, String time, String timeZone) throws ApiException {
		ApiResponse<PITimedValue> resp = getValueWithHttpInfo(webId, desiredUnits, selectedFields, time, timeZone);
		return resp.getData();
	}

	/**
	 * Returns the value of the stream at the specified time. By default, this is usually the current value. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValue> getValueWithHttpInfo(String webId, String desiredUnits, String selectedFields, String time, String timeZone) throws ApiException {
		okhttp3.Call call = getValueCall(webId, desiredUnits, selectedFields, time, timeZone,null,null);
		Type localVarReturnType = new TypeToken<PITimedValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the value of the stream at the specified time. By default, this is usually the current value. (asynchronously)
	 *
	 */
	public okhttp3.Call getValueAsync(String webId, String desiredUnits, String selectedFields, String time, String timeZone, final ApiCallback<PITimedValue> callback) throws ApiException {
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
		okhttp3.Call call = getValueCall(webId, desiredUnits, selectedFields, time, timeZone, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValueCall(String webId, String desiredUnits, String selectedFields, String time, String timeZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streams/{webId}/value";
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
		if (desiredUnits != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "desiredUnits", desiredUnits));
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
	 * Updates a value for the specified stream. 
	 *
	 */
	public void updateValue(String webId, PITimedValue value, String bufferOption, String updateOption, String webIdType) throws ApiException {
		updateValueWithHttpInfo(webId, value, bufferOption, updateOption, webIdType);
	}

	/**
	 * Updates a value for the specified stream. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateValueWithHttpInfo(String webId, PITimedValue value, String bufferOption, String updateOption, String webIdType) throws ApiException {
		okhttp3.Call call = updateValueCall(webId, value, bufferOption, updateOption, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Updates a value for the specified stream. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValueAsync(String webId, PITimedValue value, String bufferOption, String updateOption, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = updateValueCall(webId, value, bufferOption, updateOption, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValueCall(String webId, PITimedValue value, String bufferOption, String updateOption, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'value' is set
		if (value == null)
			throw new ApiException("Missing required parameter 'value'");
		String localVarPath = "/streams/{webId}/value";
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
		localVarPostBody =  value;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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

}
