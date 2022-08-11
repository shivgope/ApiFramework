package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeSerialization.EmpDetails;

public class DeSerializationOfEmp {
@Test
public void deSerialisation() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper obj=new ObjectMapper();
	EmpDetails e1=obj.readValue(new File("./emp2.json"),EmpDetails.class);
	System.out.println(e1.getAddress());
	System.out.println(e1.getEid());
}



}
