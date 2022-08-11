package createMultipleProjectusingDataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoClassForProject.PojoForProject;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class MulipleProjectByDataProvider {
	
@Test(dataProvider="createMultipleProject")
public void multipleProject(String createdBy,String projectNmae,String status,int teamSize)
{
PojoForProject poj=new PojoForProject(createdBy, projectNmae, status, teamSize);
baseURI="http://localhost:8084";

given()
.body(poj)
.contentType(ContentType.JSON)
.when()
.post("/addProject")
.then().log().all();


}
@DataProvider
public Object[][] createMultipleProject()
{
Object[][] obj=new Object[2][4];

obj[0][0]="shiv";
obj[0][1]="tyss";
obj[0][2]="created";
obj[0][3]=12;

obj[1][0]="shive";
obj[1][1]="shivrr";
obj[1][2]="ongoing";
obj[1][3]=10;
return obj;



}
}

