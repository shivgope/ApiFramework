package BasicOperationusingBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Get {
	
@Test
public void get()
{
baseURI="http://localhost";
port=8084;

when()
.delete("/projects/TY_PROJ_2005")
.then()
.assertThat().statusCode(204).log().all();
}

}
