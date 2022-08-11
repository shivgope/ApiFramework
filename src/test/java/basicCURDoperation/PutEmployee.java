package basicCURDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutEmployee {
@Test
public void updateEmp() {
	JSONObject jobj=new JSONObject();
	jobj.put("email", "abc@gmail.com");

	jobj.put("empName", "testr");

	jobj.put("mobileNo", "1234567890");

	jobj.put("username", "shiv123");
	
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response res = req.put("http://localhost:8084/employees/TYP_00211");
	
	res.then().log().all();
}



}
