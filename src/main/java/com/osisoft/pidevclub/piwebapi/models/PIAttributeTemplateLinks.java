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

public class PIAttributeTemplateLinks {
	@SerializedName("Self")
	private String self = null;

	@SerializedName("AttributeTemplates")
	private String attributeTemplates = null;

	@SerializedName("ElementTemplate")
	private String elementTemplate = null;

	@SerializedName("Parent")
	private String parent = null;

	@SerializedName("Categories")
	private String categories = null;

	@SerializedName("Trait")
	private String trait = null;

	public PIAttributeTemplateLinks() {
	}


	public void setSelf(String self) { this.self = self;}

	public String getSelf() { return this.self;}

	public void setAttributeTemplates(String attributeTemplates) { this.attributeTemplates = attributeTemplates;}

	public String getAttributeTemplates() { return this.attributeTemplates;}

	public void setElementTemplate(String elementTemplate) { this.elementTemplate = elementTemplate;}

	public String getElementTemplate() { return this.elementTemplate;}

	public void setParent(String parent) { this.parent = parent;}

	public String getParent() { return this.parent;}

	public void setCategories(String categories) { this.categories = categories;}

	public String getCategories() { return this.categories;}

	public void setTrait(String trait) { this.trait = trait;}

	public String getTrait() { return this.trait;}
}
