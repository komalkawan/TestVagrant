package TestVagrant.TV;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

public class WebTemperature extends BaseClass {

	public static float testing() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://www.ndtv.com");
		driver.manage().window().maximize();
		PageObjects pg = new PageObjects(driver);
		Thread.sleep(7000);
		pg.NoThanks().click();
		pg.india().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("scroll(0,600)");
		pg.Sections().click();
		pg.Weather().click();
		pg.city().click();
		pg.cityCheck().click();
		String content = pg.validateTemp().getText();
		String sub = content.substring(content.length() - 2, content.length());
		float webTemp = Float.parseFloat(sub);
		System.out.println("The temperature from Web is " + webTemp);
		return webTemp;

	}
}
