package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath_contains {

	public static void main(String[] args) {

		String url = "https://demo.guru99.com/v4/";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		// syntax --> //tagName[contains(@attribute, 'value)']

		List<WebElement> myList = driver.findElements(By.xpath("//input[contains(@name, 'btn')]"));
		System.out.println("Size of the list is -> " + myList.size());

		
		WebElement listElement;
		for (int i = 0; i < myList.size(); i++) {
			listElement =(WebElement) myList.get(i);
			System.out.println("Lable of the button index " + listElement.getAttribute("value"));
		}
		driver.close();
	}

}
