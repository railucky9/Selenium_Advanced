package js_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String url = "https://demo.guru99.com/test/facebook.html";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeAsyncScript("document.getElementById('email').value='Hello@gmail.com';");

	}

}
