import org.testng.annotations.Test;

import PojoClassForProject.PojoForProject;
import genericLibrary.BaseApiClass;
import genericLibrary.EndPointLibrary;
import genericLibrary.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreatePrandVerifyWRT extends BaseApiClass {
@Test	
public void createDataAndVerify() throws Throwable
{
PojoForProject pobj=new PojoForProject("shib","thss123"+jLib.getRandomNumber(), "status", 12);
Response response = given()
.body(pobj)
.contentType(ContentType.JSON)
.when()
.post(EndPointLibrary.createProject);
response.then().log().all();

String projectId = rLib.getJSONData(response, "projectId");

String querry="select * from project;";

String actual = dLib.readDataFromDBAndValidate(querry, 1, projectId);


}

}
