package myFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstAutomationScript {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String title = driver.getTitle();
		System.out.println("Title of the webpage = "+title);
	}

}
