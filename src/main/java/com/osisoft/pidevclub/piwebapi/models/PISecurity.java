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

public class PISecurity {
	@SerializedName("CanAnnotate")
	private Boolean canAnnotate = null;

	@SerializedName("CanDelete")
	private Boolean canDelete = null;

	@SerializedName("CanExecute")
	private Boolean canExecute = null;

	@SerializedName("CanRead")
	private Boolean canRead = null;

	@SerializedName("CanReadData")
	private Boolean canReadData = null;

	@SerializedName("CanSubscribe")
	private Boolean canSubscribe = null;

	@SerializedName("CanSubscribeOthers")
	private Boolean canSubscribeOthers = null;

	@SerializedName("CanWrite")
	private Boolean canWrite = null;

	@SerializedName("CanWriteData")
	private Boolean canWriteData = null;

	@SerializedName("HasAdmin")
	private Boolean hasAdmin = null;

	@SerializedName("Rights")
	private List<String> rights = null;

	public PISecurity() {
	}


	public void setCanAnnotate(Boolean canAnnotate) { this.canAnnotate = canAnnotate;}

	public Boolean getCanAnnotate() { return this.canAnnotate;}

	public void setCanDelete(Boolean canDelete) { this.canDelete = canDelete;}

	public Boolean getCanDelete() { return this.canDelete;}

	public void setCanExecute(Boolean canExecute) { this.canExecute = canExecute;}

	public Boolean getCanExecute() { return this.canExecute;}

	public void setCanRead(Boolean canRead) { this.canRead = canRead;}

	public Boolean getCanRead() { return this.canRead;}

	public void setCanReadData(Boolean canReadData) { this.canReadData = canReadData;}

	public Boolean getCanReadData() { return this.canReadData;}

	public void setCanSubscribe(Boolean canSubscribe) { this.canSubscribe = canSubscribe;}

	public Boolean getCanSubscribe() { return this.canSubscribe;}

	public void setCanSubscribeOthers(Boolean canSubscribeOthers) { this.canSubscribeOthers = canSubscribeOthers;}

	public Boolean getCanSubscribeOthers() { return this.canSubscribeOthers;}

	public void setCanWrite(Boolean canWrite) { this.canWrite = canWrite;}

	public Boolean getCanWrite() { return this.canWrite;}

	public void setCanWriteData(Boolean canWriteData) { this.canWriteData = canWriteData;}

	public Boolean getCanWriteData() { return this.canWriteData;}

	public void setHasAdmin(Boolean hasAdmin) { this.hasAdmin = hasAdmin;}

	public Boolean getHasAdmin() { return this.hasAdmin;}

	public void setRights(List<String> rights) { this.rights = rights;}

	public List<String> getRights() { return this.rights;}
}
