package raassignment;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class NewTest {
	
	@Test
	public void user() {
		
		//Create a reference for Response interface
	    Response response;
	    
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
	    response = RestAssured.get("http://localhost:8080/InfyClinicV2/APP_V2/getDoctor/byId?doctorId=1001");
	    
		// Get all the headers, return value is of type Headers.
		Headers allHeaders = response.getHeaders();
		// Headers class implements Iterable interface.
		// Iterate over all the Headers using an advance for loop as shown in the code below
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
	}
	
}
