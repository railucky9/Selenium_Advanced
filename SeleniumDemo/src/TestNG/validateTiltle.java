package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validateTiltle {

	WebDriver driver;
	String url = "https://www.selenium.dev/";
	String expectedTitle = "Selenium";

	@Test
	public void checkTitle() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
		String actualTitle = driver.getTitle();
		
		boolean result = expectedTitle.equals(actualTitle);
		Assert.assertTrue(result);
		

	}
}
