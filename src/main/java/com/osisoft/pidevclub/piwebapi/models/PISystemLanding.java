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

public class PISystemLanding {
	@SerializedName("ProductTitle")
	private String productTitle = null;

	@SerializedName("ProductVersion")
	private String productVersion = null;

	@SerializedName("Links")
	private PISystemLandingLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PISystemLanding() {
	}


	public void setProductTitle(String productTitle) { this.productTitle = productTitle;}

	public String getProductTitle() { return this.productTitle;}

	public void setProductVersion(String productVersion) { this.productVersion = productVersion;}

	public String getProductVersion() { return this.productVersion;}

	public void setLinks(PISystemLandingLinks links) { this.links = links;}

	public PISystemLandingLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
