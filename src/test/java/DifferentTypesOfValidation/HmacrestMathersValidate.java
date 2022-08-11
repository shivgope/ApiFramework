package DifferentTypesOfValidation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class HmacrestMathersValidate {
@Test	
public void hamcrestValidation()
{baseURI="http://localhost:8084";
when()
.get("/projects")
.then()
.assertThat().time(Matchers.lessThan(500l),TimeUnit.MILLISECONDS);
}
}