package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_tagname {

	public static void main(String[] args) {
	
		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get(url);
        
        List <WebElement> list = driver.findElements(By.tagName("a"));
        int size = list.size();
        
        System.out.println("Size of the list is "+size);
        
        
		

	}

}
