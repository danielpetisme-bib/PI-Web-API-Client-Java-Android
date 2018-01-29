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

public class PIPointLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("DataServer")
	private String dataServer = null;

	@SerializedName("Attributes")
	private String attributes = null;

	@SerializedName("InterpolatedData")
	private String interpolatedData = null;

	@SerializedName("RecordedData")
	private String recordedData = null;

	@SerializedName("PlotData")
	private String plotData = null;

	@SerializedName("SummaryData")
	private String summaryData = null;

	@SerializedName("Value")
	private String value = null;

	@SerializedName("EndValue")
	private String endValue = null;

	public PIPointLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setDataServer(String dataServer) { this.dataServer = dataServer;}

	public String getDataServer() { return this.dataServer;}

	public void setAttributes(String attributes) { this.attributes = attributes;}

	public String getAttributes() { return this.attributes;}

	public void setInterpolatedData(String interpolatedData) { this.interpolatedData = interpolatedData;}

	public String getInterpolatedData() { return this.interpolatedData;}

	public void setRecordedData(String recordedData) { this.recordedData = recordedData;}

	public String getRecordedData() { return this.recordedData;}

	public void setPlotData(String plotData) { this.plotData = plotData;}

	public String getPlotData() { return this.plotData;}

	public void setSummaryData(String summaryData) { this.summaryData = summaryData;}

	public String getSummaryData() { return this.summaryData;}

	public void setValue(String value) { this.value = value;}

	public String getValue() { return this.value;}

	public void setEndValue(String endValue) { this.endValue = endValue;}

	public String getEndValue() { return this.endValue;}
}
