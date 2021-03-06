package bdd.emplyee.RestAssuredActions;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteEmplyeeRecord {
	
	public void DeleteEmplyeeRecordReturnOk(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 200);
	}
	
	public void DeleteEmplyeeRecordReturnBadRequest(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 400);
	}
	
	public void DeleteEmplyeeRecordReturnNotFound(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 404);
	}
	
}