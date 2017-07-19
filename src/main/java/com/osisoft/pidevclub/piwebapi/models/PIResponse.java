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

public class PIResponse {
	@SerializedName("Status")
	private Integer status = null;

	@SerializedName("Headers")
	private Map<String, String> headers = null;

	@SerializedName("Content")
	private Object content = null;

	public PIResponse() {
	}


	public void setStatus(Integer status) { this.status = status;}

	public Integer getStatus() { return this.status;}

	public void setHeaders(Map<String, String> headers) { this.headers = headers;}

	public Map<String, String> getHeaders() { return this.headers;}

	public void setContent(Object content) { this.content = content;}

	public Object getContent() { return this.content;}
}
