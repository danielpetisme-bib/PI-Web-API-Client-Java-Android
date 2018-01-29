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
package com.osisoft.pidevclub.piwebapi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.osisoft.pidevclub.piwebapi.models.*;

public class PIAnalysisRule {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("ConfigString")
	private String configString = null;

	@SerializedName("DisplayString")
	private String displayString = null;

	@SerializedName("EditorType")
	private String editorType = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("IsConfigured")
	private Boolean isConfigured = null;

	@SerializedName("IsInitializing")
	private Boolean isInitializing = null;

	@SerializedName("PlugInName")
	private String plugInName = null;

	@SerializedName("SupportedBehaviors")
	private List<String> supportedBehaviors = null;

	@SerializedName("VariableMapping")
	private String variableMapping = null;

	@SerializedName("Links")
	private PIAnalysisRuleLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIAnalysisRule() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setConfigString(String configString) { this.configString = configString;}

	public String getConfigString() { return this.configString;}

	public void setDisplayString(String displayString) { this.displayString = displayString;}

	public String getDisplayString() { return this.displayString;}

	public void setEditorType(String editorType) { this.editorType = editorType;}

	public String getEditorType() { return this.editorType;}

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren;}

	public void setIsConfigured(Boolean isConfigured) { this.isConfigured = isConfigured;}

	public Boolean getIsConfigured() { return this.isConfigured;}

	public void setIsInitializing(Boolean isInitializing) { this.isInitializing = isInitializing;}

	public Boolean getIsInitializing() { return this.isInitializing;}

	public void setPlugInName(String plugInName) { this.plugInName = plugInName;}

	public String getPlugInName() { return this.plugInName;}

	public void setSupportedBehaviors(List<String> supportedBehaviors) { this.supportedBehaviors = supportedBehaviors;}

	public List<String> getSupportedBehaviors() { return this.supportedBehaviors;}

	public void setVariableMapping(String variableMapping) { this.variableMapping = variableMapping;}

	public String getVariableMapping() { return this.variableMapping;}

	public void setLinks(PIAnalysisRuleLinks links) { this.links = links;}

	public PIAnalysisRuleLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
