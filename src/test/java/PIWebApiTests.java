import com.google.gson.reflect.TypeToken;
import com.osisoft.pidevclub.piwebapi.ApiException;
import com.osisoft.pidevclub.piwebapi.ApiResponse;
import com.osisoft.pidevclub.piwebapi.JSON;
import com.osisoft.pidevclub.piwebapi.PIWebApiClient;
import com.osisoft.pidevclub.piwebapi.api.*;
import com.osisoft.pidevclub.piwebapi.models.*;
import com.osisoft.pidevclub.piwebapi.webid.WebIdException;
import com.osisoft.pidevclub.piwebapi.webid.WebIdInfo;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;


public class PIWebApiTests {
    private PIWebApiClient generatePIWebApiInstance()
    {
        return  new PIWebApiClient("https://marc-rras.osisoft.int/piwebapi", "marc.adm", "kk", false, false);
    }

    @Test
    public void testDebug() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://devdata.osisoft.com/piwebapi/", "webapiuser", "!try3.14webapi!", true, true);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().getSelf(), "https://devdata.osisoft.com/piwebapi/");
        } catch (ApiException ex) {
            throw new Exception(ex);
        }
    }

    @Test
    public void testInvalidCertErrorApi() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://marc-rras.osisoft.int/piwebapi", "marc.adm", "kk", true, false);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(true,false);
        }
        catch (ApiException ex)
        {
            String msg = ex.getMessage().substring(0,35);
            assertEquals(msg,"javax.net.ssl.SSLHandshakeException");
        }
    }

    @Test
    public void testSuccessInvalidCertApi() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://devdata.osisoft.com/piwebapi/", "webapiuser", "!try3.14webapi!", false, false);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().getSelf(),"https://devdata.osisoft.com/piwebapi/");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }




    @Test
    public void testBatchApi() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        Map<String, PIRequest> batch = new HashMap<String, PIRequest>();
        PIRequest req1 = new PIRequest();
        PIRequest req2 = new PIRequest();
        PIRequest req3 = new PIRequest();
        req1.setMethod("GET");
        req1.setResource("https://marc-rras.osisoft.int/piwebapi/points?path=\\\\MARC-PI2016\\sinusoid");
        req2.setMethod("GET");
        req2.setResource("https://marc-rras.osisoft.int/piwebapi/points?path=\\\\MARC-PI2016\\cdt158");
        req3.setMethod("GET");
        req3.setResource("https://marc-rras.osisoft.int/piwebapi/streamsets/value?webid={0}&webid={1}");

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

    }

    @Test
    public void testHomeApi() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().getSelf(),"https://marc-rras.osisoft.int/piwebapi/");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }

    @Test
    public void testGetDataServerByPath() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {

            PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null,null);
            assertEquals(dataServer.getName(), "MARC-PI2016");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }
    @Test
    public void testGetPointByPath() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();

        try {

            PIPoint point = client.getPoint().getByPath("\\\\MARC-PI2016\\sinusoid", null,null);
            assertEquals(point.getName(), "SINUSOID");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }

    @Test
    public void testGetRecordedValuesInBulk() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {

            PIPoint point1 = client.getPoint().getByPath("\\\\MARC-PI2016\\sinusoid", null,null);
            PIPoint point2 = client.getPoint().getByPath("\\\\MARC-PI2016\\sinusoidu", null,null);
            PIPoint point3 = client.getPoint().getByPath("\\\\MARC-PI2016\\cdt158", null,null);
            List<String> webIds = new ArrayList<String>();
            webIds.add(point1.getWebId());
            webIds.add(point2.getWebId());
            webIds.add(point3.getWebId());


            //Get recorded values in bulk
            PIItemsStreamValues piItemsStreamValues = client.getStreamSet().getRecordedAdHoc(webIds,null, "*", null, true, 1000, null, null, null,"*-3d",null, null);
            assertEquals(piItemsStreamValues.getItems().size(), 3);
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }

    @Test
    public void testGetElementByPath() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {

            PIElement myElement = client.getElement().getByPath("\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm", null, null);
            assertEquals( myElement.getName(),"marc.adm");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }
    @Test
    public void testGetElementAttributes() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {

            PIElement myElement = client.getElement().getByPath("\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm", null,null);

            PIItemsAttribute attributes = client.getElement().getAttributes(myElement.getWebId(), null, 1000, null, false, null, null,null,null,null,0,null,null, null);
            assertEquals ( attributes.getItems().size() > 0,true);

        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }
    @Test
    public void testGetAttributeByPath() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {
            PIAttribute myAttribute = client.getAttribute().getByPath("\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm|Heading", null,null);
            assertEquals( myAttribute.getName(),"Heading");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }



    @Test
    public void testCreatePoint() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {
            PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null,null);
            PIPoint newPoint = new PIPoint();
            newPoint.setName("SINUSOID_TEST122221");
            newPoint.setDescriptor("Test PI Point for Java PI Web API Client");
            newPoint.setPointClass("classic");
            newPoint.setPointType("float32");
            newPoint.setFuture(false);
            ApiResponse<Void> res =  client.getDataServer().createPointWithHttpInfo(dataServer.getWebId(), newPoint, null);
            assertEquals(res.getStatusCode(), 201);
        }
        catch (ApiException ex)
        {
            //throw new Exception(ex);
        }
    }

    @Test
    public void testCalculations() throws ApiException {
        PIWebApiClient client = generatePIWebApiInstance();
        PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null, null);
        String expression = "'sinusoid'*2 + 'cdt158'";
        List<String> time = new ArrayList<String>();
        time.add("*-1d");
        PITimedValues values = client.getCalculation().getAtTimes(expression, null, null, time, dataServer.getWebId());

        String expression2 = "'cdt158'+tagval('sinusoid','*-1d')";
        PITimedValues values2 = client.getCalculation().getAtTimes(expression2, null, null, time, dataServer.getWebId());
    }


    @Test
    public  void testWebIdsGenerators() throws ApiException, WebIdException {
        PIWebApiClient client = generatePIWebApiInstance();
        PIDataServer dataServer = client.getDataServer().getByPath("\\\\MARC-PI2016", null, null);
        PIPoint point = client.getPoint().getByPath("\\\\marc-pi2016\\sinusoid",null, null);
        PIElement element = client.getElement().getByPath("\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm",null, null);
        PIAttribute attribute = client.getAttribute().getByPath( "\\\\MARC-PI2016\\CrossPlatformLab\\marc.adm|Heading",null,null);

        WebIdInfo webIdInfo2 = client.getWebIdHelper().getWebIdInfo(attribute.getWebId());
        WebIdInfo webIdInfo = client.getWebIdHelper().getWebIdInfo(element.getWebId());
        WebIdInfo webIdInfo4 = client.getWebIdHelper().getWebIdInfo(point.getWebId());
        WebIdInfo webIdInfo3 = client.getWebIdHelper().getWebIdInfo(dataServer.getWebId());

        String path = "\\\\PISRV1\\CDF144_Repeated24h_forward";
        String web_id1 = client.getWebIdHelper().generateWebIdByPath("\\\\PISRV1\\CDF144_Repeated24h_forward", PIPoint.class, null);

        String web_id2 = client.getWebIdHelper().generateWebIdByPath(
                "\\\\PISRV1\\Universities\\UC Davis\\Buildings\\Academic Surge Building|Electricity Totalizer",
                PIAttribute.class, PIElement.class);
    }

    @Test
    public void testSendValuesInBulk() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {
            PIPoint point1 = client.getPoint().getByPath("\\\\MARC-PI2016\\sinusoid",null,null);
            PIPoint point2 = client.getPoint().getByPath("\\\\MARC-PI2016\\sinusoidu",null, null);
            PIPoint point3 = client.getPoint().getByPath("\\\\MARC-PI2016\\cdt158",null, null);


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
            assertEquals(res.getStatusCode(), 202);
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }
}


