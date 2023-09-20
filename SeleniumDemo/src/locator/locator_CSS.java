package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="https://demo.guru99.com/test/facebook.html";
        WebDriver driver;
        
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get(url);
        
        //<input type="text" class="inputtext" name="email" id="email" value="" tabindex="1">
        // Tag and ID - tag#ID
        
        //driver.findElement(By.cssSelector("input#email")).sendKeys("facebook@gmail.com");
        
        //Tag and Class - tag.class
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("facebook@gmail.com");
        
        // Tag and Attribute - tag[attribute=value]
        //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("facebook@gmail.com");
        
        //Tag, class and Attribute
        // tag.class[attribute=value]
        driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("facebook@gmail.com");
        
	}

}
