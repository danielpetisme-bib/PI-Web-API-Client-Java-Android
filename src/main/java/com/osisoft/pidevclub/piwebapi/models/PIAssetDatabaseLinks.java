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

public class PIAssetDatabaseLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("Elements")
	private String elements = null;

	@SerializedName("ElementTemplates")
	private String elementTemplates = null;

	@SerializedName("EventFrames")
	private String eventFrames = null;

	@SerializedName("AssetServer")
	private String assetServer = null;

	@SerializedName("ElementCategories")
	private String elementCategories = null;

	@SerializedName("AttributeCategories")
	private String attributeCategories = null;

	@SerializedName("TableCategories")
	private String tableCategories = null;

	@SerializedName("AnalysisCategories")
	private String analysisCategories = null;

	@SerializedName("AnalysisTemplates")
	private String analysisTemplates = null;

	@SerializedName("EnumerationSets")
	private String enumerationSets = null;

	@SerializedName("Tables")
	private String tables = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	public PIAssetDatabaseLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setElements(String elements) { this.elements = elements;}

	public String getElements() { return this.elements;}

	public void setElementTemplates(String elementTemplates) { this.elementTemplates = elementTemplates;}

	public String getElementTemplates() { return this.elementTemplates;}

	public void setEventFrames(String eventFrames) { this.eventFrames = eventFrames;}

	public String getEventFrames() { return this.eventFrames;}

	public void setAssetServer(String assetServer) { this.assetServer = assetServer;}

	public String getAssetServer() { return this.assetServer;}

	public void setElementCategories(String elementCategories) { this.elementCategories = elementCategories;}

	public String getElementCategories() { return this.elementCategories;}

	public void setAttributeCategories(String attributeCategories) { this.attributeCategories = attributeCategories;}

	public String getAttributeCategories() { return this.attributeCategories;}

	public void setTableCategories(String tableCategories) { this.tableCategories = tableCategories;}

	public String getTableCategories() { return this.tableCategories;}

	public void setAnalysisCategories(String analysisCategories) { this.analysisCategories = analysisCategories;}

	public String getAnalysisCategories() { return this.analysisCategories;}

	public void setAnalysisTemplates(String analysisTemplates) { this.analysisTemplates = analysisTemplates;}

	public String getAnalysisTemplates() { return this.analysisTemplates;}

	public void setEnumerationSets(String enumerationSets) { this.enumerationSets = enumerationSets;}

	public String getEnumerationSets() { return this.enumerationSets;}

	public void setTables(String tables) { this.tables = tables;}

	public String getTables() { return this.tables;}

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security;}

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries;}
}
