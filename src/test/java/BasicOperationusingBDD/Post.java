package BasicOperationusingBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

import java.util.Random;

public class Post
{
	@Test
	public void post()
	{Random r=new Random();
	int num=r.nextInt();
		baseURI="http://localhost";
		port=8084;
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy","Shankar");
		obj.put("status","created");
		obj.put("projectName","TYSS001"+num);
		
		given().body(obj).contentType(ContentType.JSON).when().post("/addProject").then().assertThat().statusCode(201).log().all();
	}

}
