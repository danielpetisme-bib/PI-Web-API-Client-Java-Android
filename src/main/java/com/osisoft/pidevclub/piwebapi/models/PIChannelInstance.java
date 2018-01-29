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

public class PIChannelInstance {
	@SerializedName("Id")
	private String id = null;

	@SerializedName("StartTime")
	private String startTime = null;

	@SerializedName("LastMessageSentTime")
	private String lastMessageSentTime = null;

	@SerializedName("SentMessageCount")
	private Integer sentMessageCount = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIChannelInstance() {
	}


	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setStartTime(String startTime) { this.startTime = startTime;}

	public String getStartTime() { return this.startTime;}

	public void setLastMessageSentTime(String lastMessageSentTime) { this.lastMessageSentTime = lastMessageSentTime;}

	public String getLastMessageSentTime() { return this.lastMessageSentTime;}

	public void setSentMessageCount(Integer sentMessageCount) { this.sentMessageCount = sentMessageCount;}

	public Integer getSentMessageCount() { return this.sentMessageCount;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
