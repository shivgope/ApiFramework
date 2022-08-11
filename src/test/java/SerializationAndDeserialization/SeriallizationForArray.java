    package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeSerialization.PojoClassForArrayEmp;

public class SeriallizationForArray {
	@Test	
public void ArrayEmp() throws JsonGenerationException, JsonMappingException, IOException
{
		
int[] phone={1234,12345};
String[] email={"abc@gmail.com","xyz@gmail.com"};
PojoClassForArrayEmp pe=new PojoClassForArrayEmp("ty123", phone,email, "para");
ObjectMapper obj=new ObjectMapper();
obj.writeValue(new File("./emp2.json"),pe);


}

}
