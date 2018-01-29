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

public class PIAssetServerLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("Databases")
	private String databases = null;

	@SerializedName("SecurityIdentities")
	private String securityIdentities = null;

	@SerializedName("SecurityMappings")
	private String securityMappings = null;

	@SerializedName("UnitClasses")
	private String unitClasses = null;

	@SerializedName("AnalysisRulePlugIns")
	private String analysisRulePlugIns = null;

	@SerializedName("TimeRulePlugIns")
	private String timeRulePlugIns = null;

	@SerializedName("Security")
	private String security = null;

	@SerializedName("SecurityEntries")
	private String securityEntries = null;

	public PIAssetServerLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setDatabases(String databases) { this.databases = databases;}

	public String getDatabases() { return this.databases;}

	public void setSecurityIdentities(String securityIdentities) { this.securityIdentities = securityIdentities;}

	public String getSecurityIdentities() { return this.securityIdentities;}

	public void setSecurityMappings(String securityMappings) { this.securityMappings = securityMappings;}

	public String getSecurityMappings() { return this.securityMappings;}

	public void setUnitClasses(String unitClasses) { this.unitClasses = unitClasses;}

	public String getUnitClasses() { return this.unitClasses;}

	public void setAnalysisRulePlugIns(String analysisRulePlugIns) { this.analysisRulePlugIns = analysisRulePlugIns;}

	public String getAnalysisRulePlugIns() { return this.analysisRulePlugIns;}

	public void setTimeRulePlugIns(String timeRulePlugIns) { this.timeRulePlugIns = timeRulePlugIns;}

	public String getTimeRulePlugIns() { return this.timeRulePlugIns;}

	public void setSecurity(String security) { this.security = security;}

	public String getSecurity() { return this.security;}

	public void setSecurityEntries(String securityEntries) { this.securityEntries = securityEntries;}

	public String getSecurityEntries() { return this.securityEntries;}
}
