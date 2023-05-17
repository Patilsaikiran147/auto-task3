package Api;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import body.Samplebody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import Api.ReusableMethods;
public class dynamic {
	@Test(dataProvider="BooksData")

	public void addBook(String isbn,String aisle)

	{

	RestAssured.baseURI="http://216.10.245.166";

	Response resp=given().

	header("Content-Type","application/json").

	body(Samplebody.body(isbn,aisle)).

	when().

	post("/Library/Addbook.php").

	then().assertThat().statusCode(200).

	extract().response();

	JsonPath js= ReusableMethods.rawToJson(isbn);

	   String id=js.get("ID");

	   System.out.println(id);
	}
	@DataProvider(name="BooksData")
	public Object[][]  getData(){
	return new Object[][] {
		{"hello","234"},{"fun","567"},{"sun","789"}
	};
	}
	}

