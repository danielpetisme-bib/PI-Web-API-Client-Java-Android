# PIWebApiClient

## **Constructor**
> PIWebApiClient(String baseUrl, bool String username, String password, Boolean verifySsl, Boolean debug)

Creates an instance of the PI Web API client top level object. Only Basic authentication can be used.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
**baseUrl** | **String**| PI Web API base service url. | [required]
**username** | **String**| The username for basic authentication to authenticate against PI Web API. | [required]
**password** | **String**| The password for basic authentication to authenticate against PI Web API. | [required]
**verifySsl** | **Boolean**| Verify SSL certificate.| [required]
**debug** | **Boolean**| Enable HTTP Client debug. | [required]

## **Methods**

Method | Controller
------------ | -------------
**getHome()** | [**HomeApi**](/docs/api/HomeApi.md)
**getAnalysis()** | [**AnalysisApi**](/docs/api/AnalysisApi.md)
**getAnalysisCategory()** | [**AnalysisCategoryApi**](/docs/api/AnalysisCategoryApi.md)
**getAnalysisRulePlugIn()** | [**AnalysisRulePlugInApi**](/docs/api/AnalysisRulePlugInApi.md)
**getAnalysisRule()** | [**AnalysisRuleApi**](/docs/api/AnalysisRuleApi.md)
**getAnalysisTemplate()** | [**AnalysisTemplateApi**](/docs/api/AnalysisTemplateApi.md)
**getAssetDatabase()** | [**AssetDatabaseApi**](/docs/api/AssetDatabaseApi.md)
**getAssetServer()** | [**AssetServerApi**](/docs/api/AssetServerApi.md)
**getAttributeCategory()** | [**AttributeCategoryApi**](/docs/api/AttributeCategoryApi.md)
**getAttribute()** | [**AttributeApi**](/docs/api/AttributeApi.md)
**getAttributeTemplate()** | [**AttributeTemplateApi**](/docs/api/AttributeTemplateApi.md)
**getAttributeTrait()** | [**AttributeTraitApi**](/docs/api/AttributeTraitApi.md)
**getBatch()** | [**BatchApi**](/docs/api/BatchApi.md)
**getCalculation()** | [**CalculationApi**](/docs/api/CalculationApi.md)
**getChannel()** | [**ChannelApi**](/docs/api/ChannelApi.md)
**getDataServer()** | [**DataServerApi**](/docs/api/DataServerApi.md)
**getElementCategory()** | [**ElementCategoryApi**](/docs/api/ElementCategoryApi.md)
**getElement()** | [**ElementApi**](/docs/api/ElementApi.md)
**getElementTemplate()** | [**ElementTemplateApi**](/docs/api/ElementTemplateApi.md)
**getEnumerationSet()** | [**EnumerationSetApi**](/docs/api/EnumerationSetApi.md)
**getEnumerationValue()** | [**EnumerationValueApi**](/docs/api/EnumerationValueApi.md)
**getEventFrame()** | [**EventFrameApi**](/docs/api/EventFrameApi.md)
**getPoint()** | [**PointApi**](/docs/api/PointApi.md)
**getSecurityIdentity()** | [**SecurityIdentityApi**](/docs/api/SecurityIdentityApi.md)
**getSecurityMapping()** | [**SecurityMappingApi**](/docs/api/SecurityMappingApi.md)
**getStream()** | [**StreamApi**](/docs/api/StreamApi.md)
**getStreamSet()** | [**StreamSetApi**](/docs/api/StreamSetApi.md)
**getSystem()** | [**SystemApi**](/docs/api/SystemApi.md)
**getConfiguration()** | [**ConfigurationApi**](/docs/api/ConfigurationApi.md)
**getTableCategory()** | [**TableCategoryApi**](/docs/api/TableCategoryApi.md)
**getTable()** | [**TableApi**](/docs/api/TableApi.md)
**getTimeRulePlugIn()** | [**TimeRulePlugInApi**](/docs/api/TimeRulePlugInApi.md)
**getTimeRule()** | [**TimeRuleApi**](/docs/api/TimeRuleApi.md)
**getUnitClass()** | [**UnitClassApi**](/docs/api/UnitClassApi.md)
**getUnit()** | [**UnitApi**](/docs/api/UnitApi.md)
**getWebIdHelper()** | [**WebIdHelperApi**](/docs/api/WebIdHelperApi.md)

[[Back to Model list]](../DOCUMENTATION.md#documentation-for-models) [[Back to API list]](../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to DOCUMENTATION]](../DOCUMENTATION.md)
