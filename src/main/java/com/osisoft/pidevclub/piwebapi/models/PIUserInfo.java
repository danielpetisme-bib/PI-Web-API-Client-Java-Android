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

public class PIUserInfo {
	@SerializedName("IdentityType")
	private String identityType = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("IsAuthenticated")
	private Boolean isAuthenticated = null;

	@SerializedName("SID")
	private String sID = null;

	@SerializedName("ImpersonationLevel")
	private String impersonationLevel = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIUserInfo() {
	}


	public void setIdentityType(String identityType) { this.identityType = identityType;}

	public String getIdentityType() { return this.identityType;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setIsAuthenticated(Boolean isAuthenticated) { this.isAuthenticated = isAuthenticated;}

	public Boolean getIsAuthenticated() { return this.isAuthenticated;}

	public void setSID(String sID) { this.sID = sID;}

	public String getSID() { return this.sID;}

	public void setImpersonationLevel(String impersonationLevel) { this.impersonationLevel = impersonationLevel;}

	public String getImpersonationLevel() { return this.impersonationLevel;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
