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

public class PISecurityEntry {
	@SerializedName("Name")
	private String name = null;

	@SerializedName("SecurityIdentityName")
	private String securityIdentityName = null;

	@SerializedName("AllowRights")
	private List<String> allowRights = null;

	@SerializedName("DenyRights")
	private List<String> denyRights = null;

	@SerializedName("Links")
	private PISecurityEntryLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PISecurityEntry() {
	}


	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setSecurityIdentityName(String securityIdentityName) { this.securityIdentityName = securityIdentityName;}

	public String getSecurityIdentityName() { return this.securityIdentityName;}

	public void setAllowRights(List<String> allowRights) { this.allowRights = allowRights;}

	public List<String> getAllowRights() { return this.allowRights;}

	public void setDenyRights(List<String> denyRights) { this.denyRights = denyRights;}

	public List<String> getDenyRights() { return this.denyRights;}

	public void setLinks(PISecurityEntryLinks links) { this.links = links;}

	public PISecurityEntryLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
