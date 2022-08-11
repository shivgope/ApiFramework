package genericLibrary;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	/**
	 * get the json data through json path from response body
	 * @param response 
	 * @return 
	 */
	public String getJSONData(Response response, String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}

}
