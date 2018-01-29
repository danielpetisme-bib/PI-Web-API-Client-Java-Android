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

public class PIAnalysisRuleLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("AnalysisRules")
	private String analysisRules = null;

	@SerializedName("Analysis")
	private String analysis = null;

	@SerializedName("AnalysisTemplate")
	private String analysisTemplate = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("PlugIn")
	private String plugIn = null;

	public PIAnalysisRuleLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setAnalysisRules(String analysisRules) { this.analysisRules = analysisRules;}

	public String getAnalysisRules() { return this.analysisRules;}

	public void setAnalysis(String analysis) { this.analysis = analysis;}

	public String getAnalysis() { return this.analysis;}

	public void setAnalysisTemplate(String analysisTemplate) { this.analysisTemplate = analysisTemplate;}

	public String getAnalysisTemplate() { return this.analysisTemplate;}

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent;}

	public void setPlugIn(String plugIn) { this.plugIn = plugIn;}

	public String getPlugIn() { return this.plugIn;}
}
