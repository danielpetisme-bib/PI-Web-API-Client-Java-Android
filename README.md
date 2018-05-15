PI Web API client library for Java and Android (2017 R2)
===


## Overview
This repository has the source code package of the PI Web API client library for Java and Android. This version was developed on top of the PI Web API 2017 R2 swagger specification.


## Requirements

 - JDK
 - [Maven](https://maven.apache.org/)


 
## Installation

To install the API client library to your local Maven repository, simply execute on the project folder:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

 
## Usage

After building this client library using Maven, create a new Java project using your favorite IDE. Using Maven or Gradle, add the library according to the instructions below:

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
	<groupId>com.osisoft.pidevclub</groupId>
	<artifactId>piwebapi</artifactId>
	<version>1.1.1</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile 'com.osisoft.pidevclub:piwebapi:1.1.1'
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/piwebapi-1.1.1.jar
* target/lib/*.jar


## Documentation

All classes and methods are described on the [DOCUMENTATION](DOCUMENTATION.md). 

## Notes

 - Is is highly recommended to turn debug mode on in case you are using PI Web API 2017 R2+ in order to receive more detailed exception errors. This can be achieved by creating or editing the DebugMode attribute's value to TRUE from the System Configuration element.
 - The X-Requested-With header is added to work with CSRF defences.

 
## Examples

Please check the [PIWebApiTests.java](/src/test/java/PIWebApiTests.java) from the Java test module of this repository. Below there are also code snippets written in Java for you to get started using this library:


### Create an instance of the PI Web API top level object.

```java
	PIWebApiClient client = new PIWebApiClient("https://marc-web-sql.marc.net/piwebapi", username, password, false, true);  
``` 

This library is only compatible with PI Web API Basic Authentication. As a result, you must provide the username and password.


### Get the PI Data Archive WebId

```java
	PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null, null);
```

### Create a new PI Point

```java
	PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016, null, null);
	PIPoint newPoint = new PIPoint();
	newPoint.setName("SINUSOID_TEST5");
	newPoint.setDescriptor("Test PI Point for Java PI Web API Client");
	newPoint.setPointClass("classic");
	newPoint.setPointType("float32");
	newPoint.setFuture(false);
	ApiResponse<Void> res =  client.getDataServer().createPointWithHttpInfo(dataServer.getWebId(), newPoint, null);          
```

### Get PI Points WebIds

```java
	PIPoint point1 = client.getPoint().getByPath("\\\\JUPITER001\\sinusoid", null, null);
	PIPoint point2 = client.getPoint().getByPath("\\\\JUPITER001\\sinusoidu", null, null);
	PIPoint point3 = client.getPoint().getByPath("\\\\JUPITER001\\cdt158", null, null);
```

### Get recorded values in bulk using the StreamSet/GetRecordedAdHoc

```java
	List<String> webIds = new ArrayList<String>();
	webIds.add(point1.getWebId());
	webIds.add(point2.getWebId());
	webIds.add(point3.getWebId());
	PIItemsStreamValues piItemsStreamValues = client.getStreamSet().getRecordedAdHoc(webIds,null, "*", null, true, 1000, null, null, null,"*-3d",null, null);     
```

### Send values in bulk using the StreamSet/UpdateValuesAdHoc

```java
	PIItemsStreamValues streamValuesItems = new PIItemsStreamValues();
	PIStreamValues streamValue1 = new PIStreamValues();
	PIStreamValues streamValue2 = new PIStreamValues();
	PIStreamValues streamValue3 = new PIStreamValues();
	PITimedValue value1 = new PITimedValue();
	PITimedValue value2 = new PITimedValue();
	PITimedValue value3 = new PITimedValue();
	PITimedValue value4 = new PITimedValue();
	PITimedValue value5 = new PITimedValue();
	PITimedValue value6 = new PITimedValue();
	value1.setValue(2);
	value1.setTimestamp("*-1d");
	value2.setValue(3);
	value2.setTimestamp("*-2d");
	value3.setValue(4);
	value3.setTimestamp("*-1d");
	value4.setValue(5);
	value4.setTimestamp("*-2d");
	value5.setValue(6);
	value5.setTimestamp("*-1d");
	value6.setValue(7);
	value6.setTimestamp("*-2d");
	streamValue1.setWebId(point1.getWebId());
	streamValue2.setWebId(point2.getWebId());
	streamValue3.setWebId(point3.getWebId());

	List<PITimedValue> values1 = new ArrayList<PITimedValue>();
	values1.add(value1);
	values1.add(value2);
	streamValue1.setItems(values1);

	List<PITimedValue> values2 = new ArrayList<PITimedValue>();
	values2.add(value3);
	values2.add(value4);
	streamValue2.setItems(values2);

	List<PITimedValue> values3 = new ArrayList<PITimedValue>();
	values3.add(value5);
	values3.add(value6);
	streamValue3.setItems(values3);

	List<PIStreamValues> streamValues = new ArrayList<PIStreamValues>();
	streamValues.add(streamValue1);
	streamValues.add(streamValue2);
	streamValues.add(streamValue3);
	ApiResponse<PIItemsItemsSubstatus> res = client.getStreamSet().updateValuesAdHocWithHttpInfo(streamValues, null, null);
```


### Get element and its attributes given an AF Element path

```java
	PIElement myElement = client.getElement().getByPath("\\\\PISRV1\\Element", null,null);
	PIItemsAttribute attributes = client.getElement().getAttributes(myElement.getWebId(), null, 1000, null, false, null, null,null,null,null,0,null,null, null);
           
```


### PI Web API Batch

```java
	Map<String, PIRequest> batch = new HashMap<String, PIRequest>();
	PIRequest req1 = new PIRequest();
	PIRequest req2 = new PIRequest();
	PIRequest req3 = new PIRequest();
	req1.setMethod("GET");
	req1.setResource("https://marc-web-sql.marc.net/piwebapi/points?path=\\\\MARC-PI2016\\sinusoid");
	req2.setMethod("GET");
	req2.setResource("https://marc-web-sql.marc.net/piwebapi/points?path=\\\\MARC-PI2016\\cdt158");
	req3.setMethod("GET");
	req3.setResource("https://marc-web-sql.marc.net/piwebapi/streamsets/value?webid={0}&webid={1}");

	List<String> parameters = new ArrayList<>();
	parameters.add("$.1.Content.WebId");
	parameters.add("$.2.Content.WebId" );
	req3.setParameters(parameters);


	List<String> parentIds = new ArrayList<>();
	parentIds.add("1");
	parentIds.add("2");
	req3.setParentIds(parentIds);

	batch.put("1", req1);
	batch.put("2", req2);
	batch.put("3", req3);
	Map<String, PIResponse> batchResponse = client.getBatch().execute(batch);

	Object content1 = batchResponse.get("1").getContent();
	Object content2 = batchResponse.get("2").getContent();
	Object content3 = batchResponse.get("3").getContent();

	JSON json = new JSON(client.getApiClient());
	PIPoint pointBatch1 = json.deserialize(json.serialize(content1), new TypeToken<PIPoint>(){}.getType());
	PIPoint pointBatch2 = json.deserialize(json.serialize(content2), new TypeToken<PIPoint>(){}.getType());
	PIItemsStreamValue batchStreamValues = json.deserialize(json.serialize(content3), new TypeToken<PIItemsStreamValue>(){}.getType());
```


### Getting WebID 2.0 information

```java
	string webIdType = "Full";
	PIAssetServer piAssetServer = client.AssetServer.GetByPath(Constants.AF_SERVER_PATH, null, webIdType);
	WebIdInfo piAssetServerWebIdInfo = client.WebIdHelper.GetWebIdInfo(piAssetServer.WebId);

	PIAttribute piAttribute = client.Attribute.GetByPath(Constants.AF_ATTRIBUTE_PATH, null, webIdType);
	WebIdInfo piAttributeWebIdInfo = client.WebIdHelper.GetWebIdInfo(piAttribute.WebId);
```


### Generating WebID 2.0 client side

```java
	String web_id1 = client.getWebIdHelper().generateWebIdByPath("\\\\PISRV1\\CDF144_Repeated24h_forward", PIPoint.class, null);
	String web_id2 = client.getWebIdHelper().generateWebIdByPath("\\\\PISRV1\\Universities\\UC Davis\\Buildings\\Academic Surge Building|Electricity Totalizer", 
		PIAttribute.class, PIElement.class);
```


## Licensing
Copyright 2018 OSIsoft, LLC.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
Please see the file named [LICENSE.md](LICENSE.md).
