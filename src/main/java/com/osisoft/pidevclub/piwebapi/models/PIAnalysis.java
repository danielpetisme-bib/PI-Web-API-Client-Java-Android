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

public class PIAnalysis {
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

	@SerializedName("AutoCreated")
	private Boolean autoCreated = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("GroupId")
	private Integer groupId = null;

	@SerializedName("HasNotification")
	private Boolean hasNotification = null;

	@SerializedName("HasTarget")
	private Boolean hasTarget = null;

	@SerializedName("HasTemplate")
	private Boolean hasTemplate = null;

	@SerializedName("IsConfigured")
	private Boolean isConfigured = null;

	@SerializedName("IsTimeRuleDefinedByTemplate")
	private Boolean isTimeRuleDefinedByTemplate = null;

	@SerializedName("MaximumQueueSize")
	private Integer maximumQueueSize = null;

	@SerializedName("OutputTime")
	private String outputTime = null;

	@SerializedName("Priority")
	private String priority = null;

	@SerializedName("PublishResults")
	private Boolean publishResults = null;

	@SerializedName("Status")
	private String status = null;

	@SerializedName("TargetWebId")
	private String targetWebId = null;

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("TimeRulePlugInName")
	private String timeRulePlugInName = null;

	@SerializedName("Links")
	private PIAnalysisLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIAnalysis() {
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

	public void setAutoCreated(Boolean autoCreated) { this.autoCreated = autoCreated;}

	public Boolean getAutoCreated() { return this.autoCreated;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setGroupId(Integer groupId) { this.groupId = groupId;}

	public Integer getGroupId() { return this.groupId;}

	public void setHasNotification(Boolean hasNotification) { this.hasNotification = hasNotification;}

	public Boolean getHasNotification() { return this.hasNotification;}

	public void setHasTarget(Boolean hasTarget) { this.hasTarget = hasTarget;}

	public Boolean getHasTarget() { return this.hasTarget;}

	public void setHasTemplate(Boolean hasTemplate) { this.hasTemplate = hasTemplate;}

	public Boolean getHasTemplate() { return this.hasTemplate;}

	public void setIsConfigured(Boolean isConfigured) { this.isConfigured = isConfigured;}

	public Boolean getIsConfigured() { return this.isConfigured;}

	public void setIsTimeRuleDefinedByTemplate(Boolean isTimeRuleDefinedByTemplate) { this.isTimeRuleDefinedByTemplate = isTimeRuleDefinedByTemplate;}

	public Boolean getIsTimeRuleDefinedByTemplate() { return this.isTimeRuleDefinedByTemplate;}

	public void setMaximumQueueSize(Integer maximumQueueSize) { this.maximumQueueSize = maximumQueueSize;}

	public Integer getMaximumQueueSize() { return this.maximumQueueSize;}

	public void setOutputTime(String outputTime) { this.outputTime = outputTime;}

	public String getOutputTime() { return this.outputTime;}

	public void setPriority(String priority) { this.priority = priority;}

	public String getPriority() { return this.priority;}

	public void setPublishResults(Boolean publishResults) { this.publishResults = publishResults;}

	public Boolean getPublishResults() { return this.publishResults;}

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status;}

	public void setTargetWebId(String targetWebId) { this.targetWebId = targetWebId;}

	public String getTargetWebId() { return this.targetWebId;}

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName;}

	public void setTimeRulePlugInName(String timeRulePlugInName) { this.timeRulePlugInName = timeRulePlugInName;}

	public String getTimeRulePlugInName() { return this.timeRulePlugInName;}

	public void setLinks(PIAnalysisLinks links) { this.links = links;}

	public PIAnalysisLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
