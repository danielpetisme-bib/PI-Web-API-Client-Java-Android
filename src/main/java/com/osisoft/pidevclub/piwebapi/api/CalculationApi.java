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

public class CalculationApi {
	private ApiClient apiClient;
	public CalculationApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. 
	 *
	 */
	public PITimedValues getAtIntervals(String endTime, String expression, String sampleInterval, String selectedFields, String startTime, String webId) throws ApiException {
		ApiResponse<PITimedValues> resp = getAtIntervalsWithHttpInfo(endTime, expression, sampleInterval, selectedFields, startTime, webId);
		return resp.getData();
	}

	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getAtIntervalsWithHttpInfo(String endTime, String expression, String sampleInterval, String selectedFields, String startTime, String webId) throws ApiException {
		okhttp3.Call call = getAtIntervalsCall(endTime, expression, sampleInterval, selectedFields, startTime, webId,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtIntervalsAsync(String endTime, String expression, String sampleInterval, String selectedFields, String startTime, String webId, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getAtIntervalsCall(endTime, expression, sampleInterval, selectedFields, startTime, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtIntervalsCall(String endTime, String expression, String sampleInterval, String selectedFields, String startTime, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		String localVarPath = "/calculation/intervals";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
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
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. 
	 *
	 */
	public PITimedValues getAtRecorded(String endTime, String expression, String selectedFields, String startTime, String webId) throws ApiException {
		ApiResponse<PITimedValues> resp = getAtRecordedWithHttpInfo(endTime, expression, selectedFields, startTime, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getAtRecordedWithHttpInfo(String endTime, String expression, String selectedFields, String startTime, String webId) throws ApiException {
		okhttp3.Call call = getAtRecordedCall(endTime, expression, selectedFields, startTime, webId,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtRecordedAsync(String endTime, String expression, String selectedFields, String startTime, String webId, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getAtRecordedCall(endTime, expression, selectedFields, startTime, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtRecordedCall(String endTime, String expression, String selectedFields, String startTime, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		String localVarPath = "/calculation/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
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
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. 
	 *
	 */
	public PIItemsSummaryValue getSummary(String calculationBasis, String endTime, String expression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId) throws ApiException {
		ApiResponse<PIItemsSummaryValue> resp = getSummaryWithHttpInfo(calculationBasis, endTime, expression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsSummaryValue> getSummaryWithHttpInfo(String calculationBasis, String endTime, String expression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId) throws ApiException {
		okhttp3.Call call = getSummaryCall(calculationBasis, endTime, expression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId,null,null);
		Type localVarReturnType = new TypeToken<PIItemsSummaryValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummaryAsync(String calculationBasis, String endTime, String expression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId, final ApiCallback<PIItemsSummaryValue> callback) throws ApiException {
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
		okhttp3.Call call = getSummaryCall(calculationBasis, endTime, expression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummaryCall(String calculationBasis, String endTime, String expression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		String localVarPath = "/calculation/summary";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
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
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
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
	 * Returns the result of evaluating the expression at the specified timestamps. 
	 *
	 */
	public PITimedValues getAtTimes(String expression, String selectedFields, String sortOrder, List<String> time, String webId) throws ApiException {
		ApiResponse<PITimedValues> resp = getAtTimesWithHttpInfo(expression, selectedFields, sortOrder, time, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression at the specified timestamps. (with HTTP information)
	 *
	 */
	public ApiResponse<PITimedValues> getAtTimesWithHttpInfo(String expression, String selectedFields, String sortOrder, List<String> time, String webId) throws ApiException {
		okhttp3.Call call = getAtTimesCall(expression, selectedFields, sortOrder, time, webId,null,null);
		Type localVarReturnType = new TypeToken<PITimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression at the specified timestamps. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtTimesAsync(String expression, String selectedFields, String sortOrder, List<String> time, String webId, final ApiCallback<PITimedValues> callback) throws ApiException {
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
		okhttp3.Call call = getAtTimesCall(expression, selectedFields, sortOrder, time, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtTimesCall(String expression, String selectedFields, String sortOrder, List<String> time, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		String localVarPath = "/calculation/times";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
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

}
