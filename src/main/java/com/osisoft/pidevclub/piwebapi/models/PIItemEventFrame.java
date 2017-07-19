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

public class PIItemEventFrame {
	@SerializedName("Identifier")
	private String identifier = null;

	@SerializedName("IdentifierType")
	private String identifierType = null;

	@SerializedName("Object")
	private PIEventFrame object = null;

	@SerializedName("Exception")
	private PIErrors exception = null;

	public PIItemEventFrame() {
	}


	public void setIdentifier(String identifier) { this.identifier = identifier;}

	public String getIdentifier() { return this.identifier;}

	public void setIdentifierType(String identifierType) { this.identifierType = identifierType;}

	public String getIdentifierType() { return this.identifierType;}

	public void setObject(PIEventFrame object) { this.object = object;}

	public PIEventFrame getObject() { return this.object;}

	public void setException(PIErrors exception) { this.exception = exception;}

	public PIErrors getException() { return this.exception;}
}
