package Differentparametrs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
@Test	
public void queryPara()
{baseURI="http://localhost:8084";
given()
.pathParam("pid","TY_PROJ_1002")
.when()
.get("/projects/{pid}")
.then().assertThat().statusCode(200).log().all();

}

}
