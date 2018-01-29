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

public class PIPaginationLinks {
	@SerializedName("First")
	private String first = null;

	@SerializedName("Previous")
	private String previous = null;

	@SerializedName("Next")
	private String next = null;

	@SerializedName("Last")
	private String last = null;

	public PIPaginationLinks() {
	}


	public void setFirst(String first) { this.first = first;}

	public String getFirst() { return this.first;}

	public void setPrevious(String previous) { this.previous = previous;}

	public String getPrevious() { return this.previous;}

	public void setNext(String next) { this.next = next;}

	public String getNext() { return this.next;}

	public void setLast(String last) { this.last = last;}

	public String getLast() { return this.last;}
}
