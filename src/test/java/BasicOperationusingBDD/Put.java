package BasicOperationusingBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Put {

@Test
public void update()
{
baseURI="http://localhost";
port=8084;
	
	
JSONObject jobj=new JSONObject();
jobj.put("createdBy","shi");
jobj.put("status","created");
jobj.put("projectName","tyss");

given()
.body(jobj)
.contentType(ContentType.JSON)
.when()
.put("/projects/TY_PROJ_2202")
.then()
.assertThat().statusCode(200).log().all();

	
}

}
