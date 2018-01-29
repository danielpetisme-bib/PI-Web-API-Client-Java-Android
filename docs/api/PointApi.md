# PointApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getByPath**](PointApi.md#getbypath) | **GET** /points | Get a point by path.
[**get**](PointApi.md#get) | **GET** /points/{webId} | Get a point.
[**update**](PointApi.md#update) | **PATCH** /points/{webId} | Update a point.
[**delete**](PointApi.md#delete) | **DELETE** /points/{webId} | Delete a point.
[**getAttributes**](PointApi.md#getattributes) | **GET** /points/{webId}/attributes | Get point attributes.
[**getAttributeByName**](PointApi.md#getattributebyname) | **GET** /points/{webId}/attributes/{name} | Get a point attribute by name.
[**getMultiple**](PointApi.md#getmultiple) | **GET** /points/multiple | Retrieve multiple points by web id or path.


# **getByPath**
> getByPath(String path, String selectedFields, String webIdType)

Get a point by path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| The path to the point.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **get**
> get(String webId, String selectedFields, String webIdType)

Get a point.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the point.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **update**
> update(String webId, PIPoint pointDTO)

Update a point.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the point.. | [required]
 **pointDTO** | **PIPoint**| A partial point containing the desired changes.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **delete**
> delete(String webId)

Delete a point.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the point.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAttributes**
> getAttributes(String webId, List<String> name, String nameFilter, String selectedFields, String webIdType)

Get point attributes.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the point.. | [required]
 **name** | **List<String>**| The name of a point attribute to be returned. Multiple attributes may be specified with multiple instances of the parameter.. | [optional]
 **nameFilter** | **String**| The filter to the names of the list of point attributes to be returned. The default is no filter.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAttributeByName**
> getAttributeByName(String name, String webId, String selectedFields, String webIdType)

Get a point attribute by name.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the attribute.. | [required]
 **webId** | **String**| The ID of the point.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getMultiple**
> getMultiple(Boolean asParallel, String includeMode, List<String> path, String selectedFields, List<String> webId, String webIdType)

Retrieve multiple points by web id or path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **asParallel** | **Boolean**| Specifies if the retrieval processes should be run in parallel on the server. This may improve the response time for large amounts of requested points. The default is 'false'.. | [optional]
 **includeMode** | **String**| The include mode for the return list. The default is 'All'.. | [optional]
 **path** | **List<String>**| The path of a point. Multiple points may be specified with multiple instances of the parameter.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webId** | **List<String>**| The ID of a point. Multiple points may be specified with multiple instances of the parameter.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
