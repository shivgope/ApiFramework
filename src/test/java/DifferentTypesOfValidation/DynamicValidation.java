package DifferentTypesOfValidation;

import javax.annotation.meta.When;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class DynamicValidation {
	
@Test	
public void dynamicVal()
{baseURI="http://localhost:8084";
String expData="shivgope";
boolean flag=false;
Response res = when().get("/projects");	
List<String> list = res.jsonPath().get("createdBy");
for(String data:list)
{
if(data.equalsIgnoreCase(expData))
{
System.out.println(data);
flag=true;
break;
}
}
Assert.assertTrue(flag);	
}
}