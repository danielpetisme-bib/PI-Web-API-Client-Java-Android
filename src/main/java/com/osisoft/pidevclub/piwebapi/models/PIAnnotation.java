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

public class PIAnnotation {
	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("Creator")
	private String creator = null;

	@SerializedName("CreationDate")
	private String creationDate = null;

	@SerializedName("Modifier")
	private String modifier = null;

	@SerializedName("ModifyDate")
	private String modifyDate = null;

	@SerializedName("Links")
	private PIAnnotationLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIAnnotation() {
	}


	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value;}

	public void setCreator(String creator) { this.creator = creator;}

	public String getCreator() { return this.creator;}

	public void setCreationDate(String creationDate) { this.creationDate = creationDate;}

	public String getCreationDate() { return this.creationDate;}

	public void setModifier(String modifier) { this.modifier = modifier;}

	public String getModifier() { return this.modifier;}

	public void setModifyDate(String modifyDate) { this.modifyDate = modifyDate;}

	public String getModifyDate() { return this.modifyDate;}

	public void setLinks(PIAnnotationLinks links) { this.links = links;}

	public PIAnnotationLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
