package API;

import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Request;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class test1 {
	

	@Test
	public void t1()
	
	{
		String reqbody = "{\r\n"
				+ "    \"name\": \"amruta\",    \"job\": \"leader\"\r\n"
				+ "}";
		baseURI = "https://reqres.in/api/users";
		String res =given().baseUri(baseURI).body(reqbody).post().asPrettyString();
		System.out.println(res);
		System.out.println(get("https://reqres.in/api/users/568").asPrettyString());
	}
	

}
