package js_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDemo {

	public static void main(String[] args) {
	
		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement name_WE =driver.findElement(By.name("uid"));
		js.executeScript("arguments[0].value='Hello';", name_WE);
		
		WebElement password_WE =driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='Test@123';", password_WE);
		
//		WebElement button_WE = driver.findElement(By.name("btnLogin"));
//		js.executeScript("arguments[0].click();",button_WE);
		
		js.executeScript("window.location='https://www.selenium.dev/'");
		js.executeScript("window.scrollBy(0, 1500)");
		


	}

}
