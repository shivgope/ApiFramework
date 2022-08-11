package differentWaysToPostRequest;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class WithHashmap {
@Test
public void createProjectWithHashMap()
{
baseURI="http://localhost:8084";

Random r=new Random();
int num=r.nextInt(200);

//create data

HashMap hm=new HashMap();
hm.put("createdBy","shivb");
hm.put("projectName","tyssd"+num);
hm.put("status","created");
hm.put("teamSize",12);

//send request

given()
.body(hm)
.contentType(ContentType.JSON)
.when()
.post("/addProject")
.then()
.assertThat().statusCode(201).log().all();

		

}

}
