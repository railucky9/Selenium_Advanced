package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_ID {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.name("uid")).sendKeys("mngr519603");
		driver.findElement(By.name("password")).sendKeys("dyvybAm");
		
		driver.findElement(By.name("btnLogin")).click();
		
		

	}

}
