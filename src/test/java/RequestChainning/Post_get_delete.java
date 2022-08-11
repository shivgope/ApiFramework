package RequestChainning;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import PojoClassForProject.PojoForProject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Post_get_delete {
@Test	
public void requestChaining()
{baseURI="http://localhost:8084";
Random r= new Random();
int num=r.nextInt();
//create the data
PojoForProject poj=new PojoForProject("shivnmd", "tyssnn"+num, "created", 12);

//send the request
Response res = given()
.body(poj)
.contentType(ContentType.JSON)
.when()
.post("/addProject");

//capture the projectid by using json path


String obj = res.jsonPath().get("projectId");
System.out.println(obj);

//use the captured project in request


//when().get("/projects/"+obj)
//.then().log().all();

given()
.pathParam("pro", obj)
.when()
.get("/projects/{pro}")
.then().log().all();

//delete the project

given()
.pathParam("pro",obj)
.when()
.delete("/projects/{pro}")
.then().assertThat().statusCode(204).log().all();




}


}
