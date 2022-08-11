package CreateProjectUsingPojo;

import PojoClassForProject.PojoForProject;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PostRequst {
@Test	
public void createProject()
{
baseURI="http://localhost:8084"	;
	
PojoForProject poj=new PojoForProject("shivnm","jyss","created", 13);

given()
.body(poj)
.contentType(ContentType.JSON)
.when()
.post("/addProject")
.then()
.assertThat().statusCode(201).log().all();

}

}
