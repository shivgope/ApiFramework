package DifferentTypesOfValidation;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticValidation {
@Test

public void staticValidation()
{baseURI="http://localhost:8084";
String expData="TY_PROJ_003";
Response res = when().get("/projects");
String actData = res.jsonPath().get("[1].projectId");
Assert.assertEquals(expData, actData);
System.out.println(actData);
}

}
