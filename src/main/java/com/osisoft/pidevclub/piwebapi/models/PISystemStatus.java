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

public class PISystemStatus {
	@SerializedName("UpTimeInMinutes")
	private Double upTimeInMinutes = null;

	@SerializedName("State")
	private String state = null;

	@SerializedName("CacheInstances")
	private Integer cacheInstances = null;

	public PISystemStatus() {
	}


	public void setUpTimeInMinutes(Double upTimeInMinutes) { this.upTimeInMinutes = upTimeInMinutes;}

	public Double getUpTimeInMinutes() { return this.upTimeInMinutes;}

	public void setState(String state) { this.state = state;}

	public String getState() { return this.state;}

	public void setCacheInstances(Integer cacheInstances) { this.cacheInstances = cacheInstances;}

	public Integer getCacheInstances() { return this.cacheInstances;}
}
