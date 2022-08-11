package basicCURDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {

@Test
public void createProject()
{
	Random r=new Random();
	int num=r.nextInt(200);
//create the necessary data
	
JSONObject jobj=new JSONObject();
jobj.put("createdBy", "murgi");
jobj.put("projectName", "tyss"+num);
jobj.put("status", "created");
jobj.put("teamSize", 10);

//send the request
RequestSpecification request = RestAssured.given();
 request.body(jobj);
 
request.contentType(ContentType.JSON);
Response resp = request.post("http://localhost:8084/addProject");

//validate the response

ValidatableResponse validate = resp.then();
validate.log().all();

	
}

}
