//package Api;
//
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//import body.Samplebody;
//
//
//public class Restassu_basic {
//	public static void main(String[] args) {
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		String response = given().log().all().queryParam("Key","qaclick123").headers("Content-Type","application/json")
//		.body(Samplebody.body(response, response))
//		.when().post("maps/api/place/add/json").then()
//		.assertThat().statusCode(200).body("scope",equalTo("APP"))
//		.header("Server","Apache/2.4.41 (Ubuntu)").extract().response().toString();
//		
//		JsonPath jp = new JsonPath(response);
//		String placeid = jp.getString("place_id");
//		System.out.println("place_id: "+placeid);
//		
//		
//		
//		
//	}
//
//}
