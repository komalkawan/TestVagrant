package TestVagrant.TV;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.restassured.RestAssured;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static float varianceValueF;

	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\komal\\eclipse-workspace\\TV\\src\\main\\java\\TestVagrant\\TV\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		String varianceValue = prop.getProperty("variance");
		varianceValueF = Float.parseFloat(varianceValue);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
