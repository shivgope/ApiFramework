package basicCURDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
@Test	
public void addPro()
{
JSONObject jobj=new JSONObject();
jobj.put("createdBy","shiv2");
jobj.put("projectName","ytsdd1");
jobj.put("status","ctre");
jobj.put("teamSize",12);


RequestSpecification req = RestAssured.given();
req.body(jobj);
req.contentType(ContentType.JSON);
Response res = req.post("http://localhost:8084/addProject");



res.then().log().all();
res.statusCode();
}

}
