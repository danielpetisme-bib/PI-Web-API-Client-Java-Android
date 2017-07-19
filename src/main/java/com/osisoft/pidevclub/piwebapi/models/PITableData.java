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

public class PITableData {
	@SerializedName("Columns")
	private Map<String, String> columns = null;

	@SerializedName("Rows")
	private List<Map<String, Object>> rows = null;

	public PITableData() {
	}


	public void setColumns(Map<String, String> columns) { this.columns = columns;}

	public Map<String, String> getColumns() { return this.columns;}

	public void setRows(List<Map<String, Object>> rows) { this.rows = rows;}

	public List<Map<String, Object>> getRows() { return this.rows;}
}
