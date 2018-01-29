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

public class PIItemsPoint {
	@SerializedName("Items")
	private List<PIPoint> items = null;

	@SerializedName("Links")
	private PIPaginationLinks links = null;

	public PIItemsPoint() {
	}


	public void setItems(List<PIPoint> items) { this.items = items;}

	public List<PIPoint> getItems() { return this.items;}

	public void setLinks(PIPaginationLinks links) { this.links = links;}

	public PIPaginationLinks getLinks() { return this.links;}
}
