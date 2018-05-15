## Documentation for PI Web API top level object

- [PIWebApiClient](docs/PIWebApiClient.md)

## Documentation for API Endpoints

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HomeApi* | [**get**](docs/api/HomeApi.md#get) | **GET** / | Get top level links for this PI System Web API instance.
*AnalysisApi* | [**getByPath**](docs/api/AnalysisApi.md#getbypath) | **GET** /analyses | Retrieve an Analysis by path.
*AnalysisApi* | [**get**](docs/api/AnalysisApi.md#get) | **GET** /analyses/{webId} | Retrieve an Analysis.
*AnalysisApi* | [**update**](docs/api/AnalysisApi.md#update) | **PATCH** /analyses/{webId} | Update an Analysis.
*AnalysisApi* | [**delete**](docs/api/AnalysisApi.md#delete) | **DELETE** /analyses/{webId} | Delete an Analysis.
*AnalysisApi* | [**getCategories**](docs/api/AnalysisApi.md#getcategories) | **GET** /analyses/{webId}/categories | Get an Analysis' categories.
*AnalysisApi* | [**getSecurity**](docs/api/AnalysisApi.md#getsecurity) | **GET** /analyses/{webId}/security | Get the security information of the specified security item associated with the Analysis for a specified user.
*AnalysisApi* | [**getSecurityEntries**](docs/api/AnalysisApi.md#getsecurityentries) | **GET** /analyses/{webId}/securityentries | Retrieve the security entries associated with the analysis based on the specified criteria. By default, all security entries for this analysis are returned.
*AnalysisApi* | [**createSecurityEntry**](docs/api/AnalysisApi.md#createsecurityentry) | **POST** /analyses/{webId}/securityentries | Create a security entry owned by the analysis.
*AnalysisApi* | [**getSecurityEntryByName**](docs/api/AnalysisApi.md#getsecurityentrybyname) | **GET** /analyses/{webId}/securityentries/{name} | Retrieve the security entry associated with the analysis with the specified name.
*AnalysisApi* | [**updateSecurityEntry**](docs/api/AnalysisApi.md#updatesecurityentry) | **PUT** /analyses/{webId}/securityentries/{name} | Update a security entry owned by the analysis.
*AnalysisApi* | [**deleteSecurityEntry**](docs/api/AnalysisApi.md#deletesecurityentry) | **DELETE** /analyses/{webId}/securityentries/{name} | Delete a security entry owned by the analysis.
*AnalysisApi* | [**getAnalysesQuery**](docs/api/AnalysisApi.md#getanalysesquery) | **GET** /analyses/search | Retrieve analyses based on the specified conditions. By default, returns all analyses.
*AnalysisCategoryApi* | [**getByPath**](docs/api/AnalysisCategoryApi.md#getbypath) | **GET** /analysiscategories | Retrieve an analysis category by path.
*AnalysisCategoryApi* | [**get**](docs/api/AnalysisCategoryApi.md#get) | **GET** /analysiscategories/{webId} | Retrieve an analysis category.
*AnalysisCategoryApi* | [**update**](docs/api/AnalysisCategoryApi.md#update) | **PATCH** /analysiscategories/{webId} | Update an analysis category by replacing items in its definition.
*AnalysisCategoryApi* | [**delete**](docs/api/AnalysisCategoryApi.md#delete) | **DELETE** /analysiscategories/{webId} | Delete an analysis category.
*AnalysisCategoryApi* | [**getSecurity**](docs/api/AnalysisCategoryApi.md#getsecurity) | **GET** /analysiscategories/{webId}/security | Get the security information of the specified security item associated with the analysis category for a specified user.
*AnalysisCategoryApi* | [**getSecurityEntries**](docs/api/AnalysisCategoryApi.md#getsecurityentries) | **GET** /analysiscategories/{webId}/securityentries | Retrieve the security entries associated with the analysis category based on the specified criteria. By default, all security entries for this analysis category are returned.
*AnalysisCategoryApi* | [**createSecurityEntry**](docs/api/AnalysisCategoryApi.md#createsecurityentry) | **POST** /analysiscategories/{webId}/securityentries | Create a security entry owned by the analysis category.
*AnalysisCategoryApi* | [**getSecurityEntryByName**](docs/api/AnalysisCategoryApi.md#getsecurityentrybyname) | **GET** /analysiscategories/{webId}/securityentries/{name} | Retrieve the security entry associated with the analysis category with the specified name.
*AnalysisCategoryApi* | [**updateSecurityEntry**](docs/api/AnalysisCategoryApi.md#updatesecurityentry) | **PUT** /analysiscategories/{webId}/securityentries/{name} | Update a security entry owned by the analysis category.
*AnalysisCategoryApi* | [**deleteSecurityEntry**](docs/api/AnalysisCategoryApi.md#deletesecurityentry) | **DELETE** /analysiscategories/{webId}/securityentries/{name} | Delete a security entry owned by the analysis category.
*AnalysisRulePlugInApi* | [**getByPath**](docs/api/AnalysisRulePlugInApi.md#getbypath) | **GET** /analysisruleplugins | Retrieve an Analysis Rule Plug-in by path.
*AnalysisRulePlugInApi* | [**get**](docs/api/AnalysisRulePlugInApi.md#get) | **GET** /analysisruleplugins/{webId} | Retrieve an Analysis Rule Plug-in.
*AnalysisRuleApi* | [**getByPath**](docs/api/AnalysisRuleApi.md#getbypath) | **GET** /analysisrules | Retrieve an Analysis Rule by path.
*AnalysisRuleApi* | [**get**](docs/api/AnalysisRuleApi.md#get) | **GET** /analysisrules/{webId} | Retrieve an Analysis Rule.
*AnalysisRuleApi* | [**update**](docs/api/AnalysisRuleApi.md#update) | **PATCH** /analysisrules/{webId} | Update an Analysis Rule by replacing items in its definition.
*AnalysisRuleApi* | [**delete**](docs/api/AnalysisRuleApi.md#delete) | **DELETE** /analysisrules/{webId} | Delete an Analysis Rule.
*AnalysisRuleApi* | [**getAnalysisRules**](docs/api/AnalysisRuleApi.md#getanalysisrules) | **GET** /analysisrules/{webId}/analysisrules | Get the child Analysis Rules of the Analysis Rule.
*AnalysisRuleApi* | [**createAnalysisRule**](docs/api/AnalysisRuleApi.md#createanalysisrule) | **POST** /analysisrules/{webId}/analysisrules | Create a new Analysis Rule as a child of an existing Analysis Rule.
*AnalysisTemplateApi* | [**getByPath**](docs/api/AnalysisTemplateApi.md#getbypath) | **GET** /analysistemplates | Retrieve an analysis template by path.
*AnalysisTemplateApi* | [**createFromAnalysis**](docs/api/AnalysisTemplateApi.md#createfromanalysis) | **POST** /analysistemplates | Create an Analysis template based upon a specified Analysis.
*AnalysisTemplateApi* | [**get**](docs/api/AnalysisTemplateApi.md#get) | **GET** /analysistemplates/{webId} | Retrieve an analysis template.
*AnalysisTemplateApi* | [**update**](docs/api/AnalysisTemplateApi.md#update) | **PATCH** /analysistemplates/{webId} | Update an analysis template by replacing items in its definition.
*AnalysisTemplateApi* | [**delete**](docs/api/AnalysisTemplateApi.md#delete) | **DELETE** /analysistemplates/{webId} | Delete an analysis template.
*AnalysisTemplateApi* | [**getCategories**](docs/api/AnalysisTemplateApi.md#getcategories) | **GET** /analysistemplates/{webId}/categories | Get an analysis template's categories.
*AnalysisTemplateApi* | [**getSecurity**](docs/api/AnalysisTemplateApi.md#getsecurity) | **GET** /analysistemplates/{webId}/security | Get the security information of the specified security item associated with the analysis template for a specified user.
*AnalysisTemplateApi* | [**getSecurityEntries**](docs/api/AnalysisTemplateApi.md#getsecurityentries) | **GET** /analysistemplates/{webId}/securityentries | Retrieve the security entries associated with the analysis template based on the specified criteria. By default, all security entries for this analysis template are returned.
*AnalysisTemplateApi* | [**createSecurityEntry**](docs/api/AnalysisTemplateApi.md#createsecurityentry) | **POST** /analysistemplates/{webId}/securityentries | Create a security entry owned by the analysis template.
*AnalysisTemplateApi* | [**getSecurityEntryByName**](docs/api/AnalysisTemplateApi.md#getsecurityentrybyname) | **GET** /analysistemplates/{webId}/securityentries/{name} | Retrieve the security entry associated with the analysis template with the specified name.
*AnalysisTemplateApi* | [**updateSecurityEntry**](docs/api/AnalysisTemplateApi.md#updatesecurityentry) | **PUT** /analysistemplates/{webId}/securityentries/{name} | Update a security entry owned by the analysis template.
*AnalysisTemplateApi* | [**deleteSecurityEntry**](docs/api/AnalysisTemplateApi.md#deletesecurityentry) | **DELETE** /analysistemplates/{webId}/securityentries/{name} | Delete a security entry owned by the analysis template.
*AnalysisTemplateApi* | [**getAnalysisTemplatesQuery**](docs/api/AnalysisTemplateApi.md#getanalysistemplatesquery) | **GET** /analysistemplates/search | Retrieve analysis templates based on the specified conditions. By default, returns all analysis templates.
*AssetDatabaseApi* | [**getByPath**](docs/api/AssetDatabaseApi.md#getbypath) | **GET** /assetdatabases | Retrieve an Asset Database by path.
*AssetDatabaseApi* | [**get**](docs/api/AssetDatabaseApi.md#get) | **GET** /assetdatabases/{webId} | Retrieve an Asset Database.
*AssetDatabaseApi* | [**update**](docs/api/AssetDatabaseApi.md#update) | **PATCH** /assetdatabases/{webId} | Update an asset database by replacing items in its definition.
*AssetDatabaseApi* | [**delete**](docs/api/AssetDatabaseApi.md#delete) | **DELETE** /assetdatabases/{webId} | Delete an asset database.
*AssetDatabaseApi* | [**findAnalyses**](docs/api/AssetDatabaseApi.md#findanalyses) | **GET** /assetdatabases/{webId}/analyses | Retrieve analyses based on the specified conditions.
*AssetDatabaseApi* | [**getAnalysisCategories**](docs/api/AssetDatabaseApi.md#getanalysiscategories) | **GET** /assetdatabases/{webId}/analysiscategories | Retrieve analysis categories for a given Asset Database.
*AssetDatabaseApi* | [**createAnalysisCategory**](docs/api/AssetDatabaseApi.md#createanalysiscategory) | **POST** /assetdatabases/{webId}/analysiscategories | Create an analysis category at the Asset Database root.
*AssetDatabaseApi* | [**getAnalysisTemplates**](docs/api/AssetDatabaseApi.md#getanalysistemplates) | **GET** /assetdatabases/{webId}/analysistemplates | Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned.
*AssetDatabaseApi* | [**createAnalysisTemplate**](docs/api/AssetDatabaseApi.md#createanalysistemplate) | **POST** /assetdatabases/{webId}/analysistemplates | Create an analysis template at the Asset Database root.
*AssetDatabaseApi* | [**getAttributeCategories**](docs/api/AssetDatabaseApi.md#getattributecategories) | **GET** /assetdatabases/{webId}/attributecategories | Retrieve attribute categories for a given Asset Database.
*AssetDatabaseApi* | [**createAttributeCategory**](docs/api/AssetDatabaseApi.md#createattributecategory) | **POST** /assetdatabases/{webId}/attributecategories | Create an attribute category at the Asset Database root.
*AssetDatabaseApi* | [**findElementAttributes**](docs/api/AssetDatabaseApi.md#findelementattributes) | **GET** /assetdatabases/{webId}/elementattributes | Retrieves a list of element attributes matching the specified filters from the specified asset database.
*AssetDatabaseApi* | [**getElementCategories**](docs/api/AssetDatabaseApi.md#getelementcategories) | **GET** /assetdatabases/{webId}/elementcategories | Retrieve element categories for a given Asset Database.
*AssetDatabaseApi* | [**createElementCategory**](docs/api/AssetDatabaseApi.md#createelementcategory) | **POST** /assetdatabases/{webId}/elementcategories | Create an element category at the Asset Database root.
*AssetDatabaseApi* | [**getElements**](docs/api/AssetDatabaseApi.md#getelements) | **GET** /assetdatabases/{webId}/elements | Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database.
*AssetDatabaseApi* | [**createElement**](docs/api/AssetDatabaseApi.md#createelement) | **POST** /assetdatabases/{webId}/elements | Create a child element.
*AssetDatabaseApi* | [**getElementTemplates**](docs/api/AssetDatabaseApi.md#getelementtemplates) | **GET** /assetdatabases/{webId}/elementtemplates | Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned.
*AssetDatabaseApi* | [**createElementTemplate**](docs/api/AssetDatabaseApi.md#createelementtemplate) | **POST** /assetdatabases/{webId}/elementtemplates | Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created.
*AssetDatabaseApi* | [**getEnumerationSets**](docs/api/AssetDatabaseApi.md#getenumerationsets) | **GET** /assetdatabases/{webId}/enumerationsets | Retrieve enumeration sets for given asset database.
*AssetDatabaseApi* | [**createEnumerationSet**](docs/api/AssetDatabaseApi.md#createenumerationset) | **POST** /assetdatabases/{webId}/enumerationsets | Create an enumeration set at the Asset Database.
*AssetDatabaseApi* | [**findEventFrameAttributes**](docs/api/AssetDatabaseApi.md#findeventframeattributes) | **GET** /assetdatabases/{webId}/eventframeattributes | Retrieves a list of event frame attributes matching the specified filters from the specified asset database.
*AssetDatabaseApi* | [**getEventFrames**](docs/api/AssetDatabaseApi.md#geteventframes) | **GET** /assetdatabases/{webId}/eventframes | Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource that have been active in the past 8 hours.
*AssetDatabaseApi* | [**createEventFrame**](docs/api/AssetDatabaseApi.md#createeventframe) | **POST** /assetdatabases/{webId}/eventframes | Create an event frame.
*AssetDatabaseApi* | [**export**](docs/api/AssetDatabaseApi.md#export) | **GET** /assetdatabases/{webId}/export | Export the asset database.
*AssetDatabaseApi* | [**importData**](docs/api/AssetDatabaseApi.md#importdata) | **POST** /assetdatabases/{webId}/import | Import an asset database.
*AssetDatabaseApi* | [**getReferencedElements**](docs/api/AssetDatabaseApi.md#getreferencedelements) | **GET** /assetdatabases/{webId}/referencedelements | Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database.
*AssetDatabaseApi* | [**addReferencedElement**](docs/api/AssetDatabaseApi.md#addreferencedelement) | **POST** /assetdatabases/{webId}/referencedelements | Add a reference to an existing element to the specified database.
*AssetDatabaseApi* | [**removeReferencedElement**](docs/api/AssetDatabaseApi.md#removereferencedelement) | **DELETE** /assetdatabases/{webId}/referencedelements | Remove a reference to an existing element from the specified database.
*AssetDatabaseApi* | [**getSecurity**](docs/api/AssetDatabaseApi.md#getsecurity) | **GET** /assetdatabases/{webId}/security | Get the security information of the specified security item associated with the asset database for a specified user.
*AssetDatabaseApi* | [**getSecurityEntries**](docs/api/AssetDatabaseApi.md#getsecurityentries) | **GET** /assetdatabases/{webId}/securityentries | Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned.
*AssetDatabaseApi* | [**createSecurityEntry**](docs/api/AssetDatabaseApi.md#createsecurityentry) | **POST** /assetdatabases/{webId}/securityentries | Create a security entry owned by the asset database.
*AssetDatabaseApi* | [**getSecurityEntryByName**](docs/api/AssetDatabaseApi.md#getsecurityentrybyname) | **GET** /assetdatabases/{webId}/securityentries/{name} | Retrieve the security entry of the specified security item associated with the asset database with the specified name.
*AssetDatabaseApi* | [**updateSecurityEntry**](docs/api/AssetDatabaseApi.md#updatesecurityentry) | **PUT** /assetdatabases/{webId}/securityentries/{name} | Update a security entry owned by the asset database.
*AssetDatabaseApi* | [**deleteSecurityEntry**](docs/api/AssetDatabaseApi.md#deletesecurityentry) | **DELETE** /assetdatabases/{webId}/securityentries/{name} | Delete a security entry owned by the asset database.
*AssetDatabaseApi* | [**getTableCategories**](docs/api/AssetDatabaseApi.md#gettablecategories) | **GET** /assetdatabases/{webId}/tablecategories | Retrieve table categories for a given Asset Database.
*AssetDatabaseApi* | [**createTableCategory**](docs/api/AssetDatabaseApi.md#createtablecategory) | **POST** /assetdatabases/{webId}/tablecategories | Create a table category on the Asset Database.
*AssetDatabaseApi* | [**getTables**](docs/api/AssetDatabaseApi.md#gettables) | **GET** /assetdatabases/{webId}/tables | Retrieve tables for given Asset Database.
*AssetDatabaseApi* | [**createTable**](docs/api/AssetDatabaseApi.md#createtable) | **POST** /assetdatabases/{webId}/tables | Create a table on the Asset Database.
*AssetServerApi* | [**list**](docs/api/AssetServerApi.md#list) | **GET** /assetservers | Retrieve a list of all Asset Servers known to this service.
*AssetServerApi* | [**getByName**](docs/api/AssetServerApi.md#getbyname) | **GET** /assetservers#name | Retrieve an Asset Server by name.
*AssetServerApi* | [**getByPath**](docs/api/AssetServerApi.md#getbypath) | **GET** /assetservers#path | Retrieve an Asset Server by path.
*AssetServerApi* | [**get**](docs/api/AssetServerApi.md#get) | **GET** /assetservers/{webId} | Retrieve an Asset Server.
*AssetServerApi* | [**getAnalysisRulePlugIns**](docs/api/AssetServerApi.md#getanalysisruleplugins) | **GET** /assetservers/{webId}/analysisruleplugins | Retrieve a list of all Analysis Rule Plug-in's.
*AssetServerApi* | [**getDatabases**](docs/api/AssetServerApi.md#getdatabases) | **GET** /assetservers/{webId}/assetdatabases | Retrieve a list of all Asset Databases on the specified Asset Server.
*AssetServerApi* | [**createAssetDatabase**](docs/api/AssetServerApi.md#createassetdatabase) | **POST** /assetservers/{webId}/assetdatabases | Create an asset database.
*AssetServerApi* | [**getSecurity**](docs/api/AssetServerApi.md#getsecurity) | **GET** /assetservers/{webId}/security | Get the security information of the specified security item associated with the asset server for a specified user.
*AssetServerApi* | [**getSecurityEntries**](docs/api/AssetServerApi.md#getsecurityentries) | **GET** /assetservers/{webId}/securityentries | Retrieve the security entries of the specified security item associated with the asset server based on the specified criteria. By default, all security entries for this asset server are returned.
*AssetServerApi* | [**createSecurityEntry**](docs/api/AssetServerApi.md#createsecurityentry) | **POST** /assetservers/{webId}/securityentries | Create a security entry owned by the asset server.
*AssetServerApi* | [**getSecurityEntryByName**](docs/api/AssetServerApi.md#getsecurityentrybyname) | **GET** /assetservers/{webId}/securityentries/{name} | Retrieve the security entry of the specified security item associated with the asset server with the specified name.
*AssetServerApi* | [**updateSecurityEntry**](docs/api/AssetServerApi.md#updatesecurityentry) | **PUT** /assetservers/{webId}/securityentries/{name} | Update a security entry owned by the asset server.
*AssetServerApi* | [**deleteSecurityEntry**](docs/api/AssetServerApi.md#deletesecurityentry) | **DELETE** /assetservers/{webId}/securityentries/{name} | Delete a security entry owned by the asset server.
*AssetServerApi* | [**getSecurityIdentities**](docs/api/AssetServerApi.md#getsecurityidentities) | **GET** /assetservers/{webId}/securityidentities | Retrieve security identities based on the specified criteria. By default, all security identities in the specified Asset Server are returned.
*AssetServerApi* | [**createSecurityIdentity**](docs/api/AssetServerApi.md#createsecurityidentity) | **POST** /assetservers/{webId}/securityidentities | Create a security identity.
*AssetServerApi* | [**getSecurityIdentitiesForUser**](docs/api/AssetServerApi.md#getsecurityidentitiesforuser) | **GET** /assetservers/{webId}/securityidentities#userIdentity | Retrieve security identities for a specific user.
*AssetServerApi* | [**getSecurityMappings**](docs/api/AssetServerApi.md#getsecuritymappings) | **GET** /assetservers/{webId}/securitymappings | Retrieve security mappings based on the specified criteria. By default, all security mappings in the specified Asset Server are returned.
*AssetServerApi* | [**createSecurityMapping**](docs/api/AssetServerApi.md#createsecuritymapping) | **POST** /assetservers/{webId}/securitymappings | Create a security mapping.
*AssetServerApi* | [**getTimeRulePlugIns**](docs/api/AssetServerApi.md#gettimeruleplugins) | **GET** /assetservers/{webId}/timeruleplugins | Retrieve a list of all Time Rule Plug-in's.
*AssetServerApi* | [**getUnitClasses**](docs/api/AssetServerApi.md#getunitclasses) | **GET** /assetservers/{webId}/unitclasses | Retrieve a list of all unit classes on the specified Asset Server.
*AssetServerApi* | [**createUnitClass**](docs/api/AssetServerApi.md#createunitclass) | **POST** /assetservers/{webId}/unitclasses | Create a unit class in the specified Asset Server.
*AttributeCategoryApi* | [**getByPath**](docs/api/AttributeCategoryApi.md#getbypath) | **GET** /attributecategories | Retrieve an attribute category by path.
*AttributeCategoryApi* | [**get**](docs/api/AttributeCategoryApi.md#get) | **GET** /attributecategories/{webId} | Retrieve an attribute category.
*AttributeCategoryApi* | [**update**](docs/api/AttributeCategoryApi.md#update) | **PATCH** /attributecategories/{webId} | Update an attribute category by replacing items in its definition.
*AttributeCategoryApi* | [**delete**](docs/api/AttributeCategoryApi.md#delete) | **DELETE** /attributecategories/{webId} | Delete an attribute category.
*AttributeCategoryApi* | [**getSecurity**](docs/api/AttributeCategoryApi.md#getsecurity) | **GET** /attributecategories/{webId}/security | Get the security information of the specified security item associated with the attribute category for a specified user.
*AttributeCategoryApi* | [**getSecurityEntries**](docs/api/AttributeCategoryApi.md#getsecurityentries) | **GET** /attributecategories/{webId}/securityentries | Retrieve the security entries associated with the attribute category based on the specified criteria. By default, all security entries for this attribute category are returned.
*AttributeCategoryApi* | [**createSecurityEntry**](docs/api/AttributeCategoryApi.md#createsecurityentry) | **POST** /attributecategories/{webId}/securityentries | Create a security entry owned by the attribute category.
*AttributeCategoryApi* | [**getSecurityEntryByName**](docs/api/AttributeCategoryApi.md#getsecurityentrybyname) | **GET** /attributecategories/{webId}/securityentries/{name} | Retrieve the security entry associated with the attribute category with the specified name.
*AttributeCategoryApi* | [**updateSecurityEntry**](docs/api/AttributeCategoryApi.md#updatesecurityentry) | **PUT** /attributecategories/{webId}/securityentries/{name} | Update a security entry owned by the attribute category.
*AttributeCategoryApi* | [**deleteSecurityEntry**](docs/api/AttributeCategoryApi.md#deletesecurityentry) | **DELETE** /attributecategories/{webId}/securityentries/{name} | Delete a security entry owned by the attribute category.
*AttributeApi* | [**getByPath**](docs/api/AttributeApi.md#getbypath) | **GET** /attributes | Retrieve an attribute by path.
*AttributeApi* | [**get**](docs/api/AttributeApi.md#get) | **GET** /attributes/{webId} | Retrieve an attribute.
*AttributeApi* | [**update**](docs/api/AttributeApi.md#update) | **PATCH** /attributes/{webId} | Update an attribute by replacing items in its definition.
*AttributeApi* | [**delete**](docs/api/AttributeApi.md#delete) | **DELETE** /attributes/{webId} | Delete an attribute.
*AttributeApi* | [**getAttributes**](docs/api/AttributeApi.md#getattributes) | **GET** /attributes/{webId}/attributes | Get the child attributes of the specified attribute.
*AttributeApi* | [**createAttribute**](docs/api/AttributeApi.md#createattribute) | **POST** /attributes/{webId}/attributes | Create a new attribute as a child of the specified attribute.
*AttributeApi* | [**getCategories**](docs/api/AttributeApi.md#getcategories) | **GET** /attributes/{webId}/categories | Get an attribute's categories.
*AttributeApi* | [**createConfig**](docs/api/AttributeApi.md#createconfig) | **POST** /attributes/{webId}/config | Create or update an attribute's DataReference configuration (Create/Update PI point for PI Point DataReference).
*AttributeApi* | [**getValue**](docs/api/AttributeApi.md#getvalue) | **GET** /attributes/{webId}/value | Get the attribute's value. This call is intended for use with attributes that have no data reference only. For attributes with a data reference, consult the documentation for Streams.
*AttributeApi* | [**setValue**](docs/api/AttributeApi.md#setvalue) | **PUT** /attributes/{webId}/value | Set the value of a configuration item attribute. For attributes with a data reference or non-configuration item attributes, consult the documentation for streams.
*AttributeApi* | [**getMultiple**](docs/api/AttributeApi.md#getmultiple) | **GET** /attributes/multiple | Retrieve multiple attributes by web id or path.
*AttributeApi* | [**getAttributesQuery**](docs/api/AttributeApi.md#getattributesquery) | **GET** /attributes/search | Retrieve attributes based on the specified conditions. Returns attributes using the specified search query string.
*AttributeTemplateApi* | [**getByPath**](docs/api/AttributeTemplateApi.md#getbypath) | **GET** /attributetemplates | Retrieve an attribute template by path.
*AttributeTemplateApi* | [**get**](docs/api/AttributeTemplateApi.md#get) | **GET** /attributetemplates/{webId} | Retrieve an attribute template.
*AttributeTemplateApi* | [**update**](docs/api/AttributeTemplateApi.md#update) | **PATCH** /attributetemplates/{webId} | Update an existing attribute template by replacing items in its definition.
*AttributeTemplateApi* | [**delete**](docs/api/AttributeTemplateApi.md#delete) | **DELETE** /attributetemplates/{webId} | Delete an attribute template.
*AttributeTemplateApi* | [**getAttributeTemplates**](docs/api/AttributeTemplateApi.md#getattributetemplates) | **GET** /attributetemplates/{webId}/attributetemplates | Retrieve an attribute template's child attribute templates.
*AttributeTemplateApi* | [**createAttributeTemplate**](docs/api/AttributeTemplateApi.md#createattributetemplate) | **POST** /attributetemplates/{webId}/attributetemplates | Create an attribute template as a child of another attribute template.
*AttributeTemplateApi* | [**getCategories**](docs/api/AttributeTemplateApi.md#getcategories) | **GET** /attributetemplates/{webId}/categories | Get an attribute template's categories.
*AttributeTraitApi* | [**getByCategory**](docs/api/AttributeTraitApi.md#getbycategory) | **GET** /attributetraits | Retrieve all attribute traits of the specified category/categories.
*AttributeTraitApi* | [**get**](docs/api/AttributeTraitApi.md#get) | **GET** /attributetraits/{name} | Retrieve an attribute trait.
*BatchApi* | [**execute**](docs/api/BatchApi.md#execute) | **POST** /batch | Execute a batch of requests against the service. As shown in the Sample Request, the input is a dictionary with IDs as keys and request objects as values. Each request object specifies the HTTP method and the resource and, optionally, the content and a list of parent IDs. The list of parent IDs specifies which other requests must complete before the given request will be executed. The example first creates an element, then gets the element by the response's Location header, then creates an attribute for the element. Note that the resource can be an absolute URL or a JsonPath that references the response to the parent request. The batch's response is a dictionary uses keys corresponding those provided in the request, with response objects containing a status code, response headers, and the response body. A request can alternatively specify a request template in place of a resource. In this case, a single JsonPath may select multiple tokens, and a separate subrequest will be made from the template for each token. The responses of these subrequests will returned as the content of a single outer response.
*CalculationApi* | [**getAtIntervals**](docs/api/CalculationApi.md#getatintervals) | **GET** /calculation/intervals | Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval.
*CalculationApi* | [**getAtRecorded**](docs/api/CalculationApi.md#getatrecorded) | **GET** /calculation/recorded | Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression.
*CalculationApi* | [**getSummary**](docs/api/CalculationApi.md#getsummary) | **GET** /calculation/summary | Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval.
*CalculationApi* | [**getAtTimes**](docs/api/CalculationApi.md#getattimes) | **GET** /calculation/times | Returns the result of evaluating the expression at the specified timestamps.
*ChannelApi* | [**instances**](docs/api/ChannelApi.md#instances) | **GET** /channels/instances | Retrieves a list of currently running channel instances.
*DataServerApi* | [**list**](docs/api/DataServerApi.md#list) | **GET** /dataservers | Retrieve a list of Data Servers known to this service.
*DataServerApi* | [**getByName**](docs/api/DataServerApi.md#getbyname) | **GET** /dataservers#name | Retrieve a Data Server by name.
*DataServerApi* | [**getByPath**](docs/api/DataServerApi.md#getbypath) | **GET** /dataservers#path | Retrieve a Data Server by path.
*DataServerApi* | [**get**](docs/api/DataServerApi.md#get) | **GET** /dataservers/{webId} | Retrieve a Data Server.
*DataServerApi* | [**getEnumerationSets**](docs/api/DataServerApi.md#getenumerationsets) | **GET** /dataservers/{webId}/enumerationsets | Retrieve enumeration sets for given Data Server.
*DataServerApi* | [**createEnumerationSet**](docs/api/DataServerApi.md#createenumerationset) | **POST** /dataservers/{webId}/enumerationsets | Create an enumeration set on the Data Server.
*DataServerApi* | [**getLicense**](docs/api/DataServerApi.md#getlicense) | **GET** /dataservers/{webId}/license | Retrieves the specified license for the given Data Server. The fields of the response object are string representations of the numerical values reported by the Data Server, with "Infinity" representing a license field with no limit.
*DataServerApi* | [**getPoints**](docs/api/DataServerApi.md#getpoints) | **GET** /dataservers/{webId}/points | Retrieve a list of points on a specified Data Server.
*DataServerApi* | [**createPoint**](docs/api/DataServerApi.md#createpoint) | **POST** /dataservers/{webId}/points | Create a point in the specified Data Server.
*ElementCategoryApi* | [**getByPath**](docs/api/ElementCategoryApi.md#getbypath) | **GET** /elementcategories | Retrieve an element category by path.
*ElementCategoryApi* | [**get**](docs/api/ElementCategoryApi.md#get) | **GET** /elementcategories/{webId} | Retrieve an element category.
*ElementCategoryApi* | [**update**](docs/api/ElementCategoryApi.md#update) | **PATCH** /elementcategories/{webId} | Update an element category by replacing items in its definition.
*ElementCategoryApi* | [**delete**](docs/api/ElementCategoryApi.md#delete) | **DELETE** /elementcategories/{webId} | Delete an element category.
*ElementCategoryApi* | [**getSecurity**](docs/api/ElementCategoryApi.md#getsecurity) | **GET** /elementcategories/{webId}/security | Get the security information of the specified security item associated with the element category for a specified user.
*ElementCategoryApi* | [**getSecurityEntries**](docs/api/ElementCategoryApi.md#getsecurityentries) | **GET** /elementcategories/{webId}/securityentries | Retrieve the security entries associated with the element category based on the specified criteria. By default, all security entries for this element category are returned.
*ElementCategoryApi* | [**createSecurityEntry**](docs/api/ElementCategoryApi.md#createsecurityentry) | **POST** /elementcategories/{webId}/securityentries | Create a security entry owned by the element category.
*ElementCategoryApi* | [**getSecurityEntryByName**](docs/api/ElementCategoryApi.md#getsecurityentrybyname) | **GET** /elementcategories/{webId}/securityentries/{name} | Retrieve the security entry associated with the element category with the specified name.
*ElementCategoryApi* | [**updateSecurityEntry**](docs/api/ElementCategoryApi.md#updatesecurityentry) | **PUT** /elementcategories/{webId}/securityentries/{name} | Update a security entry owned by the element category.
*ElementCategoryApi* | [**deleteSecurityEntry**](docs/api/ElementCategoryApi.md#deletesecurityentry) | **DELETE** /elementcategories/{webId}/securityentries/{name} | Delete a security entry owned by the element category.
*ElementApi* | [**getByPath**](docs/api/ElementApi.md#getbypath) | **GET** /elements | Retrieve an element by path.
*ElementApi* | [**get**](docs/api/ElementApi.md#get) | **GET** /elements/{webId} | Retrieve an element.
*ElementApi* | [**update**](docs/api/ElementApi.md#update) | **PATCH** /elements/{webId} | Update an element by replacing items in its definition.
*ElementApi* | [**delete**](docs/api/ElementApi.md#delete) | **DELETE** /elements/{webId} | Delete an element.
*ElementApi* | [**getAnalyses**](docs/api/ElementApi.md#getanalyses) | **GET** /elements/{webId}/analyses | Retrieve analyses based on the specified conditions.
*ElementApi* | [**createAnalysis**](docs/api/ElementApi.md#createanalysis) | **POST** /elements/{webId}/analyses | Create an Analysis.
*ElementApi* | [**getAttributes**](docs/api/ElementApi.md#getattributes) | **GET** /elements/{webId}/attributes | Get the attributes of the specified element.
*ElementApi* | [**createAttribute**](docs/api/ElementApi.md#createattribute) | **POST** /elements/{webId}/attributes | Create a new attribute of the specified element.
*ElementApi* | [**getCategories**](docs/api/ElementApi.md#getcategories) | **GET** /elements/{webId}/categories | Get an element's categories.
*ElementApi* | [**createConfig**](docs/api/ElementApi.md#createconfig) | **POST** /elements/{webId}/config | Executes the create configuration function of the data references found within the attributes of the element, and optionally, its children.
*ElementApi* | [**findElementAttributes**](docs/api/ElementApi.md#findelementattributes) | **GET** /elements/{webId}/elementattributes | Retrieves a list of element attributes matching the specified filters from the specified element.
*ElementApi* | [**getElements**](docs/api/ElementApi.md#getelements) | **GET** /elements/{webId}/elements | Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified element.
*ElementApi* | [**createElement**](docs/api/ElementApi.md#createelement) | **POST** /elements/{webId}/elements | Create a child element.
*ElementApi* | [**getEventFrames**](docs/api/ElementApi.md#geteventframes) | **GET** /elements/{webId}/eventframes | Retrieve event frames that reference this element based on the specified conditions. By default, returns all event frames that reference this element that have been active in the past 8 hours.
*ElementApi* | [**getReferencedElements**](docs/api/ElementApi.md#getreferencedelements) | **GET** /elements/{webId}/referencedelements | Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements of the current resource.
*ElementApi* | [**addReferencedElement**](docs/api/ElementApi.md#addreferencedelement) | **POST** /elements/{webId}/referencedelements | Add a reference to an existing element to the child elements collection.
*ElementApi* | [**removeReferencedElement**](docs/api/ElementApi.md#removereferencedelement) | **DELETE** /elements/{webId}/referencedelements | Remove a reference to an existing element from the child elements collection.
*ElementApi* | [**getSecurity**](docs/api/ElementApi.md#getsecurity) | **GET** /elements/{webId}/security | Get the security information of the specified security item associated with the element for a specified user.
*ElementApi* | [**getSecurityEntries**](docs/api/ElementApi.md#getsecurityentries) | **GET** /elements/{webId}/securityentries | Retrieve the security entries associated with the element based on the specified criteria. By default, all security entries for this element are returned.
*ElementApi* | [**createSecurityEntry**](docs/api/ElementApi.md#createsecurityentry) | **POST** /elements/{webId}/securityentries | Create a security entry owned by the element.
*ElementApi* | [**getSecurityEntryByName**](docs/api/ElementApi.md#getsecurityentrybyname) | **GET** /elements/{webId}/securityentries/{name} | Retrieve the security entry associated with the element with the specified name.
*ElementApi* | [**updateSecurityEntry**](docs/api/ElementApi.md#updatesecurityentry) | **PUT** /elements/{webId}/securityentries/{name} | Update a security entry owned by the element.
*ElementApi* | [**deleteSecurityEntry**](docs/api/ElementApi.md#deletesecurityentry) | **DELETE** /elements/{webId}/securityentries/{name} | Delete a security entry owned by the element.
*ElementApi* | [**getMultiple**](docs/api/ElementApi.md#getmultiple) | **GET** /elements/multiple | Retrieve multiple elements by web id or path.
*ElementApi* | [**getElementsQuery**](docs/api/ElementApi.md#getelementsquery) | **GET** /elements/search | Retrieve elements based on the specified conditions. By default, returns all the elements.
*ElementApi* | [**createSearchByAttribute**](docs/api/ElementApi.md#createsearchbyattribute) | **POST** /elements/searchbyattribute | Create a link for a "Search Elements By Attribute Value" operation, whose queries are specified in the request content. The SearchRoot is specified by the Web Id of the root Element. If the SearchRoot is not specified, then the search starts at the Asset Database. ElementTemplate must be provided as the Web ID of the ElementTemplate, which are used to create the Elements. All the attributes in the queries must be defined as AttributeTemplates on the ElementTemplate. An array of attribute value queries are ANDed together to find the desired Element objects. At least one value query must be specified. There are limitations on SearchOperators.
*ElementApi* | [**executeSearchByAttribute**](docs/api/ElementApi.md#executesearchbyattribute) | **GET** /elements/searchbyattribute/{searchId} | Execute a "Search Elements By Attribute Value" operation.
*ElementTemplateApi* | [**getByPath**](docs/api/ElementTemplateApi.md#getbypath) | **GET** /elementtemplates | Retrieve an element template by path.
*ElementTemplateApi* | [**get**](docs/api/ElementTemplateApi.md#get) | **GET** /elementtemplates/{webId} | Retrieve an element template.
*ElementTemplateApi* | [**update**](docs/api/ElementTemplateApi.md#update) | **PATCH** /elementtemplates/{webId} | Update an element template by replacing items in its definition.
*ElementTemplateApi* | [**delete**](docs/api/ElementTemplateApi.md#delete) | **DELETE** /elementtemplates/{webId} | Delete an element template.
*ElementTemplateApi* | [**getAnalysisTemplates**](docs/api/ElementTemplateApi.md#getanalysistemplates) | **GET** /elementtemplates/{webId}/analysistemplates | Get analysis templates for an element template.
*ElementTemplateApi* | [**getAttributeTemplates**](docs/api/ElementTemplateApi.md#getattributetemplates) | **GET** /elementtemplates/{webId}/attributetemplates | Get child attribute templates for an element template.
*ElementTemplateApi* | [**createAttributeTemplate**](docs/api/ElementTemplateApi.md#createattributetemplate) | **POST** /elementtemplates/{webId}/attributetemplates | Create an attribute template.
*ElementTemplateApi* | [**getCategories**](docs/api/ElementTemplateApi.md#getcategories) | **GET** /elementtemplates/{webId}/categories | Get an element template's categories.
*ElementTemplateApi* | [**getSecurity**](docs/api/ElementTemplateApi.md#getsecurity) | **GET** /elementtemplates/{webId}/security | Get the security information of the specified security item associated with the element template for a specified user.
*ElementTemplateApi* | [**getSecurityEntries**](docs/api/ElementTemplateApi.md#getsecurityentries) | **GET** /elementtemplates/{webId}/securityentries | Retrieve the security entries associated with the element template based on the specified criteria. By default, all security entries for this element template are returned.
*ElementTemplateApi* | [**createSecurityEntry**](docs/api/ElementTemplateApi.md#createsecurityentry) | **POST** /elementtemplates/{webId}/securityentries | Create a security entry owned by the element template.
*ElementTemplateApi* | [**getSecurityEntryByName**](docs/api/ElementTemplateApi.md#getsecurityentrybyname) | **GET** /elementtemplates/{webId}/securityentries/{name} | Retrieve the security entry associated with the element template with the specified name.
*ElementTemplateApi* | [**updateSecurityEntry**](docs/api/ElementTemplateApi.md#updatesecurityentry) | **PUT** /elementtemplates/{webId}/securityentries/{name} | Update a security entry owned by the element template.
*ElementTemplateApi* | [**deleteSecurityEntry**](docs/api/ElementTemplateApi.md#deletesecurityentry) | **DELETE** /elementtemplates/{webId}/securityentries/{name} | Delete a security entry owned by the element template.
*EnumerationSetApi* | [**getByPath**](docs/api/EnumerationSetApi.md#getbypath) | **GET** /enumerationsets | Retrieve an enumeration set by path.
*EnumerationSetApi* | [**get**](docs/api/EnumerationSetApi.md#get) | **GET** /enumerationsets/{webId} | Retrieve an enumeration set.
*EnumerationSetApi* | [**update**](docs/api/EnumerationSetApi.md#update) | **PATCH** /enumerationsets/{webId} | Update an enumeration set by replacing items in its definition.
*EnumerationSetApi* | [**delete**](docs/api/EnumerationSetApi.md#delete) | **DELETE** /enumerationsets/{webId} | Delete an enumeration set.
*EnumerationSetApi* | [**getValues**](docs/api/EnumerationSetApi.md#getvalues) | **GET** /enumerationsets/{webId}/enumerationvalues | Retrieve an enumeration set's values.
*EnumerationSetApi* | [**createValue**](docs/api/EnumerationSetApi.md#createvalue) | **POST** /enumerationsets/{webId}/enumerationvalues | Create an enumeration value for a enumeration set.
*EnumerationSetApi* | [**getSecurity**](docs/api/EnumerationSetApi.md#getsecurity) | **GET** /enumerationsets/{webId}/security | Get the security information of the specified security item associated with the enumeration set for a specified user.
*EnumerationSetApi* | [**getSecurityEntries**](docs/api/EnumerationSetApi.md#getsecurityentries) | **GET** /enumerationsets/{webId}/securityentries | Retrieve the security entries associated with the enumeration set based on the specified criteria. By default, all security entries for this enumeration set are returned.
*EnumerationSetApi* | [**createSecurityEntry**](docs/api/EnumerationSetApi.md#createsecurityentry) | **POST** /enumerationsets/{webId}/securityentries | Create a security entry owned by the enumeration set.
*EnumerationSetApi* | [**getSecurityEntryByName**](docs/api/EnumerationSetApi.md#getsecurityentrybyname) | **GET** /enumerationsets/{webId}/securityentries/{name} | Retrieve the security entry associated with the enumeration set with the specified name.
*EnumerationSetApi* | [**updateSecurityEntry**](docs/api/EnumerationSetApi.md#updatesecurityentry) | **PUT** /enumerationsets/{webId}/securityentries/{name} | Update a security entry owned by the enumeration set.
*EnumerationSetApi* | [**deleteSecurityEntry**](docs/api/EnumerationSetApi.md#deletesecurityentry) | **DELETE** /enumerationsets/{webId}/securityentries/{name} | Delete a security entry owned by the enumeration set.
*EnumerationValueApi* | [**getByPath**](docs/api/EnumerationValueApi.md#getbypath) | **GET** /enumerationvalues | Retrieve an enumeration value by path.
*EnumerationValueApi* | [**get**](docs/api/EnumerationValueApi.md#get) | **GET** /enumerationvalues/{webId} | Retrieve an enumeration value mapping
*EnumerationValueApi* | [**updateEnumerationValue**](docs/api/EnumerationValueApi.md#updateenumerationvalue) | **PATCH** /enumerationvalues/{webId} | Update an enumeration value by replacing items in its definition.
*EnumerationValueApi* | [**deleteEnumerationValue**](docs/api/EnumerationValueApi.md#deleteenumerationvalue) | **DELETE** /enumerationvalues/{webId} | Delete an enumeration value from an enumeration set.
*EventFrameApi* | [**getByPath**](docs/api/EventFrameApi.md#getbypath) | **GET** /eventframes | Retrieve an event frame by path.
*EventFrameApi* | [**get**](docs/api/EventFrameApi.md#get) | **GET** /eventframes/{webId} | Retrieve an event frame.
*EventFrameApi* | [**update**](docs/api/EventFrameApi.md#update) | **PATCH** /eventframes/{webId} | Update an event frame by replacing items in its definition.
*EventFrameApi* | [**delete**](docs/api/EventFrameApi.md#delete) | **DELETE** /eventframes/{webId} | Delete an event frame.
*EventFrameApi* | [**acknowledge**](docs/api/EventFrameApi.md#acknowledge) | **PATCH** /eventframes/{webId}/acknowledge | Calls the EventFrame's Acknowledge method.
*EventFrameApi* | [**getAnnotations**](docs/api/EventFrameApi.md#getannotations) | **GET** /eventframes/{webId}/annotations | Get an event frame's annotations.
*EventFrameApi* | [**createAnnotation**](docs/api/EventFrameApi.md#createannotation) | **POST** /eventframes/{webId}/annotations | Create an annotation on an event frame.
*EventFrameApi* | [**getAnnotationById**](docs/api/EventFrameApi.md#getannotationbyid) | **GET** /eventframes/{webId}/annotations/{id} | Get a specific annotation on an event frame.
*EventFrameApi* | [**updateAnnotation**](docs/api/EventFrameApi.md#updateannotation) | **PATCH** /eventframes/{webId}/annotations/{id} | Update an annotation on an event frame by replacing items in its definition.
*EventFrameApi* | [**deleteAnnotation**](docs/api/EventFrameApi.md#deleteannotation) | **DELETE** /eventframes/{webId}/annotations/{id} | Delete an annotation on an event frame.
*EventFrameApi* | [**getAttributes**](docs/api/EventFrameApi.md#getattributes) | **GET** /eventframes/{webId}/attributes | Get the attributes of the specified event frame.
*EventFrameApi* | [**createAttribute**](docs/api/EventFrameApi.md#createattribute) | **POST** /eventframes/{webId}/attributes | Create a new attribute of the specified event frame.
*EventFrameApi* | [**captureValues**](docs/api/EventFrameApi.md#capturevalues) | **POST** /eventframes/{webId}/attributes/capture | Calls the EventFrame's CaptureValues method.
*EventFrameApi* | [**getCategories**](docs/api/EventFrameApi.md#getcategories) | **GET** /eventframes/{webId}/categories | Get an event frame's categories.
*EventFrameApi* | [**createConfig**](docs/api/EventFrameApi.md#createconfig) | **POST** /eventframes/{webId}/config | Executes the create configuration function of the data references found within the attributes of the event frame, and optionally, its children.
*EventFrameApi* | [**findEventFrameAttributes**](docs/api/EventFrameApi.md#findeventframeattributes) | **GET** /eventframes/{webId}/eventframeattributes | Retrieves a list of event frame attributes matching the specified filters from the specified event frame.
*EventFrameApi* | [**getEventFrames**](docs/api/EventFrameApi.md#geteventframes) | **GET** /eventframes/{webId}/eventframes | Retrieve event frames based on the specified conditions. By default, returns all children of the specified root event frame that have been active in the past 8 hours.
*EventFrameApi* | [**createEventFrame**](docs/api/EventFrameApi.md#createeventframe) | **POST** /eventframes/{webId}/eventframes | Create an event frame as a child of the specified event frame.
*EventFrameApi* | [**getReferencedElements**](docs/api/EventFrameApi.md#getreferencedelements) | **GET** /eventframes/{webId}/referencedelements | Retrieve the event frame's referenced elements.
*EventFrameApi* | [**getSecurity**](docs/api/EventFrameApi.md#getsecurity) | **GET** /eventframes/{webId}/security | Get the security information of the specified security item associated with the event frame for a specified user.
*EventFrameApi* | [**getSecurityEntries**](docs/api/EventFrameApi.md#getsecurityentries) | **GET** /eventframes/{webId}/securityentries | Retrieve the security entries associated with the event frame based on the specified criteria. By default, all security entries for this event frame are returned.
*EventFrameApi* | [**createSecurityEntry**](docs/api/EventFrameApi.md#createsecurityentry) | **POST** /eventframes/{webId}/securityentries | Create a security entry owned by the event frame.
*EventFrameApi* | [**getSecurityEntryByName**](docs/api/EventFrameApi.md#getsecurityentrybyname) | **GET** /eventframes/{webId}/securityentries/{name} | Retrieve the security entry associated with the event frame with the specified name.
*EventFrameApi* | [**updateSecurityEntry**](docs/api/EventFrameApi.md#updatesecurityentry) | **PUT** /eventframes/{webId}/securityentries/{name} | Update a security entry owned by the event frame.
*EventFrameApi* | [**deleteSecurityEntry**](docs/api/EventFrameApi.md#deletesecurityentry) | **DELETE** /eventframes/{webId}/securityentries/{name} | Delete a security entry owned by the event frame.
*EventFrameApi* | [**getMultiple**](docs/api/EventFrameApi.md#getmultiple) | **GET** /eventframes/multiple | Retrieve multiple event frames by web ids or paths.
*EventFrameApi* | [**getEventFramesQuery**](docs/api/EventFrameApi.md#geteventframesquery) | **GET** /eventframes/search | Retrieve event frames based on the specified conditions. Returns event frames using the specified search query string.
*EventFrameApi* | [**createSearchByAttribute**](docs/api/EventFrameApi.md#createsearchbyattribute) | **POST** /eventframes/searchbyattribute | Create a link for a "Search EventFrames By Attribute Value" operation, whose queries are specified in the request content. The SearchRoot is specified by the Web Id of the root EventFrame. If the SearchRoot is not specified, then the search starts at the Asset Database. ElementTemplate must be provided as the Web ID of the ElementTemplate, which are used to create the EventFrames. All the attributes in the queries must be defined as AttributeTemplates on the ElementTemplate. An array of attribute value queries are ANDed together to find the desired Element objects. At least one value query must be specified. There are limitations on SearchOperators.
*EventFrameApi* | [**executeSearchByAttribute**](docs/api/EventFrameApi.md#executesearchbyattribute) | **GET** /eventframes/searchbyattribute/{searchId} | Execute a "Search EventFrames By Attribute Value" operation.
*PointApi* | [**getByPath**](docs/api/PointApi.md#getbypath) | **GET** /points | Get a point by path.
*PointApi* | [**get**](docs/api/PointApi.md#get) | **GET** /points/{webId} | Get a point.
*PointApi* | [**update**](docs/api/PointApi.md#update) | **PATCH** /points/{webId} | Update a point.
*PointApi* | [**delete**](docs/api/PointApi.md#delete) | **DELETE** /points/{webId} | Delete a point.
*PointApi* | [**getAttributes**](docs/api/PointApi.md#getattributes) | **GET** /points/{webId}/attributes | Get point attributes.
*PointApi* | [**getAttributeByName**](docs/api/PointApi.md#getattributebyname) | **GET** /points/{webId}/attributes/{name} | Get a point attribute by name.
*PointApi* | [**getMultiple**](docs/api/PointApi.md#getmultiple) | **GET** /points/multiple | Retrieve multiple points by web id or path.
*SecurityIdentityApi* | [**getByPath**](docs/api/SecurityIdentityApi.md#getbypath) | **GET** /securityidentities | Retrieve a security identity by path.
*SecurityIdentityApi* | [**get**](docs/api/SecurityIdentityApi.md#get) | **GET** /securityidentities/{webId} | Retrieve a security identity.
*SecurityIdentityApi* | [**update**](docs/api/SecurityIdentityApi.md#update) | **PATCH** /securityidentities/{webId} | Update a security identity by replacing items in its definition.
*SecurityIdentityApi* | [**delete**](docs/api/SecurityIdentityApi.md#delete) | **DELETE** /securityidentities/{webId} | Delete a security identity.
*SecurityIdentityApi* | [**getSecurity**](docs/api/SecurityIdentityApi.md#getsecurity) | **GET** /securityidentities/{webId}/security | Get the security information of the specified security item associated with the security identity for a specified user.
*SecurityIdentityApi* | [**getSecurityEntries**](docs/api/SecurityIdentityApi.md#getsecurityentries) | **GET** /securityidentities/{webId}/securityentries | Retrieve the security entries associated with the security identity based on the specified criteria. By default, all security entries for this security identity are returned.
*SecurityIdentityApi* | [**getSecurityEntryByName**](docs/api/SecurityIdentityApi.md#getsecurityentrybyname) | **GET** /securityidentities/{webId}/securityentries/{name} | Retrieve the security entry associated with the security identity with the specified name.
*SecurityIdentityApi* | [**getSecurityMappings**](docs/api/SecurityIdentityApi.md#getsecuritymappings) | **GET** /securityidentities/{webId}/securitymappings | Get security mappings for the specified security identity.
*SecurityMappingApi* | [**getByPath**](docs/api/SecurityMappingApi.md#getbypath) | **GET** /securitymappings | Retrieve a security mapping by path.
*SecurityMappingApi* | [**get**](docs/api/SecurityMappingApi.md#get) | **GET** /securitymappings/{webId} | Retrieve a security mapping.
*SecurityMappingApi* | [**update**](docs/api/SecurityMappingApi.md#update) | **PATCH** /securitymappings/{webId} | Update a security mapping by replacing items in its definition.
*SecurityMappingApi* | [**delete**](docs/api/SecurityMappingApi.md#delete) | **DELETE** /securitymappings/{webId} | Delete a security mapping.
*SecurityMappingApi* | [**getSecurity**](docs/api/SecurityMappingApi.md#getsecurity) | **GET** /securitymappings/{webId}/security | Get the security information of the specified security item associated with the security mapping for a specified user.
*SecurityMappingApi* | [**getSecurityEntries**](docs/api/SecurityMappingApi.md#getsecurityentries) | **GET** /securitymappings/{webId}/securityentries | Retrieve the security entries associated with the security mapping based on the specified criteria. By default, all security entries for this security mapping are returned.
*SecurityMappingApi* | [**getSecurityEntryByName**](docs/api/SecurityMappingApi.md#getsecurityentrybyname) | **GET** /securitymappings/{webId}/securityentries/{name} | Retrieve the security entry associated with the security mapping with the specified name.
*StreamApi* | [**getChannel**](docs/api/StreamApi.md#getchannel) | **GET** /streams/{webId}/channel | Opens a channel that will send messages about any value changes for the specified stream.
*StreamApi* | [**getEnd**](docs/api/StreamApi.md#getend) | **GET** /streams/{webId}/end | Returns the end-of-stream value of the stream.
*StreamApi* | [**getInterpolated**](docs/api/StreamApi.md#getinterpolated) | **GET** /streams/{webId}/interpolated | Retrieves interpolated values over the specified time range at the specified sampling interval.
*StreamApi* | [**getInterpolatedAtTimes**](docs/api/StreamApi.md#getinterpolatedattimes) | **GET** /streams/{webId}/interpolatedattimes | Retrieves interpolated values over the specified time range at the specified sampling interval.
*StreamApi* | [**getPlot**](docs/api/StreamApi.md#getplot) | **GET** /streams/{webId}/plot | Retrieves values over the specified time range suitable for plotting over the number of intervals (typically represents pixels).
*StreamApi* | [**getRecorded**](docs/api/StreamApi.md#getrecorded) | **GET** /streams/{webId}/recorded | Returns a list of compressed values for the requested time range from the source provider.
*StreamApi* | [**updateValues**](docs/api/StreamApi.md#updatevalues) | **POST** /streams/{webId}/recorded | Updates multiple values for the specified stream.
*StreamApi* | [**getRecordedAtTime**](docs/api/StreamApi.md#getrecordedattime) | **GET** /streams/{webId}/recordedattime | Returns a single recorded value based on the passed time and retrieval mode from the stream.
*StreamApi* | [**getRecordedAtTimes**](docs/api/StreamApi.md#getrecordedattimes) | **GET** /streams/{webId}/recordedattimes | Retrieves recorded values at the specified times.
*StreamApi* | [**getSummary**](docs/api/StreamApi.md#getsummary) | **GET** /streams/{webId}/summary | Returns a summary over the specified time range for the stream.
*StreamApi* | [**getValue**](docs/api/StreamApi.md#getvalue) | **GET** /streams/{webId}/value | Returns the value of the stream at the specified time. By default, this is usually the current value.
*StreamApi* | [**updateValue**](docs/api/StreamApi.md#updatevalue) | **POST** /streams/{webId}/value | Updates a value for the specified stream.
*StreamSetApi* | [**getChannel**](docs/api/StreamSetApi.md#getchannel) | **GET** /streamsets/{webId}/channel | Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute.
*StreamSetApi* | [**getEnd**](docs/api/StreamSetApi.md#getend) | **GET** /streamsets/{webId}/end | Returns End of stream values of the attributes for an Element, Event Frame or Attribute
*StreamSetApi* | [**getInterpolated**](docs/api/StreamSetApi.md#getinterpolated) | **GET** /streamsets/{webId}/interpolated | Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval.
*StreamSetApi* | [**getInterpolatedAtTimes**](docs/api/StreamSetApi.md#getinterpolatedattimes) | **GET** /streamsets/{webId}/interpolatedattimes | Returns interpolated values of attributes for an element, event frame or attribute at the specified times.
*StreamSetApi* | [**getPlot**](docs/api/StreamSetApi.md#getplot) | **GET** /streamsets/{webId}/plot | Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels).
*StreamSetApi* | [**getRecorded**](docs/api/StreamSetApi.md#getrecorded) | **GET** /streamsets/{webId}/recorded | Returns recorded values of the attributes for an element, event frame, or attribute.
*StreamSetApi* | [**updateValues**](docs/api/StreamSetApi.md#updatevalues) | **POST** /streamsets/{webId}/recorded | Updates multiple values for the specified streams.
*StreamSetApi* | [**getRecordedAtTime**](docs/api/StreamSetApi.md#getrecordedattime) | **GET** /streamsets/{webId}/recordedattime | Returns recorded values of the attributes for an element, event frame, or attribute.
*StreamSetApi* | [**getRecordedAtTimes**](docs/api/StreamSetApi.md#getrecordedattimes) | **GET** /streamsets/{webId}/recordedattimes | Returns recorded values of attributes for an element, event frame or attribute at the specified times.
*StreamSetApi* | [**getSummaries**](docs/api/StreamSetApi.md#getsummaries) | **GET** /streamsets/{webId}/summary | Returns summary values of the attributes for an element, event frame or attribute.
*StreamSetApi* | [**getValues**](docs/api/StreamSetApi.md#getvalues) | **GET** /streamsets/{webId}/value | Returns values of the attributes for an Element, Event Frame or Attribute at the specified time.
*StreamSetApi* | [**updateValue**](docs/api/StreamSetApi.md#updatevalue) | **POST** /streamsets/{webId}/value | Updates a single value for the specified streams.
*StreamSetApi* | [**getChannelAdHoc**](docs/api/StreamSetApi.md#getchanneladhoc) | **GET** /streamsets/channel | Opens a channel that will send messages about any value changes for the specified streams.
*StreamSetApi* | [**getEndAdHoc**](docs/api/StreamSetApi.md#getendadhoc) | **GET** /streamsets/end | Returns End Of Stream values for attributes of the specified streams
*StreamSetApi* | [**getInterpolatedAdHoc**](docs/api/StreamSetApi.md#getinterpolatedadhoc) | **GET** /streamsets/interpolated | Returns interpolated values of the specified streams over the specified time range at the specified sampling interval.
*StreamSetApi* | [**getInterpolatedAtTimesAdHoc**](docs/api/StreamSetApi.md#getinterpolatedattimesadhoc) | **GET** /streamsets/interpolatedattimes | Returns interpolated values of the specified streams at the specified times.
*StreamSetApi* | [**getPlotAdHoc**](docs/api/StreamSetApi.md#getplotadhoc) | **GET** /streamsets/plot | Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels).
*StreamSetApi* | [**getRecordedAdHoc**](docs/api/StreamSetApi.md#getrecordedadhoc) | **GET** /streamsets/recorded | Returns recorded values of the specified streams.
*StreamSetApi* | [**updateValuesAdHoc**](docs/api/StreamSetApi.md#updatevaluesadhoc) | **POST** /streamsets/recorded | Updates multiple values for the specified streams.
*StreamSetApi* | [**getRecordedAtTimeAdHoc**](docs/api/StreamSetApi.md#getrecordedattimeadhoc) | **GET** /streamsets/recordedattime | Returns recorded values based on the passed time and retrieval mode.
*StreamSetApi* | [**getRecordedAtTimesAdHoc**](docs/api/StreamSetApi.md#getrecordedattimesadhoc) | **GET** /streamsets/recordedattimes | Returns recorded values of the specified streams at the specified times.
*StreamSetApi* | [**getSummariesAdHoc**](docs/api/StreamSetApi.md#getsummariesadhoc) | **GET** /streamsets/summary | Returns summary values of the specified streams.
*StreamSetApi* | [**getValuesAdHoc**](docs/api/StreamSetApi.md#getvaluesadhoc) | **GET** /streamsets/value | Returns values of the specified streams.
*StreamSetApi* | [**updateValueAdHoc**](docs/api/StreamSetApi.md#updatevalueadhoc) | **POST** /streamsets/value | Updates a single value for the specified streams.
*SystemApi* | [**landing**](docs/api/SystemApi.md#landing) | **GET** /system | Get system links for this PI System Web API instance.
*SystemApi* | [**cacheInstances**](docs/api/SystemApi.md#cacheinstances) | **GET** /system/cacheinstances | Get AF cache instances currently in use by the system. These are caches from which user requests are serviced. The number of instances depends on the number of users connected to the service, the service's authentication method, and the cache instance configuration.
*SystemApi* | [**status**](docs/api/SystemApi.md#status) | **GET** /system/status | Get the system uptime, the system state and the number of cache instances for this PI System Web API instance.
*SystemApi* | [**userInfo**](docs/api/SystemApi.md#userinfo) | **GET** /system/userinfo | Get information about the Windows identity used to fulfill the request. This depends on the service's authentication method and the credentials passed by the client. The impersonation level of the Windows identity is included.
*SystemApi* | [**versions**](docs/api/SystemApi.md#versions) | **GET** /system/versions | Get the current versions of the PI Web API instance and all external plugins.
*ConfigurationApi* | [**list**](docs/api/ConfigurationApi.md#list) | **GET** /system/configuration | Get the current system configuration.
*ConfigurationApi* | [**get**](docs/api/ConfigurationApi.md#get) | **GET** /system/configuration/{key} | Get the value of a configuration item.
*ConfigurationApi* | [**delete**](docs/api/ConfigurationApi.md#delete) | **DELETE** /system/configuration/{key} | Delete a configuration item.
*TableCategoryApi* | [**getByPath**](docs/api/TableCategoryApi.md#getbypath) | **GET** /tablecategories | Retrieve a table category by path.
*TableCategoryApi* | [**get**](docs/api/TableCategoryApi.md#get) | **GET** /tablecategories/{webId} | Retrieve a table category.
*TableCategoryApi* | [**update**](docs/api/TableCategoryApi.md#update) | **PATCH** /tablecategories/{webId} | Update a table category by replacing items in its definition.
*TableCategoryApi* | [**delete**](docs/api/TableCategoryApi.md#delete) | **DELETE** /tablecategories/{webId} | Delete a table category.
*TableCategoryApi* | [**getSecurity**](docs/api/TableCategoryApi.md#getsecurity) | **GET** /tablecategories/{webId}/security | Get the security information of the specified security item associated with the table category for a specified user.
*TableCategoryApi* | [**getSecurityEntries**](docs/api/TableCategoryApi.md#getsecurityentries) | **GET** /tablecategories/{webId}/securityentries | Retrieve the security entries associated with the table category based on the specified criteria. By default, all security entries for this table category are returned.
*TableCategoryApi* | [**createSecurityEntry**](docs/api/TableCategoryApi.md#createsecurityentry) | **POST** /tablecategories/{webId}/securityentries | Create a security entry owned by the table category.
*TableCategoryApi* | [**getSecurityEntryByName**](docs/api/TableCategoryApi.md#getsecurityentrybyname) | **GET** /tablecategories/{webId}/securityentries/{name} | Retrieve the security entry associated with the table category with the specified name.
*TableCategoryApi* | [**updateSecurityEntry**](docs/api/TableCategoryApi.md#updatesecurityentry) | **PUT** /tablecategories/{webId}/securityentries/{name} | Update a security entry owned by the table category.
*TableCategoryApi* | [**deleteSecurityEntry**](docs/api/TableCategoryApi.md#deletesecurityentry) | **DELETE** /tablecategories/{webId}/securityentries/{name} | Delete a security entry owned by the table category.
*TableApi* | [**getByPath**](docs/api/TableApi.md#getbypath) | **GET** /tables | Retrieve a table by path.
*TableApi* | [**get**](docs/api/TableApi.md#get) | **GET** /tables/{webId} | Retrieve a table.
*TableApi* | [**update**](docs/api/TableApi.md#update) | **PATCH** /tables/{webId} | Update a table by replacing items in its definition.
*TableApi* | [**delete**](docs/api/TableApi.md#delete) | **DELETE** /tables/{webId} | Delete a table.
*TableApi* | [**getCategories**](docs/api/TableApi.md#getcategories) | **GET** /tables/{webId}/categories | Get a table's categories.
*TableApi* | [**getData**](docs/api/TableApi.md#getdata) | **GET** /tables/{webId}/data | Get the table's data.
*TableApi* | [**updateData**](docs/api/TableApi.md#updatedata) | **PUT** /tables/{webId}/data | Update the table's data.
*TableApi* | [**getSecurity**](docs/api/TableApi.md#getsecurity) | **GET** /tables/{webId}/security | Get the security information of the specified security item associated with the table for a specified user.
*TableApi* | [**getSecurityEntries**](docs/api/TableApi.md#getsecurityentries) | **GET** /tables/{webId}/securityentries | Retrieve the security entries associated with the table based on the specified criteria. By default, all security entries for this table are returned.
*TableApi* | [**createSecurityEntry**](docs/api/TableApi.md#createsecurityentry) | **POST** /tables/{webId}/securityentries | Create a security entry owned by the table.
*TableApi* | [**getSecurityEntryByName**](docs/api/TableApi.md#getsecurityentrybyname) | **GET** /tables/{webId}/securityentries/{name} | Retrieve the security entry associated with the table with the specified name.
*TableApi* | [**updateSecurityEntry**](docs/api/TableApi.md#updatesecurityentry) | **PUT** /tables/{webId}/securityentries/{name} | Update a security entry owned by the table.
*TableApi* | [**deleteSecurityEntry**](docs/api/TableApi.md#deletesecurityentry) | **DELETE** /tables/{webId}/securityentries/{name} | Delete a security entry owned by the table.
*TimeRulePlugInApi* | [**getByPath**](docs/api/TimeRulePlugInApi.md#getbypath) | **GET** /timeruleplugins | Retrieve a Time Rule Plug-in by path.
*TimeRulePlugInApi* | [**get**](docs/api/TimeRulePlugInApi.md#get) | **GET** /timeruleplugins/{webId} | Retrieve a Time Rule Plug-in.
*TimeRuleApi* | [**getByPath**](docs/api/TimeRuleApi.md#getbypath) | **GET** /timerules | Retrieve a Time Rule by path.
*TimeRuleApi* | [**get**](docs/api/TimeRuleApi.md#get) | **GET** /timerules/{webId} | Retrieve a Time Rule.
*TimeRuleApi* | [**update**](docs/api/TimeRuleApi.md#update) | **PATCH** /timerules/{webId} | Update a Time Rule by replacing items in its definition.
*TimeRuleApi* | [**delete**](docs/api/TimeRuleApi.md#delete) | **DELETE** /timerules/{webId} | Delete a Time Rule.
*UnitClassApi* | [**getByPath**](docs/api/UnitClassApi.md#getbypath) | **GET** /unitclasses | Retrieve a unit class by path.
*UnitClassApi* | [**get**](docs/api/UnitClassApi.md#get) | **GET** /unitclasses/{webId} | Retrieve a unit class.
*UnitClassApi* | [**update**](docs/api/UnitClassApi.md#update) | **PATCH** /unitclasses/{webId} | Update a unit class.
*UnitClassApi* | [**delete**](docs/api/UnitClassApi.md#delete) | **DELETE** /unitclasses/{webId} | Delete a unit class.
*UnitClassApi* | [**getCanonicalUnit**](docs/api/UnitClassApi.md#getcanonicalunit) | **GET** /unitclasses/{webId}/canonicalunit | Get the canonical unit of a unit class.
*UnitClassApi* | [**getUnits**](docs/api/UnitClassApi.md#getunits) | **GET** /unitclasses/{webId}/units | Get a list of all units belonging to the unit class.
*UnitClassApi* | [**createUnit**](docs/api/UnitClassApi.md#createunit) | **POST** /unitclasses/{webId}/units | Create a unit in the specified Unit Class.
*UnitApi* | [**getByPath**](docs/api/UnitApi.md#getbypath) | **GET** /units | Retrieve a unit by path.
*UnitApi* | [**get**](docs/api/UnitApi.md#get) | **GET** /units/{webId} | Retrieve a unit.
*UnitApi* | [**update**](docs/api/UnitApi.md#update) | **PATCH** /units/{webId} | Update a unit.
*UnitApi* | [**delete**](docs/api/UnitApi.md#delete) | **DELETE** /units/{webId} | Delete a unit.

## Documentation For Models

- [PIAnalysis](docs/models/PIAnalysis.md)
- [PIAnalysisCategory](docs/models/PIAnalysisCategory.md)
- [PIAnalysisCategoryLinks](docs/models/PIAnalysisCategoryLinks.md)
- [PIAnalysisLinks](docs/models/PIAnalysisLinks.md)
- [PIAnalysisRule](docs/models/PIAnalysisRule.md)
- [PIAnalysisRuleLinks](docs/models/PIAnalysisRuleLinks.md)
- [PIAnalysisRulePlugIn](docs/models/PIAnalysisRulePlugIn.md)
- [PIAnalysisRulePlugInLinks](docs/models/PIAnalysisRulePlugInLinks.md)
- [PIAnalysisTemplate](docs/models/PIAnalysisTemplate.md)
- [PIAnalysisTemplateLinks](docs/models/PIAnalysisTemplateLinks.md)
- [PIAnnotation](docs/models/PIAnnotation.md)
- [PIAnnotationLinks](docs/models/PIAnnotationLinks.md)
- [PIAssetDatabase](docs/models/PIAssetDatabase.md)
- [PIAssetDatabaseLinks](docs/models/PIAssetDatabaseLinks.md)
- [PIAssetServer](docs/models/PIAssetServer.md)
- [PIAssetServerLinks](docs/models/PIAssetServerLinks.md)
- [PIAttribute](docs/models/PIAttribute.md)
- [PIAttributeCategory](docs/models/PIAttributeCategory.md)
- [PIAttributeCategoryLinks](docs/models/PIAttributeCategoryLinks.md)
- [PIAttributeLinks](docs/models/PIAttributeLinks.md)
- [PIAttributeTemplate](docs/models/PIAttributeTemplate.md)
- [PIAttributeTemplateLinks](docs/models/PIAttributeTemplateLinks.md)
- [PIAttributeTrait](docs/models/PIAttributeTrait.md)
- [PIAttributeTraitLinks](docs/models/PIAttributeTraitLinks.md)
- [PICacheInstance](docs/models/PICacheInstance.md)
- [PIChannelInstance](docs/models/PIChannelInstance.md)
- [PIDataServer](docs/models/PIDataServer.md)
- [PIDataServerLicense](docs/models/PIDataServerLicense.md)
- [PIDataServerLicenseLinks](docs/models/PIDataServerLicenseLinks.md)
- [PIDataServerLinks](docs/models/PIDataServerLinks.md)
- [PIElement](docs/models/PIElement.md)
- [PIElementCategory](docs/models/PIElementCategory.md)
- [PIElementCategoryLinks](docs/models/PIElementCategoryLinks.md)
- [PIElementLinks](docs/models/PIElementLinks.md)
- [PIElementTemplate](docs/models/PIElementTemplate.md)
- [PIElementTemplateLinks](docs/models/PIElementTemplateLinks.md)
- [PIEnumerationSet](docs/models/PIEnumerationSet.md)
- [PIEnumerationSetLinks](docs/models/PIEnumerationSetLinks.md)
- [PIEnumerationValue](docs/models/PIEnumerationValue.md)
- [PIEnumerationValueLinks](docs/models/PIEnumerationValueLinks.md)
- [PIErrors](docs/models/PIErrors.md)
- [PIEventFrame](docs/models/PIEventFrame.md)
- [PIEventFrameLinks](docs/models/PIEventFrameLinks.md)
- [PIItemAttribute](docs/models/PIItemAttribute.md)
- [PIItemElement](docs/models/PIItemElement.md)
- [PIItemEventFrame](docs/models/PIItemEventFrame.md)
- [PIItemPoint](docs/models/PIItemPoint.md)
- [PIItemsAnalysis](docs/models/PIItemsAnalysis.md)
- [PIItemsAnalysisCategory](docs/models/PIItemsAnalysisCategory.md)
- [PIItemsAnalysisRule](docs/models/PIItemsAnalysisRule.md)
- [PIItemsAnalysisRulePlugIn](docs/models/PIItemsAnalysisRulePlugIn.md)
- [PIItemsAnalysisTemplate](docs/models/PIItemsAnalysisTemplate.md)
- [PIItemsAnnotation](docs/models/PIItemsAnnotation.md)
- [PIItemsAssetDatabase](docs/models/PIItemsAssetDatabase.md)
- [PIItemsAssetServer](docs/models/PIItemsAssetServer.md)
- [PIItemsAttribute](docs/models/PIItemsAttribute.md)
- [PIItemsAttributeCategory](docs/models/PIItemsAttributeCategory.md)
- [PIItemsAttributeTemplate](docs/models/PIItemsAttributeTemplate.md)
- [PIItemsAttributeTrait](docs/models/PIItemsAttributeTrait.md)
- [PIItemsCacheInstance](docs/models/PIItemsCacheInstance.md)
- [PIItemsChannelInstance](docs/models/PIItemsChannelInstance.md)
- [PIItemsDataServer](docs/models/PIItemsDataServer.md)
- [PIItemsElement](docs/models/PIItemsElement.md)
- [PIItemsElementCategory](docs/models/PIItemsElementCategory.md)
- [PIItemsElementTemplate](docs/models/PIItemsElementTemplate.md)
- [PIItemsEnumerationSet](docs/models/PIItemsEnumerationSet.md)
- [PIItemsEnumerationValue](docs/models/PIItemsEnumerationValue.md)
- [PIItemsEventFrame](docs/models/PIItemsEventFrame.md)
- [PIItemsItemAttribute](docs/models/PIItemsItemAttribute.md)
- [PIItemsItemElement](docs/models/PIItemsItemElement.md)
- [PIItemsItemEventFrame](docs/models/PIItemsItemEventFrame.md)
- [PIItemsItemPoint](docs/models/PIItemsItemPoint.md)
- [PIItemsItemsSubstatus](docs/models/PIItemsItemsSubstatus.md)
- [PIItemsPoint](docs/models/PIItemsPoint.md)
- [PIItemsPointAttribute](docs/models/PIItemsPointAttribute.md)
- [PIItemsSecurityEntry](docs/models/PIItemsSecurityEntry.md)
- [PIItemsSecurityIdentity](docs/models/PIItemsSecurityIdentity.md)
- [PIItemsSecurityMapping](docs/models/PIItemsSecurityMapping.md)
- [PIItemsSecurityRights](docs/models/PIItemsSecurityRights.md)
- [PIItemsStreamSummaries](docs/models/PIItemsStreamSummaries.md)
- [PIItemsStreamValue](docs/models/PIItemsStreamValue.md)
- [PIItemsStreamValues](docs/models/PIItemsStreamValues.md)
- [PIItemsSubstatus](docs/models/PIItemsSubstatus.md)
- [PIItemsSummaryValue](docs/models/PIItemsSummaryValue.md)
- [PIItemsTable](docs/models/PIItemsTable.md)
- [PIItemsTableCategory](docs/models/PIItemsTableCategory.md)
- [PIItemsTimeRulePlugIn](docs/models/PIItemsTimeRulePlugIn.md)
- [PIItemsUnitClass](docs/models/PIItemsUnitClass.md)
- [PILanding](docs/models/PILanding.md)
- [PILandingLinks](docs/models/PILandingLinks.md)
- [PIPaginationLinks](docs/models/PIPaginationLinks.md)
- [PIPoint](docs/models/PIPoint.md)
- [PIPointAttribute](docs/models/PIPointAttribute.md)
- [PIPointAttributeLinks](docs/models/PIPointAttributeLinks.md)
- [PIPointLinks](docs/models/PIPointLinks.md)
- [PIPropertyError](docs/models/PIPropertyError.md)
- [PIRequest](docs/models/PIRequest.md)
- [PIRequestTemplate](docs/models/PIRequestTemplate.md)
- [PIResponse](docs/models/PIResponse.md)
- [PISearchByAttribute](docs/models/PISearchByAttribute.md)
- [PISecurity](docs/models/PISecurity.md)
- [PISecurityEntry](docs/models/PISecurityEntry.md)
- [PISecurityEntryLinks](docs/models/PISecurityEntryLinks.md)
- [PISecurityIdentity](docs/models/PISecurityIdentity.md)
- [PISecurityIdentityLinks](docs/models/PISecurityIdentityLinks.md)
- [PISecurityMapping](docs/models/PISecurityMapping.md)
- [PISecurityMappingLinks](docs/models/PISecurityMappingLinks.md)
- [PISecurityRights](docs/models/PISecurityRights.md)
- [PISecurityRightsLinks](docs/models/PISecurityRightsLinks.md)
- [PIStreamSummaries](docs/models/PIStreamSummaries.md)
- [PIStreamSummariesLinks](docs/models/PIStreamSummariesLinks.md)
- [PIStreamValue](docs/models/PIStreamValue.md)
- [PIStreamValueLinks](docs/models/PIStreamValueLinks.md)
- [PIStreamValues](docs/models/PIStreamValues.md)
- [PIStreamValuesLinks](docs/models/PIStreamValuesLinks.md)
- [PISubstatus](docs/models/PISubstatus.md)
- [PISummaryValue](docs/models/PISummaryValue.md)
- [PISystemLanding](docs/models/PISystemLanding.md)
- [PISystemLandingLinks](docs/models/PISystemLandingLinks.md)
- [PISystemStatus](docs/models/PISystemStatus.md)
- [PITable](docs/models/PITable.md)
- [PITableCategory](docs/models/PITableCategory.md)
- [PITableCategoryLinks](docs/models/PITableCategoryLinks.md)
- [PITableData](docs/models/PITableData.md)
- [PITableLinks](docs/models/PITableLinks.md)
- [PITimedValue](docs/models/PITimedValue.md)
- [PITimedValues](docs/models/PITimedValues.md)
- [PITimeRule](docs/models/PITimeRule.md)
- [PITimeRuleLinks](docs/models/PITimeRuleLinks.md)
- [PITimeRulePlugIn](docs/models/PITimeRulePlugIn.md)
- [PITimeRulePlugInLinks](docs/models/PITimeRulePlugInLinks.md)
- [PIUnit](docs/models/PIUnit.md)
- [PIUnitClass](docs/models/PIUnitClass.md)
- [PIUnitClassLinks](docs/models/PIUnitClassLinks.md)
- [PIUnitLinks](docs/models/PIUnitLinks.md)
- [PIUserInfo](docs/models/PIUserInfo.md)
- [PIValue](docs/models/PIValue.md)
- [PIValueQuery](docs/models/PIValueQuery.md)
- [PIVersion](docs/models/PIVersion.md)
- [PIWebException](docs/models/PIWebException.md)
