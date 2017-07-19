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

public class PIAttributeTrait {
	@SerializedName("Name")
	private String name = null;

	@SerializedName("Abbreviation")
	private String abbreviation = null;

	@SerializedName("AllowChildAttributes")
	private Boolean allowChildAttributes = null;

	@SerializedName("AllowDuplicates")
	private Boolean allowDuplicates = null;

	@SerializedName("IsAllowedOnRootAttribute")
	private Boolean isAllowedOnRootAttribute = null;

	@SerializedName("IsTypeInherited")
	private Boolean isTypeInherited = null;

	@SerializedName("IsUOMInherited")
	private Boolean isUOMInherited = null;

	@SerializedName("RequireNumeric")
	private Boolean requireNumeric = null;

	@SerializedName("RequireString")
	private Boolean requireString = null;

	@SerializedName("Links")
	private Map<String, String> links = null;

	public PIAttributeTrait() {
	}


	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation;}

	public String getAbbreviation() { return this.abbreviation;}

	public void setAllowChildAttributes(Boolean allowChildAttributes) { this.allowChildAttributes = allowChildAttributes;}

	public Boolean getAllowChildAttributes() { return this.allowChildAttributes;}

	public void setAllowDuplicates(Boolean allowDuplicates) { this.allowDuplicates = allowDuplicates;}

	public Boolean getAllowDuplicates() { return this.allowDuplicates;}

	public void setIsAllowedOnRootAttribute(Boolean isAllowedOnRootAttribute) { this.isAllowedOnRootAttribute = isAllowedOnRootAttribute;}

	public Boolean getIsAllowedOnRootAttribute() { return this.isAllowedOnRootAttribute;}

	public void setIsTypeInherited(Boolean isTypeInherited) { this.isTypeInherited = isTypeInherited;}

	public Boolean getIsTypeInherited() { return this.isTypeInherited;}

	public void setIsUOMInherited(Boolean isUOMInherited) { this.isUOMInherited = isUOMInherited;}

	public Boolean getIsUOMInherited() { return this.isUOMInherited;}

	public void setRequireNumeric(Boolean requireNumeric) { this.requireNumeric = requireNumeric;}

	public Boolean getRequireNumeric() { return this.requireNumeric;}

	public void setRequireString(Boolean requireString) { this.requireString = requireString;}

	public Boolean getRequireString() { return this.requireString;}

	public void setLinks(Map<String, String> links) { this.links = links;}

	public Map<String, String> getLinks() { return this.links;}
}
