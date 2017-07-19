package com.osisoft.pidevclub.piwebapi;

import com.osisoft.pidevclub.piwebapi.api.*;

public class PIWebApiClient
{
    private ApiClient apiClient = null;
    private String baseUrl = null;
    private Boolean cacheDisabled = null;

    public PIWebApiClient(String baseUrl, String username, String password, Boolean verifySsl, Boolean debug)
    {
        this.baseUrl = baseUrl;
        this.cacheDisabled = true;
        this.apiClient = new ApiClient();
        this.apiClient.setVerifyingSsl(verifySsl);
        this.apiClient.setDebugging(debug);
        this.apiClient.buildClient();
        this.apiClient.setBasicAuth();
        this.apiClient.setUsername(username);
        this.apiClient.setPassword(password);
        this.apiClient.setBasePath(baseUrl);


    }



    public AnalysisApi getAnalysis()
    {
        return new AnalysisApi(apiClient);
    }

    public AnalysisCategoryApi getAnalysisCategory()
    {
        return new AnalysisCategoryApi(apiClient);
    }

    public AnalysisRulePlugInApi getAnalysisRulePlugIn()
    {
        return new AnalysisRulePlugInApi(apiClient);
    }


    public AnalysisRuleApi getAnalysisRule()
    {
        return new AnalysisRuleApi(apiClient);
    }

    public AnalysisTemplateApi getAnalysisTemplate()
    {
        return new AnalysisTemplateApi(apiClient);
    }

    public AssetDatabaseApi getAssetData()
    {
        return new AssetDatabaseApi(apiClient);
    }

    public AssetServerApi getAssetServer()
    {
        return new AssetServerApi(apiClient);
    }

    public AttributeApi getAttribute()
    {
        return new AttributeApi(apiClient);
    }

    public AttributeCategoryApi getAttributeCategory()
    {
        return new AttributeCategoryApi(apiClient);
    }

    public AttributeTemplateApi getAttributeTemplate()
    {
        return new AttributeTemplateApi(apiClient);
    }

    public AttributeTraitApi getAttributeTrait()
    {
        return new AttributeTraitApi(apiClient);
    }



    public CalculationApi getCalculation()
    {
        return new CalculationApi(apiClient);
    }

    public ConfigurationApi getConfiguration()
    {
        return new ConfigurationApi(apiClient);
    }

    public DataServerApi getDataServer()
    {
        return new DataServerApi(apiClient);
    }

    public ElementApi getElement()
    {
        return new ElementApi(apiClient);
    }

    public ElementCategoryApi getElementCategory()
    {
        return new ElementCategoryApi(apiClient);
    }



    public ElementTemplateApi getElementTemplate()
    {
        return new ElementTemplateApi (apiClient);
    }


    public EnumerationSetApi getEnumerationSet()
    {
        return new EnumerationSetApi(apiClient);
    }


    public EnumerationValueApi getEnumerationValue()
    {
        return new EnumerationValueApi(apiClient);
    }

    public EventFrameApi getEventFrame()
    {
        return new EventFrameApi(apiClient);
    }


    public HomeApi getHome()
    {
        return new  HomeApi(apiClient);
    }


    public PointApi getPoint()
    {
        return new PointApi(apiClient);
    }


    public SecurityIdentityApi getSecurityIdentity()
    {
        return new SecurityIdentityApi(apiClient);
    }

    public SecurityMappingApi getSecurityMapping()
    {
        return new SecurityMappingApi(apiClient);
    }

    public StreamApi getStream()
    {
        return new StreamApi(apiClient);
    }

    public StreamSetApi getStreamSet()
    {
        return new StreamSetApi(apiClient);
    }


    public SystemApi getSystem()
    {
        return new SystemApi(apiClient);
    }

    public TableApi getTable()
    {
        return new TableApi(apiClient);
    }

    public TableCategoryApi getTableCategory()
    {
        return new TableCategoryApi(apiClient);
    }

    public TimeRuleApi getTimeRule()
    {
        return new TimeRuleApi(apiClient);
    }

    public TimeRulePlugInApi getTimeRulePlugIn()
    {
        return new TimeRulePlugInApi (apiClient);
    }

    public UnitApi getUnit()
    {
        return new UnitApi(apiClient);
    }
    public UnitClassApi getUnitClass()
    {
        return new UnitClassApi (apiClient);
    }
}
