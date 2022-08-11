package basicCURDoperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmpPost {
@Test	
public void createEmp()
{
 Random r=new Random();
 int num=r.nextInt(200);
	
JSONObject jobj=new JSONObject();
//jobj.put("designation", "testr");
//jobj.put("dob", "01/01/1990");
jobj.put("email", "abc@gmail.com");
//jobj.put("empId", "testr");
jobj.put("empName", "testr");
//jobj.put("experience", 2);
jobj.put("mobileNo", "1234567890");
//jobj.put("password", "testr123");
//jobj.put("project", "tyss");
//jobj.put("role", "testr");
jobj.put("username", "shiv1"+num);

RequestSpecification req = RestAssured.given();
req.body(jobj);
req.contentType(ContentType.JSON);
Response res = req.post("http://localhost:8084/employees");

res.then().log().all();

}

}
