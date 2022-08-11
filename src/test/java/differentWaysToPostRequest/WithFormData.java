package differentWaysToPostRequest;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class WithFormData {
	
public void formData()
{
given()
.formParam("createdBy","swatij")
.formParam("projectName","ghyy")
.formParam("status", "created")
.formParam("teamSize", 12)
.contentType(ContentType.JSON)
.when()
.post("/addProject")
.then()
.assertThat().statusCode(201).log().all();
}

}
