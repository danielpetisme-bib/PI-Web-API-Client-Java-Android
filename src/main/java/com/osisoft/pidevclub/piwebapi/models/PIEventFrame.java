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

public class PIEventFrame {
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

	@SerializedName("TemplateName")
	private String templateName = null;

	@SerializedName("HasChildren")
	private Boolean hasChildren = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PIValue> extendedProperties = null;

	@SerializedName("StartTime")
	private String startTime = null;

	@SerializedName("EndTime")
	private String endTime = null;

	@SerializedName("Severity")
	private String severity = null;

	@SerializedName("AcknowledgedBy")
	private String acknowledgedBy = null;

	@SerializedName("AcknowledgedDate")
	private String acknowledgedDate = null;

	@SerializedName("CanBeAcknowledged")
	private Boolean canBeAcknowledged = null;

	@SerializedName("IsAcknowledged")
	private Boolean isAcknowledged = null;

	@SerializedName("IsAnnotated")
	private Boolean isAnnotated = null;

	@SerializedName("IsLocked")
	private Boolean isLocked = null;

	@SerializedName("AreValuesCaptured")
	private Boolean areValuesCaptured = null;

	@SerializedName("RefElementWebIds")
	private List<String> refElementWebIds = null;

	@SerializedName("Security")
	private PISecurity security = null;

	@SerializedName("Links")
	private PIEventFrameLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIEventFrame() {
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

	public void setTemplateName(String templateName) { this.templateName = templateName;}

	public String getTemplateName() { return this.templateName;}

	public void setHasChildren(Boolean hasChildren) { this.hasChildren = hasChildren;}

	public Boolean getHasChildren() { return this.hasChildren;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setExtendedProperties(Map<String, PIValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PIValue> getExtendedProperties() { return this.extendedProperties;}

	public void setStartTime(String startTime) { this.startTime = startTime;}

	public String getStartTime() { return this.startTime;}

	public void setEndTime(String endTime) { this.endTime = endTime;}

	public String getEndTime() { return this.endTime;}

	public void setSeverity(String severity) { this.severity = severity;}

	public String getSeverity() { return this.severity;}

	public void setAcknowledgedBy(String acknowledgedBy) { this.acknowledgedBy = acknowledgedBy;}

	public String getAcknowledgedBy() { return this.acknowledgedBy;}

	public void setAcknowledgedDate(String acknowledgedDate) { this.acknowledgedDate = acknowledgedDate;}

	public String getAcknowledgedDate() { return this.acknowledgedDate;}

	public void setCanBeAcknowledged(Boolean canBeAcknowledged) { this.canBeAcknowledged = canBeAcknowledged;}

	public Boolean getCanBeAcknowledged() { return this.canBeAcknowledged;}

	public void setIsAcknowledged(Boolean isAcknowledged) { this.isAcknowledged = isAcknowledged;}

	public Boolean getIsAcknowledged() { return this.isAcknowledged;}

	public void setIsAnnotated(Boolean isAnnotated) { this.isAnnotated = isAnnotated;}

	public Boolean getIsAnnotated() { return this.isAnnotated;}

	public void setIsLocked(Boolean isLocked) { this.isLocked = isLocked;}

	public Boolean getIsLocked() { return this.isLocked;}

	public void setAreValuesCaptured(Boolean areValuesCaptured) { this.areValuesCaptured = areValuesCaptured;}

	public Boolean getAreValuesCaptured() { return this.areValuesCaptured;}

	public void setRefElementWebIds(List<String> refElementWebIds) { this.refElementWebIds = refElementWebIds;}

	public List<String> getRefElementWebIds() { return this.refElementWebIds;}

	public void setSecurity(PISecurity security) { this.security = security;}

	public PISecurity getSecurity() { return this.security;}

	public void setLinks(PIEventFrameLinks links) { this.links = links;}

	public PIEventFrameLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
