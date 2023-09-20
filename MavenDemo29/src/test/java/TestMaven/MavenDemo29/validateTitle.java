package TestMaven.MavenDemo29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class validateTitle {

	String url = "https://www.selenium.dev/";
	String expectedTitle = "Selenium";

	WebDriver driver;

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
