package rest.api.testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ApiTesting {
	
//	@Test
//	public void getBookDetails() {
//		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
//		RequestSpecification httpRequest = RestAssured.given(); 
//		Response response = httpRequest.request(Method.GET, "");
//		System.out.println("Status Line received => " + response.getStatusLine()); 
//		System.out.println("Response=>" + response.prettyPrint());
//		System.out.println("Response=>" +response.getHeaders().toString());
//	}

	
//	@Test
//	public void postRequest() {
//		
//		RestAssured.baseURI ="https://reqres.in";
//		RequestSpecification request = RestAssured.given();
//		
//		HashMap<String, String> map = new HashMap<String,String>();
//		map.put("name", "morpheus");
//		map.put("job", "leader"); 
//		JSONObject requestParams = new JSONObject(map);
//		request.header("Content-Type","application/json");
//		request.body(requestParams.toJSONString());
//		
//		Response response = request.post("/api/users");
//		System.out.println(response.body().asPrettyString());
//		System.out.println("The status received is: "+ response.statusLine());
//		
//		
//	}
	
//
//		@Test
//	    public void getData() {
//	        RequestSpecification httpRequest = RestAssured.given().auth().digest("postman", "password");
//	        Response res = httpRequest.get("https://postman-echo.com/basic-auth");
//	        ResponseBody body = res.body();
//	        //Converting the response body to string
//	        String rbdy = body.asString();
//	        System.out.println("Data from the GET API- "+rbdy);
//	    }

//	@Test	
//	public void listUsers() {
//		
//		RequestSpecification request = RestAssured.given();
//	
//		Response res = request.body("{\"name\":\"morpheus\",\"job\":\"leader\"}").post("https://reqres.in/api/users");
//
//		System.out.println(res.getStatusCode());
//
//		System.out.println(res.body().asPrettyString());
//	
//		
//	}
//	@Test
//	public void update() {
//	Response response=	RestAssured.given().body("{\"name\": \"morpheus\",\"job\": \"zion resident\"}").delete("https://reqres.in/api/users/2");
//		System.out.println(response.prettyPrint());
//		System.out.println(response.getStatusCode());
//
//	}
//	@Test
//	public void LoginSucessfull() {
//		
//		RestAssured.baseURI = "https://reqres.in";
//		RequestSpecification request = RestAssured.given();//.auth().basic("eve.holt@reqres.in", "cityslicka");
//		
//		HashMap<String,String>  map = new HashMap<String,String>();
//		map.put("email", "eve.holt@reqres.in");
//		map.put("password", "cityslicka");
//		
//		JSONObject jsonObject = new JSONObject(map);
//		Response response = request.body(jsonObject.toJSONString()).post("/api/login");
//		System.out.println(response.asPrettyString());
//		
//	}
	@Test
	public void readJsonFile() throws IOException {
		
		byte[] byt = Files.readAllBytes(Paths.get("jsonPayload.json"));
		String b = new String(byt);
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.body(b).post("/api/users");
		System.out.println(response.prettyPrint());
	}
	}

   