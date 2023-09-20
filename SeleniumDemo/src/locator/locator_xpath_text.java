package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		
		//syntax -> //tagname[text() ='Put your search text over here']
		
		driver.findElement(By.xpath("//a[text()='here']")).click();
	

	}

}
