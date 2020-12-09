package raassignment;

import org.junit.Test;

import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class RA1 {
		
@Test

		public void user() {
			
			//Create a reference for Response interface
		    Response response;
		    
			// Make a request to the server by specifying the method Type and the method URL.
			// This will return the Response from the server. Store the response in a reference variable created above.
		    response = RestAssured.get("http://10.82.48.225:8081/EDUBank/AccountAPI/getAccount?accountNumber=443328602688020");
		    
		    //To retrieve response status from the server and print the returned value.
		    int statusCode = response.getStatusCode();
			System.out.println("Status Code: "+statusCode );
			
			//To retrieve status line of the response from the server and print the returned value.
			String statusLine = response.getStatusLine();
			System.out.println("Status Line: "+statusLine );
		
			 
		}

	}

