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

public class PITimeRulePlugIn {
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

	@SerializedName("AssemblyFileName")
	private String assemblyFileName = null;

	@SerializedName("AssemblyID")
	private String assemblyID = null;

	@SerializedName("AssemblyLoadProperties")
	private List<String> assemblyLoadProperties = null;

	@SerializedName("AssemblyTime")
	private String assemblyTime = null;

	@SerializedName("CompatibilityVersion")
	private Integer compatibilityVersion = null;

	@SerializedName("IsBrowsable")
	private Boolean isBrowsable = null;

	@SerializedName("IsNonEditableConfig")
	private Boolean isNonEditableConfig = null;

	@SerializedName("LoadedAssemblyTime")
	private String loadedAssemblyTime = null;

	@SerializedName("LoadedVersion")
	private String loadedVersion = null;

	@SerializedName("Version")
	private String version = null;

	@SerializedName("Links")
	private PITimeRulePlugInLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PITimeRulePlugIn() {
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

	public void setAssemblyFileName(String assemblyFileName) { this.assemblyFileName = assemblyFileName;}

	public String getAssemblyFileName() { return this.assemblyFileName;}

	public void setAssemblyID(String assemblyID) { this.assemblyID = assemblyID;}

	public String getAssemblyID() { return this.assemblyID;}

	public void setAssemblyLoadProperties(List<String> assemblyLoadProperties) { this.assemblyLoadProperties = assemblyLoadProperties;}

	public List<String> getAssemblyLoadProperties() { return this.assemblyLoadProperties;}

	public void setAssemblyTime(String assemblyTime) { this.assemblyTime = assemblyTime;}

	public String getAssemblyTime() { return this.assemblyTime;}

	public void setCompatibilityVersion(Integer compatibilityVersion) { this.compatibilityVersion = compatibilityVersion;}

	public Integer getCompatibilityVersion() { return this.compatibilityVersion;}

	public void setIsBrowsable(Boolean isBrowsable) { this.isBrowsable = isBrowsable;}

	public Boolean getIsBrowsable() { return this.isBrowsable;}

	public void setIsNonEditableConfig(Boolean isNonEditableConfig) { this.isNonEditableConfig = isNonEditableConfig;}

	public Boolean getIsNonEditableConfig() { return this.isNonEditableConfig;}

	public void setLoadedAssemblyTime(String loadedAssemblyTime) { this.loadedAssemblyTime = loadedAssemblyTime;}

	public String getLoadedAssemblyTime() { return this.loadedAssemblyTime;}

	public void setLoadedVersion(String loadedVersion) { this.loadedVersion = loadedVersion;}

	public String getLoadedVersion() { return this.loadedVersion;}

	public void setVersion(String version) { this.version = version;}

	public String getVersion() { return this.version;}

	public void setLinks(PITimeRulePlugInLinks links) { this.links = links;}

	public PITimeRulePlugInLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
