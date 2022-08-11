package DifferentAuthentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2_0 {
@Test	
public void auth2_0()
{ baseURI="http://coop.apps.symfonycasts.com";

//create acccess token
Response res = given()
.formParam("client_id", "murgi")
.formParam("client_secret", "56be657547cb737c2c80648d8eb0cf95")
.formParam("grant_type", "client_credentials")
.formParam("redirect_uri", "http://www.shiv.com")
.formParam("code", "authorization_code")
.when().post("/token");

//capture access token by using json path
String obj = res.jsonPath().get("access_token");
System.out.println(obj);

//utilise the access token
given()
.auth()
.oauth2(obj)
.pathParam("USER_ID",3672)
.when()
.post("/api/{USER_ID}/toiletseat-down")
.then().log().all();



}

}
