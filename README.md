PI Web API Client libraries for Java and Android
===


## Overview
This repository has the source code package of the PI Web API Client libraries for Java and Android.

## Requirements

Building this PI Web API client library requires JDK and [Maven](https://maven.apache.org/) to be installed.


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
	<version>1.0.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile 'com.osisoft.pidevclub:piwebapi:1.0.0'
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/piwebapi-1.0.0.jar
* target/lib/*.jar


## Documentation

All classes and methods are described on the [DOCUMENTATION](DOCUMENTATION.md). 

 
## Examples

Please check the [PIWebApiTests.java](/src/test/java/PIWebApiTests) from the Java test module of this repository. Below there are also code snippets written in Java for you to get started using this library:


### Create an instance of the PI Web API top level object.

```java
	PIWebApiClient client = new PIWebApiClient("https://marc-web-sql.marc.net/piwebapi", username, password, false, true);  
``` 

If you want to use basic authentication instead of Kerberos, set useKerberos to false and set the username and password accordingly.


### Get the PI Data Archive WebId

```java
	PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null);
```

### Create a new PI Point

```java
	PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016, null);
	PIPoint newPoint = new PIPoint();
	newPoint.setName("SINUSOID_TEST5");
	newPoint.setDescriptor("Test PI Point for Java PI Web API Client");
	newPoint.setPointClass("classic");
	newPoint.setPointType("float32");
	newPoint.setFuture(false);
	ApiResponse<Void> res =  client.getDataServer().createPointWithHttpInfo(dataServer.getWebId(),newPoint);          
```

### Get PI Points WebIds

```java
	PIPoint point1 = client.getPoint().getByPath("\\\\JUPITER001\\sinusoid", null);
	PIPoint point2 = client.getPoint().getByPath("\\\\JUPITER001\\sinusoidu", null);
	PIPoint point3 = client.getPoint().getByPath("\\\\JUPITER001\\cdt158", null);
```

### Get recorded values in bulk using the StreamSet/GetRecordedAdHoc

```java
	List<String> webIds = new ArrayList<String>();
	webIds.add(point1.getWebId());
	webIds.add(point2.getWebId());
	webIds.add(point3.getWebId());
	PIItemsStreamValues piItemsStreamValues = client.getStreamSet().getRecordedAdHoc(webIds,null, "*", null, true, 1000, null, "*-3d",null);
            
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
	ApiResponse<PIItemsItemsSubstatus> res = client.getStreamSet().updateValuesAdHocWithHttpInfo(streamValues, null,null);
```


### Get element and its attributes given an AF Element path

```java
	PIElement myElement = client.getElement().getByPath("\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm", null);
	PIItemsAttribute attributes = client.getElement().getAttributes(myElement.getWebId(), null, 1000, null, false, null, null,null,null,null,0,null,null);
           
```





## Licensing
Copyright 2017 OSIsoft, LLC.

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
