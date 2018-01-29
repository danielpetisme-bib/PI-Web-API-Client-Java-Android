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

public class PIVersion {
	@SerializedName("FullVersion")
	private String fullVersion = null;

	@SerializedName("MajorMinorRevision")
	private String majorMinorRevision = null;

	@SerializedName("Build")
	private String build = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIVersion() {
	}


	public void setFullVersion(String fullVersion) { this.fullVersion = fullVersion;}

	public String getFullVersion() { return this.fullVersion;}

	public void setMajorMinorRevision(String majorMinorRevision) { this.majorMinorRevision = majorMinorRevision;}

	public String getMajorMinorRevision() { return this.majorMinorRevision;}

	public void setBuild(String build) { this.build = build;}

	public String getBuild() { return this.build;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
