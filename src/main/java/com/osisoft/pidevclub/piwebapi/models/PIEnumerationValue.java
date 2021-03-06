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

public class PIEnumerationValue {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Value")
	private Integer value = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("Links")
	private PIEnumerationValueLinks links = null;

	@SerializedName("SerializeWebId")
	private Boolean serializeWebId = null;

	@SerializedName("SerializeId")
	private Boolean serializeId = null;

	@SerializedName("SerializeDescription")
	private Boolean serializeDescription = null;

	@SerializedName("SerializePath")
	private Boolean serializePath = null;

	@SerializedName("SerializeLinks")
	private Boolean serializeLinks = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIEnumerationValue() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setValue(Integer value) { this.value = value;}

	public Integer getValue() { return this.value;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent;}

	public void setLinks(PIEnumerationValueLinks links) { this.links = links;}

	public PIEnumerationValueLinks getLinks() { return this.links;}

	public void setSerializeWebId(Boolean serializeWebId) { this.serializeWebId = serializeWebId;}

	public Boolean getSerializeWebId() { return this.serializeWebId;}

	public void setSerializeId(Boolean serializeId) { this.serializeId = serializeId;}

	public Boolean getSerializeId() { return this.serializeId;}

	public void setSerializeDescription(Boolean serializeDescription) { this.serializeDescription = serializeDescription;}

	public Boolean getSerializeDescription() { return this.serializeDescription;}

	public void setSerializePath(Boolean serializePath) { this.serializePath = serializePath;}

	public Boolean getSerializePath() { return this.serializePath;}

	public void setSerializeLinks(Boolean serializeLinks) { this.serializeLinks = serializeLinks;}

	public Boolean getSerializeLinks() { return this.serializeLinks;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
