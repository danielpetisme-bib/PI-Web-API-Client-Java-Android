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

public class PILandingLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("AssetServers")
	private String assetServers = null;

	@SerializedName("DataServers")
	private String dataServers = null;

	@SerializedName("Search")
	private String search = null;

	@SerializedName("System")
	private String system = null;

	public PILandingLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setAssetServers(String assetServers) { this.assetServers = assetServers;}

	public String getAssetServers() { return this.assetServers;}

	public void setDataServers(String dataServers) { this.dataServers = dataServers;}

	public String getDataServers() { return this.dataServers;}

	public void setSearch(String search) { this.search = search;}

	public String getSearch() { return this.search;}

	public void setSystem(String system) { this.system = system;}

	public String getSystem() { return this.system;}
}
