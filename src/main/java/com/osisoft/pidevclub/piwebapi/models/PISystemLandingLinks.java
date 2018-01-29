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

public class PISystemLandingLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("CacheInstances")
	private String cacheInstances = null;

	@SerializedName("Configuration")
	private String configuration = null;

	@SerializedName("UserInfo")
	private String userInfo = null;

	@SerializedName("Versions")
	private String versions = null;

	@SerializedName("Status")
	private String status = null;

	public PISystemLandingLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setCacheInstances(String cacheInstances) { this.cacheInstances = cacheInstances;}

	public String getCacheInstances() { return this.cacheInstances;}

	public void setConfiguration(String configuration) { this.configuration = configuration;}

	public String getConfiguration() { return this.configuration;}

	public void setUserInfo(String userInfo) { this.userInfo = userInfo;}

	public String getUserInfo() { return this.userInfo;}

	public void setVersions(String versions) { this.versions = versions;}

	public String getVersions() { return this.versions;}

	public void setStatus(String status) { this.status = status;}

	public String getStatus() { return this.status;}
}
