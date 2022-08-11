package DifferentAuthentication;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BarearToken {
@Test
public void brearToken()
{
	baseURI="https://github.com";
//JSONObject jojb=new JSONObject();
//jojb.put("name","shiv");
//jojb.put("description", "created");
HashMap  map=new HashMap();
map.put("name","sdet_563");
//map.put("description", "created");

given()
.auth()
.oauth2("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")
.body(map)
.contentType(ContentType.JSON)
.when()
.post("/user/repos")
.then().log().all();
	
}



}
