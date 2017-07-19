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

public class PIRequest {
	@SerializedName("Method")
	private String method = null;

	@SerializedName("Resource")
	private String resource = null;

	@SerializedName("RequestTemplate")
	private PIRequestTemplate requestTemplate = null;

	@SerializedName("Parameters")
	private List<String> parameters = null;

	@SerializedName("Headers")
	private Map<String, String> headers = null;

	@SerializedName("Content")
	private String content = null;

	@SerializedName("ParentIds")
	private List<String> parentIds = null;

	public PIRequest() {
	}


	public void setMethod(String method) { this.method = method;}

	public String getMethod() { return this.method;}

	public void setResource(String resource) { this.resource = resource;}

	public String getResource() { return this.resource;}

	public void setRequestTemplate(PIRequestTemplate requestTemplate) { this.requestTemplate = requestTemplate;}

	public PIRequestTemplate getRequestTemplate() { return this.requestTemplate;}

	public void setParameters(List<String> parameters) { this.parameters = parameters;}

	public List<String> getParameters() { return this.parameters;}

	public void setHeaders(Map<String, String> headers) { this.headers = headers;}

	public Map<String, String> getHeaders() { return this.headers;}

	public void setContent(String content) { this.content = content;}

	public String getContent() { return this.content;}

	public void setParentIds(List<String> parentIds) { this.parentIds = parentIds;}

	public List<String> getParentIds() { return this.parentIds;}
}
