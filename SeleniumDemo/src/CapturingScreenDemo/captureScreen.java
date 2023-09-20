package CapturingScreenDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreen {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
		String url = "https://www.selenium.dev/";
		String filePath = "D:\\selenium_screenshot\\myScreenshot.png";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		captureScreen.captureScreenShot(driver, filePath);
	}
	
	public static void captureScreenShot(WebDriver driver, String filePath) throws Exception {
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(filePath);
		
		FileUtils.copyFile(sourceFile,destinationFile );
		
		
	}

}
