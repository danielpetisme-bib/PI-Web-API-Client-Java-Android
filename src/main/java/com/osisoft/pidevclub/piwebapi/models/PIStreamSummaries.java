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

public class PIStreamSummaries {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("Items")
	private List<PISummaryValue> items = null;

	@SerializedName("Links")
	private PIStreamSummariesLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIStreamSummaries() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setItems(List<PISummaryValue> items) { this.items = items;}

	public List<PISummaryValue> getItems() { return this.items;}

	public void setLinks(PIStreamSummariesLinks links) { this.links = links;}

	public PIStreamSummariesLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
