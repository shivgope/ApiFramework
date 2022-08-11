package Differentparametrs;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParameter {
@Test	
public void queryPara()
{baseURI="https://reqres.in/";
	given()
	.queryParam("page", 6)
	.when()
	.get("/api/users")
	.then().assertThat().statusCode(200).log().all();
}

}
