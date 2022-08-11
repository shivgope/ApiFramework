package genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class BaseApiClass {

	public DataBaseLibrary dLib= new DataBaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{	
		dLib.connectToDB();
		Reporter.log("========connection successful=======", true);
		baseURI = "http://localhost:8084";
	//	port=;
	}
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dLib.closeDB();
		Reporter.log("======connection closed========", true);
	}
}
