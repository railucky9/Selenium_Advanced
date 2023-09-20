package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class homePageTiltleCheck {

	WebDriver driver;
	String url = "https://www.selenium.dev/";
	String expectedTitle = "Selenium";

	@Test
	public void validateTitle() {
		String actualTitle = driver.getTitle();
		boolean result = expectedTitle.equals(actualTitle);
		Assert.assertTrue(result);
	}

	@BeforeMethod
	public void initTest() {

		// for initializing test

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void cleanUpTest() {
		// clean up

		driver.close();
	}

}
