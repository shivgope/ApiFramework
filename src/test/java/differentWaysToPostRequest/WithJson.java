package differentWaysToPostRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class WithJson {
@Test	
public void createProjectWithJsonFile()
{
baseURI="http://localhost:8084";
File file=new File(".\\src\\test\\resources\\RequestData.json");

given()
.body(file)
.contentType(ContentType.JSON)
.when()
.post("/addProject")
.then()
.assertThat().statusCode(201).log().all();
}

}
