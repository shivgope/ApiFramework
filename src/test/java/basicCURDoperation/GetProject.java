package basicCURDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProject {

@Test
public void get()
{
Response res = RestAssured.get("http://localhost:8084/projects");	

res.then().log().all();
}

}
