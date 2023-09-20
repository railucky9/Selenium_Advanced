package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class homePageValidation {

	WebDriver driver;
	String url = "https://www.selenium.dev/";
	String expectedTitle = "Selenium";

	@Test
	public void validateTitle() {
		// First Test Case

		String actualTitle = driver.getTitle();
		boolean result = expectedTitle.equals(actualTitle);
		Assert.assertTrue(result);
	}

	@Test
	public void validatePresenceOfLinkDownload() {
		// second test case implementataion
		
		boolean flag = true;

		WebElement download_WE = driver.findElement(By.xpath("//span[normalize-space()=\"Downloads\"]"));
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(download_WE));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			flag = false;
			e.printStackTrace();
		}
		Assert.assertTrue(flag);
		
	}

	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
	}

	@AfterTest
	public void afterMethod() {
		driver.close();
	}

}
