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

public class PIElementTemplateLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("AnalysisTemplates")
	private String analysisTemplates = null;

	@SerializedName("AttributeTemplates")
	private String attributeTemplates = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("BaseTemplate")
	private String baseTemplate = null;

	@SerializedName("DefaultAttribute")
	private String defaultAttribute = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	public PIElementTemplateLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setAnalysisTemplates(String analysisTemplates) { this.analysisTemplates = analysisTemplates;}

	public String getAnalysisTemplates() { return this.analysisTemplates;}

	public void setAttributeTemplates(String attributeTemplates) { this.attributeTemplates = attributeTemplates;}

	public String getAttributeTemplates() { return this.attributeTemplates;}

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database;}

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories;}

	public void setBaseTemplate(String baseTemplate) { this.baseTemplate = baseTemplate;}

	public String getBaseTemplate() { return this.baseTemplate;}

	public void setDefaultAttribute(String defaultAttribute) { this.defaultAttribute = defaultAttribute;}

	public String getDefaultAttribute() { return this.defaultAttribute;}

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security;}

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries;}
}
