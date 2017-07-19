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

public class PISearchByAttributeElement {
	@SerializedName("SearchRoot")
	private Object searchRoot = null;

	@SerializedName("ElementTemplate")
	private Object elementTemplate = null;

	@SerializedName("ValueQueries")
	private List<PIAttributeValueQuery> valueQueries = null;

	public PISearchByAttributeElement() {
	}


	public void setSearchRoot(Object searchRoot) { this.searchRoot = searchRoot;}

	public Object getSearchRoot() { return this.searchRoot;}

	public void setElementTemplate(Object elementTemplate) { this.elementTemplate = elementTemplate;}

	public Object getElementTemplate() { return this.elementTemplate;}

	public void setValueQueries(List<PIAttributeValueQuery> valueQueries) { this.valueQueries = valueQueries;}

	public List<PIAttributeValueQuery> getValueQueries() { return this.valueQueries;}
}
