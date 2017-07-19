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

public class PIPoint {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private Integer id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Descriptor")
	private String descriptor = null;

	@SerializedName("PointClass")
	private String pointClass = null;

	@SerializedName("PointType")
	private String pointType = null;

	@SerializedName("DigitalSetName")
	private String digitalSetName = null;

	@SerializedName("EngineeringUnits")
	private String engineeringUnits = null;

	@SerializedName("Step")
	private Boolean step = null;

	@SerializedName("Future")
	private Boolean future = null;

	@SerializedName("Links")
	private Map<String, String> links = null;

	public PIPoint() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(Integer id) { this.id = id;}

	public Integer getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setDescriptor(String descriptor) { this.descriptor = descriptor;}

	public String getDescriptor() { return this.descriptor;}

	public void setPointClass(String pointClass) { this.pointClass = pointClass;}

	public String getPointClass() { return this.pointClass;}

	public void setPointType(String pointType) { this.pointType = pointType;}

	public String getPointType() { return this.pointType;}

	public void setDigitalSetName(String digitalSetName) { this.digitalSetName = digitalSetName;}

	public String getDigitalSetName() { return this.digitalSetName;}

	public void setEngineeringUnits(String engineeringUnits) { this.engineeringUnits = engineeringUnits;}

	public String getEngineeringUnits() { return this.engineeringUnits;}

	public void setStep(Boolean step) { this.step = step;}

	public Boolean getStep() { return this.step;}

	public void setFuture(Boolean future) { this.future = future;}

	public Boolean getFuture() { return this.future;}

	public void setLinks(Map<String, String> links) { this.links = links;}

	public Map<String, String> getLinks() { return this.links;}
}
