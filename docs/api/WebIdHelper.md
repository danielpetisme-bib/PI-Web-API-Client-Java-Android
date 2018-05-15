# WebIdHelper

Method | Description
------------ | -------------
[**getWebIdInfo**](WebIdHelper.md#getwebidinfo) | Get WebID 2.0 information.
[**generateWebIdByPath**](WebIdHelper.md#generatewebidbypath) | Generate a WebID client-side using the object's path.


# **getWebIdInfo**
> WebIdInfo getWebIdInfo(String webId)

Get WebID 2.0 information.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the PIObject.. | [required]

### Return type

[**WebIdInfo**](../models/WebIdInfo.md)

[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **generateWebIdByPath**
> String generateWebIdByPath(String path, String type, String ownerType);

Generate a WebID client-side using the object's path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String** | The path of the PIObject. | [required]
 **type** | **String** | The type of the PIObject. | [required]
 **ownerType** | **String** | Optional parameter.  The type of the owner of the PIObject. It is required for some types of objects | [optional]


### Return type String


[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
