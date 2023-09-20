package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_linkText {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get(url);
         //driver.findElement(By.linkText("here")).click();
         driver.findElement(By.partialLinkText("ere")).click();
         
	}

}
