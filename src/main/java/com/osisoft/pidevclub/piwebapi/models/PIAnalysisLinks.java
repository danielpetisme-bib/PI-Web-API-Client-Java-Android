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

public class PIAnalysisLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("Target")
	private String target = null;

	@SerializedName("Database")
	private String database = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Template")
	private String template = null;

	@SerializedName("AnalysisRule")
	private String analysisRule = null;

	@SerializedName("AnalysisRulePlugIn")
	private String analysisRulePlugIn = null;

	@SerializedName("TimeRule")
	private String timeRule = null;

	@SerializedName("TimeRulePlugIn")
	private String timeRulePlugIn = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	public PIAnalysisLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setTarget(String target) { this.target = target;}

	public String getTarget() { return this.target;}

	public void setDatabase(String database) { this.database = database;}

	public String getDatabase() { return this.database;}

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories;}

	public void setTemplate(String template) { this.template = template;}

	public String getTemplate() { return this.template;}

	public void setAnalysisRule(String analysisRule) { this.analysisRule = analysisRule;}

	public String getAnalysisRule() { return this.analysisRule;}

	public void setAnalysisRulePlugIn(String analysisRulePlugIn) { this.analysisRulePlugIn = analysisRulePlugIn;}

	public String getAnalysisRulePlugIn() { return this.analysisRulePlugIn;}

	public void setTimeRule(String timeRule) { this.timeRule = timeRule;}

	public String getTimeRule() { return this.timeRule;}

	public void setTimeRulePlugIn(String timeRulePlugIn) { this.timeRulePlugIn = timeRulePlugIn;}

	public String getTimeRulePlugIn() { return this.timeRulePlugIn;}

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security;}

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries;}
}
