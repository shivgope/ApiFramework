package basicCURDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEmp {
@Test	
public void getEmp()
{
Response res = RestAssured.get("http://localhost:8084/employees/TYP_00403");

res.then().log().all();
}

}
