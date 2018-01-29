# EventFrameApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getByPath**](EventFrameApi.md#getbypath) | **GET** /eventframes | Retrieve an event frame by path.
[**get**](EventFrameApi.md#get) | **GET** /eventframes/{webId} | Retrieve an event frame.
[**update**](EventFrameApi.md#update) | **PATCH** /eventframes/{webId} | Update an event frame by replacing items in its definition.
[**delete**](EventFrameApi.md#delete) | **DELETE** /eventframes/{webId} | Delete an event frame.
[**acknowledge**](EventFrameApi.md#acknowledge) | **PATCH** /eventframes/{webId}/acknowledge | Calls the EventFrame's Acknowledge method.
[**getAnnotations**](EventFrameApi.md#getannotations) | **GET** /eventframes/{webId}/annotations | Get an event frame's annotations.
[**createAnnotation**](EventFrameApi.md#createannotation) | **POST** /eventframes/{webId}/annotations | Create an annotation on an event frame.
[**getAnnotationById**](EventFrameApi.md#getannotationbyid) | **GET** /eventframes/{webId}/annotations/{id} | Get a specific annotation on an event frame.
[**updateAnnotation**](EventFrameApi.md#updateannotation) | **PATCH** /eventframes/{webId}/annotations/{id} | Update an annotation on an event frame by replacing items in its definition.
[**deleteAnnotation**](EventFrameApi.md#deleteannotation) | **DELETE** /eventframes/{webId}/annotations/{id} | Delete an annotation on an event frame.
[**getAttributes**](EventFrameApi.md#getattributes) | **GET** /eventframes/{webId}/attributes | Get the attributes of the specified event frame.
[**createAttribute**](EventFrameApi.md#createattribute) | **POST** /eventframes/{webId}/attributes | Create a new attribute of the specified event frame.
[**captureValues**](EventFrameApi.md#capturevalues) | **POST** /eventframes/{webId}/attributes/capture | Calls the EventFrame's CaptureValues method.
[**getCategories**](EventFrameApi.md#getcategories) | **GET** /eventframes/{webId}/categories | Get an event frame's categories.
[**createConfig**](EventFrameApi.md#createconfig) | **POST** /eventframes/{webId}/config | Executes the create configuration function of the data references found within the attributes of the event frame, and optionally, its children.
[**findEventFrameAttributes**](EventFrameApi.md#findeventframeattributes) | **GET** /eventframes/{webId}/eventframeattributes | Retrieves a list of event frame attributes matching the specified filters from the specified event frame.
[**getEventFrames**](EventFrameApi.md#geteventframes) | **GET** /eventframes/{webId}/eventframes | Retrieve event frames based on the specified conditions. By default, returns all children of the specified root event frame that have been active in the past 8 hours.
[**createEventFrame**](EventFrameApi.md#createeventframe) | **POST** /eventframes/{webId}/eventframes | Create an event frame as a child of the specified event frame.
[**getReferencedElements**](EventFrameApi.md#getreferencedelements) | **GET** /eventframes/{webId}/referencedelements | Retrieve the event frame's referenced elements.
[**getSecurity**](EventFrameApi.md#getsecurity) | **GET** /eventframes/{webId}/security | Get the security information of the specified security item associated with the event frame for a specified user.
[**getSecurityEntries**](EventFrameApi.md#getsecurityentries) | **GET** /eventframes/{webId}/securityentries | Retrieve the security entries associated with the event frame based on the specified criteria. By default, all security entries for this event frame are returned.
[**createSecurityEntry**](EventFrameApi.md#createsecurityentry) | **POST** /eventframes/{webId}/securityentries | Create a security entry owned by the event frame.
[**getSecurityEntryByName**](EventFrameApi.md#getsecurityentrybyname) | **GET** /eventframes/{webId}/securityentries/{name} | Retrieve the security entry associated with the event frame with the specified name.
[**updateSecurityEntry**](EventFrameApi.md#updatesecurityentry) | **PUT** /eventframes/{webId}/securityentries/{name} | Update a security entry owned by the event frame.
[**deleteSecurityEntry**](EventFrameApi.md#deletesecurityentry) | **DELETE** /eventframes/{webId}/securityentries/{name} | Delete a security entry owned by the event frame.
[**getMultiple**](EventFrameApi.md#getmultiple) | **GET** /eventframes/multiple | Retrieve multiple event frames by web ids or paths.
[**getEventFramesQuery**](EventFrameApi.md#geteventframesquery) | **GET** /eventframes/search | Retrieve event frames based on the specified conditions. Returns event frames using the specified search query string.
[**createSearchByAttribute**](EventFrameApi.md#createsearchbyattribute) | **POST** /eventframes/searchbyattribute | Create a link for a "Search EventFrames By Attribute Value" operation, whose queries are specified in the request content. The SearchRoot is specified by the Web Id of the root EventFrame. If the SearchRoot is not specified, then the search starts at the Asset Database. ElementTemplate must be provided as the Web ID of the ElementTemplate, which are used to create the EventFrames. All the attributes in the queries must be defined as AttributeTemplates on the ElementTemplate. An array of attribute value queries are ANDed together to find the desired Element objects. At least one value query must be specified. There are limitations on SearchOperators.
[**executeSearchByAttribute**](EventFrameApi.md#executesearchbyattribute) | **GET** /eventframes/searchbyattribute/{searchId} | Execute a "Search EventFrames By Attribute Value" operation.


# **getByPath**
> getByPath(String path, String selectedFields, String webIdType)

Retrieve an event frame by path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| The path to the event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **get**
> get(String webId, String selectedFields, String webIdType)

Retrieve an event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **update**
> update(String webId, PIEventFrame eventFrame)

Update an event frame by replacing items in its definition.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame to update.. | [required]
 **eventFrame** | **PIEventFrame**| A partial event frame containing the desired changes.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **delete**
> delete(String webId)

Delete an event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame to delete.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **acknowledge**
> acknowledge(String webId)

Calls the EventFrame's Acknowledge method.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAnnotations**
> getAnnotations(String webId, String selectedFields, String webIdType)

Get an event frame's annotations.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the owner event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createAnnotation**
> createAnnotation(String webId, PIAnnotation annotation, String webIdType)

Create an annotation on an event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the owner event frame on which to create the annotation.. | [required]
 **annotation** | **PIAnnotation**| The new annotation definition.. | [required]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAnnotationById**
> getAnnotationById(String id, String webId, String selectedFields, String webIdType)

Get a specific annotation on an event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Annotation identifier of the specific annotation.. | [required]
 **webId** | **String**| The ID of the owner event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateAnnotation**
> updateAnnotation(String id, String webId, PIAnnotation annotation)

Update an annotation on an event frame by replacing items in its definition.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Annotation identifier of the annotation to be updated.. | [required]
 **webId** | **String**| The ID of the owner event frame of the annotation to update.. | [required]
 **annotation** | **PIAnnotation**| A partial annotation containing the desired changes.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **deleteAnnotation**
> deleteAnnotation(String id, String webId)

Delete an annotation on an event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Annotation identifier of the annotation to be deleted.. | [required]
 **webId** | **String**| The ID of the owner event frame of the annotation to delete.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getAttributes**
> getAttributes(String webId, String categoryName, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, Integer startIndex, String templateName, String valueType, String webIdType)

Get the attributes of the specified event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]
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

Create a new attribute of the specified event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame on which to create the attribute.. | [required]
 **attribute** | **PIAttribute**| The definition of the new attribute.. | [required]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **captureValues**
> captureValues(String webId)

Calls the EventFrame's CaptureValues method.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getCategories**
> getCategories(String webId, String selectedFields, String webIdType)

Get an event frame's categories.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createConfig**
> createConfig(String webId, Boolean includeChildElements)

Executes the create configuration function of the data references found within the attributes of the event frame, and optionally, its children.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]
 **includeChildElements** | **Boolean**| If true, includes the child event frames of the specified event frame.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **findEventFrameAttributes**
> findEventFrameAttributes(String webId, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType)

Retrieves a list of event frame attributes matching the specified filters from the specified event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame to use as the root of the search.. | [required]
 **attributeCategory** | **String**| Specify that returned attributes must have this category. The default is no filter.. | [optional]
 **attributeDescriptionFilter** | **String**| The attribute description filter string used for finding objects. Only the first 440 characters of the description will be searched. For Asset Servers older than 2.7, a 400 status code (Bad Request) will be returned if this parameter is specified. The default is no filter.. | [optional]
 **attributeNameFilter** | **String**| The attribute name filter string used for finding objects. The default is no filter.. | [optional]
 **attributeType** | **String**| Specify that returned attributes' value type must be this value type. The default is no filter.. | [optional]
 **endTime** | **String**| A string representing the latest ending time for the event frames to be matched. The endTime must be greater than or equal to the startTime. The default is '*'.. | [optional]
 **eventFrameCategory** | **String**| Specify that the owner of the returned attributes must have this category. The default is no filter.. | [optional]
 **eventFrameDescriptionFilter** | **String**| The event frame description filter string used for finding objects. Only the first 440 characters of the description will be searched. For Asset Servers older than 2.7, a 400 status code (Bad Request) will be returned if this parameter is specified. The default is no filter.. | [optional]
 **eventFrameNameFilter** | **String**| The event frame name filter string used for finding objects. The default is no filter.. | [optional]
 **eventFrameTemplate** | **String**| Specify that the owner of the returned attributes must have this template or a template derived from this template. The default is no filter.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned (the page size). The default is 1000.. | [optional]
 **referencedElementNameFilter** | **String**| The name query string which must match the name of a referenced element. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies if the search should include objects nested further than immediate children of the given resource. The default is 'false'.. | [optional]
 **searchMode** | **String**| Determines how the startTime and endTime parameters are treated when searching for event frames. The default is 'Overlapped'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **sortField** | **String**| The field or property of the object used to sort the returned collection. The default is 'Name'.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **startTime** | **String**| A string representing the earliest starting time for the event frames to be matched. startTime must be less than or equal to the endTime. The default is '*-8h'.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getEventFrames**
> getEventFrames(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, String webIdType)

Retrieve event frames based on the specified conditions. By default, returns all children of the specified root event frame that have been active in the past 8 hours.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame to use as the root of the search.. | [required]
 **canBeAcknowledged** | **Boolean**| Specify the returned event frames' canBeAcknowledged property. The default is no canBeAcknowledged filter.. | [optional]
 **categoryName** | **String**| Specify that returned event frames must have this category. The default is no category filter.. | [optional]
 **endTime** | **String**| The ending time for the search. The endTime must be greater than or equal to the startTime. The searchMode parameter will control whether the comparison will be performed against the event frame's startTime or endTime. The default is '*' if searchMode is not one of the 'Backward*' or 'Forward*' values.. | [optional]
 **isAcknowledged** | **Boolean**| Specify the returned event frames' isAcknowledged property. The default no isAcknowledged filter.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **nameFilter** | **String**| The name query string used for finding event frames. The default is no filter.. | [optional]
 **referencedElementNameFilter** | **String**| The name query string which must match the name of a referenced element. The default is no filter.. | [optional]
 **referencedElementTemplateName** | **String**| Specify that returned event frames must have an element in the event frame's referenced elements collection that derives from the template. Specify this parameter by name.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies whether the search should include objects nested further than the immediate children of the search root. The default is 'false'.. | [optional]
 **searchMode** | **String**| Determines how the startTime and endTime parameters are treated when searching for event frame objects to be included in the returned collection. If this parameter is one of the 'Backward*' or 'Forward*' values, none of endTime, sortField, or sortOrder may be specified. The default is 'Overlapped'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **severity** | **List<String>**| Specify that returned event frames must have this severity. Multiple severity values may be specified with multiple instances of the parameter. The default is no severity filter.. | [optional]
 **sortField** | **String**| The field or property of the object used to sort the returned collection. The default is 'Name' if searchMode is not one of the 'Backward*' or 'Forward*' values.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending' if searchMode is not one of the 'Backward*' or 'Forward*' values.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **startTime** | **String**| The starting time for the search. startTime must be less than or equal to the endTime. The searchMode parameter will control whether the comparison will be performed against the event frame's startTime or endTime. The default is '*-8h'.. | [optional]
 **templateName** | **String**| Specify that returned event frames must have this template or a template derived from this template. The default is no template filter. Specify this parameter by name.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createEventFrame**
> createEventFrame(String webId, PIEventFrame eventFrame, String webIdType)

Create an event frame as a child of the specified event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the parent event frame on which to create the event frame.. | [required]
 **eventFrame** | **PIEventFrame**| The new event frame definition.. | [required]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getReferencedElements**
> getReferencedElements(String webId, String selectedFields, String webIdType)

Retrieve the event frame's referenced elements.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame whose referenced elements should be retrieved.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getSecurity**
> getSecurity(String webId, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType)

Get the security information of the specified security item associated with the event frame for a specified user.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame for the security to be checked.. | [required]
 **userIdentity** | **List<String>**| The user identity for the security information to be checked. Multiple security identities may be specified with multiple instances of the parameter. If the parameter is not specified, only the current user's security rights will be returned.. | [required]
 **forceRefresh** | **Boolean**| Indicates if the security cache should be refreshed before getting security information. The default is 'false'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getSecurityEntries**
> getSecurityEntries(String webId, String nameFilter, String selectedFields, String webIdType)

Retrieve the security entries associated with the event frame based on the specified criteria. By default, all security entries for this event frame are returned.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame.. | [required]
 **nameFilter** | **String**| The name query string used for filtering security entries. The default is no filter.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createSecurityEntry**
> createSecurityEntry(String webId, PISecurityEntry securityEntry, Boolean applyToChildren, String webIdType)

Create a security entry owned by the event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the event frame where the security entry will be created.. | [required]
 **securityEntry** | **PISecurityEntry**| The new security entry definition. The full list of allow and deny rights must be supplied.. | [required]
 **applyToChildren** | **Boolean**| If false, the new access permissions are only applied to the associated object. If true, the access permissions of children with any parent-child reference types will change when the permissions on the primary parent change.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getSecurityEntryByName**
> getSecurityEntryByName(String name, String webId, String selectedFields, String webIdType)

Retrieve the security entry associated with the event frame with the specified name.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the security entry. For every backslash character (\) in the security entry name, replace with asterisk (*). As an example, use domain*username instead of domain\username.. | [required]
 **webId** | **String**| The ID of the event frame.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **updateSecurityEntry**
> updateSecurityEntry(String name, String webId, PISecurityEntry securityEntry, Boolean applyToChildren)

Update a security entry owned by the event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the security entry.. | [required]
 **webId** | **String**| The ID of the event frame where the security entry will be updated.. | [required]
 **securityEntry** | **PISecurityEntry**| The new security entry definition. The full list of allow and deny rights must be supplied or they will be removed.. | [required]
 **applyToChildren** | **Boolean**| If false, the new access permissions are only applied to the associated object. If true, the access permissions of children with any parent-child reference types will change when the permissions on the primary parent change.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **deleteSecurityEntry**
> deleteSecurityEntry(String name, String webId, Boolean applyToChildren)

Delete a security entry owned by the event frame.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the security entry. For every backslash character (\) in the security entry name, replace with asterisk (*). As an example, use domain*username instead of domain\username.. | [required]
 **webId** | **String**| The ID of the event frame where the security entry will be deleted.. | [required]
 **applyToChildren** | **Boolean**| If false, the new access permissions are only applied to the associated object. If true, the access permissions of children with any parent-child reference types will change when the permissions on the primary parent change.. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getMultiple**
> getMultiple(Boolean asParallel, String includeMode, List<String> path, String selectedFields, List<String> webId, String webIdType)

Retrieve multiple event frames by web ids or paths.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **asParallel** | **Boolean**| Specifies if the retrieval processes should be run in parallel on the server. This may improve the response time for large amounts of requested attributes. The default is 'false'.. | [optional]
 **includeMode** | **String**| The include mode for the return list. The default is 'All'.. | [optional]
 **path** | **List<String>**| The path of an event frame. Multiple event frames may be specified with multiple instances of the parameter.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webId** | **List<String>**| The ID of an event frame. Multiple event frames may be specified with multiple instances of the parameter.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getEventFramesQuery**
> getEventFramesQuery(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType)

Retrieve event frames based on the specified conditions. Returns event frames using the specified search query string.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **databaseWebId** | **String**| The ID of the asset database to use as the root of the query.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **query** | **String**| The query string is a list of filters used to perform an AFSearch for the eventframes in the asset database. An example would be: "query=Name:=MyEventFrame* Category:=MyCategory Template:=EFTemplate*".. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **createSearchByAttribute**
> createSearchByAttribute(PISearchByAttribute query, Boolean noResults, String selectedFields, String webIdType)

Create a link for a "Search EventFrames By Attribute Value" operation, whose queries are specified in the request content. The SearchRoot is specified by the Web Id of the root EventFrame. If the SearchRoot is not specified, then the search starts at the Asset Database. ElementTemplate must be provided as the Web ID of the ElementTemplate, which are used to create the EventFrames. All the attributes in the queries must be defined as AttributeTemplates on the ElementTemplate. An array of attribute value queries are ANDed together to find the desired Element objects. At least one value query must be specified. There are limitations on SearchOperators.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **query** | **PISearchByAttribute**| The query of search by attribute.. | [required]
 **noResults** | **Boolean**| If false, the response content will contain the first page of the search results. If true, the response content will be empty. The default is false.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **executeSearchByAttribute**
> executeSearchByAttribute(String searchId, Boolean canBeAcknowledged, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType)

Execute a "Search EventFrames By Attribute Value" operation.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **searchId** | **String**| The encoded search Id of the "Search EventFrames By Attribute Value" operation.. | [required]
 **canBeAcknowledged** | **Boolean**| Specify the returned event frames' canBeAcknowledged property. The default is no canBeAcknowledged filter.. | [optional]
 **endTime** | **String**| The ending time for the search. endTime must be greater than or equal to the startTime. The searchMode parameter will control whether the comparison will be performed against the event frame's startTime or endTime. The default is '*'.. | [optional]
 **isAcknowledged** | **Boolean**| Specify the returned event frames' isAcknowledged property. The default no isAcknowledged filter.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **nameFilter** | **String**| The name query string used for finding event frames. The default is no filter.. | [optional]
 **referencedElementNameFilter** | **String**| The name query string which must match the name of a referenced element. The default is no filter.. | [optional]
 **searchFullHierarchy** | **Boolean**| Specifies whether the search should include objects nested further than the immediate children of the search root. The default is 'false'.. | [optional]
 **searchMode** | **String**| Determines how the startTime and endTime parameters are treated when searching for event frame objects to be included in the returned collection. The default is 'Overlapped'.. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **severity** | **List<String>**| Specify that returned event frames must have this severity. Multiple severity values may be specified with multiple instances of the parameter. The default is no severity filter.. | [optional]
 **sortField** | **String**| The field or property of the object used to sort the returned collection. The default is 'Name'.. | [optional]
 **sortOrder** | **String**| The order that the returned collection is sorted. The default is 'Ascending'.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **startTime** | **String**| The starting time for the search. startTime must be less than or equal to the endTime. The searchMode parameter will control whether the comparison will be performed against the event frame's startTime or endTime. The default is '*-8h'.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
