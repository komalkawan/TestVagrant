package TestVagrant.TV;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiTemperature extends BaseClass {

	public static float testResponsecode() {
		Response resp = RestAssured.get(
				"http://api.openweathermap.org/data/2.5/weather?q=Allahabad&appid=7fe67bf08c80ded756e598d6f8fedaea");
		System.out.println("the status code is " + resp.getStatusCode());
		// System.out.println(resp.getBody().jsonPath().prettify());
		JsonPath json = resp.jsonPath();
		float apiTempKelvin = json.get("main.temp");
		float apiTemp = apiTempKelvin - 273;
		System.out.println("The temperature obtained through API response is " + apiTemp);
		return apiTemp;

	}
}
