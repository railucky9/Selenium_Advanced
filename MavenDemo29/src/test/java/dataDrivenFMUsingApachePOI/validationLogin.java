package dataDrivenFMUsingApachePOI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class validationLogin {

	String url = "https://demo.guru99.com/v4/";
	String filePath = "C:\\Users\\luckr\\OneDrive\\Desktop\\Selenium_Topics\\MavenDemo29\\Resource";
	String fileName = "TestData.xlsx";
	String sheetName = "TestData";
	String expectedTitle = "Guru99 Bank Manager HomePage";
	
	WebDriver driver;

	@Test(dataProvider = "supplyTestData")
	public void f(String userID, String password) {
		driver.findElement(By.name("uid")).sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
		String actualTitle = driver.getTitle();
		boolean result = expectedTitle.equals(actualTitle);
		
		Assert.assertTrue(result);
		
		
	}

	@BeforeMethod
	public void initTest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@DataProvider
	public Object[][] supplyTestData() throws Exception {

		Object[][] myCredentials = null;

		File file = new File(filePath + "\\" + fileName);
		FileInputStream fin = new FileInputStream(file);

		Workbook workbook = null;

		String fileExtenstionName = fileName.substring(fileName.indexOf("."));

		if (fileExtenstionName.equals(".xlsx")) { // newer version of excel
			
			workbook = new XSSFWorkbook(fin);

		} else if (fileExtenstionName.equals(".xls")) { // older version of excel
			
			workbook = new HSSFWorkbook(fin);

		}
		
		
		Sheet sheet = workbook.getSheet(sheetName);
		
       

		
		
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		Iterator rowIterator = sheet.rowIterator();
		
		Row headerRow = (Row) rowIterator.next();
		
		int cellCount = headerRow.getPhysicalNumberOfCells();
		
		myCredentials = new Object[rowCount][cellCount];
		DataFormatter dataFormatter = new DataFormatter();
		
		for(int i =1; i<rowCount +1; i++) {
			Row row = sheet.getRow(i);
			
			for(int j =0; j<row.getLastCellNum(); j++) {
            myCredentials[i - 1][j] = dataFormatter.formatCellValue(row.getCell(j));
			}
		}

		return myCredentials;

	}
}
