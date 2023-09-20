package AutoIT_Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingAuto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String url = "https://www.filemail.com/share/upload-file";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("addBtn"))).perform();
		action.click().perform();
        
		Runtime.getRuntime().exec("D:\\Selenium_Files\\AutoITScript\\fileUpload.exe");
	}

}
