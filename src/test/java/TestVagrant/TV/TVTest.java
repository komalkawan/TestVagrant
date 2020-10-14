package TestVagrant.TV;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestVagrant.TV.*;

public class TVTest extends BaseClass {

	@Test
	public void execute() throws IOException, InterruptedException {
		float resultWeb = WebTemperature.testing();
		float resultApi = ApiTemperature.testResponsecode();
		float difference = resultApi - resultWeb;
		float variance = BaseClass.varianceValueF;
		System.out.println("The difference between api temperature and web temperature is " + difference);
		System.out.println("The variance defined is " + variance);

		if (difference <= variance) {
			Assert.assertTrue(true);
			System.out.println("Temperature Test Passed");

		} else {
			Assert.assertFalse(false);
			System.out.println("Temperature Test Failed");
		}
	}
}
