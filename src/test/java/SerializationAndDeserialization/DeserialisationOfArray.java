package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeSerialization.PojoClassForArrayEmp;

public class DeserialisationOfArray {

	@Test
public void desrialise() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper obj=new ObjectMapper();
	PojoClassForArrayEmp e1 = obj.readValue(new File(".\\emp2.json"),PojoClassForArrayEmp.class);
	System.out.println(e1.getPhone()[0]);
	System.out.println(e1.getEmail()[1]);
}


}
