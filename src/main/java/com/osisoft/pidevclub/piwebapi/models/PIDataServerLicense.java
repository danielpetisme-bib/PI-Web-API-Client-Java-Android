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

public class PIDataServerLicense {
	@SerializedName("AmountLeft")
	private String amountLeft = null;

	@SerializedName("AmountUsed")
	private String amountUsed = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("TotalAmount")
	private String totalAmount = null;

	@SerializedName("Links")
	private PIDataServerLicenseLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIDataServerLicense() {
	}


	public void setAmountLeft(String amountLeft) { this.amountLeft = amountLeft;}

	public String getAmountLeft() { return this.amountLeft;}

	public void setAmountUsed(String amountUsed) { this.amountUsed = amountUsed;}

	public String getAmountUsed() { return this.amountUsed;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount;}

	public String getTotalAmount() { return this.totalAmount;}

	public void setLinks(PIDataServerLicenseLinks links) { this.links = links;}

	public PIDataServerLicenseLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
