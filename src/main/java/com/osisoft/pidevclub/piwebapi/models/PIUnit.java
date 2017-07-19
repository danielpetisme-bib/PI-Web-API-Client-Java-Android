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

public class PIUnit {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Abbreviation")
	private String abbreviation = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Factor")
	private Double factor = null;

	@SerializedName("Offset")
	private Double offset = null;

	@SerializedName("ReferenceFactor")
	private Double referenceFactor = null;

	@SerializedName("ReferenceOffset")
	private Double referenceOffset = null;

	@SerializedName("ReferenceUnitAbbreviation")
	private String referenceUnitAbbreviation = null;

	@SerializedName("Links")
	private Map<String, String> links = null;

	public PIUnit() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation;}

	public String getAbbreviation() { return this.abbreviation;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setFactor(Double factor) { this.factor = factor;}

	public Double getFactor() { return this.factor;}

	public void setOffset(Double offset) { this.offset = offset;}

	public Double getOffset() { return this.offset;}

	public void setReferenceFactor(Double referenceFactor) { this.referenceFactor = referenceFactor;}

	public Double getReferenceFactor() { return this.referenceFactor;}

	public void setReferenceOffset(Double referenceOffset) { this.referenceOffset = referenceOffset;}

	public Double getReferenceOffset() { return this.referenceOffset;}

	public void setReferenceUnitAbbreviation(String referenceUnitAbbreviation) { this.referenceUnitAbbreviation = referenceUnitAbbreviation;}

	public String getReferenceUnitAbbreviation() { return this.referenceUnitAbbreviation;}

	public void setLinks(Map<String, String> links) { this.links = links;}

	public Map<String, String> getLinks() { return this.links;}
}
