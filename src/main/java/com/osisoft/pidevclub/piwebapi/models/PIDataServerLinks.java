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

public class PIDataServerLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("Points")
	private String points = null;

	@SerializedName("EnumerationSets")
	private String enumerationSets = null;

	public PIDataServerLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setPoints(String points) { this.points = points;}

	public String getPoints() { return this.points;}

	public void setEnumerationSets(String enumerationSets) { this.enumerationSets = enumerationSets;}

	public String getEnumerationSets() { return this.enumerationSets;}
}
