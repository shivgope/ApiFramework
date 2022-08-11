package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeSerialization.EmpDetails;

public class SerializationOfEmpDeatails {

	//create object of pojo and provide values
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmpDetails emp=new EmpDetails("shiva","ty123",123456,"para" );
		//create object of objectmapper from jackson mapper
		ObjectMapper objm = new ObjectMapper();
		//write data into jason file
		objm.writeValue(new File("./empDetails.json"), emp);
	}
	
	
	
	

}
