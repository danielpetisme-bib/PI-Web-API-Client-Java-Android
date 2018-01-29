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

public class PIValueQuery {
	@SerializedName("AttributeName")
	private String attributeName = null;

	@SerializedName("AttributeUOM")
	private String attributeUOM = null;

	@SerializedName("AttributeValue")
	private Object attributeValue = null;

	@SerializedName("SearchOperator")
	private String searchOperator = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIValueQuery() {
	}


	public void setAttributeName(String attributeName) { this.attributeName = attributeName;}

	public String getAttributeName() { return this.attributeName;}

	public void setAttributeUOM(String attributeUOM) { this.attributeUOM = attributeUOM;}

	public String getAttributeUOM() { return this.attributeUOM;}

	public void setAttributeValue(Object attributeValue) { this.attributeValue = attributeValue;}

	public Object getAttributeValue() { return this.attributeValue;}

	public void setSearchOperator(String searchOperator) { this.searchOperator = searchOperator;}

	public String getSearchOperator() { return this.searchOperator;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
