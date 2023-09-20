package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class annotationBmAm {
	@Test
	public void firstTestCase() {
		System.out.println("Executing....firstTestCase");
	}

	@Test
	public void secondTestCase() {
		System.out.println("Executing....secondTestCase");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside beforeMethod()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside afterMethod()");
	}

}
