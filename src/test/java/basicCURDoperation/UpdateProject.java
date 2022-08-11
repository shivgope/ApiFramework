package basicCURDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void update()
	{
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "rahil");
	jobj.put("projectName", "tyss1");
	jobj.put("status", "created");
	jobj.put("teamSize", 10);
	
	RequestSpecification request = RestAssured.given();
	request.body(jobj);
	request.contentType(ContentType.JSON);
	Response resp = request.put("http://localhost:8084/projects/TY_PROJ_1602");
	
	resp.then().log().all();
	
		
	}

}
