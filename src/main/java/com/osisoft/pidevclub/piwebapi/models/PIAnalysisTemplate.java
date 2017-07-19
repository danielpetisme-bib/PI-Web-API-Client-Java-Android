/*
 *
 * Copyright 2017 OSIsoft, LLC
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

public class PIAnalysisTemplate {
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

	@SerializedName("AnalysisRulePlugInName")
	private String analysisRulePlugInName = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("CreateEnabled")
	private Boolean createEnabled = null;

	@SerializedName("GroupId")
	private Integer groupId = null;

	@SerializedName("HasNotificationTemplate")
	private Boolean hasNotificationTemplate = null;

	@SerializedName("HasTarget")
	private Boolean hasTarget = null;

	@SerializedName("OutputTime")
	private String outputTime = null;

	@SerializedName("TargetName")
	private String targetName = null;

	@SerializedName("TimeRulePlugInName")
	private String timeRulePlugInName = null;

	@SerializedName("Links")
	private Map<String, String> links = null;

	public PIAnalysisTemplate() {
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

	public void setAnalysisRulePlugInName(String analysisRulePlugInName) { this.analysisRulePlugInName = analysisRulePlugInName;}

	public String getAnalysisRulePlugInName() { return this.analysisRulePlugInName;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setCreateEnabled(Boolean createEnabled) { this.createEnabled = createEnabled;}

	public Boolean getCreateEnabled() { return this.createEnabled;}

	public void setGroupId(Integer groupId) { this.groupId = groupId;}

	public Integer getGroupId() { return this.groupId;}

	public void setHasNotificationTemplate(Boolean hasNotificationTemplate) { this.hasNotificationTemplate = hasNotificationTemplate;}

	public Boolean getHasNotificationTemplate() { return this.hasNotificationTemplate;}

	public void setHasTarget(Boolean hasTarget) { this.hasTarget = hasTarget;}

	public Boolean getHasTarget() { return this.hasTarget;}

	public void setOutputTime(String outputTime) { this.outputTime = outputTime;}

	public String getOutputTime() { return this.outputTime;}

	public void setTargetName(String targetName) { this.targetName = targetName;}

	public String getTargetName() { return this.targetName;}

	public void setTimeRulePlugInName(String timeRulePlugInName) { this.timeRulePlugInName = timeRulePlugInName;}

	public String getTimeRulePlugInName() { return this.timeRulePlugInName;}

	public void setLinks(Map<String, String> links) { this.links = links;}

	public Map<String, String> getLinks() { return this.links;}
}
