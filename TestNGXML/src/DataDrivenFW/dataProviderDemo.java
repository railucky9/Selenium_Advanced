package DataDrivenFW;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class dataProviderDemo {

	WebDriver driver;
	String url = "https://demo.guru99.com/v4/";
	String expectedTitle = "Guru99 Bank Manager HomePage";

	@Test(dataProvider = "supplyCredentials")
	public void f(String userID, String password) {
		System.out.println("User ID " + userID);
		System.out.println("Password " + password);

		

		driver.findElement(By.name("uid")).sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();
		
		String actualTitle = driver.getTitle();
		boolean result = expectedTitle.equals(actualTitle);
		
		Assert.assertTrue(result);
		
	}
	
	@BeforeMethod 
	public void initTest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
	}
    
	@AfterMethod 
	public void cleanTest() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] supplyCredentials() {

		Object[][] myCredentials = new Object[3][2];

		myCredentials[0][0] = "mngr519603";
		myCredentials[0][1] = "dyvybAm";

		myCredentials[1][0] = "Hello World";
		myCredentials[1][1] = "12345";

		myCredentials[2][0] = "mngr519603";
		myCredentials[2][1] = "dyvybAm";

		return myCredentials;
	}
}
