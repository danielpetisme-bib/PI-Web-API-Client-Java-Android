# StreamSetApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getChannel**](StreamSetApi.md#getchannel) | **GET** /streamsets/{webId}/channel | Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute.
[**getEnd**](StreamSetApi.md#getend) | **GET** /streamsets/{webId}/end | Returns End of stream values of the attributes for an Element, Event Frame or Attribute
[**getInterpolated**](StreamSetApi.md#getinterpolated) | **GET** /streamsets/{webId}/interpolated | Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval.
[**getInterpolatedAtTimes**](StreamSetApi.md#getinterpolatedattimes) | **GET** /streamsets/{webId}/interpolatedattimes | Returns interpolated values of attributes for an element, event frame or attribute at the specified times.
[**getPlot**](StreamSetApi.md#getplot) | **GET** /streamsets/{webId}/plot | Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels).
[**getRecorded**](StreamSetApi.md#getrecorded) | **GET** /streamsets/{webId}/recorded | Returns recorded values of the attributes for an element, event frame, or attribute.
[**updateValues**](StreamSetApi.md#updatevalues) | **POST** /streamsets/{webId}/recorded | Updates multiple values for the specified streams.
[**getRecordedAtTime**](StreamSetApi.md#getrecordedattime) | **GET** /streamsets/{webId}/recordedattime | Returns recorded values of the attributes for an element, event frame, or attribute.
[**getRecordedAtTimes**](StreamSetApi.md#getrecordedattimes) | **GET** /streamsets/{webId}/recordedattimes | Returns recorded values of attributes for an element, event frame or attribute at the specified times.
[**getSummaries**](StreamSetApi.md#getsummaries) | **GET** /streamsets/{webId}/summary | Returns summary values of the attributes for an element, event frame or attribute.
[**getValues**](StreamSetApi.md#getvalues) | **GET** /streamsets/{webId}/value | Returns values of the attributes for an Element, Event Frame or Attribute at the specified time.
[**updateValue**](StreamSetApi.md#updatevalue) | **POST** /streamsets/{webId}/value | Updates a single value for the specified streams.
[**getChannelAdHoc**](StreamSetApi.md#getchanneladhoc) | **GET** /streamsets/channel | Opens a channel that will send messages about any value changes for the specified streams.
[**getEndAdHoc**](StreamSetApi.md#getendadhoc) | **GET** /streamsets/end | Returns End Of Stream values for attributes of the specified streams
[**getInterpolatedAdHoc**](StreamSetApi.md#getinterpolatedadhoc) | **GET** /streamsets/interpolated | Returns interpolated values of the specified streams over the specified time range at the specified sampling interval.
[**getInterpolatedAtTimesAdHoc**](StreamSetApi.md#getinterpolatedattimesadhoc) | **GET** /streamsets/interpolatedattimes | Returns interpolated values of the specified streams at the specified times.
[**getPlotAdHoc**](StreamSetApi.md#getplotadhoc) | **GET** /streamsets/plot | Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels).
[**getRecordedAdHoc**](StreamSetApi.md#getrecordedadhoc) | **GET** /streamsets/recorded | Returns recorded values of the specified streams.
[**updateValuesAdHoc**](StreamSetApi.md#updatevaluesadhoc) | **POST** /streamsets/recorded | Updates multiple values for the specified streams.
[**getRecordedAtTimeAdHoc**](StreamSetApi.md#getrecordedattimeadhoc) | **GET** /streamsets/recordedattime | Returns recorded values based on the passed time and retrieval mode.
[**getRecordedAtTimesAdHoc**](StreamSetApi.md#getrecordedattimesadhoc) | **GET** /streamsets/recordedattimes | Returns recorded values of the specified streams at the specified times.
[**getSummariesAdHoc**](StreamSetApi.md#getsummariesadhoc) | **GET** /streamsets/summary | Returns summary values of the specified streams.
[**getValuesAdHoc**](StreamSetApi.md#getvaluesadhoc) | **GET** /streamsets/value | Returns values of the specified streams.
[**updateValueAdHoc**](StreamSetApi.md#updatevalueadhoc) | **POST** /streamsets/value | Updates a single value for the specified streams.


# **getChannel**
> getChannel(String webId, String categoryName, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName)

Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an Element, Event Frame or Attribute, which is the base element or parent of all the stream attributes.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **includeInitialValues** | **Boolean**| Specified if the channel should send a message with the current values of all the streams after the connection is opened. The default is 'false'.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getEnd**
> getEnd(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName)

Returns End of stream values of the attributes for an Element, Event Frame or Attribute

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an Element, Event Frame or Attribute, which is the base element or parent of all the stream attributes.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getInterpolated**
> getInterpolated(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone)

Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*' for element attributes and points. For event frame attributes, the default is the event frame's end time, or '*' if that is not set. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. If the attribute does not support filtering, the filter will be ignored. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **interval** | **String**| The sampling interval, in AFTimeSpan format.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d' for element attributes and points. For event frame attributes, the default is the event frame's start time, or '*-1d' if that is not set.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getInterpolatedAtTimes**
> getInterpolatedAtTimes(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone)

Returns interpolated values of attributes for an element, event frame or attribute at the specified times.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **time** | **List<String>**| The timestamp at which to retrieve a interpolated value. Multiple timestamps may be specified with multiple instances of the parameter.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. If the attribute does not support filtering, the filter will be ignored. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getPlot**
> getPlot(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone)

Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels).

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*' for element attributes and points. For event frame attributes, the default is the event frame's end time, or '*' if that is not set. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **intervals** | **Integer**| The number of intervals to plot over. Typically, this would be the number of horizontal pixels in the trend. The default is '24'. For each interval, the data available is examined and significant values are returned. Each interval can produce up to 5 values if they are unique, the first value in the interval, the last value, the highest value, the lowest value and at most one exceptional point (bad status or digital state).. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d' for element attributes and points. For event frame attributes, the default is the event frame's start time, or '*-1d' if that is not set.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecorded**
> getRecorded(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String templateName, String timeZone)

Returns recorded values of the attributes for an element, event frame, or attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **boundaryType** | **String**| An optional value that determines how the times and values of the returned end points are determined. The default is 'Inside'.. | [optional]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*' for element attributes and points. For event frame attributes, the default is the event frame's end time, or '*' if that is not set. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **maxCount** | **Integer**| The maximum number of values to be returned. The default is 1000.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d' for element attributes and points. For event frame attributes, the default is the event frame's start time, or '*-1d' if that is not set.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateValues**
> updateValues(String webId, List<PIStreamValues> values, String bufferOption, String updateOption)

Updates multiple values for the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the parent element, event frame, or attribute. Attributes specified in the body must be descendants of the specified object.. | [required]
 **values** | **List<PIStreamValues>**| The values to add or update.. | [required]
 **bufferOption** | **String**| The desired AFBufferOption. The default is 'BufferIfPossible'.. | [optional]
 **updateOption** | **String**| The desired AFUpdateOption. The default is 'Replace'.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecordedAtTime**
> getRecordedAtTime(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone)

Returns recorded values of the attributes for an element, event frame, or attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **time** | **String**| The timestamp at which the values are desired.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **retrievalMode** | **String**| An optional value that determines the values to return when values don't exist at the exact time specified. The default is 'Auto'.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecordedAtTimes**
> getRecordedAtTimes(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone)

Returns recorded values of attributes for an element, event frame or attribute at the specified times.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **time** | **List<String>**| The timestamp at which to retrieve a recorded value. Multiple timestamps may be specified with multiple instances of the parameter.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **retrievalMode** | **String**| An optional value that determines the values to return when values don't exist at the exact time specified. The default is 'Auto'.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getSummaries**
> getSummaries(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone)

Returns summary values of the attributes for an element, event frame or attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an element, event frame or attribute, which is the base element or parent of all the stream attributes.. | [required]
 **calculationBasis** | **String**| Specifies the method of evaluating the data over the time range. The default is 'TimeWeighted'.. | [optional]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*' for element attributes and points. For event frame attributes, the default is the event frame's end time, or '*' if that is not set. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| A string containing a filter expression. Expression variables are relative to the attribute. Use '.' to reference the containing attribute. The default is no filtering.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **sampleInterval** | **String**| A time span specifies how often the filter expression is evaluated when computing the summary for an interval, if the sampleType is 'Interval'.. | [optional]
 **sampleType** | **String**| A flag which specifies one or more summaries to compute for each interval over the time range. The default is 'ExpressionRecordedValues'.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d' for element attributes and points. For event frame attributes, the default is the event frame's start time, or '*-1d' if that is not set.. | [optional]
 **summaryDuration** | **String**| The duration of each summary interval.. | [optional]
 **summaryType** | **List<String>**| Specifies the kinds of summaries to produce over the range. The default is 'Total'. Multiple summary types may be specified by using multiple instances of summaryType.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **timeType** | **String**| Specifies how to calculate the timestamp for each interval. The default is 'Auto'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getValues**
> getValues(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String time, String timeZone)

Returns values of the attributes for an Element, Event Frame or Attribute at the specified time.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of an Element, Event Frame or Attribute, which is the base element or parent of all the stream attributes.. | [required]
 **categoryName** | **String**| Specify that included attributes must have this category. The default is no category filter.. | [optional]
 **nameFilter** | **String**| The name query string used for filtering attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **templateName** | **String**| Specify that included attributes must be members of this template. The default is no template filter.. | [optional]
 **time** | **String**| An AF time string, which is used as the time context to get stream values if it is provided. By default, it is not specified, and the default time context of the AF object will be used.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateValue**
> updateValue(String webId, List<PIStreamValue> values, String bufferOption, String updateOption)

Updates a single value for the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the parent element, event frame, or attribute. Attributes specified in the body must be descendants of the specified object.. | [required]
 **values** | **List<PIStreamValue>**| The values to add or update.. | [required]
 **bufferOption** | **String**| The desired AFBufferOption. The default is 'BufferIfPossible'.. | [optional]
 **updateOption** | **String**| The desired AFUpdateOption. The default is 'Replace'.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getChannelAdHoc**
> getChannelAdHoc(List<String> webId, Boolean includeInitialValues)

Opens a channel that will send messages about any value changes for the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **includeInitialValues** | **Boolean**| Specified if the channel should send a message with the current values of all the streams after the connection is opened. The default is 'false'.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getEndAdHoc**
> getEndAdHoc(List<String> webId, String selectedFields)

Returns End Of Stream values for attributes of the specified streams

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getInterpolatedAdHoc**
> getInterpolatedAdHoc(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String startTime, String timeZone)

Returns interpolated values of the specified streams over the specified time range at the specified sampling interval.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream. Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **endTime** | **String**| An optional end time. The default is '*'. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. If the attribute does not support filtering, the filter will be ignored. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **interval** | **String**| The sampling interval, in AFTimeSpan format.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getInterpolatedAtTimesAdHoc**
> getInterpolatedAtTimesAdHoc(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone)

Returns interpolated values of the specified streams at the specified times.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **time** | **List<String>**| The timestamp at which to retrieve a interpolated value. Multiple timestamps may be specified with multiple instances of the parameter.. | [required]
 **webId** | **List<String>**| The ID of a stream. Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. If the attribute does not support filtering, the filter will be ignored. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getPlotAdHoc**
> getPlotAdHoc(List<String> webId, String endTime, Integer intervals, String selectedFields, String startTime, String timeZone)

Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels).

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **endTime** | **String**| An optional end time. The default is '*'. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **intervals** | **Integer**| The number of intervals to plot over. Typically, this would be the number of horizontal pixels in the trend. The default is '24'. For each interval, the data available is examined and significant values are returned. Each interval can produce up to 5 values if they are unique, the first value in the interval, the last value, the highest value, the lowest value and at most one exceptional point (bad status or digital state).. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecordedAdHoc**
> getRecordedAdHoc(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone)

Returns recorded values of the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **boundaryType** | **String**| An optional value that determines how the times and values of the returned end points are determined. The default is 'Inside'.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*'. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| An optional string containing a filter expression. Expression variables are relative to the data point. Use '.' to reference the containing attribute. The default is no filtering.. | [optional]
 **includeFilteredValues** | **Boolean**| Specify 'true' to indicate that values which fail the filter criteria are present in the returned data at the times where they occurred with a value set to a 'Filtered' enumeration value with bad status. Repeated consecutive failures are omitted.. | [optional]
 **maxCount** | **Integer**| The maximum number of values to be returned. The default is 1000.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateValuesAdHoc**
> updateValuesAdHoc(List<PIStreamValues> values, String bufferOption, String updateOption)

Updates multiple values for the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **values** | **List<PIStreamValues>**| The values to add or update.. | [required]
 **bufferOption** | **String**| The desired AFBufferOption. The default is 'BufferIfPossible'.. | [optional]
 **updateOption** | **String**| The desired AFUpdateOption. The default is 'Replace'.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecordedAtTimeAdHoc**
> getRecordedAtTimeAdHoc(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone)

Returns recorded values based on the passed time and retrieval mode.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **time** | **String**| The timestamp at which the values are desired.. | [required]
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **retrievalMode** | **String**| An optional value that determines the values to return when values don't exist at the exact time specified. The default is 'Auto'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getRecordedAtTimesAdHoc**
> getRecordedAtTimesAdHoc(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone)

Returns recorded values of the specified streams at the specified times.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **time** | **List<String>**| The timestamp at which to retrieve a recorded value. Multiple timestamps may be specified with multiple instances of the parameter.. | [required]
 **webId** | **List<String>**| The ID of a stream. Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **retrievalMode** | **String**| An optional value that determines the values to return when values don't exist at the exact time specified. The default is 'Auto'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getSummariesAdHoc**
> getSummariesAdHoc(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone)

Returns summary values of the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **calculationBasis** | **String**| Specifies the method of evaluating the data over the time range. The default is 'TimeWeighted'.. | [optional]
 **endTime** | **String**| An optional end time. The default is '*'. Note that if endTime is earlier than startTime, the resulting values will be in time-descending order.. | [optional]
 **filterExpression** | **String**| A string containing a filter expression. Expression variables are relative to the attribute. Use '.' to reference the containing attribute. The default is no filtering.. | [optional]
 **sampleInterval** | **String**| A time span specifies how often the filter expression is evaluated when computing the summary for an interval, if the sampleType is 'Interval'.. | [optional]
 **sampleType** | **String**| A flag which specifies one or more summaries to compute for each interval over the time range. The default is 'ExpressionRecordedValues'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startTime** | **String**| An optional start time. The default is '*-1d'.. | [optional]
 **summaryDuration** | **String**| The duration of each summary interval.. | [optional]
 **summaryType** | **List<String>**| Specifies the kinds of summaries to produce over the range. The default is 'Total'. Multiple summary types may be specified by using multiple instances of summaryType.. | [optional]
 **timeType** | **String**| Specifies how to calculate the timestamp for each interval. The default is 'Auto'.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getValuesAdHoc**
> getValuesAdHoc(List<String> webId, String selectedFields, String time, String timeZone)

Returns values of the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **List<String>**| The ID of a stream.  Multiple streams may be specified with multiple instances of the parameter.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **time** | **String**| An AF time string, which is used as the time context to get stream values if it is provided. By default, it is not specified, and the default time context of the AF object will be used.. | [optional]
 **timeZone** | **String**| The time zone in which the time string will be interpreted. This parameter will be ignored if a time zone is specified in the time string. If no time zone is specified in either places, the PI Web API server time zone will be used.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateValueAdHoc**
> updateValueAdHoc(List<PIStreamValue> values, String bufferOption, String updateOption)

Updates a single value for the specified streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **values** | **List<PIStreamValue>**| The values to add or update.. | [required]
 **bufferOption** | **String**| The desired AFBufferOption. The default is 'BufferIfPossible'.. | [optional]
 **updateOption** | **String**| The desired AFUpdateOption. The default is 'Replace'.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
