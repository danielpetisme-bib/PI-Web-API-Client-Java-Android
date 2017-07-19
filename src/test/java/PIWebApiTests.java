import com.osisoft.pidevclub.piwebapi.ApiException;
import com.osisoft.pidevclub.piwebapi.ApiResponse;
import com.osisoft.pidevclub.piwebapi.PIWebApiClient;
import com.osisoft.pidevclub.piwebapi.api.*;
import com.osisoft.pidevclub.piwebapi.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;


public class PIWebApiTests {
    private PIWebApiClient generatePIWebApiInstance()
    {
        return  new PIWebApiClient("https://fqdn-valid-ssl/piwebapi", "username", "password", true, false);
    }

    @Test
    public void testDebug() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://fqdn-valid-ssl/piwebapi", "username", "password", true, true);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().get("Self"), "https://fqdn-valid-ssl/piwebapi/");
        } catch (ApiException ex) {
            throw new Exception(ex);
        }
    }

    @Test
    public void testInvalidCertErrorApi() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://fqdn-invalid-ssl/piwebapi/", "username", "password", true, false);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(true,false);
        }
        catch (ApiException ex)
        {
            assertEquals(ex.getMessage(),"javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: PKIX path validation failed: java.security.cert.CertPathValidatorException: timestamp check failed");
        }
    }

    @Test
    public void testSuccessInvalidCertApi() throws Exception {
        PIWebApiClient client = new PIWebApiClient("https://fqdn-invalid-ssl/piwebapi/", "username", "password", false, false);
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().get("Self"),"https://fqdn-invalid-ssl/piwebapi/");
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }




    @Test
    public void testHomeApi() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        HomeApi home = client.getHome();
        try {

            PILanding land = home.get();
            assertEquals(land.getLinks().get("Self"),"https://fqdn-valid-ssl/piwebapi/");
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

            PIDataServer dataServer = client.getDataServer().getByPath("\\\\SERVERNAME", null);
            assertEquals(dataServer.getName(), "SERVERNAME");
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

            PIPoint point = client.getPoint().getByPath("\\\\SERVERNAME\\sinusoid", null);
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

            PIPoint point1 = client.getPoint().getByPath("\\\\SERVERNAME\\sinusoid", null);
            PIPoint point2 = client.getPoint().getByPath("\\\\SERVERNAME\\sinusoidu", null);
            PIPoint point3 = client.getPoint().getByPath("\\\\SERVERNAME\\cdt158", null);
            List<String> webIds = new ArrayList<String>();
            webIds.add(point1.getWebId());
            webIds.add(point2.getWebId());
            webIds.add(point3.getWebId());


            //Get recorded values in bulk
            PIItemsStreamValues piItemsStreamValues = client.getStreamSet().getRecordedAdHoc(webIds,null, "*", null, true, 1000, null, "*-3d",null);
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

            PIElement myElement = client.getElement().getByPath("\\\\SERVERNAME\\Element", null);
            assertEquals( myElement.getName(),"Electricity");
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

            PIElement myElement = client.getElement().getByPath("\\\\SERVERNAME\\Element", null);

            PIItemsAttribute attributes = client.getElement().getAttributes(myElement.getWebId(), null, 1000, null, false, null, null,null,null,null,0,null,null);
            assertEquals ( attributes.getItems().size(),19);

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
            PIAttribute myAttribute = client.getAttribute().getByPath("\\\\SERVERNAME\\Element|Attribute", null);
            assertEquals( myAttribute.getName(),"Annual Cost");
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
            PIDataServer dataServer = client.getDataServer().getByPath("\\\\SERVERNAME", null);
            PIPoint newPoint = new PIPoint();
            newPoint.setName("SINUSOID_TEST11");
            newPoint.setDescriptor("Test PI Point for Java PI Web API Client");
            newPoint.setPointClass("classic");
            newPoint.setPointType("float32");
            newPoint.setFuture(false);
            ApiResponse<Void> res =  client.getDataServer().createPointWithHttpInfo(dataServer.getWebId(),newPoint);
            assertEquals(res.getStatusCode(), 201);
        }
        catch (ApiException ex)
        {
            throw new Exception(ex);
        }
    }




    @Test
    public void testSendValuesInBulk() throws Exception {
        PIWebApiClient client = generatePIWebApiInstance();
        try {
            PIPoint point1 = client.getPoint().getByPath("\\\\SERVERNAME\\sinusoid",null);
            PIPoint point2 = client.getPoint().getByPath("\\\\SERVERNAME\\sinusoidu",null);
            PIPoint point3 = client.getPoint().getByPath("\\\\SERVERNAME\\cdt158",null);


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


