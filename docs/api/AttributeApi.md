# AttributeApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getByPath**](AttributeApi.md#getbypath) | **GET** /attributes | Retrieve an attribute by path.
[**get**](AttributeApi.md#get) | **GET** /attributes/{webId} | Retrieve an attribute.
[**update**](AttributeApi.md#update) | **PATCH** /attributes/{webId} | Update an attribute by replacing items in its definition.
[**delete**](AttributeApi.md#delete) | **DELETE** /attributes/{webId} | Delete an attribute.
[**getAttributes**](AttributeApi.md#getattributes) | **GET** /attributes/{webId}/attributes | Get the child attributes of the specified attribute.
[**createAttribute**](AttributeApi.md#createattribute) | **POST** /attributes/{webId}/attributes | Create a new attribute as a child of the specified attribute.
[**getCategories**](AttributeApi.md#getcategories) | **GET** /attributes/{webId}/categories | Get an attribute's categories.
[**createConfig**](AttributeApi.md#createconfig) | **POST** /attributes/{webId}/config | Create or update an attribute's DataReference configuration (Create/Update PI point for PI Point DataReference).
[**getValue**](AttributeApi.md#getvalue) | **GET** /attributes/{webId}/value | Get the attribute's value. This call is intended for use with attributes that have no data reference only. For attributes with a data reference, consult the documentation for Streams.
[**setValue**](AttributeApi.md#setvalue) | **PUT** /attributes/{webId}/value | Set the value of a configuration item attribute. For attributes with a data reference or non-configuration item attributes, consult the documentation for streams.
[**getMultiple**](AttributeApi.md#getmultiple) | **GET** /attributes/multiple | Retrieve multiple attributes by web id or path.
[**getAttributesQuery**](AttributeApi.md#getattributesquery) | **GET** /attributes/search | Retrieve attributes based on the specified conditions. Returns attributes using the specified search query string.


# **getByPath**
> getByPath(String path, String selectedFields, String webIdType)

Retrieve an attribute by path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| The path to the attribute.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **get**
> get(String webId, String selectedFields, String webIdType)

Retrieve an attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **update**
> update(String webId, PIAttribute attribute)

Update an attribute by replacing items in its definition.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **attribute** | **PIAttribute**| A partial attribute containing the desired changes.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **delete**
> delete(String webId)

Delete an attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAttributes**
> getAttributes(String webId, String categoryName, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, Integer startIndex, String templateName, String valueType, String webIdType)

Get the child attributes of the specified attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the parent attribute.. | [required]
 **categoryName** | **String**| Specify that returned attributes must have this category. The default is no category filter.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **nameFilter** | **String**| The name query string used for finding attributes. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include attributes nested further than the immediate attributes of the searchRoot. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **showExcluded** | **Boolean**| Specified if the search should include attributes with the Excluded property set. The default is 'false'.. | [optional]
 **showHidden** | **Boolean**| Specified if the search should include attributes with the Hidden property set. The default is 'false'.. | [optional]
 **sortField** | **String**| The field or property of the object used to sort the returned collection. The default is 'Name'.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **templateName** | **String**| Specify that returned attributes must be members of this template. The default is no template filter.. | [optional]
 **valueType** | **String**| Specify that returned attributes' value type must be the given value type. The default is no value type filter.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createAttribute**
> createAttribute(String webId, PIAttribute attribute, String webIdType)

Create a new attribute as a child of the specified attribute.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the parent attribute on which to create the attribute.. | [required]
 **attribute** | **PIAttribute**| The definition of the new attribute.. | [required]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getCategories**
> getCategories(String webId, String selectedFields, String webIdType)

Get an attribute's categories.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createConfig**
> createConfig(String webId, String webIdType)

Create or update an attribute's DataReference configuration (Create/Update PI point for PI Point DataReference).

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getValue**
> getValue(String webId, String selectedFields)

Get the attribute's value. This call is intended for use with attributes that have no data reference only. For attributes with a data reference, consult the documentation for Streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **setValue**
> setValue(String webId, PITimedValue value)

Set the value of a configuration item attribute. For attributes with a data reference or non-configuration item attributes, consult the documentation for streams.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the attribute.. | [required]
 **value** | **PITimedValue**| The value to write.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getMultiple**
> getMultiple(Boolean asParallel, String includeMode, List<String> path, String selectedFields, List<String> webId, String webIdType)

Retrieve multiple attributes by web id or path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **asParallel** | **Boolean**| Specifies if the retrieval processes should be run in parallel on the server. This may improve the response time for large amounts of requested attributes. The default is 'false'.. | [optional]
 **includeMode** | **String**| The include mode for the return list. The default is 'All'.. | [optional]
 **path** | **List<String>**| The path of an attribute. Multiple attributes may be specified with multiple instances of the parameter.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webId** | **List<String>**| The ID of an attribute. Multiple attributes may be specified with multiple instances of the parameter.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAttributesQuery**
> getAttributesQuery(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType)

Retrieve attributes based on the specified conditions. Returns attributes using the specified search query string.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **databaseWebId** | **String**| The ID of the asset database to use as the root of the query.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **query** | **String**| The query string is a list of filters used to perform an AFSearch for the attributes in the asset database. An example would be: "query=Element:{ Name:='MyElement' } Type:=Int32".. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
