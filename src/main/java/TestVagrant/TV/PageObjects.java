package TestVagrant.TV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	WebDriver driver;

	public PageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By NoThanks = By.xpath("//a[contains(text(),\"No Thanks\")]");

	public WebElement NoThanks() {
		return driver.findElement(NoThanks);
	}

	By india = By.xpath("//a[contains(text(),\"INDIA\")]");

	public WebElement india() {
		return driver.findElement(india);
	}

	By Sections = By.xpath("//div[contains(text(),\"Sections\")]");

	public WebElement Sections() {
		return driver.findElement(Sections);
	}

	By Weather = By.xpath("//a[contains(text(),\"Weather\")]");

	public WebElement Weather() {
		return driver.findElement(Weather);
	}

	By city = By.xpath("//label[@for=\"Allahabad\"]");

	public WebElement city() {
		return driver.findElement(city);
	}

	By cityCheck = By.xpath("//div[contains(text(),\"Allahabad\")]");

	public WebElement cityCheck() {
		return driver.findElement(cityCheck);
	}

	By validateTemp = By.xpath("//div[@class=\"leaflet-popup-content\"]/div/span[4]");

	public WebElement validateTemp() {
		return driver.findElement(validateTemp);
	}
}